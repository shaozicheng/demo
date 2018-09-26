package com.example.demo.webService;

public class HospitalWSSoapProxy implements com.example.demo.webService.HospitalWSSoap {
  private String _endpoint = null;
  private com.example.demo.webService.HospitalWSSoap hospitalWSSoap = null;
  
  public HospitalWSSoapProxy() {
    _initHospitalWSSoapProxy();
  }
  
  public HospitalWSSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initHospitalWSSoapProxy();
  }
  
  private void _initHospitalWSSoapProxy() {
    try {
      hospitalWSSoap = (new com.example.demo.webService.HospitalWSLocator()).getHospitalWSSoap();
      if (hospitalWSSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)hospitalWSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)hospitalWSSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (hospitalWSSoap != null)
      ((javax.xml.rpc.Stub)hospitalWSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.example.demo.webService.HospitalWSSoap getHospitalWSSoap() {
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap;
  }
  
  public java.lang.String IF_Create_MedicalCard(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Create_MedicalCard(xml);
  }
  
  public java.lang.String IF_Regist_MedicalCard(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Regist_MedicalCard(xml);
  }
  
  public java.lang.String IF_Cancel_MedicalCard(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Cancel_MedicalCard(xml);
  }
  
  public java.lang.String IF_Clear_MedicalCard(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Clear_MedicalCard(xml);
  }
  
  public java.lang.String IF_Get_Hospital_MedicalCard_List(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Hospital_MedicalCard_List(xml);
  }
  
  public java.lang.String IF_Get_Booking_Resource(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Booking_Resource(xml);
  }
  
  public java.lang.String IF_Get_Booking_Dept_NoSource(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Booking_Dept_NoSource(xml);
  }
  
  public java.lang.String IF_Get_Booking_Doc_Resource(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Booking_Doc_Resource(xml);
  }
  
  public java.lang.String IF_Confirm_Booking(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Confirm_Booking(xml);
  }
  
  public java.lang.String IF_Cancel_Booking(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Cancel_Booking(xml);
  }
  
  public java.lang.String IF_Booking_To_Regist(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Booking_To_Regist(xml);
  }
  
  public java.lang.String IF_Get_Patient_Booking_List(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Patient_Booking_List(xml);
  }
  
  public java.lang.String IF_Get_Patient_Booking_Detail(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Patient_Booking_Detail(xml);
  }
  
  public java.lang.String IF_Get_Regist_Resource(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Regist_Resource(xml);
  }
  
  public java.lang.String IF_Get_Regist_Dept_NoSource(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Regist_Dept_NoSource(xml);
  }
  
  public java.lang.String IF_Get_Regist_Doc_Resource(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Regist_Doc_Resource(xml);
  }
  
  public java.lang.String IF_Confirm_Regist(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Confirm_Regist(xml);
  }
  
  public java.lang.String IF_Cancel_Regist(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Cancel_Regist(xml);
  }
  
  public java.lang.String IF_Get_Patient_Regist_List(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Patient_Regist_List(xml);
  }
  
  public java.lang.String IF_Get_Patient_Regist_Detail(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Patient_Regist_Detail(xml);
  }
  
  public java.lang.String IF_Check_Hospital_Trade_Status(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Check_Hospital_Trade_Status(xml);
  }
  
  public java.lang.String IF_Update_Trade_Status(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Update_Trade_Status(xml);
  }
  
  public java.lang.String IF_Get_OutPatient_Uncharge_Trade_List(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_OutPatient_Uncharge_Trade_List(xml);
  }
  
  public java.lang.String IF_Get_OutPatient_UnCharge_Trade_Detail(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_OutPatient_UnCharge_Trade_Detail(xml);
  }
  
  public java.lang.String IF_Get_OutPatient_Charged_Trade_List(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_OutPatient_Charged_Trade_List(xml);
  }
  
  public java.lang.String IF_Get_OutPatient_Charged_Trade_Detail(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_OutPatient_Charged_Trade_Detail(xml);
  }
  
  public java.lang.String IF_Check_Hospital_Trade(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Check_Hospital_Trade(xml);
  }
  
  public java.lang.String IF_Confirm_AdmissionNumber(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Confirm_AdmissionNumber(xml);
  }
  
  public java.lang.String IF_Charge_Foregift(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Charge_Foregift(xml);
  }
  
  public java.lang.String IF_Get_Inhospital_Foregift_List(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Inhospital_Foregift_List(xml);
  }
  
  public java.lang.String IF_Get_Inhospital_Foregift_Detail(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Inhospital_Foregift_Detail(xml);
  }
  
  public java.lang.String IF_Get_Inhospital_Patient_List(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Inhospital_Patient_List(xml);
  }
  
  public java.lang.String IF_Confirm_MedicalCard(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Confirm_MedicalCard(xml);
  }
  
  public java.lang.String IF_Charge_MedicalCard(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Charge_MedicalCard(xml);
  }
  
  public java.lang.String IF_Get_MedicalCard_Charge_List(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_MedicalCard_Charge_List(xml);
  }
  
  public java.lang.String IF_Get_MedicalCard_Charge_Detail(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_MedicalCard_Charge_Detail(xml);
  }
  
  public java.lang.String IF_Get_Jianyan_Report_List(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Jianyan_Report_List(xml);
  }
  
  public java.lang.String IF_Get_Jianyan_Report_Detail(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Jianyan_Report_Detail(xml);
  }
  
  public java.lang.String IF_Get_Fangshe_Report_List(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Fangshe_Report_List(xml);
  }
  
  public java.lang.String IF_Get_Fangshe_Report_Detail(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Fangshe_Report_Detail(xml);
  }
  
  public java.lang.String IF_Get_ChaoSheng_Report_List(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_ChaoSheng_Report_List(xml);
  }
  
  public java.lang.String IF_Get_Chaosheng_Report_Detail(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Chaosheng_Report_Detail(xml);
  }
  
  public java.lang.String IF_Get_Bingli_Report_List(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Bingli_Report_List(xml);
  }
  
  public java.lang.String IF_Get_Bingli_Report_Detail(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Bingli_Report_Detail(xml);
  }
  
  public java.lang.String IF_Get_Inhospital_Total_Cost_List(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Inhospital_Total_Cost_List(xml);
  }
  
  public java.lang.String IF_Get_Inhospital_Total_Cost_Detail(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Inhospital_Total_Cost_Detail(xml);
  }
  
  public java.lang.String IF_Get_Inhospital_Day_Cost_List(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Inhospital_Day_Cost_List(xml);
  }
  
  public java.lang.String IF_Get_Inhospital_Day_Cost_Detail(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Inhospital_Day_Cost_Detail(xml);
  }
  
  public java.lang.String IF_Get_InhospitalCost_Patient_List(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_InhospitalCost_Patient_List(xml);
  }
  
  public java.lang.String IF_Hospitalization_Get_List(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Hospitalization_Get_List(xml);
  }
  
  public java.lang.String IF_Hospitalization_Detail(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Hospitalization_Detail(xml);
  }
  
  public java.lang.String IF_Hospitalization_Confirm_Booking(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Hospitalization_Confirm_Booking(xml);
  }
  
  public java.lang.String IF_LeaveHospital_Get_List(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_LeaveHospital_Get_List(xml);
  }
  
  public java.lang.String IF_LeaveHospital_Detail(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_LeaveHospital_Detail(xml);
  }
  
  public java.lang.String IF_LeaveHospital_Confirm(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_LeaveHospital_Confirm(xml);
  }
  
  public java.lang.String IF_LeaveHospitalSummary_Get_List(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_LeaveHospitalSummary_Get_List(xml);
  }
  
  public java.lang.String IF_LeaveHospitalSummary_Detail(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_LeaveHospitalSummary_Detail(xml);
  }
  
  public java.lang.String IF_Get_Hospital_Waiting_List(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Hospital_Waiting_List(xml);
  }
  
  public java.lang.String IF_Get_Hospital_Trade_List(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Hospital_Trade_List(xml);
  }
  
  public java.lang.String IF_Get_Hospital_CardType_List(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Hospital_CardType_List(xml);
  }
  
  public java.lang.String IF_Get_Hospital_CertType_List(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Hospital_CertType_List(xml);
  }
  
  public java.lang.String IF_Get_Hospital_Bank_List(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.IF_Get_Hospital_Bank_List(xml);
  }
  
  public java.lang.String FWC_IF_Refundment(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.FWC_IF_Refundment(xml);
  }
  
  public java.lang.String FWC_IF_Get_AlipayTrades_Month(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.FWC_IF_Get_AlipayTrades_Month(xml);
  }
  
  public java.lang.String FWC_IF_Get_WxTrades_Month(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.FWC_IF_Get_WxTrades_Month(xml);
  }
  
  public java.lang.String FWC_IF_Barcode_Pay(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.FWC_IF_Barcode_Pay(xml);
  }
  
  public java.lang.String FWC_IF_Barcode_Pay_Query(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.FWC_IF_Barcode_Pay_Query(xml);
  }
  
  public java.lang.String FWC_IF_Barcode_Pay_Cancel(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.FWC_IF_Barcode_Pay_Cancel(xml);
  }
  
  public java.lang.String FWC_IF_Barcode_Pay_Refund(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.FWC_IF_Barcode_Pay_Refund(xml);
  }
  
  public java.lang.String FWC_IF_Qrcode_Pay(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.FWC_IF_Qrcode_Pay(xml);
  }
  
  public java.lang.String FWC_IF_Qrcode_Pay_Query(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.FWC_IF_Qrcode_Pay_Query(xml);
  }
  
  public java.lang.String FWC_IF_Qrcode_Pay_Cancel(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.FWC_IF_Qrcode_Pay_Cancel(xml);
  }
  
  public java.lang.String FWC_IF_Qrcode_Pay_Refund(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.FWC_IF_Qrcode_Pay_Refund(xml);
  }
  
  public java.lang.String FWC_IF_Qrcode_Pay_Notify(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.FWC_IF_Qrcode_Pay_Notify(xml);
  }
  
  public java.lang.String FWC_IF_Get_OrderDetail(java.lang.String xml) throws java.rmi.RemoteException{
    if (hospitalWSSoap == null)
      _initHospitalWSSoapProxy();
    return hospitalWSSoap.FWC_IF_Get_OrderDetail(xml);
  }
  
  
}