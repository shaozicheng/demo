package com.example.demo.domain.MedicalCard.CancelMedicalCard;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 解绑就诊卡
 * @author shzch
 *
 */
@XStreamAlias("xml")
public class CancelMedicalCardXml {

	@XStreamAsAttribute
	@XStreamAlias("head")
	private CancelMedicalCardHead head;
	
	
	@XStreamAsAttribute
	@XStreamAlias("body")
	private CancelMedicalCardBody body;
	
	@XStreamAsAttribute
	@XStreamAlias("sign")
	private String sign;

	public CancelMedicalCardHead getHead() {
		return head;
	}

	public void setHead(CancelMedicalCardHead head) {
		this.head = head;
	}

	public CancelMedicalCardBody getBody() {
		return body;
	}

	public void setBody(CancelMedicalCardBody body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
}
