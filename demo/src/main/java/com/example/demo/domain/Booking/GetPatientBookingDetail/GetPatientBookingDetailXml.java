package com.example.demo.domain.Booking.GetPatientBookingDetail;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 获取患者预约详细
 * @author shzch
 *
 */
@XStreamAlias("xml")
public class GetPatientBookingDetailXml {

	@XStreamAsAttribute
	@XStreamAlias("head")
	private GetPatientBookingDetailHead head;
	
	
	@XStreamAsAttribute
	@XStreamAlias("body")
	private GetPatientBookingDetailBody body;
	
	@XStreamAsAttribute
	@XStreamAlias("sign")
	private String sign;

	public GetPatientBookingDetailHead getHead() {
		return head;
	}

	public void setHead(GetPatientBookingDetailHead head) {
		this.head = head;
	}

	public GetPatientBookingDetailBody getBody() {
		return body;
	}

	public void setBody(GetPatientBookingDetailBody body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
}
