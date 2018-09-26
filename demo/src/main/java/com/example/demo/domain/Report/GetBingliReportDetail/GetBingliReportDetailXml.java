package com.example.demo.domain.Report.GetBingliReportDetail;

import com.example.demo.domain.Report.GetJianyanReportDetail.GetJianyanReportDetailHead;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 获取病理报告详细
 * @author shzch
 *
 */
@XStreamAlias("xml")
public class GetBingliReportDetailXml {

	@XStreamAsAttribute
	@XStreamAlias("head")
	private GetJianyanReportDetailHead head;
	
	
	@XStreamAsAttribute
	@XStreamAlias("body")
	private GetBingliReportDetailBody body;
	
	@XStreamAsAttribute
	@XStreamAlias("sign")
	private String sign;

	public GetJianyanReportDetailHead getHead() {
		return head;
	}

	public void setHead(GetJianyanReportDetailHead head) {
		this.head = head;
	}

	public GetBingliReportDetailBody getBody() {
		return body;
	}

	public void setBody(GetBingliReportDetailBody body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
	
}
