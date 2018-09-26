package com.example.demo.domain.Report.GetJianyanReportDetail;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 获取检验报告详细
 * @author shzch
 *
 */
@XStreamAlias("xml")
public class GetJianyanReportDetailXml {

	@XStreamAsAttribute
	@XStreamAlias("head")
	private GetJianyanReportDetailHead head;
	
	
	@XStreamAsAttribute
	@XStreamAlias("body")
	private GetJianyanReportDetailBody body;
	
	@XStreamAsAttribute
	@XStreamAlias("sign")
	private String sign;

	public GetJianyanReportDetailHead getHead() {
		return head;
	}

	public void setHead(GetJianyanReportDetailHead head) {
		this.head = head;
	}

	public GetJianyanReportDetailBody getBody() {
		return body;
	}

	public void setBody(GetJianyanReportDetailBody body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
	
}
