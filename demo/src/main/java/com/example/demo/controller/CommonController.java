package com.example.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.AES.anno.Decrypt;
import com.example.demo.AES.anno.Encrypt;
import com.example.demo.domain.Entity;
import com.example.demo.domain.Booking.DocModel;
import com.example.demo.domain.Booking.CancelBooking.CancelBookingHead;
import com.example.demo.domain.MedicalCard.GetHospitalMedicalCardList.UserModel;
import com.example.demo.service.CommonService;

/***
 * 公共相关
 * @author 邵子城 2018/7/23
 *
 */
@RestController
@CrossOrigin
@RequestMapping("/common")
public class CommonController {

	final static Logger logger = LoggerFactory.getLogger(CommonController.class);
	
	@Autowired
	CommonService commonService;
	
	
	/**
	 * 登录做游客纪录
	 * @param 
	 * @return
	 */
	@RequestMapping("/getweachat")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity  getWeachat(@RequestBody DocModel model){
		Entity entity=new Entity();
		try {
			if(model.getHospitalID() != null){
				UserModel userModel =new UserModel();
				userModel.setOpenId(model.getHospitalID());
				userModel.setOpenUserName(model.getHospitalName());
				commonService.addTourist(userModel);//添加游客记录
				entity.setSuccess(true);
				entity.setResult("213123");
			}
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage("游客记录失败");
		}
		
		return entity;
		
	}
	
	/**
	 * 验证是否绑定就诊卡和完善个人信息
	 * @param 
	 * @return
	 */
	@RequestMapping("/checkdata")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity checkData(@RequestBody DocModel model ){
		Entity entity=new Entity();
		try {
			if(model.getHospitalID() != null){
				
				Integer user = commonService.checkWeachat(model.getHospitalID());//验证用户信息是否完善
				Integer patients = commonService.checkPatient(model.getHospitalID());//验证是否绑定过就诊卡
				
				if(user ==1 && patients >0){
					entity.setResult(1);//验证通过 
				}else if(user != 1 && patients >0){
					entity.setMessage("用户个人信息未完善,请至个人中心完善");
					entity.setResult(2);
				}else if(user ==1 && patients ==0){
					entity.setMessage("未绑定就诊卡,请至个人中心绑定");
					entity.setResult(3);
				}else{
					entity.setMessage("未绑定就诊卡与用户个人信息,请至个人中心进行填写");
					entity.setResult(4);
				}
			}
		} catch (Exception e) {
			entity.setMessage("系统错误");
			entity.setSuccess(false);
		}
		
		return entity;
		
	}
	
	/**
	 * 调查数据收集
	 * @param data 数据
	 * @param openid 微信用户识别码
	 * @return
	 */
	@RequestMapping("/getquestionnaire")
	@PostMapping
	@Encrypt
	@Decrypt
	public Entity getQuestionnaire(@RequestBody CancelBookingHead model){
		Entity entity=new Entity();
		try {
			commonService.getQuestionnaire(model);
			entity.setSuccess(true);
			entity.setMessage("问卷提交成功,感谢您的支持");
		} catch (Exception e) {
			entity.setSuccess(false);
		}
		
		return entity;
		
	}
	
	
}
