package com.example.demo.domain.MedicalCard.GetHospitalMedicalCardList;

public class UserModel {

	//微信唯一识别码
	private String openId;
	
	//患者唯一标识ID
	private String patientID;
	
	//用户名字
	private String openUserName;
	
	//用户身份证
	private String openIDCard;
	
	//用户手机号
	private String openTel;
	
	//证件类型
	private Integer certType;
	
	//创建时间
	private String createTime;

	//多功能
	private String id;
	
	//临时
	private String paid;
	
	//临时患者身份证
	private String idCard;
	
	//临时患者手机号
	private String tel;

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPaid() {
		return paid;
	}

	public void setPaid(String paid) {
		this.paid = paid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getCertType() {
		return certType;
	}

	public void setCertType(Integer certType) {
		this.certType = certType;
	}

	public String getPatientID() {
		return patientID;
	}

	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOpenUserName() {
		return openUserName;
	}

	public void setOpenUserName(String openUserName) {
		this.openUserName = openUserName;
	}

	public String getOpenIDCard() {
		return openIDCard;
	}

	public void setOpenIDCard(String openIDCard) {
		this.openIDCard = openIDCard;
	}

	public String getOpenTel() {
		return openTel;
	}

	public void setOpenTel(String openTel) {
		this.openTel = openTel;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
	
}
