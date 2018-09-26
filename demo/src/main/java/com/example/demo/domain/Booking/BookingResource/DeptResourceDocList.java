package com.example.demo.domain.Booking.BookingResource;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DeptResourceDocList")
public class DeptResourceDocList {
	
	//科室编码
    @XStreamAsAttribute
    @XStreamAlias("DeptCode")
	private String deptCode;
	
    //科室名称
    @XStreamAsAttribute
    @XStreamAlias("DeptName")
	private String deptName;
	
    //医生编码
    @XStreamAsAttribute
    @XStreamAlias("DocCode")
    private String docCode;
    
    //医生名称
    @XStreamAsAttribute
    @XStreamAlias("DocName")
	private String docName;
	
    //医生图片路径
    @XStreamAsAttribute
    @XStreamAlias("DocPhotoPath")
	private String docPhotoPath;
	
    //医生职称
    @XStreamAsAttribute
    @XStreamAlias("DocDuty")
    private String docDuty;

    //医生描述
    @XStreamAsAttribute
    @XStreamAlias("DocDesc")
	private String docDesc;
	
    //扩展信息
    @XStreamAsAttribute
    @XStreamAlias("JsonMemo")
    private String jsonMemo;

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

	public String getDocCode() {
		return docCode;
	}

	public void setDocCode(String docCode) {
		this.docCode = docCode;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

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

	public String getDocDesc() {
		return docDesc;
	}

	public void setDocDesc(String docDesc) {
		this.docDesc = docDesc;
	}

	public String getJsonMemo() {
		return jsonMemo;
	}

	public void setJsonMemo(String jsonMemo) {
		this.jsonMemo = jsonMemo;
	}
    
    
}
