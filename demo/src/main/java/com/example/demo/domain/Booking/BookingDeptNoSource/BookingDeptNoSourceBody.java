package com.example.demo.domain.Booking.BookingDeptNoSource;

import java.util.List;

import com.example.demo.domain.ResponseResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("body")
public class BookingDeptNoSourceBody {

	//服务响应基本模型
	@XStreamAsAttribute
	@XStreamAlias("ResponseResult")
	private ResponseResult responseResult;
	
	//医生号源列表
	@XStreamAsAttribute
	@XStreamImplicit(itemFieldName="DeptResourceDocNoSourceList")
	private List<DeptResourceDocNoSourceList> deptResourceDocNoSourceList;

	public ResponseResult getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(ResponseResult responseResult) {
		this.responseResult = responseResult;
	}

	public List<DeptResourceDocNoSourceList> getDeptResourceDocNoSourceList() {
		return deptResourceDocNoSourceList;
	}

	public void setDeptResourceDocNoSourceList(List<DeptResourceDocNoSourceList> deptResourceDocNoSourceList) {
		this.deptResourceDocNoSourceList = deptResourceDocNoSourceList;
	}

	
}
