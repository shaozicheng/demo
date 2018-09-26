package com.example.demo.domain.Report.GetJianyanReportDetail;

import java.util.List;

import com.example.demo.domain.ResponseResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("body")
public class GetJianyanReportDetailBody {
	
	//服务响应基本模型
	@XStreamAsAttribute
	@XStreamAlias("ResponseResult")
	private ResponseResult responseResult;
	
	//检验报告主体信息模型
	@XStreamAsAttribute
	@XStreamAlias("ReportInspection")
	private ReportInspection reportInspection;
	
	//检验报告项目模型
	@XStreamAsAttribute
	@XStreamImplicit(itemFieldName="ReportInspectionItemList")
	private List<ReportInspectionItemList> reportInspectionItemList;
	
	//影像图列表
	@XStreamAsAttribute
	@XStreamImplicit(itemFieldName="ImageList")
	private List<ImageList> imageList;

	public ResponseResult getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(ResponseResult responseResult) {
		this.responseResult = responseResult;
	}

	public ReportInspection getReportInspection() {
		return reportInspection;
	}

	public void setReportInspection(ReportInspection reportInspection) {
		this.reportInspection = reportInspection;
	}

	public List<ReportInspectionItemList> getReportInspectionItemList() {
		return reportInspectionItemList;
	}

	public void setReportInspectionItemList(List<ReportInspectionItemList> reportInspectionItemList) {
		this.reportInspectionItemList = reportInspectionItemList;
	}

	public List<ImageList> getImageList() {
		return imageList;
	}

	public void setImageList(List<ImageList> imageList) {
		this.imageList = imageList;
	}
	
	
	
	
}
