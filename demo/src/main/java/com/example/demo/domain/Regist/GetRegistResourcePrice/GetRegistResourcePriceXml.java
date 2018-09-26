package com.example.demo.domain.Regist.GetRegistResourcePrice;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 获取号源价格
 * @author shzch
 *
 */
@XStreamAlias("xml")
public class GetRegistResourcePriceXml {

	@XStreamAsAttribute
	@XStreamAlias("head")
	private GetRegistResourcePriceHead head;
	
	
	@XStreamAsAttribute
	@XStreamAlias("body")
	private GetRegistResourcePriceBody body;
	
	@XStreamAsAttribute
	@XStreamAlias("sign")
	private String sign;
	
}
