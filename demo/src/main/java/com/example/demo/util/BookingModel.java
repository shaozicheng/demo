package com.example.demo.util;

import org.springframework.stereotype.Component;

import com.example.demo.domain.Booking.BookingDeptNoSource.BookingDeptNoSourceHead;
import com.example.demo.domain.Booking.BookingDocResource.BookingDocResourceHead;
import com.example.demo.domain.Booking.BookingResource.BookingResourceHead;
import com.example.demo.domain.Booking.CancelBooking.CancelBookingHead;
import com.example.demo.domain.Booking.ConfirmBooking.ConfirmBookingHead;
import com.example.demo.domain.Booking.GetPatientBookingDetail.GetPatientBookingDetailHead;
import com.example.demo.domain.Booking.GetPatientBookingList.GetPatientBookingListHead;

@Component
public class BookingModel {

	/**
	 * 22.1、获取预约资源
	 * @param AccessToken 调用接口的授权码
	 * @param DataSource 数据来源
	 * @param HospitalUserID 服务窗和医院之间确定身份的唯一标识 医院唯一
	 * @param OpenUserID 外部接入系统ID
	 * @return
	 */
	public  String sendStr(BookingResourceHead recordCardHead) {
		StringBuffer intput = new StringBuffer();
		intput.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?><xml><head><AccessToken>");
		intput.append(recordCardHead.getAccessToken());
		intput.append("</AccessToken><DataSource>");
		intput.append(recordCardHead.getDataSource());
		intput.append("</DataSource><HospitalUserID>");
		intput.append(recordCardHead.getHospitalUserID());
		intput.append("</HospitalUserID><OpenUserID>");
		intput.append(recordCardHead.getOpenUserID());
		intput.append("</OpenUserID></head><body></body><sign></sign></xml>");
		return intput.toString();
	       
	}
	
	/**
	 * 22.2、获取科室预约号源
	 * @param AccessToken 调用接口的授权码
	 * @param DataSource 数据来源
	 * @param HospitalUserID 服务窗和医院之间确定身份的唯一标识 医院唯一
	 * @param DeptCode 科室编码
	 * @param OpenUserID 外部接入系统ID
	 * @return
	 */
	public  String sendStr(BookingDeptNoSourceHead recordCardHead) {
		StringBuffer intput = new StringBuffer();
		intput.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?><xml><head><AccessToken>");
		intput.append(recordCardHead.getAccessToken());
		intput.append("</AccessToken><DataSource>");
		intput.append(recordCardHead.getDataSource());
		intput.append("</DataSource><HospitalUserID>");
		intput.append(recordCardHead.getHospitalUserID());
		intput.append("</HospitalUserID><DeptCode>");
		intput.append(recordCardHead.getDeptCode());		
		intput.append("</DeptCode><OpenUserID>");		
		intput.append(recordCardHead.getOpenUserID());
		intput.append("</OpenUserID></head><body></body><sign></sign></xml>");
		return intput.toString();
	       
	}
	
	/**
	 * 22.3、获取医生预约号源
	 * @param AccessToken 调用接口的授权码
	 * @param DataSource 数据来源
	 * @param HospitalUserID 服务窗和医院之间确定身份的唯一标识 医院唯一
	 * @param OpenUserID 外部接入系统ID
	 * @param DocCode 医生编码
	 * @param Day 日期
	 * @return
	 */
	public  String sendStr(BookingDocResourceHead recordCardHead) {
		StringBuffer intput = new StringBuffer();
		intput.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?><xml><head><AccessToken>");
		intput.append(recordCardHead.getAccessToken());
		intput.append("</AccessToken><DataSource>");
		intput.append(recordCardHead.getDataSource());
		intput.append("</DataSource><HospitalUserID>");
		intput.append(recordCardHead.getHospitalUserID());
		intput.append("</HospitalUserID><DocCode>");
		intput.append(recordCardHead.getDocCode());
		intput.append("</DocCode><Day>");
		intput.append(recordCardHead.getDay());
		intput.append("</Day><OpenUserID>");
		intput.append(recordCardHead.getOpenUserID());
		intput.append("</OpenUserID></head><body></body><sign></sign></xml>");
		return intput.toString();
	       
	}
	

