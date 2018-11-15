package com.example.demo.util;

import org.springframework.stereotype.Component;

import com.example.demo.domain.OutPatientTrade.CheckHospitalTrade.CheckHospitalTradeHead;
import com.example.demo.domain.OutPatientTrade.OutPatientChargedTradeDetail.OutPatientChargedTradeDetailHead;
import com.example.demo.domain.OutPatientTrade.OutPatientChargedTradeList.OutPatientChargedTradeListHead;
import com.example.demo.domain.OutPatientTrade.OutPatientUnchargeTradeDetail.OutPatientUnchargeTradeDetailHead;
import com.example.demo.domain.OutPatientTrade.OutPatientUnchargeTradeList.OutPatientUnchargeTradeListHead;


@Component
public class OutPatientTradeModel {

	/**
	 * 5.1、获取诊间未缴费账单列表 
	 * @param AccessToken 调用接口的授权码
	 * @param HospitalUserID 服务窗和医院之间确定身份的唯一标识 医院唯一
	 * @param OpenUserID 外部接入系统ID
	 * @return
	 */
	public  String sendStr(OutPatientUnchargeTradeListHead recordCardHead) {
		StringBuffer intput = new StringBuffer();
		intput.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?><xml><head><AccessToken>");
		intput.append(recordCardHead.getAccessToken());
		intput.append("</AccessToken><HospitalUserID>");
		intput.append(recordCardHead.getHospitalUserID());
		intput.append("</HospitalUserID><OpenUserID>");
		intput.append(recordCardHead.getOpenUserID());
		intput.append("</OpenUserID></head><body></body><sign></sign></xml>");
		return intput.toString();
	       
	}
	
	/**
	 * 5.2、获取未付诊间缴费明细 
	 * @param AccessToken 调用接口的授权码
	 * @param OutPatientNumber 	门诊号
	 * @param HospitalUserID 服务窗和医院之间确定身份的唯一标识 医院唯一
	 * @param OpenUserID 外部接入系统ID
	 * @return
	 */
	public  String sendStr(OutPatientUnchargeTradeDetailHead recordCardHead) {
		StringBuffer intput = new StringBuffer();
		intput.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?><xml><head><AccessToken>");
		intput.append(recordCardHead.getAccessToken());
		intput.append("</AccessToken><OutPatientNumber>");
		intput.append(recordCardHead.getOutPatientNumber());
		intput.append("</OutPatientNumber><HospitalUserID>");
		intput.append(recordCardHead.getHospitalUserID());
		intput.append("</HospitalUserID><OpenUserID>");
		intput.append(recordCardHead.getOpenUserID());
		intput.append("</OpenUserID></head><body></body><sign></sign></xml>");
		return intput.toString();
	       
	}
	
	/**
	 * 5.3、获取诊间已缴费列表 
	 * @param AccessToken 调用接口的授权码
	 * @param DataSource 数据来源
	 * @param HospitalUserID 服务窗和医院之间确定身份的唯一标识 医院唯一
	 * @param OpenUserID 外部接入系统ID
	 * @return
	 */
	public  String sendStr(OutPatientChargedTradeListHead recordCardHead) {
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
	 * 5.4、获取诊间费用详细 
	 * @param AccessToken 调用接口的授权码
	 * @param OutTradeNo 外部订单编号
	 * @param HospitalUserID 服务窗和医院之间确定身份的唯一标识 医院唯一
	 * @param OpenUserID 外部接入系统ID
	 * @return
	 */
	public  String sendStr(OutPatientChargedTradeDetailHead recordCardHead) {
		StringBuffer intput = new StringBuffer();
		intput.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?><xml><head><AccessToken>");
		intput.append(recordCardHead.getAccessToken());
		intput.append("</AccessToken><OutTradeNo>");
		intput.append(recordCardHead.getOutTradeNo());
		intput.append("</OutTradeNo><HospitalUserID>");
		intput.append(recordCardHead.getHospitalUserID());
		intput.append("</HospitalUserID><OpenUserID>");
		intput.append(recordCardHead.getOpenUserID());
		intput.append("</OpenUserID></head><body></body><sign></sign></xml>");
		return intput.toString();
	       
	}
	
	/**
	 * 5.5、诊间未缴费订单验证接口（院方） 
	 * @param AccessToken 调用接口的授权码
	 * @param OutPatientNumber 门诊号
	 * @param HospitalUserID 服务窗和医院之间确定身份的唯一标识 医院唯一
	 * @param OpenUserID 外部接入系统ID
	 * @param TotalAmount 	总金额
	 * @param AdvID  医嘱编号，处方编号
	 * @param PreferentialCode  优惠码
	 * @param Tel  手机号码
	 * @param HomeAddress  家庭住址，收货地址
	 * @param HomeAddressDetail  地址详情
	 * @return
	 */
	public  String sendStr(CheckHospitalTradeHead recordCardHead) {
		StringBuffer intput = new StringBuffer();
		intput.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?><xml><head><AccessToken>");
		intput.append(recordCardHead.getAccessToken());
		intput.append("</AccessToken><OutPatientNumber>");
		intput.append(recordCardHead.getOutPatientNumber());
		intput.append("</OutPatientNumber><TotalAmount>");		
		intput.append(recordCardHead.getTotalAmount());
		intput.append("</TotalAmount><AdvID>");
		intput.append(recordCardHead.getAdvID());
		intput.append("</AdvID><PreferentialCode>");
		intput.append(recordCardHead.getPreferentialCode());
		intput.append("</PreferentialCode><Tel>");
		intput.append(recordCardHead.getTel());
		intput.append("</Tel><HomeAddress>");
		intput.append(recordCardHead.getHomeAddress());
		intput.append("</HomeAddress><HomeAddressDetail>");
		intput.append(recordCardHead.getHomeAddressDetail());
		intput.append("</HomeAddressDetail><HospitalUserID>");
		intput.append(recordCardHead.getHospitalUserID());
		intput.append("</HospitalUserID><OpenUserID>");
		intput.append(recordCardHead.getOpenUserID());
		intput.append("</OpenUserID></head><body></body><sign></sign></xml>");
		return intput.toString();
	       
	}
	
}
