package com.example.demo.domain.MedicalCard.RegistMedicalCard;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("CreateAndRegistMedicalCard")
public class RegistMedicalCardList {
	
	//卡号
    @XStreamAsAttribute
    @XStreamAlias("CardNo")
	private String cardNo;
	
    //就诊卡类型
    @XStreamAsAttribute
    @XStreamAlias("CardType")
	private String cardType;
	
    //服务窗和医院之间确定身份的唯一标识 医院唯一
    @XStreamAsAttribute
    @XStreamAlias("HospitalUserID")
    private String hospitalUserID;
    
    //患者姓名
    @XStreamAsAttribute
    @XStreamAlias("PatientName")
    private String patientName;
	

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

	public String getHospitalUserID() {
		return hospitalUserID;
	}

	public void setHospitalUserID(String hospitalUserID) {
		this.hospitalUserID = hospitalUserID;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	
	
}
