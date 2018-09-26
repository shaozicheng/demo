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
	
}
