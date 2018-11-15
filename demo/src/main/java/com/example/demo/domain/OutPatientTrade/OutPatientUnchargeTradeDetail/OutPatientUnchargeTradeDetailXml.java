package com.example.demo.domain.OutPatientTrade.OutPatientUnchargeTradeDetail;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 获取未付诊间缴费明细 
 * @author shzch
 *
 */
@XStreamAlias("xml")
public class OutPatientUnchargeTradeDetailXml {

	@XStreamAsAttribute
	@XStreamAlias("head")
	private OutPatientUnchargeTradeDetailHead head;
	
	@XStreamAsAttribute
	@XStreamAlias("body")
	private OutPatientUnchargeTradeDetailBody body;
	
	@XStreamAsAttribute
	@XStreamAlias("sign")
	private String sign;

	public OutPatientUnchargeTradeDetailHead getHead() {
		return head;
	}

	public void setHead(OutPatientUnchargeTradeDetailHead head) {
		this.head = head;
	}

	public OutPatientUnchargeTradeDetailBody getBody() {
		return body;
	}

	public void setBody(OutPatientUnchargeTradeDetailBody body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	
}
