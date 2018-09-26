package com.example.demo.domain.Booking.CancelBooking;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 取消预约
 * @author shzch
 *
 */
@XStreamAlias("xml")
public class CancelBookingXml {

	@XStreamAsAttribute
	@XStreamAlias("head")
	private CancelBookingHead head;
	
	
	@XStreamAsAttribute
	@XStreamAlias("body")
	private CancelBookingBody body;
	
	@XStreamAsAttribute
	@XStreamAlias("sign")
	private String sign;

	public CancelBookingHead getHead() {
		return head;
	}

	public void setHead(CancelBookingHead head) {
		this.head = head;
	}

	public CancelBookingBody getBody() {
		return body;
	}

	public void setBody(CancelBookingBody body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
}
