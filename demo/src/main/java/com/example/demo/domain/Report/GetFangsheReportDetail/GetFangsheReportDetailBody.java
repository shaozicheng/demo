package com.example.demo.domain.Report.GetFangsheReportDetail;

import java.util.List;

import com.example.demo.domain.ResponseResult;
import com.example.demo.domain.Report.GetJianyanReportDetail.ImageList;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("body")
public class GetFangsheReportDetailBody {

	//服务响应基本模型
	@XStreamAsAttribute
	@XStreamAlias("ResponseResult")
	private ResponseResult responseResult;
	
	//报告主体信息模型
	@XStreamAsAttribute
	@XStreamAlias("RadiologyTest")
	private RadiologyTest radiologyTest;
	
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

	public RadiologyTest getRadiologyTest() {
		return radiologyTest;
	}

	public void setRadiologyTest(RadiologyTest radiologyTest) {
		this.radiologyTest = radiologyTest;
	}

	public List<ImageList> getImageList() {
		return imageList;
	}

	public void setImageList(List<ImageList> imageList) {
		this.imageList = imageList;
	}
	
	
	
}
