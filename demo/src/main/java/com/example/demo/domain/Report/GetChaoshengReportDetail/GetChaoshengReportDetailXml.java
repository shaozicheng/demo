package com.example.demo.domain.Report.GetChaoshengReportDetail;

import com.example.demo.domain.Report.GetJianyanReportDetail.GetJianyanReportDetailHead;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 获取超声报告详细
 * @author shzch
 *
 */
@XStreamAlias("xml")
public class GetChaoshengReportDetailXml {

	@XStreamAsAttribute
	@XStreamAlias("head")
	private GetJianyanReportDetailHead head;
	
	
	@XStreamAsAttribute
	@XStreamAlias("body")
	private GetChaoshengReportDetailBody body;
	
	@XStreamAsAttribute
	@XStreamAlias("sign")
	private String sign;

	public GetJianyanReportDetailHead getHead() {
		return head;
	}

	public void setHead(GetJianyanReportDetailHead head) {
		this.head = head;
	}

	public GetChaoshengReportDetailBody getBody() {
		return body;
	}

	public void setBody(GetChaoshengReportDetailBody body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
	
}
