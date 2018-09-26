package com.example.demo.domain.Regist.GetPatientRegistDetail;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 获取患者挂号详细
 * @author shzch
 *
 */
@XStreamAlias("xml")
public class GetPatientRegistDetailXml {

	@XStreamAsAttribute
	@XStreamAlias("head")
	private GetPatientRegistDetailHead head;
	
	
	@XStreamAsAttribute
	@XStreamAlias("body")
	private GetPatientRegistDetailBody body;
	
	@XStreamAsAttribute
	@XStreamAlias("sign")
	private String sign;

	public GetPatientRegistDetailHead getHead() {
		return head;
	}

	public void setHead(GetPatientRegistDetailHead head) {
		this.head = head;
	}

	public GetPatientRegistDetailBody getBody() {
		return body;
	}

	public void setBody(GetPatientRegistDetailBody body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
	
}
