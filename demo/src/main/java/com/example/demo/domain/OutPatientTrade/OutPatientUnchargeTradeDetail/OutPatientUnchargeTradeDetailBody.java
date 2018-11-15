package com.example.demo.domain.OutPatientTrade.OutPatientUnchargeTradeDetail;

import java.util.List;

import com.example.demo.domain.ResponseResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("body")
public class OutPatientUnchargeTradeDetailBody {

	//服务响应基本模型
	@XStreamAsAttribute
	@XStreamAlias("ResponseResult")
	private ResponseResult responseResult;
	
	//服务响应基本模型
	@XStreamAsAttribute
	@XStreamAlias("OutPatientUnChargedCostInfo")
	private OutPatientUnChargedCostInfo outPatientUnChargedCostInfo;
	
	//诊间缴费列表模型
	@XStreamAsAttribute
	@XStreamImplicit(itemFieldName="OutPatientCostList")
	private List<OutPatientCostList> outPatientCostList;

	//诊间缴费列表模型
	@XStreamAsAttribute
	@XStreamImplicit(itemFieldName="OutPatientSubItemList")
	private List<OutPatientSubItemList> outPatientSubItemList;

	public ResponseResult getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(ResponseResult responseResult) {
		this.responseResult = responseResult;
	}

	public OutPatientUnChargedCostInfo getOutPatientUnChargedCostInfo() {
		return outPatientUnChargedCostInfo;
	}

	public void setOutPatientUnChargedCostInfo(OutPatientUnChargedCostInfo outPatientUnChargedCostInfo) {
		this.outPatientUnChargedCostInfo = outPatientUnChargedCostInfo;
	}

	public List<OutPatientCostList> getOutPatientCostList() {
		return outPatientCostList;
	}

	public void setOutPatientCostList(List<OutPatientCostList> outPatientCostList) {
		this.outPatientCostList = outPatientCostList;
	}

	public List<OutPatientSubItemList> getOutPatientSubItemList() {
		return outPatientSubItemList;
	}

	public void setOutPatientSubItemList(List<OutPatientSubItemList> outPatientSubItemList) {
		this.outPatientSubItemList = outPatientSubItemList;
	}
	
	
}
