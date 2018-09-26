package com.example.demo.domain.Booking.BookingResource;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 获取预约资源
 * @author shzch
 *
 */
@XStreamAlias("xml")
public class BookingResourceXml {

	@XStreamAsAttribute
	@XStreamAlias("head")
	private BookingResourceHead head;
	
	
	@XStreamAsAttribute
	@XStreamAlias("body")
	private BookingResourceBody body;
	
	@XStreamAsAttribute
	@XStreamAlias("sign")
	private String sign;

	public BookingResourceHead getHead() {
		return head;
	}

	public void setHead(BookingResourceHead head) {
		this.head = head;
	}

	public BookingResourceBody getBody() {
		return body;
	}

	public void setBody(BookingResourceBody body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
}
