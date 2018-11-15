package com.example.demo.domain.OutPatientTrade.OutPatientChargedTradeDetail;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 获取诊间费用详细 
 * @author shzch
 *
 */
@XStreamAlias("xml")
public class OutPatientChargedTradeDetailXml {

	@XStreamAsAttribute
	@XStreamAlias("head")
	private OutPatientChargedTradeDetailHead head;
	
	
	@XStreamAsAttribute
	@XStreamAlias("body")
	private OutPatientChargedTradeDetailBody body;
	
	@XStreamAsAttribute
	@XStreamAlias("sign")
	private String sign;

	public OutPatientChargedTradeDetailHead getHead() {
		return head;
	}

	public void setHead(OutPatientChargedTradeDetailHead head) {
		this.head = head;
	}

	public OutPatientChargedTradeDetailBody getBody() {
		return body;
	}

	public void setBody(OutPatientChargedTradeDetailBody body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
}
