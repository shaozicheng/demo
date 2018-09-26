package com.example.demo.domain.Report.GetChaoshengReportDetail;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("UltrasonicTest")
public class UltrasonicTest {

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
    
    //超声类型
    @XStreamAsAttribute
    @XStreamAlias("UltrasonicType")
	private String ultrasonicType;
    
    //超声部位
    @XStreamAsAttribute
    @XStreamAlias("UltrasonicPosition")
	private String ultrasonicPosition;
    
    //报告提示信息
    @XStreamAsAttribute
    @XStreamAlias("ReportAlert")
	private String reportAlert;
    
    //超声结果
    @XStreamAsAttribute
    @XStreamAlias("UltrasonicResult")
	private String ultrasonicResult;
    
    //报告审核医生
    @XStreamAsAttribute
    @XStreamAlias("ReportCheckDoctor")
    private String reportCheckDoctor;

	
	
}
