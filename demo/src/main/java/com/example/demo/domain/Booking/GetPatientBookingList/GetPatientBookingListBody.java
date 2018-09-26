package com.example.demo.domain.Booking.GetPatientBookingList;

import java.util.List;

import com.example.demo.domain.ResponseResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("body")
public class GetPatientBookingListBody {

	//服务响应基本模型
	@XStreamAsAttribute
	@XStreamAlias("ResponseResult")
	private ResponseResult responseResult;
	
	//预约列表模型
	@XStreamAsAttribute
	@XStreamImplicit(itemFieldName="BookingList")
	private List<BookingList> bookingList;

	public ResponseResult getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(ResponseResult responseResult) {
		this.responseResult = responseResult;
	}

	public List<BookingList> getBookingList() {
		return bookingList;
	}

	public void setBookingList(List<BookingList> bookingList) {
		this.bookingList = bookingList;
	}
	
	
	
}
