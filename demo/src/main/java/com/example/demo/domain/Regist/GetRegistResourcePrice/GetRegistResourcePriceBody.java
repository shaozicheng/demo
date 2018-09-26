package com.example.demo.domain.Regist.GetRegistResourcePrice;

import com.example.demo.domain.ResponseResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("body")
public class GetRegistResourcePriceBody {

	//服务响应基本模型
	@XStreamAsAttribute
	@XStreamAlias("ResponseResult")
	private ResponseResult responseResult;
	
	//号源信息
	@XStreamAsAttribute
	@XStreamAlias("ResponseResult")
	private ResourceInfo resourceInfo;
	
}
