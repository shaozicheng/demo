package com.example.demo.domain.Sign.GetSignList;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class SignList {

	//项目名称
	@XStreamAsAttribute
	@XStreamAlias("ItemName")
	private String itemName;
	
	//候诊人数
    @XStreamAsAttribute
    @XStreamAlias("WaitingNumber")
	private String waitingNumber;
	
    //个人排队号
    @XStreamAsAttribute
    @XStreamAlias("MyNumber")
	private String myNumber;
	
    //备注
    @XStreamAsAttribute
    @XStreamAlias("Memo")
    private String memo;
    
    //是否可用
    @XStreamAsAttribute
    @XStreamAlias("IsAvailable")
	private String isAvailable;
	
    //开放时间备注
    @XStreamAsAttribute
    @XStreamAlias("OpenTimeMemo")
	private String openTimeMemo;
    
    //
    @XStreamAsAttribute
    @XStreamAlias("ID")
	private String ID;
	
    //数据来源
    @XStreamAsAttribute
    @XStreamAlias("DataSource")
	private String dataSource;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getWaitingNumber() {
		return waitingNumber;
	}

	public void setWaitingNumber(String waitingNumber) {
		this.waitingNumber = waitingNumber;
	}

	public String getMyNumber() {
		return myNumber;
	}

	public void setMyNumber(String myNumber) {
		this.myNumber = myNumber;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getOpenTimeMemo() {
		return openTimeMemo;
	}

	public void setOpenTimeMemo(String openTimeMemo) {
		this.openTimeMemo = openTimeMemo;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}
	
}
