package com.example.demo.domain.Booking.BookingResource;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;


@XStreamAlias("HospitalList")
public class HospitalList {

	//医院编号
    @XStreamAsAttribute
    @XStreamAlias("HospitalID")
	private String hospitalID;
	
    //医院名称
    @XStreamAsAttribute
    @XStreamAlias("HospitalName")
	private String hospitalName;
	
    //医院描述
    @XStreamAsAttribute
    @XStreamAlias("HospitalDesc")
    private String hospitalDesc;

	public String getHospitalID() {
		return hospitalID;
	}

	public void setHospitalID(String hospitalID) {
		this.hospitalID = hospitalID;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalDesc() {
		return hospitalDesc;
	}

	public void setHospitalDesc(String hospitalDesc) {
		this.hospitalDesc = hospitalDesc;
	}
    
    
    
}
