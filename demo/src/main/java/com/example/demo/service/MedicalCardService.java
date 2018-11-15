package com.example.demo.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.MedicalCardDao;
import com.example.demo.domain.Configure;
import com.example.demo.domain.InModel;
import com.example.demo.domain.Photo;
import com.example.demo.domain.WechatModel;
import com.example.demo.domain.Booking.DocModel;
import com.example.demo.domain.MedicalCard.GetHospitalMedicalCardList.UserModel;
import com.example.demo.domain.MedicalCard.RegistMedicalCard.RegistMedicalCardHead;
import com.example.demo.util.WebClientUtil;
import com.google.gson.Gson;

@Component
public class MedicalCardService {
	
	final static String localhost = "https://www.tonticn.cn:8081/";
	
	@Autowired
	MedicalCardDao medicalCardDao;
	
	@Autowired
	Configure configure;
	
	@Autowired
    private RedisTemplate<String, String> redisTemplate;
	
	/**
	 * 绑定微信用户个人信息
	 * @param 
	 * @return
	 */
	public void insertWeachat(UserModel userModel) {
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date();
		String createTime=sdf.format(date);
		userModel.setCreateTime(createTime);
		medicalCardDao.insertWeachat(userModel);
		
	}

	/**
	 * 获取个人用户信息
	 * @param openUserName
	 * @return
	 */
	public UserModel getUserData(String openId) {
		return medicalCardDao.getUserData(openId);
	}

	/**
	 * 新增患者信息并绑定相关用户信息
	 * @param recordCardList
	 */
	@Transactional
	public void getRecordCard(RegistMedicalCardHead recordCardHead) {
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date();
		String createTime=sdf.format(date);
		recordCardHead.setTime(createTime);
		medicalCardDao.insertPatient(recordCardHead);//新增患者信息
		medicalCardDao.insertBding(recordCardHead);//更新绑定关系
	}


	/**
	 * 获取微信用户已绑定的就诊卡
	 * @param 
	 * @return
	 */
	public List<UserModel> getWeachatTopatient(UserModel userModel) {
		List<String> patientID = medicalCardDao.getPatientID(userModel.getOpenId());
		List<UserModel> patients = new ArrayList<UserModel>();
		
		for (String id : patientID) {
			UserModel patient = new UserModel();
			patient =medicalCardDao.getPatientData(id,userModel.getPaid());
			if(patient != null){
				patient.setId(userModel.getOpenId());
				String a = patient.getOpenIDCard().replaceAll("(\\d{4})\\d{10}(\\w{4})","$1*****$2");
				String b =patient.getOpenTel().replaceAll("(\\d{3})\\d{4}(\\d{4})","$1****$2");
				patient.setOpenIDCard(a);
				patient.setOpenTel(b);
				patients.add(patient);
			}
			
		}
		return patients;
	}

	/**
	 * 获取微信唯一code
	 * @param 
	 * @return
	 */
	public WechatModel getOpenID(String code) {
		Gson gson = new Gson();
		String weCode = code;
	    String url = "https://api.weixin.qq.com/sns/jscode2session";
        HashMap<String,String> params = new HashMap<>();
        params.put("appid", configure.getAppid());
        params.put("secret", configure.getAppSecret());
        params.put("js_code",weCode);
        params.put("grant_type",configure.getType());
        String rtnStr = null;
        WechatModel wechatModel = new WechatModel();
		try {
			rtnStr = WebClientUtil.doGet(url,params);
			wechatModel =gson.fromJson(rtnStr, WechatModel.class);
			if(wechatModel.getSession_key() != null){
				redisTemplate.opsForValue().set(wechatModel.getOpenid(),wechatModel.getSession_key());
			}
		} catch (Exception e) {
			e.printStackTrace();
			wechatModel.setErrmsg(e.toString());
		}
		
        return wechatModel;
	}


	/**
	 * 验证用户是否登录
	 * @param 
	 * @return
	 */
	public boolean checkLogin(String atoken) {
		
		String key = redisTemplate.opsForValue().get(atoken);
		
		if(key == null){
			return false;
		}else{
			return true;
		}
		
		
	}

