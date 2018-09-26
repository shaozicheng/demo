package com.example.demo.domain.Regist.CancelRegist;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 取消挂号
 * @author shzch
 *
 */
@XStreamAlias("xml")
public class CancelRegistXml {

	@XStreamAsAttribute
	@XStreamAlias("head")
	private CancelRegistHead head;
	
	
	@XStreamAsAttribute
	@XStreamAlias("body")
	private CancelRegistBody body;
	
	@XStreamAsAttribute
	@XStreamAlias("sign")
	private String sign;

	public CancelRegistHead getHead() {
		return head;
	}

	public void setHead(CancelRegistHead head) {
		this.head = head;
	}

	public CancelRegistBody getBody() {
		return body;
	}

	public void setBody(CancelRegistBody body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
	
}
