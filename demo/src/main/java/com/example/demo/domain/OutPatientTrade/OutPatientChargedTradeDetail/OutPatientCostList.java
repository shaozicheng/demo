package com.example.demo.domain.OutPatientTrade.OutPatientChargedTradeDetail;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("OutPatientCostList")
public class OutPatientCostList {

	//项目编码
	@XStreamAsAttribute
	@XStreamAlias("ItemCode")
	private String itemCode;
	
	//项目名称
	@XStreamAsAttribute
	@XStreamAlias("ItemName")
	private String itemName;
	
	//分类总金额
	@XStreamAsAttribute
	@XStreamAlias("SubTotalAmount")
	private String subTotalAmount;
	
	//科室名称
	@XStreamAsAttribute
	@XStreamAlias("DeptName")
	private String deptName;
	
	//医生开单时间
	@XStreamAsAttribute
	@XStreamAlias("ClinicDateTime")
	private String clinicDateTime;
	
	//是否必须项
	@XStreamAsAttribute
	@XStreamAlias("IsMust")
	private String isMust;

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getSubTotalAmount() {
		return subTotalAmount;
	}

	public void setSubTotalAmount(String subTotalAmount) {
		this.subTotalAmount = subTotalAmount;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getClinicDateTime() {
		return clinicDateTime;
	}

	public void setClinicDateTime(String clinicDateTime) {
		this.clinicDateTime = clinicDateTime;
	}

	public String getIsMust() {
		return isMust;
	}

	public void setIsMust(String isMust) {
		this.isMust = isMust;
	}
	

}
