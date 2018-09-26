package com.example.demo.domain.Regist.GetPatientRegistDetail;

import com.example.demo.domain.ResponseResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("body")
public class GetPatientRegistDetailBody {

	//服务响应基本模型
	@XStreamAsAttribute
	@XStreamAlias("ResponseResult")
	private ResponseResult responseResult;
	
	//挂号详细
	@XStreamAsAttribute
	@XStreamAlias("RegistDetail")
	private RegistDetail registDetail ;

	public ResponseResult getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(ResponseResult responseResult) {
		this.responseResult = responseResult;
	}

	public RegistDetail getRegistDetail() {
		return registDetail;
	}

	public void setRegistDetail(RegistDetail registDetail) {
		this.registDetail = registDetail;
	}
	
	
	
}
