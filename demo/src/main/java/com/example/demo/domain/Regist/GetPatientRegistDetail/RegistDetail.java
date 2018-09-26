package com.example.demo.domain.Regist.GetPatientRegistDetail;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("RegistDetail")
public class RegistDetail {

	//医院名称
    @XStreamAsAttribute
    @XStreamAlias("HospitalName")
	private String HospitalName;
	
    //科室名称
    @XStreamAsAttribute
    @XStreamAlias("DeptName")
    private String deptName;
    
    //医生名称
    @XStreamAsAttribute
    @XStreamAlias("DocName")
	private String docName;
	
    //二维码
    @XStreamAsAttribute
    @XStreamAlias("TwoDimensionCode")
	private String twoDimensionCode;
	
    //就诊区域
    @XStreamAsAttribute
    @XStreamAlias("ClinicArea")
	private String clinicArea;
    
    //条形码
    @XStreamAsAttribute
    @XStreamAlias("Barcode")
    private String barcode;
    
    //条码备注
    @XStreamAsAttribute
    @XStreamAlias("BarCodeMemo")
	private String barCodeMemo;
	
    //二维码备注
    @XStreamAsAttribute
    @XStreamAlias("QrCodeMemo")
    private String qrCodeMemo;
    
    //外部订单编号
    @XStreamAsAttribute
    @XStreamAlias("OutTradeNo")
	private String outTradeNo;
	
    //患者姓名
    @XStreamAsAttribute
    @XStreamAlias("PatientName")
	private String patientName;
    
    //挂号日期
    @XStreamAsAttribute
    @XStreamAlias("RegistDate")
	private String registDate;
	
    //就诊内容
    @XStreamAsAttribute
    @XStreamAlias("DiagnosisDetails")
    private String diagnosisDetails;
    
	//排队号
    @XStreamAsAttribute
    @XStreamAlias("QueuingNumber")
	private String queuingNumber;
	
    //候诊人数
    @XStreamAsAttribute
    @XStreamAlias("WaitingNumber")
    private String waitingNumber;
    
    //挂号状态
    @XStreamAsAttribute
    @XStreamAlias("RegistStatus")
	private String registStatus;
	
    //总金额
    @XStreamAsAttribute
    @XStreamAlias("TotalAmount")
	private String totalAmount;
	
    //订单创建日期时间
    @XStreamAsAttribute
    @XStreamAlias("TradeCreateDateTime")
    private String tradeCreateDateTime;
    
	//支付平台订单号
    @XStreamAsAttribute
    @XStreamAlias("TradeNo")
	private String tradeNo;
	
    //附加说明
    @XStreamAsAttribute
    @XStreamAlias("AddMemo")
	private String addMemo;
	
    //附加链接
    @XStreamAsAttribute
    @XStreamAlias("AddUrl")
    private String addUrl;
    
    //一级挂号类别
    @XStreamAsAttribute
    @XStreamAlias("RegistLevel1")
	private String registLevel1;	
    
  	//扩展信息
    @XStreamAsAttribute
    @XStreamAlias("ExtInfo")
	private String extInfo;	
    
    //签到状态
    @XStreamAsAttribute
    @XStreamAlias("CheckStatus")
	private String checkStatus;	
    

	
}