	/**
	 * 22.6、确认预约
	 * @param AccessToken 调用接口的授权码
	 * @param DataSource 数据来源
	 * @param HospitalUserID 服务窗和医院之间确定身份的唯一标识 医院唯一
	 * @param OpenUserID 外部接入系统ID
	 * @param ResourceID 资源编号
	 * @param CouponNo 券号
	 * @return
	 */
	public  String sendStr(ConfirmBookingHead recordCardHead) {
		StringBuffer intput = new StringBuffer();
		intput.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?><xml><head><AccessToken>");
		intput.append(recordCardHead.getAccessToken());
		intput.append("</AccessToken><DataSource>");
		intput.append(recordCardHead.getDataSource());
		intput.append("</DataSource><HospitalUserID>");
		intput.append(recordCardHead.getHospitalUserID());
		intput.append("</HospitalUserID><ResourceID>");
		intput.append(recordCardHead.getResourceID());
		intput.append("</ResourceID><CouponNo>");
		intput.append(recordCardHead.getCouponNo());
		intput.append("</CouponNo><OpenUserID>");
		intput.append(recordCardHead.getOpenUserID());
		intput.append("</OpenUserID></head><body></body><sign></sign></xml>");
		return intput.toString();
	       
	}
	

	/**
	 * 22.7、取消预约
	 * @param AccessToken 调用接口的授权码
	 * @param DataSource 数据来源
	 * @param HospitalUserID 服务窗和医院之间确定身份的唯一标识 医院唯一
	 * @param BookingID 预约ID
	 * @param OpenUserID 外部接入系统ID
	 * @return
	 */
	public  String sendStr(CancelBookingHead recordCardHead) {
		StringBuffer intput = new StringBuffer();
		intput.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?><xml><head><AccessToken>");
		intput.append(recordCardHead.getAccessToken());
		intput.append("</AccessToken><DataSource>");
		intput.append(recordCardHead.getDataSource());
		intput.append("</DataSource><HospitalUserID>");
		intput.append(recordCardHead.getHospitalUserID());
		intput.append("</HospitalUserID><BookingID>");
		intput.append(recordCardHead.getBookingID());
		intput.append("</BookingID><OpenUserID>");
		intput.append(recordCardHead.getOpenUserID());
		intput.append("</OpenUserID></head><body></body><sign></sign></xml>");
		return intput.toString();
	       
	}
	
	/**
	 * 22.9、获取患者预约列表
	 * @param AccessToken 调用接口的授权码
	 * @param DataSource 数据来源
	 * @param HospitalUserID 服务窗和医院之间确定身份的唯一标识 医院唯一
	 * @param Day 日期
	 * @param OpenUserID 外部接入系统ID
	 * @return
	 */
	public  String sendStr(GetPatientBookingListHead recordCardHead) {
		StringBuffer intput = new StringBuffer();
		intput.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?><xml><head><AccessToken>");
		intput.append(recordCardHead.getAccessToken());
		intput.append("</AccessToken><DataSource>");
		intput.append(recordCardHead.getDataSource());
		intput.append("</DataSource><HospitalUserID>");
		intput.append(recordCardHead.getHospitalUserID());
		intput.append("</HospitalUserID><Day>");
		intput.append(recordCardHead.getDay());
		intput.append("</Day><OpenUserID>");
		intput.append(recordCardHead.getOpenUserID());
		intput.append("</OpenUserID></head><body></body><sign></sign></xml>");
		return intput.toString();
	       
	}
	

	/**
	 * 22.10、获取患者预约详细
	 * @param AccessToken 调用接口的授权码
	 * @param DataSource 数据来源
	 * @param HospitalUserID 服务窗和医院之间确定身份的唯一标识 医院唯一
	 * @param BookingID 预约ID
	 * @param OpenUserID 外部接入系统ID
	 * @return
	 */
	public  String sendStr(GetPatientBookingDetailHead recordCardHead) {
		StringBuffer intput = new StringBuffer();
		intput.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?><xml><head><AccessToken>");
		intput.append(recordCardHead.getAccessToken());
		intput.append("</AccessToken><DataSource>");
		intput.append(recordCardHead.getDataSource());
		intput.append("</DataSource><HospitalUserID>");
		intput.append(recordCardHead.getHospitalUserID());
		intput.append("</HospitalUserID><BookingID>");
		intput.append(recordCardHead.getBookingID());
		intput.append("</BookingID><OpenUserID>");
		intput.append(recordCardHead.getOpenUserID());
		intput.append("</OpenUserID></head><body></body><sign></sign></xml>");
		return intput.toString();
	       
	}



}
