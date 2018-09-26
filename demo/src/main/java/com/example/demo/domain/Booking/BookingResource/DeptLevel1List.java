package com.example.demo.domain.Booking.BookingResource;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DeptLevel1List")
public class DeptLevel1List {
	
	//科室编码
    @XStreamAsAttribute
    @XStreamAlias("DeptCode")
	private String deptCode;
	
    //科室名称
    @XStreamAsAttribute
    @XStreamAlias("DeptName")
	private String deptName;
	
    //科室描述
    @XStreamAsAttribute
    @XStreamAlias("DeptDesc")
    private String deptDesc;
    
    //医院编号
    @XStreamAsAttribute
    @XStreamAlias("HospitalID")
	private String hospitalID;
	
    //扩展信息
    @XStreamAsAttribute
    @XStreamAlias("JsonMemo")
	private String jsonMemo;
	
    //科室图片
    @XStreamAsAttribute
    @XStreamAlias("DeptPhotoPath")
    private String deptPhotoPath;

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptDesc() {
		return deptDesc;
	}

	public void setDeptDesc(String deptDesc) {
		this.deptDesc = deptDesc;
	}

	public String getHospitalID() {
		return hospitalID;
	}

	public void setHospitalID(String hospitalID) {
		this.hospitalID = hospitalID;
	}

	public String getJsonMemo() {
		return jsonMemo;
	}

	public void setJsonMemo(String jsonMemo) {
		this.jsonMemo = jsonMemo;
	}

	public String getDeptPhotoPath() {
		return deptPhotoPath;
	}

	public void setDeptPhotoPath(String deptPhotoPath) {
		this.deptPhotoPath = deptPhotoPath;
	}
    
    
    
}
