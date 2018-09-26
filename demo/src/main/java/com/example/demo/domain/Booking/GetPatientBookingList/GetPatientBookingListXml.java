package com.example.demo.domain.Booking.GetPatientBookingList;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 获取患者预约列表
 * @author shzch
 *
 */
@XStreamAlias("xml")
public class GetPatientBookingListXml {

	@XStreamAsAttribute
	@XStreamAlias("head")
	private GetPatientBookingListHead head;
	
	@XStreamAsAttribute
	@XStreamAlias("body")
	private GetPatientBookingListBody body;
	
	@XStreamAsAttribute
	@XStreamAlias("sign")
	private String sign;

	public GetPatientBookingListHead getHead() {
		return head;
	}

	public void setHead(GetPatientBookingListHead head) {
		this.head = head;
	}

	public GetPatientBookingListBody getBody() {
		return body;
	}

	public void setBody(GetPatientBookingListBody body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
}
