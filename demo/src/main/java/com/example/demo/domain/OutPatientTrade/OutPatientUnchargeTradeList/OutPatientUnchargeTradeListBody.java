package com.example.demo.domain.OutPatientTrade.OutPatientUnchargeTradeList;

import java.util.List;

import com.example.demo.domain.ResponseResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("body")
public class OutPatientUnchargeTradeListBody {

	//服务响应基本模型
	@XStreamAsAttribute
	@XStreamAlias("ResponseResult")
	private ResponseResult responseResult;
	
	//诊间缴费列表模型
	@XStreamAsAttribute
	@XStreamImplicit(itemFieldName="OutPatientUnchargedOrderList")
	private List<OutPatientUnchargedOrderList> outPatientUnchargedOrderList ;

	public ResponseResult getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(ResponseResult responseResult) {
		this.responseResult = responseResult;
	}

	public List<OutPatientUnchargedOrderList> getOutPatientUnchargedOrderList() {
		return outPatientUnchargedOrderList;
	}

	public void setOutPatientUnchargedOrderList(List<OutPatientUnchargedOrderList> outPatientUnchargedOrderList) {
		this.outPatientUnchargedOrderList = outPatientUnchargedOrderList;
	}
	
}
