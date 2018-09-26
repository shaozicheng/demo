package com.example.demo.domain.MedicalCard.RegistMedicalCard;


import com.example.demo.domain.ResponseResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("body")
public class RegistMedicalCardBody {
	
	//服务响应基本模型
	@XStreamAsAttribute
	@XStreamAlias("ResponseResult")
	private ResponseResult responseResult;
	
	//创建登记就诊卡返回结果
	@XStreamAsAttribute
	@XStreamAlias("CreateAndRegistMedicalCard")
	private RegistMedicalCardList recordCardList;

	public ResponseResult getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(ResponseResult responseResult) {
		this.responseResult = responseResult;
	}

	public RegistMedicalCardList getRecordCardList() {
		return recordCardList;
	}

	public void setRecordCardList(RegistMedicalCardList recordCardList) {
		this.recordCardList = recordCardList;
	}


}
