package com.example.demo.domain.Regist.GetRegistResourcePrice;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("head")
public class GetRegistResourcePriceHead {

	//调用接口的授权码
    @XStreamAsAttribute
    @XStreamAlias("AccessToken")
	private String accessToken;
	
    //外部接入系统ID
    @XStreamAsAttribute
    @XStreamAlias("OpenUserID")
	private String openUserID;
	
    //服务窗和医院之间确定身份的唯一标识 医院唯一
    @XStreamAsAttribute
    @XStreamAlias("HospitalUserID")
    private String hospitalUserID;
    
    //资源编号
    @XStreamAsAttribute
    @XStreamAlias("ResourceID")
	private String resourceID;
	
    //数据来源
    @XStreamAsAttribute
    @XStreamAlias("DataSource")
	private String dataSource;
	
}
