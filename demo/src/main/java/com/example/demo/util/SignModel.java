package com.example.demo.util;

import org.springframework.stereotype.Component;

import com.example.demo.domain.Sign.GetSignList.GetSignListHead;

@Component
public class SignModel {

	/**
	 * 39.1、获取签到取号列表
	 * @param AccessToken 调用接口的授权码
	 * @param DataSource 数据来源
	 * @param HospitalUserID 服务窗和医院之间确定身份的唯一标识 医院唯一
	 * @param OpenUserID 外部接入系统ID
	 * @return
	 */
	public  String sendStr(GetSignListHead recordCardHead) {
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
	
}
