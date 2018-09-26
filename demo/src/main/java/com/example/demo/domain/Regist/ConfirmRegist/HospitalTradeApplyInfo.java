package com.example.demo.domain.Regist.ConfirmRegist;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("HospitalTradeApplyInfo ")
public class HospitalTradeApplyInfo {

	//外部订单编号
    @XStreamAsAttribute
    @XStreamAlias("OutTradeNo")
	private String outTradeNo;
	
    //是否需要付款
    @XStreamAsAttribute
    @XStreamAlias("NeedPay")
	private String needPay;
	
    //总金额
    @XStreamAsAttribute
    @XStreamAlias("TotalAmount")
    private String totalAmount;
    
    //备注
    @XStreamAsAttribute
    @XStreamAlias("Memo")
    private String memo;
}
