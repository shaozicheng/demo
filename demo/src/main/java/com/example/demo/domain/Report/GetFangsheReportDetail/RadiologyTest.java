package com.example.demo.domain.Report.GetFangsheReportDetail;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("RadiologyTest")
public class RadiologyTest {

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

    //检查内容
    @XStreamAsAttribute
    @XStreamAlias("ReportContent")
	private String reportContent;
    
    //影响分析
    @XStreamAsAttribute
    @XStreamAlias("ImageAnalyze")
	private String imageAnalyze;
    
    //报告日期
    @XStreamAsAttribute
    @XStreamAlias("ReportDateTime")
	private String reportDateTime;
    
    //检测结论
    @XStreamAsAttribute
    @XStreamAlias("TestConclusion")
	private String testConclusion;
    
    //报告审核医生
    @XStreamAsAttribute
    @XStreamAlias("ReportCheckDoctor")
    private String reportCheckDoctor;

	
}
