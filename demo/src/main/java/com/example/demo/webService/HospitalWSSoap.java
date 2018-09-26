/**
 * HospitalWSSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.demo.webService;

public interface HospitalWSSoap extends java.rmi.Remote {

    /**
     * 1.1、创建就诊卡
     */
    public java.lang.String IF_Create_MedicalCard(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 1.2、登记就诊卡
     */
    public java.lang.String IF_Regist_MedicalCard(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 1.3、注销就诊卡
     */
    public java.lang.String IF_Cancel_MedicalCard(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 1.4、清除就诊卡
     */
    public java.lang.String IF_Clear_MedicalCard(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 1.5、获取医院已有卡列表
     */
    public java.lang.String IF_Get_Hospital_MedicalCard_List(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 22.1、获取预约资源
     */
    public java.lang.String IF_Get_Booking_Resource(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 22.2、获取科室预约号源
     */
    public java.lang.String IF_Get_Booking_Dept_NoSource(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 22.3、获取医生预约号源
     */
    public java.lang.String IF_Get_Booking_Doc_Resource(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 2.6、确认预约
     */
    public java.lang.String IF_Confirm_Booking(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 2.7、取消预约
     */
    public java.lang.String IF_Cancel_Booking(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 2.8、预约转挂号
     */
    public java.lang.String IF_Booking_To_Regist(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 2.9、获取患者预约列表
     */
    public java.lang.String IF_Get_Patient_Booking_List(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 2.10、获取患者预约详细
     */
    public java.lang.String IF_Get_Patient_Booking_Detail(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 23.1、获取挂号资源
     */
    public java.lang.String IF_Get_Regist_Resource(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 23.2、获取科室挂号号源
     */
    public java.lang.String IF_Get_Regist_Dept_NoSource(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 23.3、获取医生挂号号源
     */
    public java.lang.String IF_Get_Regist_Doc_Resource(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 3.6、确认挂号
     */
    public java.lang.String IF_Confirm_Regist(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 3.7、取消挂号
     */
    public java.lang.String IF_Cancel_Regist(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 3.8、获取患者挂号列表
     */
    public java.lang.String IF_Get_Patient_Regist_List(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 3.9、获取患者挂号详细
     */
    public java.lang.String IF_Get_Patient_Regist_Detail(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 4.1、检查订单状态（院方）
     */
    public java.lang.String IF_Check_Hospital_Trade_Status(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 4.2、更新订单状态（院方）
     */
    public java.lang.String IF_Update_Trade_Status(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 5.1、获取诊间未缴费账单列表
     */
    public java.lang.String IF_Get_OutPatient_Uncharge_Trade_List(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 5.2、获取未付诊间缴费明细
     */
    public java.lang.String IF_Get_OutPatient_UnCharge_Trade_Detail(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 5.3、获取诊间已缴费列表
     */
    public java.lang.String IF_Get_OutPatient_Charged_Trade_List(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 5.4、获取诊间费用详细
     */
    public java.lang.String IF_Get_OutPatient_Charged_Trade_Detail(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 5.5、诊间未缴费订单验证接口（院方）
     */
    public java.lang.String IF_Check_Hospital_Trade(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 6.1、确认住院号（含规则）
     */
    public java.lang.String IF_Confirm_AdmissionNumber(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 6.2、缴纳住院预缴金
     */
    public java.lang.String IF_Charge_Foregift(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 6.3、获取住院预缴列表
     */
    public java.lang.String IF_Get_Inhospital_Foregift_List(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 6.4、住院预交金详细接口
     */
    public java.lang.String IF_Get_Inhospital_Foregift_Detail(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 6.5、获取住院患者列表
     */
    public java.lang.String IF_Get_Inhospital_Patient_List(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 7.1、确认就诊卡（含规则）
     */
    public java.lang.String IF_Confirm_MedicalCard(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 7.2、充值就诊卡
     */
    public java.lang.String IF_Charge_MedicalCard(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 7.3、获取就诊卡充值列表
     */
    public java.lang.String IF_Get_MedicalCard_Charge_List(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 7.4、获取就诊卡充值详细接口
     */
    public java.lang.String IF_Get_MedicalCard_Charge_Detail(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 8.1、获取检验报告列表
     */
    public java.lang.String IF_Get_Jianyan_Report_List(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 8.2、获取检验报告详细
     */
    public java.lang.String IF_Get_Jianyan_Report_Detail(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 8.3、获取放射报告列表
     */
    public java.lang.String IF_Get_Fangshe_Report_List(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 8.4、获取放射报告详细
     */
    public java.lang.String IF_Get_Fangshe_Report_Detail(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 8.5、获取超声报告列表
     */
    public java.lang.String IF_Get_ChaoSheng_Report_List(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 8.6、获取超声报告详细
     */
    public java.lang.String IF_Get_Chaosheng_Report_Detail(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 8.7、获取病理报告列表
     */
    public java.lang.String IF_Get_Bingli_Report_List(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 8.8、获取病理报告详细
     */
    public java.lang.String IF_Get_Bingli_Report_Detail(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 9.1、获取住院总费用列表
     */
    public java.lang.String IF_Get_Inhospital_Total_Cost_List(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 9.2、获取住院总费用详细
     */
    public java.lang.String IF_Get_Inhospital_Total_Cost_Detail(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 9.3、获取住院日清单列表
     */
    public java.lang.String IF_Get_Inhospital_Day_Cost_List(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 9.4、获取住院日清单详细
     */
    public java.lang.String IF_Get_Inhospital_Day_Cost_Detail(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 9.5、获取住院患者列表
     */
    public java.lang.String IF_Get_InhospitalCost_Patient_List(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 14.1、获取住院列表
     */
    public java.lang.String IF_Hospitalization_Get_List(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 14.2、获取住院详情
     */
    public java.lang.String IF_Hospitalization_Detail(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 14.3、确认预约
     */
    public java.lang.String IF_Hospitalization_Confirm_Booking(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 16.1、获取出院列表
     */
    public java.lang.String IF_LeaveHospital_Get_List(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 16.2、获取出院详情
     */
    public java.lang.String IF_LeaveHospital_Detail(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 16.3、确认出院办理
     */
    public java.lang.String IF_LeaveHospital_Confirm(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 16.4、出院小结列表
     */
    public java.lang.String IF_LeaveHospitalSummary_Get_List(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 16.5、出院小结详情
     */
    public java.lang.String IF_LeaveHospitalSummary_Detail(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 10.2、获取医院候诊查询列表（个人）
     */
    public java.lang.String IF_Get_Hospital_Waiting_List(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 10.3、获取医院交易数据（对账用）
     */
    public java.lang.String IF_Get_Hospital_Trade_List(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 10.5、获取医院就诊卡类型
     */
    public java.lang.String IF_Get_Hospital_CardType_List(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 10.6、获取医院证件类型
     */
    public java.lang.String IF_Get_Hospital_CertType_List(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 10.7、获取银行列表
     */
    public java.lang.String IF_Get_Hospital_Bank_List(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 99.2、服务窗退款
     */
    public java.lang.String FWC_IF_Refundment(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 99.6、支付宝交易查询
     */
    public java.lang.String FWC_IF_Get_AlipayTrades_Month(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 99.6.1、支付宝交易查询
     */
    public java.lang.String FWC_IF_Get_WxTrades_Month(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 99.7、条码支付
     */
    public java.lang.String FWC_IF_Barcode_Pay(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 99.8、条码支付交易查询
     */
    public java.lang.String FWC_IF_Barcode_Pay_Query(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 99.9、条码支付交易撤销
     */
    public java.lang.String FWC_IF_Barcode_Pay_Cancel(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 99.10、条码支付交易退款
     */
    public java.lang.String FWC_IF_Barcode_Pay_Refund(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 99.11、扫码支付
     */
    public java.lang.String FWC_IF_Qrcode_Pay(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 99.12、扫码支付交易查询
     */
    public java.lang.String FWC_IF_Qrcode_Pay_Query(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 99.13、扫码支付交易撤销
     */
    public java.lang.String FWC_IF_Qrcode_Pay_Cancel(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 99.14、扫码支付交易退款
     */
    public java.lang.String FWC_IF_Qrcode_Pay_Refund(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 99.15、扫码付异步通知
     */
    public java.lang.String FWC_IF_Qrcode_Pay_Notify(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 99.17、订单详情查询 FWC_IF_Get_OrderDetail
     */
    public java.lang.String FWC_IF_Get_OrderDetail(java.lang.String xml) throws java.rmi.RemoteException;
}
