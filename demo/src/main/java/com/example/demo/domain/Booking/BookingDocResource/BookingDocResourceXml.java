package com.example.demo.domain.Booking.BookingDocResource;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 获取医生预约号源
 * @author shzch
 *
 */
@XStreamAlias("xml")
public class BookingDocResourceXml {
	
	@XStreamAsAttribute
	@XStreamAlias("head")
	private BookingDocResourceHead head;
	
	
	@XStreamAsAttribute
	@XStreamAlias("body")
	private BookingDocResourceBody body;
	
	@XStreamAsAttribute
	@XStreamAlias("sign")
	private String sign;

	public BookingDocResourceHead getHead() {
		return head;
	}

	public void setHead(BookingDocResourceHead head) {
		this.head = head;
	}

	public BookingDocResourceBody getBody() {
		return body;
	}

	public void setBody(BookingDocResourceBody body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
	

}
