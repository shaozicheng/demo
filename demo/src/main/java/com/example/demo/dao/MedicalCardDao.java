package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.example.demo.domain.InModel;
import com.example.demo.domain.Photo;
import com.example.demo.domain.Booking.DocModel;
import com.example.demo.domain.MedicalCard.GetHospitalMedicalCardList.UserModel;
import com.example.demo.domain.MedicalCard.RegistMedicalCard.RegistMedicalCardHead;

@Component
public interface MedicalCardDao {

	/**
	 * 绑定微信用户个人信息
	 * @param 
	 * @return
	 */
	void insertWeachat(@Param(value = "userModel") UserModel userModel);

	/**
	 * 获取个人用户信息
	 * @param openUserName
	 * @return
	 */
	UserModel getUserData(@Param(value = "id") String openId);

	/**
	 * 新增患者信息
	 * @param recordCardHead
	 */
	void insertPatient(@Param(value = "record") RegistMedicalCardHead recordCardHead);

	/**
	 * 更新绑定关系
	 * @param recordCardHead
	 */
	void insertBding(@Param(value = "record")  RegistMedicalCardHead recordCardHead);

	/**
	 * 获取已绑定的就诊人识别码
	 * @param openID
	 * @return
	 */
	List<String> getPatientID(@Param(value = "openID") String openID);

	/**
	 * 获得就诊人详情
	 * @param id
	 * @return
	 */
	UserModel getPatientData(@Param(value = "id") String id,@Param(value = "hospt") String hospt);

	/**
	 * 新增收藏医生功能
	 * 
	 * @param DocModel
	 * @return
	 */
	void addDocList(@Param(value = "inModel") InModel inModel);

	/**
	 * 删除收藏医生
	 * 
	 * @param DocModel
	 * @return
	 */
	void deleteDocList(@Param(value = "inModel") InModel inModel );

	/**
	 * 获取收藏医生编码
	 * 
	 * @param DocModel
	 * @return
	 */
	List<String> getDocList(@Param(value = "openId") String openId);

	/**
	 * 获取收藏医生数据
	 * 
	 * @param DocModel
	 * @return
	 */
	DocModel getDocData(@Param(value = "doc") String doc);

	/**
	 * 查看是否收藏医生
	 * 
	 * @param DocModel
	 * @return
	 */
	String checkDoc(@Param(value = "doc") InModel inModel);

	/**
	 * 删除就诊人个人信息
	 * @param 
	 * @return
	 */
	void deletePatient(@Param(value = "patientID") String patientID);

	/**
	 * 删除绑定关系
	 * @param 
	 * @return
	 */
	void deleteBing(@Param(value = "patientID") String patientID);

	/**
	 * 删除就诊人预约记录
	 * @param 
	 * @return
	 */
	void deleteBook(@Param(value = "patientID") String patientID);

	/**
	 * 判断用户是否拥有个人信息
	 * @param 
	 * @return
	 */
	int checkWeachat(@Param(value = "openId")  String openId);

	/**
	 * 编辑用户个人信息
	 * @param 
	 * @return
	 */
	void updateWeachat(@Param(value = "userModel") UserModel userModel);

	/**
	 * 确认是否已绑定
	 * @param dataSource
	 * @param string
	 * @return
	 */
	int checkIsExist(@Param(value = "cardNo") String cardNo, @Param(value = "hospt")  String hospt, @Param(value = "name")  String name);
	


	/**
	 * 获得医院唯一识别码
	 * @param patientID
	 * @return
	 */
	String getHostpId(@Param(value = "patientID") String patientID);
	
	/**
	 * 查询生效的图内容
	 * 
	 * @return
	 */
	List<Photo> selectPhotoText(@Param(value = "photo") Photo photo);
	
	/**
	 * 查询生效的各类图标题
	 * 
	 * @return
	 */
	List<Photo> selectPhotoTitle(@Param(value = "photo") Photo photo);
	
}
