package com.example.demo.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("ResponseResult")
public class ResponseResult {
	
	//是否成功
	@XStreamAsAttribute
	@XStreamAlias("IsSuccess")
	private String isSuccess;
	
	//消息
	@XStreamAsAttribute
	@XStreamAlias("Message")
	private String message;
	
	//业务返回码
	@XStreamAsAttribute
	@XStreamAlias("SubCode")
	private String subCode;
	
	//业务返回码描述
	@XStreamAsAttribute
	@XStreamAlias("SubMessage")
	private String subMessage;

	public String getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSubCode() {
		return subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubMessage() {
		return subMessage;
	}

	public void setSubMessage(String subMessage) {
		this.subMessage = subMessage;
	}
	
	

}
