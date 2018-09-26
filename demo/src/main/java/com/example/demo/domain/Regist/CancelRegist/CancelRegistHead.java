package com.example.demo.domain.Regist.CancelRegist;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("head")
public class CancelRegistHead {

	//调用接口的授权码
    @XStreamAsAttribute
    @XStreamAlias("AccessToken")
	private String accessToken;
	
    //服务窗和医院之间确定身份的唯一标识 医院唯一
    @XStreamAsAttribute
    @XStreamAlias("HospitalUserID")
	private String hospitalUserID;
	
    //外部订单编号
    @XStreamAsAttribute
    @XStreamAlias("OutTradeNo")
    private String outTradeNo;
    
    //备注
    @XStreamAsAttribute
    @XStreamAlias("Memo")
	private String memo;
    
    //数据来源
    @XStreamAsAttribute
    @XStreamAlias("DataSource")
	private String dataSource;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getHospitalUserID() {
		return hospitalUserID;
	}

	public void setHospitalUserID(String hospitalUserID) {
		this.hospitalUserID = hospitalUserID;
	}

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}
	
    
    
}
