package com.example.demo.domain.MedicalCard.GetHospitalMedicalCardList;

import java.util.List;

import com.example.demo.domain.ResponseResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("body")
public class GetHospitalMedicalCardListBody {

	//服务响应基本模型
	@XStreamAsAttribute
	@XStreamAlias("ResponseResult")
	private ResponseResult responseResult;
	
	//医院已有卡列表
	@XStreamAsAttribute
//	@XStreamAlias("HospitalCardList")
	@XStreamImplicit(itemFieldName="HospitalCardList")
	private List<HospitalCardList> hospitalCardList ;

	public ResponseResult getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(ResponseResult responseResult) {
		this.responseResult = responseResult;
	}

	public List<HospitalCardList> getHospitalCardList() {
		return hospitalCardList;
	}

	public void setHospitalCardList(List<HospitalCardList> hospitalCardList) {
		this.hospitalCardList = hospitalCardList;
	}
	
	
}
