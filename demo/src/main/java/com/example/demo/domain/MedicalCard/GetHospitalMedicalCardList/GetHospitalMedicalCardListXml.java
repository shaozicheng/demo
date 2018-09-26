package com.example.demo.domain.MedicalCard.GetHospitalMedicalCardList;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 获取医院已有卡列表
 * @author shzch
 *
 */
@XStreamAlias("xml")
public class GetHospitalMedicalCardListXml {

	@XStreamAsAttribute
	@XStreamAlias("head")
	private GetHospitalMedicalCardListHead head;
	
	
	@XStreamAsAttribute
	@XStreamAlias("body")
	private GetHospitalMedicalCardListBody body;
	
	@XStreamAsAttribute
	@XStreamAlias("sign")
	private String sign;

	public GetHospitalMedicalCardListHead getHead() {
		return head;
	}

	public void setHead(GetHospitalMedicalCardListHead head) {
		this.head = head;
	}

	public GetHospitalMedicalCardListBody getBody() {
		return body;
	}

	public void setBody(GetHospitalMedicalCardListBody body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
	
	
}
