package com.example.demo.domain.OutPatientTrade.OutPatientChargedTradeList;

import java.util.List;

import com.example.demo.domain.ResponseResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("body")
public class OutPatientChargedTradeListBody {

	//服务响应基本模型
	@XStreamAsAttribute
	@XStreamAlias("ResponseResult")
	private ResponseResult responseResult;
	
	//诊间缴费列表模型
	@XStreamAsAttribute
	@XStreamImplicit(itemFieldName="OutPatientChargedOrderList")
	private List<OutPatientChargedOrderList > outPatientChargedOrderList ;

	public ResponseResult getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(ResponseResult responseResult) {
		this.responseResult = responseResult;
	}

	public List<OutPatientChargedOrderList> getOutPatientChargedOrderList() {
		return outPatientChargedOrderList;
	}

	public void setOutPatientChargedOrderList(List<OutPatientChargedOrderList> outPatientChargedOrderList) {
		this.outPatientChargedOrderList = outPatientChargedOrderList;
	}

}
