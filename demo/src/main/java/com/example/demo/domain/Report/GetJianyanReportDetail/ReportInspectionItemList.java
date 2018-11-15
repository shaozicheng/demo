package com.example.demo.domain.Report.GetJianyanReportDetail;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("ReportInspectionItemList")
public class ReportInspectionItemList {

	//项目名称
    @XStreamAsAttribute
    @XStreamAlias("ItemName")
	private String itemName;
	
    //项目结果
    @XStreamAsAttribute
    @XStreamAlias("ItemResult")
	private String itemResult;
	
    //参考值
    @XStreamAsAttribute
    @XStreamAlias("ReferenceValue")
    private String referenceValue;
    
    //参考值单位
    @XStreamAsAttribute
    @XStreamAlias("ReferenceValueUnit")
	private String referenceValueUnit;
	
    //报告提示信息
    @XStreamAsAttribute
    @XStreamAlias("ReportAlert")
	private String reportAlert;
    
    //报告编号
	private String reportNo;

	public String getReportNo() {
		return reportNo;
	}

	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemResult() {
		return itemResult;
	}

	public void setItemResult(String itemResult) {
		this.itemResult = itemResult;
	}

	public String getReferenceValue() {
		return referenceValue;
	}

	public void setReferenceValue(String referenceValue) {
		this.referenceValue = referenceValue;
	}

	public String getReferenceValueUnit() {
		return referenceValueUnit;
	}

	public void setReferenceValueUnit(String referenceValueUnit) {
		this.referenceValueUnit = referenceValueUnit;
	}

	public String getReportAlert() {
		return reportAlert;
	}

	public void setReportAlert(String reportAlert) {
		this.reportAlert = reportAlert;
	}
	
}
