package com.example.demo.domain.Report.GetBingliReportDetail;

import java.util.List;

import com.example.demo.domain.ResponseResult;
import com.example.demo.domain.Report.GetJianyanReportDetail.ImageList;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("body")
public class GetBingliReportDetailBody {

	//服务响应基本模型
	@XStreamAsAttribute
	@XStreamAlias("ResponseResult")
	private ResponseResult responseResult;
	
	//检验检查报告列表返回模型
	@XStreamAsAttribute
	@XStreamImplicit(itemFieldName="PathologyTest")
	private List<PathologyTest> pathologyTest;
		
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

	public List<PathologyTest> getPathologyTest() {
		return pathologyTest;
	}

	public void setPathologyTest(List<PathologyTest> pathologyTest) {
		this.pathologyTest = pathologyTest;
	}

	public List<ImageList> getImageList() {
		return imageList;
	}

	public void setImageList(List<ImageList> imageList) {
		this.imageList = imageList;
	}
		
	
	
}
