package com.example.demo.domain.Regist.CancelRegist;

import com.example.demo.domain.ResponseResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("body")
public class CancelRegistBody {

	//服务响应基本模型
	@XStreamAsAttribute
	@XStreamAlias("ResponseResult")
	private ResponseResult responseResult;
	
	//医院退单信息
	@XStreamAsAttribute
	@XStreamAlias("HospitalTradeRefundInfo")
	private HospitalTradeRefundInfo hospitalTradeRefundInfo;

	public ResponseResult getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(ResponseResult responseResult) {
		this.responseResult = responseResult;
	}

	public HospitalTradeRefundInfo getHospitalTradeRefundInfo() {
		return hospitalTradeRefundInfo;
	}

	public void setHospitalTradeRefundInfo(HospitalTradeRefundInfo hospitalTradeRefundInfo) {
		this.hospitalTradeRefundInfo = hospitalTradeRefundInfo;
	}
	
	
	
}
