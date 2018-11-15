package com.example.demo.domain.Report.GetJianyanReportList;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("ReportList")
public class ReportList {

	//检查内容
    @XStreamAsAttribute
    @XStreamAlias("ReportContent")
	private String reportContent;
	
    //报告日期
    @XStreamAsAttribute
    @XStreamAlias("ReportDateTime")
	private String reportDateTime;
	
    //报告读取状态
    @XStreamAsAttribute
    @XStreamAlias("ReportReadStatus")
    private String reportReadStatus;
    
    //报告单编号
    @XStreamAsAttribute
    @XStreamAlias("ReportNo")
	private String reportNo;
	
    //患者姓名
    @XStreamAsAttribute
    @XStreamAlias("PatientName")
	private String patientName;
	
    //报告类型
    @XStreamAsAttribute
    @XStreamAlias("ReportType")
    private String reportType;

    //链接地址
    @XStreamAsAttribute
    @XStreamAlias("URL")
	private String URL;
    
    //报告编号
    @XStreamAsAttribute
    @XStreamAlias("ReportNo_Short")
	private String reportNoShort;
    
    //报告编号
    @XStreamAsAttribute
    @XStreamAlias("RESULT_STATUS")
	private String RESULT_STATUS;
    
    //患者编号
    private String openUserId;
    
    //患者编号
    private String createTime;
    
    //患者编号
    private String createUser;

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getOpenUserId() {
		return openUserId;
	}

	public void setOpenUserId(String openUserId) {
		this.openUserId = openUserId;
	}

	public String getReportContent() {
		return reportContent;
	}

	public void setReportContent(String reportContent) {
		this.reportContent = reportContent;
	}

	public String getReportDateTime() {
		return reportDateTime;
	}

	public void setReportDateTime(String reportDateTime) {
		this.reportDateTime = reportDateTime;
	}

	public String getReportReadStatus() {
		return reportReadStatus;
	}

	public void setReportReadStatus(String reportReadStatus) {
		this.reportReadStatus = reportReadStatus;
	}

	public String getReportNo() {
		return reportNo;
	}

	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public String getReportNoShort() {
		return reportNoShort;
	}

	public void setReportNoShort(String reportNoShort) {
		this.reportNoShort = reportNoShort;
	}

	public String getRESULT_STATUS() {
		return RESULT_STATUS;
	}

	public void setRESULT_STATUS(String rESULT_STATUS) {
		RESULT_STATUS = rESULT_STATUS;
	}

}
