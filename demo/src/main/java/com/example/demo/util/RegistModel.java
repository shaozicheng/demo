package com.example.demo.util;

import org.springframework.stereotype.Component;

import com.example.demo.domain.Booking.BookingDeptNoSource.BookingDeptNoSourceHead;
import com.example.demo.domain.Booking.BookingDocResource.BookingDocResourceHead;
import com.example.demo.domain.Booking.BookingResource.BookingResourceHead;
import com.example.demo.domain.Regist.CancelRegist.CancelRegistHead;
import com.example.demo.domain.Regist.ConfirmRegist.ConfirmRegistHead;
import com.example.demo.domain.Regist.GetPatientRegistDetail.GetPatientRegistDetailHead;
import com.example.demo.domain.Regist.GetPatientRegistList.GetPatientRegistListHead;

@Component
public class RegistModel {

	/**
	 * 23.1、获取挂号资源
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
	 * 23.2、获取科室挂号号源
	 * @param AccessToken 调用接口的授权码
	 * @param DataSource 数据来源
	 * @param HospitalUserID 服务窗和医院之间确定身份的唯一标识 医院唯一
	 * @param OpenUserID 外部接入系统ID
	 * @param DeptCode 科室编码
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
	 * 23.3、获取医生挂号号源
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
	 * 23.6、确认挂号
	 * @param AccessToken 调用接口的授权码
	 * @param DataSource 数据来源
	 * @param HospitalUserID 服务窗和医院之间确定身份的唯一标识 医院唯一
	 * @param OpenUserID 外部接入系统ID
	 * @param ResourceID 资源编号
	 * @return
	 */
	public  String sendStr(ConfirmRegistHead recordCardHead) {
		StringBuffer intput = new StringBuffer();
		intput.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?><xml><head><AccessToken>");
		intput.append(recordCardHead.getAccessToken());
		intput.append("</AccessToken><DataSource>");
		intput.append(recordCardHead.getDataSource());
		intput.append("</DataSource><HospitalUserID>");
		intput.append(recordCardHead.getHospitalUserID());
		intput.append("</HospitalUserID><ResourceID>");
		intput.append(recordCardHead.getResourceID());
		intput.append("</ResourceID><OpenUserID>");
		intput.append(recordCardHead.getOpenUserID());
		intput.append("</OpenUserID></head><body></body><sign></sign></xml>");
		return intput.toString();
	       
	}

	/**
	 * 23.7、取消挂号
	 * @param AccessToken 调用接口的授权码
	 * @param DataSource 数据来源
	 * @param HospitalUserID 服务窗和医院之间确定身份的唯一标识 医院唯一
	 * @param OutTradeNo 外部订单编号
	 * @param Memo 备注
	 * @return
	 */
	public  String sendStr(CancelRegistHead recordCardHead) {
		StringBuffer intput = new StringBuffer();
		intput.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?><xml><head><AccessToken>");
		intput.append(recordCardHead.getAccessToken());
		intput.append("</AccessToken><DataSource>");
		intput.append(recordCardHead.getDataSource());
		intput.append("</DataSource><HospitalUserID>");
		intput.append(recordCardHead.getHospitalUserID());
		intput.append("</HospitalUserID><Memo>");
		intput.append(recordCardHead.getMemo());
		intput.append("</Memo><OutTradeNo>");
		intput.append(recordCardHead.getOutTradeNo());
		intput.append("</OutTradeNo></head><body></body><sign></sign></xml>");
		return intput.toString();
	       
	}

	/**
	 * 23.8、获取患者挂号列表
	 * @param AccessToken 调用接口的授权码
	 * @param DataSource 数据来源
	 * @param HospitalUserID 服务窗和医院之间确定身份的唯一标识 医院唯一
	 * @param OpenUserID 外部接入系统ID
	 * @return
	 */
	public  String sendStr(GetPatientRegistListHead recordCardHead) {
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
	 * 23.9、获取患者挂号详细
	 * @param AccessToken 调用接口的授权码
	 * @param DataSource 数据来源
	 * @param HospitalUserID 服务窗和医院之间确定身份的唯一标识 医院唯一
	 * @param OpenUserID 外部接入系统ID
	 * @param OutTradeNo 外部订单编号
	 * @return
	 */
	public  String sendStr(GetPatientRegistDetailHead recordCardHead) {
		StringBuffer intput = new StringBuffer();
		intput.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?><xml><head><AccessToken>");
		intput.append(recordCardHead.getAccessToken());
		intput.append("</AccessToken><DataSource>");
		intput.append(recordCardHead.getDataSource());
		intput.append("</DataSource><HospitalUserID>");
		intput.append(recordCardHead.getHospitalUserID());
		intput.append("</HospitalUserID><OutTradeNo>");
		intput.append(recordCardHead.getOutTradeNo());
		intput.append("</OutTradeNo><OpenUserID>");
		intput.append(recordCardHead.getOpenUserID());
		intput.append("</OpenUserID></head><body></body><sign></sign></xml>");
		return intput.toString();
	       
	}
	
	
}
