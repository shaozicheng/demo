package com.example.demo.domain.Sign.GetSignList;

import java.util.List;

import com.example.demo.domain.ResponseResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("body")
public class GetSignListBody {

	//服务响应基本模型
	@XStreamAsAttribute
	@XStreamAlias("ResponseResult")
	private ResponseResult responseResult;
	
	//医生号源列表
	@XStreamAsAttribute
	@XStreamImplicit(itemFieldName="SignList")
	private List<SignList> signList;

	public ResponseResult getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(ResponseResult responseResult) {
		this.responseResult = responseResult;
	}

	public List<SignList> getSignList() {
		return signList;
	}

	public void setSignList(List<SignList> signList) {
		this.signList = signList;
	}
	
}
