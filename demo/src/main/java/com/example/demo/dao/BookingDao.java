package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Booking.DocModel;
import com.example.demo.domain.Booking.BookingDeptNoSource.DeptResourceDocNoSourceList;
import com.example.demo.domain.Booking.BookingDocResource.DocResourceResourceList;
import com.example.demo.domain.Booking.ConfirmBooking.BookPatientModel;
import com.example.demo.domain.MedicalCard.GetHospitalMedicalCardList.UserModel;

@Component
public interface BookingDao {

	/**
	 * 获取数据库中已有的医生列表数据
	 * @return
	 */
	List<String> getOldDoc(@Param(value = "hostp") String hostp);

	/**
	 * 新增医生数据
	 * @return
	 */
	void addNewDoc(@Param(value = "doc") DocModel newDocModelList);

	/**
	 * 更新医生数据
	 * @param docModel
	 */
	void updateDoc(@Param(value = "doc") DocModel docModel);

	/**
	 * 逻辑删除医生数据
	 * @param docCode
	 */
	void changeStatus(@Param(value = "doc") String docCode);

	/**
	 * 删除老的科室预约信息
	 * @param deptCode
	 */
	void deleteDept(@Param(value = "deptCode") String deptCode);

	/**
	 * 新增新的科室预约信息
	 * @param deptResource
	 */
	void addDept(@Param(value = "dept") DeptResourceDocNoSourceList deptResource);

	/**
	 * 获得所需日期的科室预约情况
	 * @param day
	 * @return
	 */
	List<DeptResourceDocNoSourceList> getDept(@Param(value = "day") String day,@Param(value = "deptCode") String deptCode);

	/**
	 * 删除过期的医生预约信息
	 * @param docCode
	 */
	void deleteDoc(@Param(value = "docCode") String docCode);

	/**
	 * 新增新的医生预约信息
	 * @param docResource
	 */
	void addDoc(@Param(value = "doc") DocResourceResourceList docResource);

	/**
	 * 获得所需日期的医生预约情况
	 * @param day
	 * @return
	 */
	List<DocResourceResourceList> getDoc(@Param(value = "day")  String day,@Param(value = "docCode")  String docCode);

	/**
	 * 保存预约相关信息
	 * @param bookPatientModel
	 */
	void confirmBooking(@Param(value = "patient") BookPatientModel bookPatientModel);

	/**
	 * 获取患者预约记录
	 * @param patientID
	 * @return
	 */
	List<BookPatientModel> getPatientData(@Param(value = "patientID") String patientID);

	/**
	 * 更新预约状态
	 * @param status
	 * @param bookingID
	 */
	void updatePatient(@Param(value = "status") String status, @Param(value = "bookingID") String bookingID,@Param(value = "updateTime") String updateTime);

	/**
	 * 获取科室
	 * @param hospitalID
	 * @return
	 */
	List<DocModel> getDeptList(@Param(value = "model") DocModel model);

	/**
	 * 获取用户预约列表
	 * @param userModel
	 * @return
	 */
	List<UserModel> getPatientList(@Param(value = "model") UserModel userModel);

	
	
}
