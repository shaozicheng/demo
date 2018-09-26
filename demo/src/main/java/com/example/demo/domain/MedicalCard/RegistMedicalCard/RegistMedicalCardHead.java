package com.example.demo.domain.MedicalCard.RegistMedicalCard;


import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;


@XStreamAlias("head")
public class RegistMedicalCardHead {
	
	//调用接口的授权码
	@XStreamAsAttribute
	@XStreamAlias("AccessToken")
	private String accessToken;
	
	//外部接入系统ID
	@XStreamAsAttribute
	@XStreamAlias("OpenUserID")
	private String openUserID;
	
	//实名制用户姓名
	@XStreamAsAttribute
	@XStreamAlias("OpenUserName")
	private String openUserName;
	
	//实名制身份证号
	@XStreamAsAttribute
	@XStreamAlias("OpenIDCard")
	private String openIDCard;
	
	//实名制手机号码
	@XStreamAsAttribute
	@XStreamAlias("OpenTel")
	private String openTel;
	
	//手机号码
	@XStreamAsAttribute
	@XStreamAlias("Tel")
	private String tel;
	
	//证件类型
	@XStreamAsAttribute
	@XStreamAlias("CertType")
	private String certType;
	
	//家庭住址，收货地址
	@XStreamAsAttribute
	@XStreamAlias("HomeAddress")
	private String homeAddress;
	
	//身份证号码
	@XStreamAsAttribute
	@XStreamAlias("IDCard")
	private String idCard;
	
	//患者姓名
	@XStreamAsAttribute
	@XStreamAlias("PatientName")
	private String patientName;
	
	//卡号
	@XStreamAsAttribute
	@XStreamAlias("CardNo")
	private String cardNo;
	
	//就诊卡类型
	@XStreamAsAttribute
	@XStreamAlias("CardType")
	private String cardType;
	
	//卡属性
	@XStreamAsAttribute
	@XStreamAlias("CardProperty")
	private String cardProperty;
	
	//验证码
	@XStreamAsAttribute
	@XStreamAlias("VerCode")
	private String verCode;

	//扩展信息
	@XStreamAsAttribute
	@XStreamAlias("ExtInfo")
	private String extInfo;
	
	//服务窗和医院之间确定身份的唯一标识 医院唯一
	private String hospitalUserID;
	
	//微信唯一识别码
	private String openID;
	
	//患者唯一ID
	private String patientID;
	
	//时间
	private String time;
	
	public String getExtInfo() {
		return extInfo;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPatientID() {
		return patientID;
	}

	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	public String getOpenID() {
		return openID;
	}

	public void setOpenID(String openID) {
		this.openID = openID;
	}

	public String getHospitalUserID() {
		return hospitalUserID;
	}

	public void setHospitalUserID(String hospitalUserID) {
		this.hospitalUserID = hospitalUserID;
	}

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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCertType() {
		return certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardProperty() {
		return cardProperty;
	}

	public void setCardProperty(String cardProperty) {
		this.cardProperty = cardProperty;
	}

	public String getVerCode() {
		return verCode;
	}

	public void setVerCode(String verCode) {
		this.verCode = verCode;
	}
	
	
}
