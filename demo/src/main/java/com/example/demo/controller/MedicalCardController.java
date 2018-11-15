package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.AES.anno.Decrypt;
import com.example.demo.AES.anno.Encrypt;
import com.example.demo.domain.Entity;
import com.example.demo.domain.InModel;
import com.example.demo.domain.Photo;
import com.example.demo.domain.WechatModel;
import com.example.demo.domain.Booking.DocModel;
import com.example.demo.domain.MedicalCard.CancelMedicalCard.CancelMedicalCardHead;
import com.example.demo.domain.MedicalCard.CancelMedicalCard.CancelMedicalCardXml;
import com.example.demo.domain.MedicalCard.GetHospitalMedicalCardList.GetHospitalMedicalCardListHead;
import com.example.demo.domain.MedicalCard.GetHospitalMedicalCardList.GetHospitalMedicalCardListXml;
import com.example.demo.domain.MedicalCard.GetHospitalMedicalCardList.UserModel;
import com.example.demo.domain.MedicalCard.RegistMedicalCard.RegistMedicalCardHead;
import com.example.demo.domain.MedicalCard.RegistMedicalCard.RegistMedicalCardXml;
import com.example.demo.service.MedicalCardService;
import com.example.demo.util.MedicalCardMode;
import com.example.demo.webService.HospitalWS;
import com.example.demo.webService.HospitalWSLocator;
import com.example.demo.webService.HospitalWSSoap;
import com.thoughtworks.xstream.XStream;


/***
 * 就诊卡相关
 * @author 邵子城 2018/7/5
 *
 */

@RestController
@CrossOrigin
@RequestMapping("/medicalcard")
public class MedicalCardController {
	
	final static Logger logger = LoggerFactory.getLogger(BookingController.class);
	
	
	@Autowired
	MedicalCardService MedicalCardService;
	
	@Autowired
	MedicalCardMode recordCardMode;
	
