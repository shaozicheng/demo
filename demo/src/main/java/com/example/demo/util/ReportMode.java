package com.example.demo.util;

import org.springframework.stereotype.Component;

import com.example.demo.domain.Report.GetJianyanReportDetail.GetJianyanReportDetailHead;
import com.example.demo.domain.Report.GetJianyanReportList.GetJianyanReportListHead;

@Component
public class ReportMode {

	/**
	 * 8.1、获取检验报告列表
	 * @param AccessToken 调用接口的授权码
	 * @param OpenUserID 外部接入系统ID
	 * @param HospitalUserID 服务窗和医院之间确定身份的唯一标识 医院唯一
	 * @param DataSource 数据来源
	 * @return
	 */
	public  String sendStr(GetJianyanReportListHead recordCardHead) {
		StringBuffer intput = new StringBuffer();
		intput.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?><xml><head><AccessToken>");
		intput.append(recordCardHead.getAccessToken());
		intput.append("</AccessToken><OpenUserID>");
		intput.append(recordCardHead.getOpenUserID());
		intput.append("</OpenUserID><HospitalUserID>");
		intput.append(recordCardHead.getHospitalUserID());
		intput.append("</HospitalUserID><DataSource>");
		intput.append(recordCardHead.getDataSource());
		intput.append("</DataSource></head><body></body><sign></sign></xml>");
		return intput.toString();
	       
	}
	
	/**
	 * 8.2、获取检验报告详细
	 * @param AccessToken 调用接口的授权码
	 * @param ReportNo 报告单编号
	 * @param HospitalUserID 服务窗和医院之间确定身份的唯一标识 医院唯一
	 * @param ReportReadStatus 报告读取状态
	 * @param OpenUserID 外部接入系统ID
	 * @return
	 */
	public  String sendStr(GetJianyanReportDetailHead recordCardHead) {
		StringBuffer intput = new StringBuffer();
		intput.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?><xml><head><AccessToken>");
		intput.append(recordCardHead.getAccessToken());
		intput.append("</AccessToken><ReportNo>");
		intput.append(recordCardHead.getReportNo());
		intput.append("</ReportNo><HospitalUserID>");
		intput.append(recordCardHead.getHospitalUserID());
		intput.append("</HospitalUserID><ReportReadStatus>");
		intput.append(recordCardHead.getReportReadStatus());
		intput.append("</ReportReadStatus><OpenUserID>");
		intput.append(recordCardHead.getOpenUserID());
		intput.append("</OpenUserID></head><body></body><sign></sign></xml>");
		return intput.toString();
	       
	}
	
	

	
	
	
	
}
