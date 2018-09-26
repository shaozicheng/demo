package com.example.demo.domain.Report.GetJianyanReportDetail;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("head")
public class GetJianyanReportDetailHead {

	//调用接口的授权码
    @XStreamAsAttribute
    @XStreamAlias("AccessToken")
	private String accessToken;
	
    //报告单编号
    @XStreamAsAttribute
    @XStreamAlias("ReportNo")
	private String reportNo;
	
    //服务窗和医院之间确定身份的唯一标识 医院唯一
    @XStreamAsAttribute
    @XStreamAlias("HospitalUserID")
    private String hospitalUserID;
    
    //报告读取状态
    @XStreamAsAttribute
    @XStreamAlias("ReportReadStatus")
	private String reportReadStatus;
	
    //外部接入系统ID
    @XStreamAsAttribute
    @XStreamAlias("OpenUserID")
	private String openUserID;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getReportNo() {
		return reportNo;
	}

	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	public String getHospitalUserID() {
		return hospitalUserID;
	}

	public void setHospitalUserID(String hospitalUserID) {
		this.hospitalUserID = hospitalUserID;
	}

	public String getReportReadStatus() {
		return reportReadStatus;
	}

	public void setReportReadStatus(String reportReadStatus) {
		this.reportReadStatus = reportReadStatus;
	}

	public String getOpenUserID() {
		return openUserID;
	}

	public void setOpenUserID(String openUserID) {
		this.openUserID = openUserID;
	}
    
    
}
