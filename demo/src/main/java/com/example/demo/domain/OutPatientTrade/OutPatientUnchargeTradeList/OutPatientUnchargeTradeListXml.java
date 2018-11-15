package com.example.demo.domain.OutPatientTrade.OutPatientUnchargeTradeList;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 获取诊间未缴费账单列表 
 * @author shzch
 *
 */
@XStreamAlias("xml")
public class OutPatientUnchargeTradeListXml {

	@XStreamAsAttribute
	@XStreamAlias("head")
	private OutPatientUnchargeTradeListHead head;
	
	@XStreamAsAttribute
	@XStreamAlias("body")
	private OutPatientUnchargeTradeListBody body;
	
	@XStreamAsAttribute
	@XStreamAlias("sign")
	private String sign;

	public OutPatientUnchargeTradeListHead getHead() {
		return head;
	}

	public void setHead(OutPatientUnchargeTradeListHead head) {
		this.head = head;
	}

	public OutPatientUnchargeTradeListBody getBody() {
		return body;
	}

	public void setBody(OutPatientUnchargeTradeListBody body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	
}
