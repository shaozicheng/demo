package com.example.demo.domain.Report.GetBingliReportList;

import com.example.demo.domain.Report.GetJianyanReportList.GetJianyanReportListBody;
import com.example.demo.domain.Report.GetJianyanReportList.GetJianyanReportListHead;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 获取病理报告列表
 * @author shzch
 *
 */
@XStreamAlias("xml")
public class GetBingliReportListXml {

	@XStreamAsAttribute
	@XStreamAlias("head")
	private GetJianyanReportListHead head;
	
	@XStreamAsAttribute
	@XStreamAlias("body")
	private GetJianyanReportListBody body;
	
	@XStreamAsAttribute
	@XStreamAlias("sign")
	private String sign;

	public GetJianyanReportListHead getHead() {
		return head;
	}

	public void setHead(GetJianyanReportListHead head) {
		this.head = head;
	}

	public GetJianyanReportListBody getBody() {
		return body;
	}

	public void setBody(GetJianyanReportListBody body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
	
}
