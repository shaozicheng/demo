package com.example.demo.domain.OutPatientTrade.OutPatientChargedTradeDetail;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("OutPatientCostInfo")
public class OutPatientCostInfo {

	//申请医生
	@XStreamAsAttribute
	@XStreamAlias("Doctor")
	private String doctor;
	
	//发票号
	@XStreamAsAttribute
	@XStreamAlias("InvoiceNumber")
	private String invoiceNumber;
	
	//收据号
	@XStreamAsAttribute
	@XStreamAlias("ReceiptNumber")
	private String receiptNumber;
	
	//消息
	@XStreamAsAttribute
	@XStreamAlias("Message")
	private String message;
	
	//二维码
	@XStreamAsAttribute
	@XStreamAlias("TwoDimensionCode")
	private String twoDimensionCode;
	
	//条形码
	@XStreamAsAttribute
	@XStreamAlias("Barcode")
	private String barcode;
	
	//条码备注
	@XStreamAsAttribute
	@XStreamAlias("BarCodeMemo")
	private String barCodeMemo;
	
	//二维码备注
	@XStreamAsAttribute
	@XStreamAlias("QrCodeMemo")
	private String qrCodeMemo;

	//总金额
	@XStreamAsAttribute
	@XStreamAlias("TotalAmount")
	private String totalAmount;
	
	//订单创建日期时间
	@XStreamAsAttribute
	@XStreamAlias("TradeCreateDateTime")
	private String tradeCreateDateTime;
	
	//交易日期时间
	@XStreamAsAttribute
	@XStreamAlias("TradeDateTime")
	private String tradeDateTime;
	
	//卡号
	@XStreamAsAttribute
	@XStreamAlias("CardNo")
	private String cardNo;
	
	//患者姓名
	@XStreamAsAttribute
	@XStreamAlias("PatientName")
	private String patientName;
	
	//外部订单编号
	@XStreamAsAttribute
	@XStreamAlias("OutTradeNo")
	private String outTradeNo;
	
	//手机号码
	@XStreamAsAttribute
	@XStreamAlias("Tel")
	private String tel;
	
	//地址详情
	@XStreamAsAttribute
	@XStreamAlias("HomeAddressDetail")
	private String homeAddressDetail;

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getReceiptNumber() {
		return receiptNumber;
	}

	public void setReceiptNumber(String receiptNumber) {
		this.receiptNumber = receiptNumber;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTwoDimensionCode() {
		return twoDimensionCode;
	}

	public void setTwoDimensionCode(String twoDimensionCode) {
		this.twoDimensionCode = twoDimensionCode;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getBarCodeMemo() {
		return barCodeMemo;
	}

	public void setBarCodeMemo(String barCodeMemo) {
		this.barCodeMemo = barCodeMemo;
	}

	public String getQrCodeMemo() {
		return qrCodeMemo;
	}

	public void setQrCodeMemo(String qrCodeMemo) {
		this.qrCodeMemo = qrCodeMemo;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradeCreateDateTime() {
		return tradeCreateDateTime;
	}

	public void setTradeCreateDateTime(String tradeCreateDateTime) {
		this.tradeCreateDateTime = tradeCreateDateTime;
	}

	public String getTradeDateTime() {
		return tradeDateTime;
	}

	public void setTradeDateTime(String tradeDateTime) {
		this.tradeDateTime = tradeDateTime;
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

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getHomeAddressDetail() {
		return homeAddressDetail;
	}

	public void setHomeAddressDetail(String homeAddressDetail) {
		this.homeAddressDetail = homeAddressDetail;
	}

}
