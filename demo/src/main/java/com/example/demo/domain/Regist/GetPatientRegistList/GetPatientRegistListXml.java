package com.example.demo.domain.Regist.GetPatientRegistList;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 获取患者挂号列表
 * @author shzch
 *
 */
@XStreamAlias("xml")
public class GetPatientRegistListXml {

	@XStreamAsAttribute
	@XStreamAlias("head")
	private GetPatientRegistListHead head;
	
	@XStreamAsAttribute
	@XStreamAlias("body")
	private GetPatientRegistListBody body;
	
	@XStreamAsAttribute
	@XStreamAlias("sign")
	private String sign;

	public GetPatientRegistListHead getHead() {
		return head;
	}

	public void setHead(GetPatientRegistListHead head) {
		this.head = head;
	}

	public GetPatientRegistListBody getBody() {
		return body;
	}

	public void setBody(GetPatientRegistListBody body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
	
}
