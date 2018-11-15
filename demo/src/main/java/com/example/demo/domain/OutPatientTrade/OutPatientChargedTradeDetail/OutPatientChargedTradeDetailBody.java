package com.example.demo.domain.OutPatientTrade.OutPatientChargedTradeDetail;

import java.util.List;

import com.example.demo.domain.ResponseResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("body")
public class OutPatientChargedTradeDetailBody {

	//服务响应基本模型
	@XStreamAsAttribute
	@XStreamAlias("ResponseResult")
	private ResponseResult responseResult;
	
	//诊间费用主体信息
	@XStreamAsAttribute
	@XStreamAlias("OutPatientCostInfo")
	private OutPatientCostInfo OutPatientCostInfo;

	//诊间费用明细列表模型
	@XStreamAsAttribute
	@XStreamImplicit(itemFieldName="OutPatientCostList")
	private List<OutPatientCostList> outPatientCostList;
	
	//子项目列表模型
	@XStreamAsAttribute
	@XStreamImplicit(itemFieldName="OutPatientSubItemList")
	private List<OutPatientSubItemList> outPatientSubItemList;

	public ResponseResult getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(ResponseResult responseResult) {
		this.responseResult = responseResult;
	}

	public OutPatientCostInfo getOutPatientCostInfo() {
		return OutPatientCostInfo;
	}

	public void setOutPatientCostInfo(OutPatientCostInfo outPatientCostInfo) {
		OutPatientCostInfo = outPatientCostInfo;
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
