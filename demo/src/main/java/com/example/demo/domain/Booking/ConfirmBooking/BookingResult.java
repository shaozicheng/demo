package com.example.demo.domain.Booking.ConfirmBooking;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("BookingResult")
public class BookingResult {

	//预约ID
    @XStreamAsAttribute
    @XStreamAlias("BookingID")
	private String bookingID;
	
    //是否需要付款
    @XStreamAsAttribute
    @XStreamAlias("NeedPay")
	private String needPay;
	
    //需要支付金额
    @XStreamAsAttribute
    @XStreamAlias("NeedPayAmount")
    private String needPayAmount;

	public String getBookingID() {
		return bookingID;
	}

	public void setBookingID(String bookingID) {
		this.bookingID = bookingID;
	}

	public String getNeedPay() {
		return needPay;
	}

	public void setNeedPay(String needPay) {
		this.needPay = needPay;
	}

	public String getNeedPayAmount() {
		return needPayAmount;
	}

	public void setNeedPayAmount(String needPayAmount) {
		this.needPayAmount = needPayAmount;
	}
    
    
}
