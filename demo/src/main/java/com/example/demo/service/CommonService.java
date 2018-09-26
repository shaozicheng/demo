package com.example.demo.service;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dao.CommonDao;
import com.example.demo.domain.Photo;
import com.example.demo.domain.Booking.CancelBooking.CancelBookingHead;
import com.example.demo.domain.MedicalCard.GetHospitalMedicalCardList.UserModel;

@Component
public class CommonService {

	@Autowired
	CommonDao commonDao;
	
	@Value("${web.upload-path}")
    private String path;
	
	/**
	 * 添加游客记录
	 * @param userModel
	 */
	public void addTourist(UserModel userModel) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date();
		String createTime=sdf.format(date);
		userModel.setCreateTime(createTime);
		commonDao.addTourist(userModel);
		
	}

	/**
	 * 验证用户信息是否完善
	 * @param openId
	 * @return
	 */
	public Integer checkWeachat(String openId) {
		return commonDao.checkWeachat(openId);
	}

	/**
	 * 验证是否绑定过就诊卡
	 * @param openId
	 * @return
	 */
	public Integer checkPatient(String openId) {
		return commonDao.checkPatient(openId);
	}

	/**
	 * 调查数据收集
	 * @param 
	 * @return
	 */
	public void getQuestionnaire(CancelBookingHead model) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date();
		model.setBookingID(sdf.format(date));
		commonDao.getQuestionnaire(model);
	}
	
}
