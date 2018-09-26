package com.example.demo.domain.MedicalCard.RegistMedicalCard;


import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
/**
 * 登记就诊卡
 * @author shzch
 *
 */
@XStreamAlias("xml")
public class RegistMedicalCardXml {

	@XStreamAsAttribute
	@XStreamAlias("head")
	private RegistMedicalCardHead head;
	
	
	@XStreamAsAttribute
	@XStreamAlias("body")
	private RegistMedicalCardBody body;
	
	@XStreamAsAttribute
	@XStreamAlias("sign")
	private String sign;

	public RegistMedicalCardHead getHead() {
		return head;
	}

	public void setHead(RegistMedicalCardHead head) {
		this.head = head;
	}

	public RegistMedicalCardBody getBody() {
		return body;
	}

	public void setBody(RegistMedicalCardBody body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
	
}
