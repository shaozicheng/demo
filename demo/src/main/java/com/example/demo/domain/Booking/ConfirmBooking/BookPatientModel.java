package com.example.demo.domain.Booking.ConfirmBooking;

public class BookPatientModel {

	//医院
	private String id;
	
	//医院
	private String hospt;
	
	//科室
	private String dept;
	
	//医生
	private String doc;
	
	//费用
	private String cost;
	
	//预约时间
	private String time;
	
	//患者唯一标识ID
	private String patientID;
	
	//创建时间
	private String createTime;
	
	//用户识别ID
	private String openID;	
	
	//预约号码
	private String bookingID;
	
	//是否需要付款
	private String needPay;
	
	//预约状态
	private String bookingStatus;
	
	//服务窗和医院之间确定身份的唯一标识 医院唯一
	private String hospitalUserID;
	
	//资源编号
	private String resourceID;
	
	//调用接口的授权码
	private String accessToken;

    //外部接入系统ID
	private String openUserID;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getOpenID() {
		return openID;
	}

	public void setOpenID(String openID) {
		this.openID = openID;
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

	public String getBookingID() {
		return bookingID;
	}

	public void setBookingID(String bookingID) {
		this.bookingID = bookingID;
	}

	public String getHospitalUserID() {
		return hospitalUserID;
	}

	public void setHospitalUserID(String hospitalUserID) {
		this.hospitalUserID = hospitalUserID;
	}

	public String getResourceID() {
		return resourceID;
	}

	public void setResourceID(String resourceID) {
		this.resourceID = resourceID;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getOpenUserID() {
		return openUserID;
	}

	public void setOpenUserID(String openUserID) {
		this.openUserID = openUserID;
	}

	public String getHospt() {
		return hospt;
	}

	public void setHospt(String hospt) {
		this.hospt = hospt;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPatientID() {
		return patientID;
	}

	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}
	
	
}
