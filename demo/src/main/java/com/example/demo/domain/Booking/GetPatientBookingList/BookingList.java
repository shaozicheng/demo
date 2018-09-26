package com.example.demo.domain.Booking.GetPatientBookingList;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("BookingList")
public class BookingList {

	//预约ID
    @XStreamAsAttribute
    @XStreamAlias("BookingID")
	private String bookingID;
	
    //预约日期
    @XStreamAsAttribute
    @XStreamAlias("BookingDate")
	private String bookingDate;
	
    //就诊内容
    @XStreamAsAttribute
    @XStreamAlias("DiagnosisDetails")
    private String diagnosisDetails;
    
    //排队号
    @XStreamAsAttribute
    @XStreamAlias("QueuingNumber")
	private String queuingNumber;
	
    //患者姓名
    @XStreamAsAttribute
    @XStreamAlias("PatientName")
	private String patientName;
	
    //总金额
    @XStreamAsAttribute
    @XStreamAlias("TotalAmount")
    private String totalAmount;

    
    //订单创建日期时间
    @XStreamAsAttribute
    @XStreamAlias("TradeCreateDateTime")
	private String tradeCreateDateTime;
    
    
    //预约状态
    @XStreamAsAttribute
    @XStreamAlias("BookingStatus")
	private String bookingStatus;
    
    
    //是否需要付款
    @XStreamAsAttribute
    @XStreamAlias("NeedPay")
	private String needPay;


	public String getBookingID() {
		return bookingID;
	}


	public void setBookingID(String bookingID) {
		this.bookingID = bookingID;
	}


	public String getBookingDate() {
		return bookingDate;
	}


	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}


	public String getDiagnosisDetails() {
		return diagnosisDetails;
	}


	public void setDiagnosisDetails(String diagnosisDetails) {
		this.diagnosisDetails = diagnosisDetails;
	}


	public String getQueuingNumber() {
		return queuingNumber;
	}


	public void setQueuingNumber(String queuingNumber) {
		this.queuingNumber = queuingNumber;
	}


	public String getPatientName() {
		return patientName;
	}


	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}


	public String getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}


	public String getTradeCreateDateTime() {
		return tradeCreateDateTime;
	}


	public void setTradeCreateDateTime(String tradeCreateDateTime) {
		this.tradeCreateDateTime = tradeCreateDateTime;
	}


	public String getBookingStatus() {
		return bookingStatus;
	}


	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}


	public String getNeedPay() {
		return needPay;
	}


	public void setNeedPay(String needPay) {
		this.needPay = needPay;
	}
    
}
