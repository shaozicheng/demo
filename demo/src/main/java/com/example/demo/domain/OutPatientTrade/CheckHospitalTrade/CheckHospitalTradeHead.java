package com.example.demo.domain.OutPatientTrade.CheckHospitalTrade;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("head")
public class CheckHospitalTradeHead {

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
	
	//总金额
	@XStreamAsAttribute
	@XStreamAlias("TotalAmount")
	private String totalAmount;
	
	//医嘱编号，处方编号
	@XStreamAsAttribute
	@XStreamAlias("AdvID")
	private String advID;
	
	//优惠码
	@XStreamAsAttribute
	@XStreamAlias("PreferentialCode")
	private String preferentialCode;
	
	//手机号码
	@XStreamAsAttribute
	@XStreamAlias("Tel")
	private String tel;
	
	//家庭住址，收货地址
	@XStreamAsAttribute
	@XStreamAlias("HomeAddress")
	private String homeAddress;
	
	//地址详情
	@XStreamAsAttribute
	@XStreamAlias("HomeAddressDetail")
	private String homeAddressDetail;

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

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getAdvID() {
		return advID;
	}

	public void setAdvID(String advID) {
		this.advID = advID;
	}

	public String getPreferentialCode() {
		return preferentialCode;
	}

	public void setPreferentialCode(String preferentialCode) {
		this.preferentialCode = preferentialCode;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getHomeAddressDetail() {
		return homeAddressDetail;
	}

	public void setHomeAddressDetail(String homeAddressDetail) {
		this.homeAddressDetail = homeAddressDetail;
	}
	
	
}
