package com.example.demo.domain.OutPatientTrade.OutPatientUnchargeTradeList;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("OutPatientUnchargedOrderList")
public class OutPatientUnchargedOrderList {

	//门诊号
	@XStreamAsAttribute
	@XStreamAlias("OutPatientNumber")
	private String outPatientNumber;
	
	//诊间费用名称
	@XStreamAsAttribute
	@XStreamAlias("OutPatientCostName")
	private String outPatientCostName;
	
	//日期
	@XStreamAsAttribute
	@XStreamAlias("Day")
	private String day;
	
	//总金额
	@XStreamAsAttribute
	@XStreamAlias("TotalAmount")
	private String totalAmount;

	public String getOutPatientNumber() {
		return outPatientNumber;
	}

	public void setOutPatientNumber(String outPatientNumber) {
		this.outPatientNumber = outPatientNumber;
	}

	public String getOutPatientCostName() {
		return outPatientCostName;
	}

	public void setOutPatientCostName(String outPatientCostName) {
		this.outPatientCostName = outPatientCostName;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}


	
}
