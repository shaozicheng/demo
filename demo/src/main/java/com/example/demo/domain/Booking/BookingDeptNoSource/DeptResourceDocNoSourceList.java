package com.example.demo.domain.Booking.BookingDeptNoSource;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DeptResourceDocNoSourceList")
public class DeptResourceDocNoSourceList {

	//科室编码
	private String deptCode;
	
	//医生编码
    @XStreamAsAttribute
    @XStreamAlias("DocCode")
	private String docCode;
	
    //日期
    @XStreamAsAttribute
    @XStreamAlias("Day")
	private String day;
	
    //号源说明
    @XStreamAsAttribute
    @XStreamAlias("ResourceMemo")
    private String resourceMemo;
    
    //是否可用
    @XStreamAsAttribute
    @XStreamAlias("IsAvailable")
	private String isAvailable;
	
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

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDocCode() {
		return docCode;
	}

	public void setDocCode(String docCode) {
		this.docCode = docCode;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
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

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
    
    
    
}
