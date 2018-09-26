package com.example.demo.domain.Booking.ConfirmBooking;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("head")
public class ConfirmBookingHead {

	//调用接口的授权码
    @XStreamAsAttribute
    @XStreamAlias("AccessToken")
	private String accessToken;
	
    //外部接入系统ID
    @XStreamAsAttribute
    @XStreamAlias("OpenUserID")
	private String openUserID;
	
    //服务窗和医院之间确定身份的唯一标识 医院唯一
    @XStreamAsAttribute
    @XStreamAlias("HospitalUserID")
    private String hospitalUserID;
    
    //资源编号
    @XStreamAsAttribute
    @XStreamAlias("ResourceID")
	private String resourceID;
	
    //数据来源
    @XStreamAsAttribute
    @XStreamAlias("DataSource")
	private String dataSource;
	
    //券号
    @XStreamAsAttribute
    @XStreamAlias("CouponNo")
    private String couponNo;

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

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getCouponNo() {
		return couponNo;
	}

	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
	}
	
    
    
}
