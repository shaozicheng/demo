package com.example.demo.domain.OutPatientTrade.CheckHospitalTrade;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("CheckUnchargedTrade")
public class CheckUnchargedTrade {

	//外部订单编号
    @XStreamAsAttribute
    @XStreamAlias("OutTradeNo")
	private String outTradeNo;
    
	//总金额
    @XStreamAsAttribute
    @XStreamAlias("TotalAmount")
	private String totalAmount;

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	} 
    
    
}
