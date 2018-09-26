package com.example.demo.domain.Regist.GetPatientRegistList;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("RegistList")
public class RegistList {

	//外部订单编号
    @XStreamAsAttribute
    @XStreamAlias("OutTradeNo")
	private String OutTradeNo;
	
    //患者姓名
    @XStreamAsAttribute
    @XStreamAlias("PatientName")
	private String PatientName;
	
    //挂号日期
    @XStreamAsAttribute
    @XStreamAlias("RegistDate")
    private String RegistDate;
    
    //就诊内容
    @XStreamAsAttribute
    @XStreamAlias("DiagnosisDetails")
	private String DiagnosisDetails;
	
    //排队号
    @XStreamAsAttribute
    @XStreamAlias("QueuingNumber")
	private String QueuingNumber;
	
    //挂号状态
    @XStreamAsAttribute
    @XStreamAlias("RegistStatus")
    private String RegistStatus;

    
    //交易日期时间
    @XStreamAsAttribute
    @XStreamAlias("TradeDateTime")
	private String TradeDateTime;
    
    
    //总金额
    @XStreamAsAttribute
    @XStreamAlias("TotalAmount")
	private String TotalAmount;
    
    
    //签到状态
    @XStreamAsAttribute
    @XStreamAlias("CheckStatus")
	private String CheckStatus;
	
}
