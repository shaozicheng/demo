package com.example.demo.domain.Regist.GetPatientRegistList;

import java.util.List;

import com.example.demo.domain.ResponseResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("body")
public class GetPatientRegistListBody {

	//服务响应基本模型
	@XStreamAsAttribute
	@XStreamAlias("ResponseResult")
	private ResponseResult responseResult;
	
	//挂号列表模型
	@XStreamAsAttribute
	@XStreamImplicit(itemFieldName="RegistList")
	private List<RegistList> registList;

	public ResponseResult getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(ResponseResult responseResult) {
		this.responseResult = responseResult;
	}

	public List<RegistList> getRegistList() {
		return registList;
	}

	public void setRegistList(List<RegistList> registList) {
		this.registList = registList;
	}
	
	
	
}
