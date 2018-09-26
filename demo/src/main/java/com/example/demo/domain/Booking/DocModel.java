package com.example.demo.domain.Booking;

public class DocModel {
	
	//序列号
	private Integer id;
	
	//医院编码
	private String hospitalID;
	
	//医院名称
	private String hospitalName;
	
	//医院相关介绍
	private String hospitalDesc;
	
	//一级科室编码
	private String deptCode1;
	
	//一级科室名称
	private String deptName1;
	
	//一级科室描述
	private String deptDesc1;
	
	//一级科室扩展信息
	private String jsonMemo1;
	
	//一级科室图片
	private String deptPhotoPath1;
	
	//二级科室编码
	private String deptCode2;
	
	//二级科室名称
	private String deptName2;
	
	//二级科室描述
	private String deptDesc2;
	
	//二级科室扩展信息
	private String jsonMemo2;
	
	//二级科室图片
	private String deptPhotoPath2;
	
	//医生编码
	private String docCode;
	
	//医生名称
	private String docName;
	
	//医生图片路径
	private String docPhotoPath;
	
	//医生职称
	private String docDuty;
	
	//医生描述
	private String docDesc;
	
	//医生扩展信息
	private String jsonMemo;
	
	//判断该行数据是否有效,0为有效 1为无效
	private Integer status;

	public String getHospitalID() {
		return hospitalID;
	}

	public void setHospitalID(String hospitalID) {
		this.hospitalID = hospitalID;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getDeptCode1() {
		return deptCode1;
	}

	public void setDeptCode1(String deptCode1) {
		this.deptCode1 = deptCode1;
	}

	public String getDeptName1() {
		return deptName1;
	}

	public void setDeptName1(String deptName1) {
		this.deptName1 = deptName1;
	}

	public String getDeptDesc1() {
		return deptDesc1;
	}

	public void setDeptDesc1(String deptDesc1) {
		this.deptDesc1 = deptDesc1;
	}

	public String getJsonMemo1() {
		return jsonMemo1;
	}

	public void setJsonMemo1(String jsonMemo1) {
		this.jsonMemo1 = jsonMemo1;
	}

	public String getDeptPhotoPath1() {
		return deptPhotoPath1;
	}

	public void setDeptPhotoPath1(String deptPhotoPath1) {
		this.deptPhotoPath1 = deptPhotoPath1;
	}

	public String getDeptCode2() {
		return deptCode2;
	}

	public void setDeptCode2(String deptCode2) {
		this.deptCode2 = deptCode2;
	}

	public String getDeptName2() {
		return deptName2;
	}

	public void setDeptName2(String deptName2) {
		this.deptName2 = deptName2;
	}

	public String getDeptDesc2() {
		return deptDesc2;
	}

	public void setDeptDesc2(String deptDesc2) {
		this.deptDesc2 = deptDesc2;
	}

	public String getJsonMemo2() {
		return jsonMemo2;
	}

	public void setJsonMemo2(String jsonMemo2) {
		this.jsonMemo2 = jsonMemo2;
	}

	public String getDeptPhotoPath2() {
		return deptPhotoPath2;
	}

	public void setDeptPhotoPath2(String deptPhotoPath2) {
		this.deptPhotoPath2 = deptPhotoPath2;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	

}
