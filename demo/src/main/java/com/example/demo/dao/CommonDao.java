package com.example.demo.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Booking.CancelBooking.CancelBookingHead;
import com.example.demo.domain.MedicalCard.GetHospitalMedicalCardList.UserModel;

@Component
public interface CommonDao {

	
	/**
	 * 添加游客记录
	 * @param userModel
	 */
	void addTourist(@Param(value = "user") UserModel userModel);

	/**
	 * 验证用户信息是否完善
	 * @param openId
	 * @return
	 */
	Integer checkWeachat(@Param(value = "openId") String openId);

	/**
	 * 验证是否绑定过就诊卡
	 * @param openId
	 * @return
	 */
	Integer checkPatient(@Param(value = "openId") String openId);

	/**
	 * 调查数据收集
	 * @param 
	 * @return
	 */
	void getQuestionnaire(@Param(value = "model") CancelBookingHead model);

	
	
	
}
