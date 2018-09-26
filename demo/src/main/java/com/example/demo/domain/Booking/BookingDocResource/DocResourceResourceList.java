package com.example.demo.domain.Booking.BookingDocResource;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DocResourceResourceList")
public class DocResourceResourceList {
	
	//医生编号
	private String docCode;
	
	//资源编号
    @XStreamAsAttribute
    @XStreamAlias("ResourceID")
	private String resourceID;
	
    //日期
    @XStreamAsAttribute
    @XStreamAlias("Day")
	private String day;
	
    //开始时间
    @XStreamAsAttribute
    @XStreamAlias("TimeStart")
    private String timeStart;
    
    //结束时间
    @XStreamAsAttribute
    @XStreamAlias("TimeEnd")
	private String timeEnd;
	
    //一级挂号类别
    @XStreamAsAttribute
    @XStreamAlias("RegistLevel1")
	private String registLevel1;
	
    //金额
    @XStreamAsAttribute
    @XStreamAlias("Amount")
    private String amount;

    
    //号源说明
    @XStreamAsAttribute
    @XStreamAlias("ResourceMemo")
	private String resourceMemo;
    
    
    //是否可用
    @XStreamAsAttribute
    @XStreamAlias("IsAvailable")
	private String isAvailable;
    
    
    //是否按天
    @XStreamAsAttribute
    @XStreamAlias("IsDay")
	private String isDay;
    
    
    //备注
    @XStreamAsAttribute
    @XStreamAlias("Memo")
	private String memo;

    //医生描述
    private String docMemo;
    
    //医生职称
    private String docDuty;
    
    //医生照片
    private String docPhotoPath;
    
	public String getDocPhotoPath() {
		return docPhotoPath;
	}


	public void setDocPhotoPath(String docPhotoPath) {
		this.docPhotoPath = docPhotoPath;
	}


	public String getDocDuty() {
		return docDuty;
	}


	public void setDocDuty(String docDuty) {
		this.docDuty = docDuty;
	}


	public String getDocMemo() {
		return docMemo;
	}


	public void setDocMemo(String docMemo) {
		this.docMemo = docMemo;
	}


	public String getDocCode() {
		return docCode;
	}


	public void setDocCode(String docCode) {
		this.docCode = docCode;
	}


	public String getResourceID() {
		return resourceID;
	}


	public void setResourceID(String resourceID) {
		this.resourceID = resourceID;
	}


	public String getDay() {
		return day;
	}


	public void setDay(String day) {
		this.day = day;
	}


	public String getTimeStart() {
		return timeStart;
	}


	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
	}


	public String getTimeEnd() {
		return timeEnd;
	}


	public void setTimeEnd(String timeEnd) {
		this.timeEnd = timeEnd;
	}


	public String getRegistLevel1() {
		return registLevel1;
	}


	public void setRegistLevel1(String registLevel1) {
		this.registLevel1 = registLevel1;
	}


	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}


	public String getResourceMemo() {
		return resourceMemo;
	}


	public void setResourceMemo(String resourceMemo) {
		this.resourceMemo = resourceMemo;
	}


	public String getIsAvailable() {
		return isAvailable;
	}


	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}


	public String getIsDay() {
		return isDay;
	}


	public void setIsDay(String isDay) {
		this.isDay = isDay;
	}


	public String getMemo() {
		return memo;
	}


	public void setMemo(String memo) {
		this.memo = memo;
	}
    
    
}
