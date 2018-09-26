package com.example.demo.domain.Regist.CancelRegist;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("HospitalTradeRefundInfo")
public class HospitalTradeRefundInfo {
	
	//是否需要退款
    @XStreamAsAttribute
    @XStreamAlias("NeedRefund")
	private String needRefund;
	
    //总金额
    @XStreamAsAttribute
    @XStreamAlias("TotalAmount")
	private String totalAmount;

}
