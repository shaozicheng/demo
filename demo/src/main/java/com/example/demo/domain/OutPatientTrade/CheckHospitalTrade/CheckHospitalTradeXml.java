package com.example.demo.domain.OutPatientTrade.CheckHospitalTrade;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 诊间未缴费订单验证接口
 * @author shzch
 *
 */
@XStreamAlias("xml")
public class CheckHospitalTradeXml {


	@XStreamAsAttribute
	@XStreamAlias("head")
	private CheckHospitalTradeHead head;
	
	@XStreamAsAttribute
	@XStreamAlias("body")
	private CheckHospitalTradeBody body;
	
	@XStreamAsAttribute
	@XStreamAlias("sign")
	private String sign;

	public CheckHospitalTradeHead getHead() {
		return head;
	}

	public void setHead(CheckHospitalTradeHead head) {
		this.head = head;
	}

	public CheckHospitalTradeBody getBody() {
		return body;
	}

	public void setBody(CheckHospitalTradeBody body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
}
