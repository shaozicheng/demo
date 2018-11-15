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

	public String getReportSpecimen() {
		return reportSpecimen;
	}

	public void setReportSpecimen(String reportSpecimen) {
		this.reportSpecimen = reportSpecimen;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientSex() {
		return patientSex;
	}

	public void setPatientSex(String patientSex) {
		this.patientSex = patientSex;
	}

	public String getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(String patientAge) {
		this.patientAge = patientAge;
	}

	public String getReportTestDept() {
		return reportTestDept;
	}

	public void setReportTestDept(String reportTestDept) {
		this.reportTestDept = reportTestDept;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getReportDateTime() {
		return reportDateTime;
	}

	public void setReportDateTime(String reportDateTime) {
		this.reportDateTime = reportDateTime;
	}

	public String getReportClinicalDiagnosis() {
		return reportClinicalDiagnosis;
	}

	public void setReportClinicalDiagnosis(String reportClinicalDiagnosis) {
		this.reportClinicalDiagnosis = reportClinicalDiagnosis;
	}

	public String getReportMemo() {
		return reportMemo;
	}

	public void setReportMemo(String reportMemo) {
		this.reportMemo = reportMemo;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getReportContent() {
		return reportContent;
	}

	public void setReportContent(String reportContent) {
		this.reportContent = reportContent;
	}

	public String getReportCheckDoctor() {
		return reportCheckDoctor;
	}

	public void setReportCheckDoctor(String reportCheckDoctor) {
		this.reportCheckDoctor = reportCheckDoctor;
	}

	public String getReportResult() {
		return reportResult;
	}

	public void setReportResult(String reportResult) {
		this.reportResult = reportResult;
	}

	public String getDetectionRange() {
		return detectionRange;
	}

	public void setDetectionRange(String detectionRange) {
		this.detectionRange = detectionRange;
	}

	public String getDetectionConclusion() {
		return detectionConclusion;
	}

	public void setDetectionConclusion(String detectionConclusion) {
		this.detectionConclusion = detectionConclusion;
	}
    
}
