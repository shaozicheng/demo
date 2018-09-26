package com.example.demo.domain.Booking.BookingResource;

import java.util.List;

import com.example.demo.domain.ResponseResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("body")
public class BookingResourceBody {
	
	//服务响应基本模型
	@XStreamAsAttribute
	@XStreamAlias("ResponseResult")
	private ResponseResult responseResult;
	
	//院区列表
	@XStreamAsAttribute
	@XStreamImplicit(itemFieldName="HospitalList")
	private List<HospitalList> hospitalList;
	
	//一级科室列表
	@XStreamAsAttribute
	@XStreamImplicit(itemFieldName="DeptLevel1List")
	private List<DeptLevel1List> deptLevel1List;
	
	//二级科室
	@XStreamAsAttribute
	@XStreamImplicit(itemFieldName="DeptLevel2List")
	private List<DeptLevel2List> deptLevel2List;
	
	//医生资源列表
	@XStreamAsAttribute
	@XStreamImplicit(itemFieldName="DeptResourceDocList")
	private List<DeptResourceDocList> deptResourceDocList;

	public ResponseResult getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(ResponseResult responseResult) {
		this.responseResult = responseResult;
	}

	public List<HospitalList> getHospitalList() {
		return hospitalList;
	}

	public void setHospitalList(List<HospitalList> hospitalList) {
		this.hospitalList = hospitalList;
	}

	public List<DeptLevel1List> getDeptLevel1List() {
		return deptLevel1List;
	}

	public void setDeptLevel1List(List<DeptLevel1List> deptLevel1List) {
		this.deptLevel1List = deptLevel1List;
	}

	public List<DeptLevel2List> getDeptLevel2List() {
		return deptLevel2List;
	}

	public void setDeptLevel2List(List<DeptLevel2List> deptLevel2List) {
		this.deptLevel2List = deptLevel2List;
	}

	public List<DeptResourceDocList> getDeptResourceDocList() {
		return deptResourceDocList;
	}

	public void setDeptResourceDocList(List<DeptResourceDocList> deptResourceDocList) {
		this.deptResourceDocList = deptResourceDocList;
	}

	
	
}
