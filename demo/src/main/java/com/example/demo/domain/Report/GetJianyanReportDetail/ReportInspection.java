package com.example.demo.domain.Report.GetJianyanReportDetail;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("ReportInspection")
public class ReportInspection {

	//标本
    @XStreamAsAttribute
    @XStreamAlias("ReportSpecimen")
	private String reportSpecimen;
	
    //患者姓名
    @XStreamAsAttribute
    @XStreamAlias("PatientName")
	private String patientName;
	
    //患者性别
    @XStreamAsAttribute
    @XStreamAlias("PatientSex")
    private String patientSex;
    
    //患者年龄
    @XStreamAsAttribute
    @XStreamAlias("PatientAge")
	private String patientAge;
	
    //检查科室
    @XStreamAsAttribute
    @XStreamAlias("ReportTestDept")
	private String reportTestDept;
	
    //申请医生
    @XStreamAsAttribute
    @XStreamAlias("Doctor")
    private String doctor;

    //报告日期
    @XStreamAsAttribute
    @XStreamAlias("ReportDateTime")
	private String reportDateTime;
    
    //临床诊断
    @XStreamAsAttribute
    @XStreamAlias("ReportClinicalDiagnosis")
	private String reportClinicalDiagnosis;
    
    //备注
    @XStreamAsAttribute
    @XStreamAlias("ReportMemo")
    private String reportMemo;

    //条形码
    @XStreamAsAttribute
    @XStreamAlias("Barcode")
	private String barcode;
    
    //检查内容
    @XStreamAsAttribute
    @XStreamAlias("ReportContent")
	private String reportContent;
    
    //报告审核医生
    @XStreamAsAttribute
    @XStreamAlias("ReportCheckDoctor")
    private String reportCheckDoctor;

    //检查结果
    @XStreamAsAttribute
    @XStreamAlias("ReportResult")
	private String reportResult;
    
    //检测范围
    @XStreamAsAttribute
    @XStreamAlias("DetectionRange")
	private String detectionRange;
	
    //检测结论
    @XStreamAsAttribute
    @XStreamAlias("DetectionConclusion")
	private String detectionConclusion;
    
}
