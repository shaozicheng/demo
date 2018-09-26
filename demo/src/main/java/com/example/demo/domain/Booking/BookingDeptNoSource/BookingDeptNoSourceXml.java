package com.example.demo.domain.Booking.BookingDeptNoSource;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 获取科室预约号源
 * @author shzch
 *
 */
@XStreamAlias("xml")
public class BookingDeptNoSourceXml {

	@XStreamAsAttribute
	@XStreamAlias("head")
	private BookingDeptNoSourceHead head;
	
	
	@XStreamAsAttribute
	@XStreamAlias("body")
	private BookingDeptNoSourceBody body;
	
	@XStreamAsAttribute
	@XStreamAlias("sign")
	private String sign;

	public BookingDeptNoSourceHead getHead() {
		return head;
	}

	public void setHead(BookingDeptNoSourceHead head) {
		this.head = head;
	}

	public BookingDeptNoSourceBody getBody() {
		return body;
	}

	public void setBody(BookingDeptNoSourceBody body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
}
