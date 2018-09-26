package com.example.demo.domain.MedicalCard.GetHospitalMedicalCardList;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("head")
public class GetHospitalMedicalCardListHead {

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
	
	//证件类型
	@XStreamAsAttribute
	@XStreamAlias("CertType")
	private String certType;
	
	//实名制身份证号
	@XStreamAsAttribute
	@XStreamAlias("OpenIDCard")
	private String openIDCard;
	
	//实名制手机号码
	@XStreamAsAttribute
	@XStreamAlias("OpenTel")
	private String openTel;
	
	//卡属性
	@XStreamAsAttribute
	@XStreamAlias("CardProperty")
	private String cardProperty;
	
	//卡号
	@XStreamAsAttribute
	@XStreamAlias("CardNo")
	private String cardNo;
	
	//就诊卡类型
	@XStreamAsAttribute
	@XStreamAlias("CardType")
	private String cardType;
	
	//数据来源
	@XStreamAsAttribute
	@XStreamAlias("DataSource")
	private String dataSource;

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

	public String getCertType() {
		return certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
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

	public String getCardProperty() {
		return cardProperty;
	}

	public void setCardProperty(String cardProperty) {
		this.cardProperty = cardProperty;
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

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}
	
	
}
