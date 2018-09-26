package com.example.demo.domain.Report.GetChaoshengReportDetail;

import java.util.List;

import com.example.demo.domain.ResponseResult;
import com.example.demo.domain.Report.GetJianyanReportDetail.ImageList;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("body")
public class GetChaoshengReportDetailBody {

	//服务响应基本模型
	@XStreamAsAttribute
	@XStreamAlias("ResponseResult")
	private ResponseResult responseResult;
	
	//超声结果模型
	@XStreamAsAttribute
	@XStreamAlias("UltrasonicTest")
	private UltrasonicTest ultrasonicTest;
	
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

	public UltrasonicTest getUltrasonicTest() {
		return ultrasonicTest;
	}

	public void setUltrasonicTest(UltrasonicTest ultrasonicTest) {
		this.ultrasonicTest = ultrasonicTest;
	}

	public List<ImageList> getImageList() {
		return imageList;
	}

	public void setImageList(List<ImageList> imageList) {
		this.imageList = imageList;
	}
	
	
	
}
