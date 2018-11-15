package com.example.demo.domain.Sign.GetSignList;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 获取签到取号列表
 * @author shzch
 *
 */
@XStreamAlias("xml")
public class GetSignListXml {

	@XStreamAsAttribute
	@XStreamAlias("head")
	private GetSignListHead head;
	
	
	@XStreamAsAttribute
	@XStreamAlias("body")
	private GetSignListBody body;
	
	@XStreamAsAttribute
	@XStreamAlias("sign")
	private String sign;

	public GetSignListHead getHead() {
		return head;
	}

	public void setHead(GetSignListHead head) {
		this.head = head;
	}

	public GetSignListBody getBody() {
		return body;
	}

	public void setBody(GetSignListBody body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
}
