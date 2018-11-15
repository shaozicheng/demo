package com.example.demo.domain.OutPatientTrade.OutPatientChargedTradeDetail;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("OutPatientSubItemList")
public class OutPatientSubItemList {

	//子项目代码
	@XStreamAsAttribute
	@XStreamAlias("SubItemCode")
	private String subItemCode;
	
	//子项目名称
	@XStreamAsAttribute
	@XStreamAlias("SubItemName")
	private String subItemName;
	
	//单价
	@XStreamAsAttribute
	@XStreamAlias("Price")
	private String price;
	
	//单位
	@XStreamAsAttribute
	@XStreamAlias("Unit")
	private String unit;
	
	//数量
	@XStreamAsAttribute
	@XStreamAlias("Number")
	private String number;
	
	//金额
	@XStreamAsAttribute
	@XStreamAlias("Amount")
	private String amount;
	
	//项目编码
	@XStreamAsAttribute
	@XStreamAlias("ItemCode")
	private String itemCode;
	
	//项目类别
	@XStreamAsAttribute
	@XStreamAlias("ItemType")
	private String itemType;

	//是否必须项
	@XStreamAsAttribute
	@XStreamAlias("IsMust")
	private String isMust;

	public String getSubItemCode() {
		return subItemCode;
	}

	public void setSubItemCode(String subItemCode) {
		this.subItemCode = subItemCode;
	}

	public String getSubItemName() {
		return subItemName;
	}

	public void setSubItemName(String subItemName) {
		this.subItemName = subItemName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getIsMust() {
		return isMust;
	}

	public void setIsMust(String isMust) {
		this.isMust = isMust;
	}
	
}
