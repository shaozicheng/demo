package com.example.demo.domain.OutPatientTrade.OutPatientChargedTradeList;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("OutPatientChargedOrderList")
public class OutPatientChargedOrderList {
	
	//外部订单编号
	@XStreamAsAttribute
	@XStreamAlias("OutTradeNo")
	private String outTradeNo;
	
	//诊间费用名称
	@XStreamAsAttribute
	@XStreamAlias("OutPatientCostName")
	private String outPatientCostName;
	
	//条形码
	@XStreamAsAttribute
	@XStreamAlias("Barcode")
	private String barcode;
	
	//条码备注
	@XStreamAsAttribute
	@XStreamAlias("BarCodeMemo")
	private String barCodeMemo;
	
	//订单创建日期时间
	@XStreamAsAttribute
	@XStreamAlias("TradeCreateDateTime")
	private String tradeCreateDateTime;
	
	//总金额
	@XStreamAsAttribute
	@XStreamAlias("TotalAmount")
	private String totalAmount;
	
	//交易日期时间
	@XStreamAsAttribute
	@XStreamAlias("TradeDateTime")
	private String tradeDateTime;
	
	//二维码
	@XStreamAsAttribute
	@XStreamAlias("TwoDimensionCode")
	private String twoDimensionCode;
	
	//交易状态
	@XStreamAsAttribute
	@XStreamAlias("OutTradeStatus")
	private String outTradeStatus;
	
	//二维码备注
	@XStreamAsAttribute
	@XStreamAlias("QrCodeMemo")
	private String qrCodeMemo;

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getOutPatientCostName() {
		return outPatientCostName;
	}

	public void setOutPatientCostName(String outPatientCostName) {
		this.outPatientCostName = outPatientCostName;
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

	public String getTradeCreateDateTime() {
		return tradeCreateDateTime;
	}

	public void setTradeCreateDateTime(String tradeCreateDateTime) {
		this.tradeCreateDateTime = tradeCreateDateTime;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradeDateTime() {
		return tradeDateTime;
	}

	public void setTradeDateTime(String tradeDateTime) {
		this.tradeDateTime = tradeDateTime;
	}

	public String getTwoDimensionCode() {
		return twoDimensionCode;
	}

	public void setTwoDimensionCode(String twoDimensionCode) {
		this.twoDimensionCode = twoDimensionCode;
	}

	public String getOutTradeStatus() {
		return outTradeStatus;
	}

	public void setOutTradeStatus(String outTradeStatus) {
		this.outTradeStatus = outTradeStatus;
	}

	public String getQrCodeMemo() {
		return qrCodeMemo;
	}

	public void setQrCodeMemo(String qrCodeMemo) {
		this.qrCodeMemo = qrCodeMemo;
	}
	
	
}
