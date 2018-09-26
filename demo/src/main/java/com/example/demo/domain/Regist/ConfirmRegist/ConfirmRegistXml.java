package com.example.demo.domain.Regist.ConfirmRegist;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 确认挂号
 * @author shzch
 *
 */
@XStreamAlias("xml")
public class ConfirmRegistXml {

	@XStreamAsAttribute
	@XStreamAlias("head")
	private ConfirmRegistHead head;
	
	@XStreamAsAttribute
	@XStreamAlias("body")
	private ConfirmRegistBody body;
	
	@XStreamAsAttribute
	@XStreamAlias("sign")
	private String sign;

	public ConfirmRegistHead getHead() {
		return head;
	}

	public void setHead(ConfirmRegistHead head) {
		this.head = head;
	}

	public ConfirmRegistBody getBody() {
		return body;
	}

	public void setBody(ConfirmRegistBody body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
	
}
