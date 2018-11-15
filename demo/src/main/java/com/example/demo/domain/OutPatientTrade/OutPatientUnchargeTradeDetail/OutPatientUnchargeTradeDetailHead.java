package com.example.demo.domain.OutPatientTrade.OutPatientUnchargeTradeDetail;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("head")
public class OutPatientUnchargeTradeDetailHead {

	//调用接口的授权码
	@XStreamAsAttribute
	@XStreamAlias("AccessToken")
	private String accessToken;
	
	//外部接入系统ID
	@XStreamAsAttribute
	@XStreamAlias("OpenUserID")
	private String openUserID;
	
	//服务窗和医院之间确定身份的唯一标识 医院唯一
	@XStreamAsAttribute
	@XStreamAlias("HospitalUserID")
	private String hospitalUserID;
	
	//门诊号
	@XStreamAsAttribute
	@XStreamAlias("OutPatientNumber")
	private String outPatientNumber;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getOpenUserID() {
		return openUserID;
	}

	public void setOpenUserID(String openUserID) {
		this.openUserID = openUserID;
	}

	public String getHospitalUserID() {
		return hospitalUserID;
	}

	public void setHospitalUserID(String hospitalUserID) {
		this.hospitalUserID = hospitalUserID;
	}

	public String getOutPatientNumber() {
		return outPatientNumber;
	}

	public void setOutPatientNumber(String outPatientNumber) {
		this.outPatientNumber = outPatientNumber;
	}

	
}
