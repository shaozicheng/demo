package com.example.demo.domain.Booking.BookingDocResource;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("head")
public class BookingDocResourceHead {

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
    
    //医生编码
    @XStreamAsAttribute
    @XStreamAlias("DocCode")
	private String docCode;
	
    //数据来源
    @XStreamAsAttribute
    @XStreamAlias("DataSource")
	private String dataSource;
	
    //日期
    @XStreamAsAttribute
    @XStreamAlias("Day")
    private String day;

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

	public String getDocCode() {
		return docCode;
	}

	public void setDocCode(String docCode) {
		this.docCode = docCode;
	}

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
    
    
}
