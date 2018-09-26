package com.example.demo.domain.Booking.GetPatientBookingDetail;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("BookingDetail")
public class BookingDetail {

	//预约ID
    @XStreamAsAttribute
    @XStreamAlias("BookingID")
	private String bookingID;
	
    //预约号
    @XStreamAsAttribute
    @XStreamAlias("BookingNumber")
	private String bookingNumber;
	
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
	
    //条形码
    @XStreamAsAttribute
    @XStreamAlias("Barcode")
    private String barcode;
    
	//就诊区域
    @XStreamAsAttribute
    @XStreamAlias("ClinicArea")
	private String clinicArea;
	
    //条码备注
    @XStreamAsAttribute
    @XStreamAlias("BarCodeMemo")
	private String barCodeMemo;
	
    //二维码备注
    @XStreamAsAttribute
    @XStreamAlias("QrCodeMemo")
    private String qrCodeMemo;
    
    //医院名称
    @XStreamAsAttribute
    @XStreamAlias("HospitalName")
	private String hospitalName;
	
    //预约日期
    @XStreamAsAttribute
    @XStreamAlias("BookingDate")
	private String bookingDate;
	
    //就诊内容
    @XStreamAsAttribute
    @XStreamAlias("DiagnosisDetails")
    private String diagnosisDetails;
    
	//排队号
    @XStreamAsAttribute
    @XStreamAlias("QueuingNumber")
	private String queuingNumber;
	
    //患者姓名
    @XStreamAsAttribute
    @XStreamAlias("PatientName")
	private String patientName;
	
    //订单创建日期时间
    @XStreamAsAttribute
    @XStreamAlias("TradeCreateDateTime")
    private String tradeCreateDateTime;
    
    //金额
    @XStreamAsAttribute
    @XStreamAlias("Amount")
	private String amount;
	
    //预约状态
    @XStreamAsAttribute
    @XStreamAlias("BookingStatus")
	private String bookingStatus;
	
    //是否允许挂号
    @XStreamAsAttribute
    @XStreamAlias("AllowRegist")
    private String allowRegist;
    
	//项目类别
    @XStreamAsAttribute
    @XStreamAlias("ItemType")
	private String itemType;
	
    //是否可以取消
    @XStreamAsAttribute
    @XStreamAlias("IsCancel")
	private String isCancel;
	
    //一级挂号类别
    @XStreamAsAttribute
    @XStreamAlias("RegistLevel1")
    private String registLevel1;
    
    //扩展信息
    @XStreamAsAttribute
    @XStreamAlias("ExtInfo")
	private String extInfo;

	public String getBookingID() {
		return bookingID;
	}

	public void setBookingID(String bookingID) {
		this.bookingID = bookingID;
	}

	public String getBookingNumber() {
		return bookingNumber;
	}

	public void setBookingNumber(String bookingNumber) {
		this.bookingNumber = bookingNumber;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getTwoDimensionCode() {
		return twoDimensionCode;
	}

	public void setTwoDimensionCode(String twoDimensionCode) {
		this.twoDimensionCode = twoDimensionCode;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getClinicArea() {
		return clinicArea;
	}

	public void setClinicArea(String clinicArea) {
		this.clinicArea = clinicArea;
	}

	public String getBarCodeMemo() {
		return barCodeMemo;
	}

	public void setBarCodeMemo(String barCodeMemo) {
		this.barCodeMemo = barCodeMemo;
	}

	public String getQrCodeMemo() {
		return qrCodeMemo;
	}

	public void setQrCodeMemo(String qrCodeMemo) {
		this.qrCodeMemo = qrCodeMemo;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getDiagnosisDetails() {
		return diagnosisDetails;
	}

	public void setDiagnosisDetails(String diagnosisDetails) {
		this.diagnosisDetails = diagnosisDetails;
	}

	public String getQueuingNumber() {
		return queuingNumber;
	}

	public void setQueuingNumber(String queuingNumber) {
		this.queuingNumber = queuingNumber;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getTradeCreateDateTime() {
		return tradeCreateDateTime;
	}

	public void setTradeCreateDateTime(String tradeCreateDateTime) {
		this.tradeCreateDateTime = tradeCreateDateTime;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public String getAllowRegist() {
		return allowRegist;
	}

	public void setAllowRegist(String allowRegist) {
		this.allowRegist = allowRegist;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getIsCancel() {
		return isCancel;
	}

	public void setIsCancel(String isCancel) {
		this.isCancel = isCancel;
	}

	public String getRegistLevel1() {
		return registLevel1;
	}

	public void setRegistLevel1(String registLevel1) {
		this.registLevel1 = registLevel1;
	}

	public String getExtInfo() {
		return extInfo;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	
    
}
