package com.example.demo.domain.OutPatientTrade.OutPatientUnchargeTradeDetail;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("OutPatientUnChargedCostInfo")
public class OutPatientUnChargedCostInfo {

	//申请医生
	@XStreamAsAttribute
	@XStreamAlias("Doctor")
	private String doctor;
	
	//总金额
	@XStreamAsAttribute
	@XStreamAlias("TotalAmount")
	private String totalAmount;
	
	//医生开单时间
	@XStreamAsAttribute
	@XStreamAlias("ClinicDateTime")
	private String clinicDateTime;
	
	//卡号
	@XStreamAsAttribute
	@XStreamAlias("CardNo")
	private String cardNo;
	
	//患者姓名
	@XStreamAsAttribute
	@XStreamAlias("PatientName")
	private String patientName;
	
	//是否需要付款
	@XStreamAsAttribute
	@XStreamAlias("NeedPay")
	private String needPay;
	
	//需要支付金额
	@XStreamAsAttribute
	@XStreamAlias("NeedPayAmount")
	private String needPayAmount;
	
	//备注
	@XStreamAsAttribute
	@XStreamAlias("Memo")
	private String memo;
	
	//扩展信息
	@XStreamAsAttribute
	@XStreamAlias("ExtInfo")
	private String extInfo;
	
	//是否有优惠
	@XStreamAsAttribute
	@XStreamAlias("HasPreferential")
	private String hasPreferential;
	
	//是否配送
	@XStreamAsAttribute
	@XStreamAlias("IsDelivery")
	private String isDelivery;

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getClinicDateTime() {
		return clinicDateTime;
	}

	public void setClinicDateTime(String clinicDateTime) {
		this.clinicDateTime = clinicDateTime;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getNeedPay() {
		return needPay;
	}

	public void setNeedPay(String needPay) {
		this.needPay = needPay;
	}

	public String getNeedPayAmount() {
		return needPayAmount;
	}

	public void setNeedPayAmount(String needPayAmount) {
		this.needPayAmount = needPayAmount;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getExtInfo() {
		return extInfo;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getHasPreferential() {
		return hasPreferential;
	}

	public void setHasPreferential(String hasPreferential) {
		this.hasPreferential = hasPreferential;
	}

	public String getIsDelivery() {
		return isDelivery;
	}

	public void setIsDelivery(String isDelivery) {
		this.isDelivery = isDelivery;
	}
	
	
}
