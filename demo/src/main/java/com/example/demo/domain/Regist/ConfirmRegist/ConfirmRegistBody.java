package com.example.demo.domain.Regist.ConfirmRegist;

import com.example.demo.domain.ResponseResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("body")
public class ConfirmRegistBody {

	//服务响应基本模型
	@XStreamAsAttribute
	@XStreamAlias("ResponseResult")
	private ResponseResult responseResult;
	
	//医院内部订单申请返回模型
	@XStreamAsAttribute
	@XStreamAlias("HospitalTradeApplyInfo")
	private HospitalTradeApplyInfo hospitalTradeApplyInfo;

	public ResponseResult getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(ResponseResult responseResult) {
		this.responseResult = responseResult;
	}

	public HospitalTradeApplyInfo getHospitalTradeApplyInfo() {
		return hospitalTradeApplyInfo;
	}

	public void setHospitalTradeApplyInfo(HospitalTradeApplyInfo hospitalTradeApplyInfo) {
		this.hospitalTradeApplyInfo = hospitalTradeApplyInfo;
	}
	
	
}
