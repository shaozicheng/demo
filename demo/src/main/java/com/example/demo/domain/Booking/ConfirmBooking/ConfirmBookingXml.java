package com.example.demo.domain.Booking.ConfirmBooking;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 确认预约
 * @author shzch
 *
 */
@XStreamAlias("xml")
public class ConfirmBookingXml {

	@XStreamAsAttribute
	@XStreamAlias("head")
	private ConfirmBookingHead head;
	
	
	@XStreamAsAttribute
	@XStreamAlias("body")
	private ConfirmBookingBody body;
	
	@XStreamAsAttribute
	@XStreamAlias("sign")
	private String sign;

	public ConfirmBookingHead getHead() {
		return head;
	}

	public void setHead(ConfirmBookingHead head) {
		this.head = head;
	}

	public ConfirmBookingBody getBody() {
		return body;
	}

	public void setBody(ConfirmBookingBody body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
	
}
