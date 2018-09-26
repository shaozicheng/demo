package com.example.demo.domain.Report.GetBingliReportDetail;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("PathologyTest")
public class PathologyTest {

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
    
    //报告日期
    @XStreamAsAttribute
    @XStreamAlias("ReportDateTime")
	private String reportDateTime;
    
    //申请医生
    @XStreamAsAttribute
    @XStreamAlias("Doctor")
    private String doctor;
    
    //报告审核医生
    @XStreamAsAttribute
    @XStreamAlias("ReportCheckDoctor")
    private String reportCheckDoctor;
    
    //临床诊断
    @XStreamAsAttribute
    @XStreamAlias("ReportClinicalDiagnosis")
	private String reportClinicalDiagnosis;
	
}
