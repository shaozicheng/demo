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
    @XStreamAlias("  ReportType  ")
    private String reportType;

    //链接地址
    @XStreamAsAttribute
    @XStreamAlias("URL")
	private String URL;
    
    //报告编号
    @XStreamAsAttribute
    @XStreamAlias("ReportNo_Short")
	private String reportNoShort;
	
}
