package com.example.demo.domain.Booking.BookingDocResource;

import java.util.List;

import com.example.demo.domain.ResponseResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("body")
public class BookingDocResourceBody {

	//服务响应基本模型
	@XStreamAsAttribute
	@XStreamAlias("ResponseResult")
	private ResponseResult responseResult;

	//医生
	@XStreamAsAttribute
	@XStreamAlias("DocIntroduction")
	private DocIntroduction docIntroduction;
	
	//医生号源列表
	@XStreamAsAttribute
	@XStreamImplicit(itemFieldName="DocResourceResourceList")
	private List<DocResourceResourceList> docResourceResourceList;
	

	public ResponseResult getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(ResponseResult responseResult) {
		this.responseResult = responseResult;
	}

	public List<DocResourceResourceList> getDocResourceResourceList() {
		return docResourceResourceList;
	}

	public void setDocResourceResourceList(List<DocResourceResourceList> docResourceResourceList) {
		this.docResourceResourceList = docResourceResourceList;
	}

	
}