	/**
	 * 新增收藏医生功能
	 * 
	 * @param DocModel
	 * @return
	 */
	public void addDocList(InModel inModel) {
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date();
		String createTime=sdf.format(date);
		inModel.setCreateTime(createTime);
		medicalCardDao.addDocList(inModel);
	}

	/**
	 * 删除收藏医生
	 * 
	 * @param DocModel
	 * @return
	 */
	public void deleteDocList(InModel inModel ) {
		medicalCardDao.deleteDocList(inModel);
	}

	/**
	 * 获取收藏医生
	 * 
	 * @param DocModel
	 * @return
	 */
	public List<DocModel> getDocList(InModel inModel) {
		List<String> docs = medicalCardDao.getDocList(inModel.getOpenID());
		List<DocModel> docList = new ArrayList<>();
		
		for (String doc : docs) {
			DocModel docData = new DocModel();
			docData = medicalCardDao.getDocData(doc);
			docList.add(docData);
		}
		
		return docList;
	}

	/**
	 * 查看是否收藏医生
	 * 
	 * @param DocModel
	 * @return
	 */
	public boolean checkDoc(InModel inModel) {
		String docID = medicalCardDao.checkDoc(inModel);
		if(docID == null){
			return false;
		}else{
			return true;
		}
		
	}

	/**
	 * 删除就诊人
	 * @param 
	 * @return
	 */
	public void deletePatient(InModel inModel) {
		medicalCardDao.deletePatient(inModel.getPatientID());//删除就诊人个人信息
		medicalCardDao.deleteBing(inModel.getPatientID());//删除绑定关系
		medicalCardDao.deleteBook(inModel.getPatientID());//删除就诊人预约记录
	}

	/**
	 * 判断用户是否拥有个人信息
	 * @param 
	 * @return
	 */
	public int checkWeachat(UserModel userModel) {
		int count = 0;
		count = medicalCardDao.checkWeachat(userModel.getOpenId());
		
		return count;
	}


	/**
	 * 编辑用户个人信息
	 * @param 
	 * @return
	 */
	public void updateWeachat(UserModel userModel) {
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date();
		String updateTime=sdf.format(date);
		userModel.setCreateTime(updateTime);
		medicalCardDao.updateWeachat(userModel);
	}

	/**
	 * 确认是否已绑定
	 * @param dataSource
	 * @param string
	 * @return
	 */
	public int checkIsExist(String cardNo, String hospt,String name) {
		return medicalCardDao.checkIsExist(cardNo,hospt,name);
	}
	
	/**
	 * 查询生效的图内容
	 * 
	 * @return
	 */
	public List<Photo> selectPhotoText(Photo photo) {
		
		List<Photo> pootos = medicalCardDao.selectPhotoText(photo);
		for (Photo photo2 : pootos) {
			photo2.setPhoto(localhost+photo2.getPhoto());
			photo2.setCreateTime(photo2.getCreateTime().substring(0, 11));
		}
		return pootos;
	}
	
	/**
	 * 获得医院唯一识别码
	 * @param patientID
	 * @return
	 */
	public String getHostpId(String patientID) {
		return medicalCardDao.getHostpId(patientID);
	}

	/**
	 * 获取院内简介图
	 * 
	 * @return
	 */
	public List<String> selectIntroduce() {
		List<String> introduce = new ArrayList<String>();
		introduce.add(localhost+"introduce1.png");
		introduce.add(localhost+"introduce2.png");
		introduce.add(localhost+"introduce3.png");
		introduce.add(localhost+"introduce4.png");
		introduce.add(localhost+"introduce5.png");
		return introduce;
	}

	/**
	 * 查询生效的各类图标题
	 * 
	 * @return
	 */
	public List<Photo> selectPhotoTitle(Photo photo) {
		Integer start = 0;
		if(photo.getStatus() !=null){
			start = (photo.getId()-1)*photo.getStatus();
		}else{
			photo.setStatus(3);
		}
		photo.setId(start);
		 return  medicalCardDao.selectPhotoTitle(photo);
	}
	
}
