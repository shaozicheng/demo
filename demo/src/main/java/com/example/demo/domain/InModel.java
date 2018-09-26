package com.example.demo.domain;

/**
 * 
 * @author shzch 
 *
 */
public class InModel {
	
	//医生ID
	private String docID;
	
	//用户识别码
	private String openID;
	
	//创建时间
	private String createTime;
	
	//所属医院
	private String hosptFrom;
	
	//病人识别码
	private String patientID;

	public String getHosptFrom() {
		return hosptFrom;
	}

	public void setHosptFrom(String hosptFrom) {
		this.hosptFrom = hosptFrom;
	}

	public String getPatientID() {
		return patientID;
	}

	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	public String getDocID() {
		return docID;
	}

	public void setDocID(String docID) {
		this.docID = docID;
	}

	public String getOpenID() {
		return openID;
	}

	public void setOpenID(String openID) {
		this.openID = openID;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}



}
