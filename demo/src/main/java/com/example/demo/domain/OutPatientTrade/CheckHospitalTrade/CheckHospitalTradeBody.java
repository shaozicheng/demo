package com.example.demo.domain.OutPatientTrade.CheckHospitalTrade;


import com.example.demo.domain.ResponseResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("body")
public class CheckHospitalTradeBody {

	//服务响应基本模型
	@XStreamAsAttribute
	@XStreamAlias("ResponseResult")
	private ResponseResult responseResult;
	
	//校验未付订单
	@XStreamAsAttribute
	@XStreamAlias("CheckUnchargedTrade")
	private CheckUnchargedTrade checkUnchargedTrade;

	public ResponseResult getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(ResponseResult responseResult) {
		this.responseResult = responseResult;
	}

	public CheckUnchargedTrade getCheckUnchargedTrade() {
		return checkUnchargedTrade;
	}

	public void setCheckUnchargedTrade(CheckUnchargedTrade checkUnchargedTrade) {
		this.checkUnchargedTrade = checkUnchargedTrade;
	}

	
}