	/**
	 * 登记就诊卡(1.2)
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/getRecordCard")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity getRecordCard(@RequestBody RegistMedicalCardHead recordCardHead ){
		Entity entity=new Entity();
		String patientID=UUID.randomUUID().toString().replace("-", "");
		
		UserModel userModel=MedicalCardService.getUserData(recordCardHead.getOpenID());
		recordCardHead.setOpenIDCard(userModel.getOpenIDCard());
		recordCardHead.setOpenTel(userModel.getOpenTel());
		recordCardHead.setOpenUserName(userModel.getOpenUserName());
		recordCardHead.setCertType(userModel.getCertType().toString());
		recordCardHead.setOpenUserID(patientID);
		
		String xml=recordCardMode.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Regist_MedicalCard (xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(RegistMedicalCardXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(RegistMedicalCardXml.class.getClassLoader());
            RegistMedicalCardXml xmlTest= (RegistMedicalCardXml) xstream.fromXML(result);
            
            if(xmlTest.getBody().getRecordCardList() != null){
            	recordCardHead.setHospitalUserID(xmlTest.getBody().getRecordCardList().getHospitalUserID());
            	recordCardHead.setPatientID(patientID);
            	
                MedicalCardService.getRecordCard(recordCardHead);
                entity.setSuccess(true);
                entity.setMessage("绑定成功");
            }else{
            	entity.setSuccess(false);
            	entity.setMessage("绑定失败: "+xmlTest.getBody().getResponseResult().getMessage());
            }
    		
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage("绑定失败: "+e.getMessage());
			e.printStackTrace();
		}
		
		
		return entity;
	}
	
	/**
	 * 注销就诊卡(1.3)
	 * @param patientID 患者识别ID
	 * @param hosptFrom 所属医院
	 * @return
	 */
	public Entity cancelCard(String patientID,String hosptFrom){
		Entity entity=new Entity();
		CancelMedicalCardHead recordCardHead = new CancelMedicalCardHead();
		recordCardHead.setOpenUserID(patientID);
		String hosptId = MedicalCardService.getHostpId(patientID);
		recordCardHead.setHospitalUserID(hosptId);
		if(hosptFrom.equals("金山院区")){
			recordCardHead.setAccessToken("800EBED9-63E5-4408-A184-BE693DA32CB7");
		}
		if(hosptFrom.equals("虹口院区")){
			recordCardHead.setAccessToken("800EBED9-63E5-4408-A184-BE693DA32CB6");
		}
		String xml=recordCardMode.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Cancel_MedicalCard (xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(CancelMedicalCardXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(CancelMedicalCardXml.class.getClassLoader());
            CancelMedicalCardXml xmlTest= (CancelMedicalCardXml) xstream.fromXML(result);
            entity.setResult(xmlTest.getBody().getResponseResult().getIsSuccess());
            entity.setMessage(xmlTest.getBody().getResponseResult().getMessage());
    		
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage(e.getMessage());
			e.printStackTrace();
		}
		
		
		return entity;
	}
	
	/**
	 * 获取医院已有卡列表(1.5)
	 * @param recordCardHead
	 * @return
	 */
	public Entity GetHospitalCard(@RequestBody GetHospitalMedicalCardListHead recordCardHead ){
		Entity entity=new Entity();
		String xml=recordCardMode.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Get_Hospital_MedicalCard_List(xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(GetHospitalMedicalCardListXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(GetHospitalMedicalCardListXml.class.getClassLoader());
            GetHospitalMedicalCardListXml xmlTest= (GetHospitalMedicalCardListXml) xstream.fromXML(result);
            
            entity.setSuccess(true);
    		entity.setMessage(xmlTest.getBody().getResponseResult().getMessage());
    		
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage(e.getMessage());
			e.printStackTrace();
		}
		
		
		return entity;
	}

	
	
	/**
	 * 绑定微信用户个人信息
	 * @param 
	 * @return
	 */
	@RequestMapping("/insertweachat")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity insertWeachat(@RequestBody UserModel userModel ){
		Entity entity=new Entity();
		try {
			if(userModel.getOpenId() != null && userModel.getOpenId() != ""){
				MedicalCardService.insertWeachat(userModel);
				entity.setSuccess(true);
				entity.setMessage("绑定成功");
			}else{
				entity.setSuccess(false);
				entity.setMessage("未识别有效用户识别码");
			}
			
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage(e.toString());
		}
		
		return entity;
		
	}
	
	/**
	 * 获取微信用户已绑定的就诊卡
	 * @param 
	 * @return
	 */
	@RequestMapping("/getweachattopatient")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity getWeachatTopatient(@RequestBody UserModel userModel){
		Entity entity=new Entity();
		try {
			List<UserModel> patients = MedicalCardService.getWeachatTopatient(userModel);
			entity.setResult(patients);
			entity.setSuccess(true);
		} catch (Exception e) {
			entity.setMessage("获取失败");
			entity.setSuccess(false);
		}
		
		return entity;
		
	}
	
	/**
	 * 获取微信唯一code
	 * @param 
	 * @return
	 */
	@RequestMapping("/getopenid")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity getOpenID(@RequestBody UserModel userModel){
		Entity entity=new Entity();
		try {
			WechatModel wechatModel = MedicalCardService.getOpenID(userModel.getOpenId());
			 if (wechatModel.getErrcode() != null)
		        {
				 entity.setMessage(String.format("WxUserAuth.findAccessToken,errorCode:%s,errorMsg:%s",wechatModel.getErrcode(),wechatModel.getErrmsg()));
				 entity.setSuccess(false);
				 
		        }else{
					entity.setResult(wechatModel.getOpenid());
					entity.setSuccess(true);
		        }

		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage(e.toString());
		}
		
		return entity;
		
	}
	
	/**
	 * 验证用户是否登录
	 * @param 
	 * @return
	 */
	@RequestMapping("/checklogin")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity checkLogin(@RequestBody UserModel userModel) {
		Entity entity=new Entity();
		try {
			boolean check = MedicalCardService.checkLogin(userModel.getOpenId());
			entity.setSuccess(true);
			entity.setResult(check);
		} catch (Exception e) {
			entity.setSuccess(false);
		}
		return entity;
	}
	
	/**
	 * 新增收藏医生
	 * 
	 * @param docID  医生id
	 * @param openID 用户识别码
	 * @return
	 */
	@RequestMapping("/adddoclist")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity addDocList(@RequestBody InModel inModel ) {
		Entity entity= new Entity();
		try {
			if(inModel.getOpenID() !=null && inModel.getDocID() != null){
				 MedicalCardService.addDocList(inModel);
				 entity.setMessage("收藏成功");
				 entity.setSuccess(true);
			}else{
				 entity.setMessage("缺失關鍵信息");
				 entity.setSuccess(false);
			}

		} catch (Exception e) {
			entity.setMessage("收藏失败");
			entity.setSuccess(false);
			entity.setMessage(e.toString());
		}
		return entity;
	}
	
	/**
	 * 删除收藏医生
	 * 
	 * @param docID  医生id
	 * @param openID 用户识别码
	 * @return
	 */
	@RequestMapping("/deletedoclist")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity deleteDocList(@RequestBody InModel inModel ) {
		Entity entity= new Entity();
		try {
			 MedicalCardService.deleteDocList(inModel);
			 entity.setMessage("取消成功");
			 entity.setSuccess(true);
		} catch (Exception e) {
			entity.setMessage("取消失败");
			entity.setSuccess(false);
			entity.setMessage(e.toString());
		}
		return entity;
	}
	
	/**
	 * 获取收藏医生
	 * 
	 * @param DocModel
	 * @return
	 */
	@RequestMapping("/getdoclist")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity getDocList(@RequestBody InModel inModel ) {
		Entity entity= new Entity();
		try {
			 List<DocModel> docList = MedicalCardService.getDocList(inModel);
			 entity.setSuccess(true);
			 entity.setResult(docList);
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage(e.toString());
		}
		return entity;
	}
	
	/**
	 * 查看是否收藏医生
	 * 
	 * @param DocModel
	 * @return
	 */
	@RequestMapping("/checkDoc")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity checkDoc(@RequestBody InModel inModel  ) {
		Entity entity= new Entity();
		try {
			 boolean check = MedicalCardService.checkDoc(inModel);
			 if(check){
				 entity.setSuccess(true);
			 }else{
				 entity.setSuccess(false);
			 }
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage(e.toString());
		}
		return entity;
	}
	
	/**
	 * 获取院内简介图
	 * 
	 * @return
	 */
	@RequestMapping("/selectintroduce")
	@GetMapping
	@Encrypt
	@Decrypt
	public Entity selectIntroduce() {
		Entity entity= new Entity();
		try {
			List<String> introduce = MedicalCardService.selectIntroduce();
			
			entity.setResult(introduce);
			entity.setSuccess(true);
		} catch (Exception e) {
			entity.setSuccess(false);
		}
			
		return entity;
	}
	
	/**
	 * 删除就诊人
	 * @param 
	 * @return
	 */
	@RequestMapping("/deletepatient")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity deletePatient(@RequestBody InModel inModel){
		Entity entity=new Entity();
		try {
			entity = cancelCard(inModel.getPatientID(),inModel.getHosptFrom());
			if(entity.getResult().equals("1")){
				MedicalCardService.deletePatient(inModel);
				entity.setSuccess(true);
			}else{
				entity.setSuccess(false);
			}
		} catch (Exception e) {
			entity.setMessage(e.toString());
			entity.setSuccess(false);
		}
		
		return entity;
		
	}
	
	/**
	 * 判断用户是否拥有个人信息
	 * @param 
	 * @return
	 */
	@RequestMapping("/checkweachat")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity checkWeachat(@RequestBody UserModel userModel ){
		Entity entity=new Entity();
		try {
			int check = MedicalCardService.checkWeachat(userModel);
			if(check > 0){
				entity.setSuccess(true);
			}
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage(e.toString());
		}
		
		return entity;
		
	}
	
	/**
	 * 获取用户个人信息
	 * @param 
	 * @return
	 */
	@RequestMapping("/getweachat")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity getWeachat(@RequestBody UserModel userModel ){
		Entity entity=new Entity();
		try {
			UserModel user = MedicalCardService.getUserData(userModel.getOpenId());
			entity.setSuccess(true);
			entity.setResult(user);
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage(e.toString());
		}
		
		return entity;
		
	}
	
	/**
	 * 编辑用户个人信息
	 * @param 
	 * @return
	 */
	@RequestMapping("/updateweachat")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity updateWeachat(@RequestBody UserModel userModel ){
		Entity entity=new Entity();
		try {
			MedicalCardService.updateWeachat(userModel);
			entity.setSuccess(true);
			entity.setMessage("编辑成功");
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage(e.toString());
		}
		
		return entity;
	}
	
	/**
	 *  查询生效的各类图内容
	 * 
	 * @return
	 */
	@RequestMapping("/selectphototext")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity selectPhotoText(@RequestBody Photo photo) {
		Entity entity= new Entity();
		try {
			List<Photo> pootos = MedicalCardService.selectPhotoText(photo);
			entity.setResult(pootos);
			entity.setSuccess(true);
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage(e.toString());
		}
		return entity;
	}
	
	/**
	 * 查询生效的各类图标题
	 * 
	 * @return
	 */
	@RequestMapping("/selectphototitle")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity selectPhotoTitle(@RequestBody Photo photo) {
		Entity entity= new Entity();
		try {
			List<Photo> pootos = MedicalCardService.selectPhotoTitle(photo);
			entity.setResult(pootos);
			entity.setSuccess(true);
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage(e.toString());
		}
		return entity;
	}
	
	/**
	 * 验证就诊卡所属医院
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/checkidfrom")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity checkIDFrom(@RequestBody GetHospitalMedicalCardListHead recordCardHead ){
		Entity entity= new Entity();
		List<String> hostps = new ArrayList<>();
		List<String> hostpEx = new ArrayList<>();
		List<List<String>> list = new ArrayList<>();
		int count = 0;
//		UserModel user = MedicalCardService.getUserData(recordCardHead.getDataSource());
//		recordCardHead.setCertType(user.getCertType().toString());
//		recordCardHead.setOpenIDCard(user.getOpenIDCard());
//		recordCardHead.setOpenTel(user.getOpenTel());
//		recordCardHead.setOpenUserName(user.getOpenUserName());
		try {
			recordCardHead.setAccessToken("800EBED9-63E5-4408-A184-BE693DA32CB7");//金山总部token
			entity = GetHospitalCard(recordCardHead);
			count = MedicalCardService.checkIsExist(recordCardHead.getCardNo(),"金山院区",recordCardHead.getOpenUserName());
			
			if(entity.getMessage() == "" && count == 0){
				hostps.add("金山院区");
			}
			
			if(count > 0){
				hostpEx.add("金山院区");
			}
			count = 0;
			recordCardHead.setAccessToken("800EBED9-63E5-4408-A184-BE693DA32CB6");//市区分部token
			entity = GetHospitalCard(recordCardHead);
			count = MedicalCardService.checkIsExist(recordCardHead.getCardNo(),"虹口院区",recordCardHead.getOpenUserName());
			
			if(entity.getMessage() == "" && count == 0){
				hostps.add("虹口院区");
			}
			
			if(count > 0){
				hostpEx.add("虹口院区");
			}
			list.add(hostps);//可绑定
			list.add(hostpEx);//已存在
			if(hostps.size() > 0){
				entity.setMessage("可绑院区如下");
				entity.setSuccess(true);
			}
			if(hostps.size() == 0){
				entity.setMessage("暂无可绑医院");
				entity.setSuccess(false);
			}
			if(hostpEx.size() ==0 && hostps.size() == 0  ){
				entity.setMessage("请查看就诊卡信息是否填写正确");
				entity.setSuccess(false);
			}
			
			entity.setResult(list);

		} catch (Exception e) {
			entity.setMessage("系统出错");
			entity.setSuccess(false);
		}
				
		return entity;
	}
	

}
