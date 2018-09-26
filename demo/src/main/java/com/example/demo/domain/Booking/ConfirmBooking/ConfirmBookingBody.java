package com.example.demo.domain.Booking.ConfirmBooking;


import com.example.demo.domain.ResponseResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("body")
public class ConfirmBookingBody {

	@XStreamAsAttribute
	@XStreamAlias("ResponseResult")
	private ResponseResult responseResult;
	
	@XStreamAsAttribute
	@XStreamAlias("BookingResult")
	private BookingResult BookingResult;

	public ResponseResult getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(ResponseResult responseResult) {
		this.responseResult = responseResult;
	}

	public BookingResult getBookingResult() {
		return BookingResult;
	}

	public void setBookingResult(BookingResult bookingResult) {
		BookingResult = bookingResult;
	}
	
	
}
