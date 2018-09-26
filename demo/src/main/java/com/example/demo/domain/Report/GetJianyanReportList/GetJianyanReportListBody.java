package com.example.demo.domain.Report.GetJianyanReportList;

import java.util.List;

import com.example.demo.domain.ResponseResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("body")
public class GetJianyanReportListBody {

	//服务响应基本模型
	@XStreamAsAttribute
	@XStreamAlias("ResponseResult")
	private ResponseResult responseResult;
	
	//检验检查报告列表返回模型
	@XStreamAsAttribute
	@XStreamImplicit(itemFieldName="ReportList")
	private List<ReportList> reportList;

	public ResponseResult getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(ResponseResult responseResult) {
		this.responseResult = responseResult;
	}

	public List<ReportList> getReportList() {
		return reportList;
	}

	public void setReportList(List<ReportList> reportList) {
		this.reportList = reportList;
	}
	
	
}
