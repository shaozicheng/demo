package com.example.demo.util;

import org.springframework.stereotype.Component;

import com.example.demo.domain.MedicalCard.CancelMedicalCard.CancelMedicalCardHead;
import com.example.demo.domain.MedicalCard.GetHospitalMedicalCardList.GetHospitalMedicalCardListHead;
import com.example.demo.domain.MedicalCard.RegistMedicalCard.RegistMedicalCardHead;

@Component
public class MedicalCardMode {

	
	/**
	 * 登记就诊卡
	 * @param AccessToken 调用接口的授权码
	 * @param OpenUserID 外部接入系统ID
	 * @param OpenUserName 实名制用户姓名
	 * @param OpenIDCard 实名制身份证号
	 * @param OpenTel 实名制手机号码
	 * @param Tel 手机号码
	 * @param CertType 证件类型
	 * @param HomeAddress 家庭住址，收货地址
	 * @param IDCard 身份证号码
	 * @param PatientName 患者姓名
	 * @param CardNo 卡号
	 * @param CardType 就诊卡类型
	 * @param CardProperty 卡属性
	 * @param VerCode 验证码
	 * @return
	 */
	public  String sendStr(RegistMedicalCardHead recordCardHead) {
		StringBuffer intput = new StringBuffer();
		intput.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?><xml><head><AccessToken>");
		intput.append(recordCardHead.getAccessToken());
		intput.append("</AccessToken><OpenUserID>");
		intput.append(recordCardHead.getOpenUserID());
		intput.append("</OpenUserID><OpenUserName>");
		intput.append(recordCardHead.getOpenUserName());
		intput.append("</OpenUserName><OpenIDCard>");
		intput.append(recordCardHead.getOpenIDCard());
		intput.append("</OpenIDCard><OpenTel>");
		intput.append(recordCardHead.getOpenTel());
		intput.append("</OpenTel><Tel>");
		intput.append(recordCardHead.getTel());
		intput.append("</Tel><CertType>");
		intput.append(recordCardHead.getCertType());
		intput.append("</CertType><HomeAddress>");
		intput.append(recordCardHead.getHomeAddress());
		intput.append("</HomeAddress><IDCard>");
		intput.append(recordCardHead.getIdCard());
		intput.append("</IDCard><PatientName>");
		intput.append(recordCardHead.getPatientName());
		intput.append("</PatientName><CardNo>");
		intput.append(recordCardHead.getCardNo());
		intput.append("</CardNo><CardType>");
		intput.append(recordCardHead.getCardType());
		intput.append("</CardType><CardProperty>");
		intput.append(recordCardHead.getCardProperty());
		intput.append("</CardProperty><VerCode>");
		intput.append(recordCardHead.getVerCode());
		intput.append("</VerCode><ExtInfo>");
		intput.append(recordCardHead.getExtInfo() );
		intput.append("</ExtInfo></head><body></body><sign></sign></xml>");
		return intput.toString();
	       
	}
	
	/**
	 * 获取医院已有卡列表
	 * @param AccessToken 调用接口的授权码
	 * @param OpenUserID 外部接入系统ID
	 * @param OpenUserName 实名制用户姓名
	 * @param OpenIDCard 实名制身份证号
	 * @param OpenTel 实名制手机号码
	 * @param CertType 证件类型
	 * @param DataSource 数据来源
	 * @param CardNo 卡号
	 * @param CardProperty 卡属性
	 * @param CardType 就诊卡类型
	 * @return
	 */
	public  String sendStr(GetHospitalMedicalCardListHead recordCardHead) {
		StringBuffer intput = new StringBuffer();
		intput.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?><xml><head><AccessToken>");
		intput.append(recordCardHead.getAccessToken());
		intput.append("</AccessToken><OpenUserID>");
		intput.append(recordCardHead.getOpenUserID());
		intput.append("</OpenUserID><OpenUserName>");
		intput.append(recordCardHead.getOpenUserName());
		intput.append("</OpenUserName><OpenIDCard>");
		intput.append(recordCardHead.getOpenIDCard());
		intput.append("</OpenIDCard><OpenTel>");
		intput.append(recordCardHead.getOpenTel());
		intput.append("</OpenTel><CertType>");
		intput.append(recordCardHead.getCertType());
		intput.append("</CertType><DataSource>");
		intput.append(recordCardHead.getDataSource());
		intput.append("</DataSource><CardNo>");
		intput.append(recordCardHead.getCardNo());
		intput.append("</CardNo><CardProperty>");
		intput.append(recordCardHead.getCardProperty());
		intput.append("</CardProperty><CardType>");
		intput.append(recordCardHead.getCardType());
		intput.append("</CardType></head><body></body><sign></sign></xml>");
		return intput.toString();
	       
	}
	
	/**
	 * 解绑医院卡
	 * @param AccessToken 调用接口的授权码
	 * @param OpenUserID 外部接入系统ID
	 * @param OpenUserName 实名制用户姓名
	 * @return
	 */
	public  String sendStr(CancelMedicalCardHead recordCardHead) {
		StringBuffer intput = new StringBuffer();
		intput.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?><xml><head><AccessToken>");
		intput.append(recordCardHead.getAccessToken());
		intput.append("</AccessToken><OpenUserID>");
		intput.append(recordCardHead.getOpenUserID());
		intput.append("</OpenUserID><HospitalUserID>");
		intput.append(recordCardHead.getHospitalUserID());
		intput.append("</HospitalUserID></head><body></body><sign></sign></xml>");
		return intput.toString();
	       
	}
	
}
