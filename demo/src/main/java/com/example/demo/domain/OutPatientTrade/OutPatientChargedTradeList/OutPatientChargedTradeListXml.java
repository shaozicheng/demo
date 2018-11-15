package com.example.demo.domain.OutPatientTrade.OutPatientChargedTradeList;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 获取诊间已缴费列表 
 * @author shzch
 *
 */
@XStreamAlias("xml")
public class OutPatientChargedTradeListXml {

	@XStreamAsAttribute
	@XStreamAlias("head")
	private OutPatientChargedTradeListHead head;
	
	@XStreamAsAttribute
	@XStreamAlias("body")
	private OutPatientChargedTradeListBody body;
	
	@XStreamAsAttribute
	@XStreamAlias("sign")
	private String sign;

	public OutPatientChargedTradeListHead getHead() {
		return head;
	}

	public void setHead(OutPatientChargedTradeListHead head) {
		this.head = head;
	}

	public OutPatientChargedTradeListBody getBody() {
		return body;
	}

	public void setBody(OutPatientChargedTradeListBody body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	
}
