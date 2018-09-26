package com.example.demo.domain.Regist.GetRegistResourcePrice;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class ResourceInfo {

	//金额
    @XStreamAsAttribute
    @XStreamAlias("Amount")
	private String amount;
	
}
