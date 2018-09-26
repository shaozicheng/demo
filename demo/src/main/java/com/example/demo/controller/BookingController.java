package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Entity;
import com.example.demo.domain.Booking.DocModel;
import com.example.demo.domain.Booking.BookingDeptNoSource.BookingDeptNoSourceHead;
import com.example.demo.domain.Booking.BookingDeptNoSource.BookingDeptNoSourceXml;
import com.example.demo.domain.Booking.BookingDeptNoSource.DeptResourceDocNoSourceList;
import com.example.demo.domain.Booking.BookingDocResource.BookingDocResourceHead;
import com.example.demo.domain.Booking.BookingDocResource.BookingDocResourceXml;
import com.example.demo.domain.Booking.BookingDocResource.DocResourceResourceList;
import com.example.demo.domain.Booking.BookingResource.BookingResourceHead;
import com.example.demo.domain.Booking.BookingResource.BookingResourceXml;
import com.example.demo.domain.Booking.CancelBooking.CancelBookingHead;
import com.example.demo.domain.Booking.CancelBooking.CancelBookingXml;
import com.example.demo.domain.Booking.ConfirmBooking.BookPatientModel;
import com.example.demo.domain.Booking.ConfirmBooking.ConfirmBookingHead;
import com.example.demo.domain.Booking.ConfirmBooking.ConfirmBookingXml;
import com.example.demo.domain.Booking.GetPatientBookingDetail.GetPatientBookingDetailHead;
import com.example.demo.domain.Booking.GetPatientBookingDetail.GetPatientBookingDetailXml;
import com.example.demo.domain.Booking.GetPatientBookingList.GetPatientBookingListHead;
import com.example.demo.domain.Booking.GetPatientBookingList.GetPatientBookingListXml;
import com.example.demo.domain.MedicalCard.GetHospitalMedicalCardList.UserModel;
import com.example.demo.service.BookingService;
import com.example.demo.util.BookingModel;
import com.example.demo.webService.HospitalWS;
import com.example.demo.webService.HospitalWSLocator;
import com.example.demo.webService.HospitalWSSoap;
import com.thoughtworks.xstream.XStream;

/***
 * 预约相关
 * @author 邵子城 2018/7/23
 *
 */
@RestController
@CrossOrigin
@RequestMapping("/booking")
public class BookingController {

	final static Logger logger = LoggerFactory.getLogger(BookingController.class);
	
	@Autowired
	BookingModel bookingMode;
	
	@Autowired
	BookingService bookingService;
	
	/**
	 * 22.1、获取预约资源
	 * @param recordCardHead
	 * @return
	 */
	
	//设立一个定时器调用此方法
//	@RequestMapping("/getbookingresource")
//	@PostMapping
	public Entity getBookingResource(@RequestBody BookingResourceHead recordCardHead ){
		Entity entity=new Entity();
//		BookingModel bookingModes = new BookingModel();
//		BookingService bookingS = new BookingService();
		String xml=bookingMode.sendStr(recordCardHead);
		
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Get_Booking_Resource (xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(BookingResourceXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(BookingResourceXml.class.getClassLoader());
            BookingResourceXml xmlTest= (BookingResourceXml) xstream.fromXML(result);
            
            entity.setSuccess(true);
    		entity.setResult(xmlTest.getBody());
//    		bookingService.GetBookingResource(xmlTest.getBody());
    		
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage(e.getMessage());
			e.printStackTrace();
		}
		
		
		return entity;
	}
	
	/**
	 * 22.2、更新预约科室资源
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/getbookingdeptnosource")
	@PostMapping
	public Entity getBookingDeptNoSource(@RequestBody BookingDeptNoSourceHead recordCardHead ){
		Entity entity=new Entity();
		String xml=bookingMode.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Get_Booking_Dept_NoSource (xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(BookingDeptNoSourceXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(BookingDeptNoSourceXml.class.getClassLoader());
            BookingDeptNoSourceXml xmlTest= (BookingDeptNoSourceXml) xstream.fromXML(result);
            
            entity.setSuccess(true);
    		entity.setMessage(xmlTest.getBody().getResponseResult().getMessage());
    		entity.setResult(xmlTest.getBody());
    		if(xmlTest.getBody() != null){
    			List<DeptResourceDocNoSourceList> dept=bookingService.GetBookingDeptNoSource(xmlTest.getBody(),recordCardHead.getDeptCode(),recordCardHead.getDay());
    			entity.setResult(dept);
    		}else{
    			entity.setSuccess(false);
    			entity.setMessage("暂无数据");
    		}
    		
    		
    		
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage(e.getMessage());
			e.printStackTrace();
		}
		
		
		return entity;
	}
	
	/**
	 * 22.3、获取医生预约号源
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/getbookingdocresource")
	@PostMapping
	public Entity getBookingDocResource(@RequestBody BookingDocResourceHead recordCardHead ){
		Entity entity=new Entity();
		String xml=bookingMode.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Get_Booking_Doc_Resource (xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(BookingDocResourceXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(BookingDocResourceXml.class.getClassLoader());
            BookingDocResourceXml xmlTest= (BookingDocResourceXml) xstream.fromXML(result);
            
            entity.setSuccess(true);
            if(xmlTest.getBody() != null){
            List<DocResourceResourceList> doc = bookingService.getBookingDocResource(recordCardHead.getDay(),xmlTest.getBody(),recordCardHead.getDocCode());
    		entity.setResult(doc);
            }else{
    			entity.setSuccess(false);
    			entity.setMessage("暂无数据");
    		}
            
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage(e.getMessage());
			e.printStackTrace();
		}
		
		
		return entity;
	}
	
	/**
	 * 22.6、确认预约
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/confirmbooking")
	@PostMapping
	public Entity ConfirmBooking(@RequestBody  BookPatientModel bookPatientModel){
		Entity entity=new Entity();
		ConfirmBookingHead recordCardHead =new ConfirmBookingHead();
		
		recordCardHead.setAccessToken(bookPatientModel.getAccessToken());
		recordCardHead.setOpenUserID(bookPatientModel.getOpenUserID());
		recordCardHead.setHospitalUserID(bookPatientModel.getHospitalUserID());
		recordCardHead.setResourceID(bookPatientModel.getResourceID());
		String xml=bookingMode.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Confirm_Booking (xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(ConfirmBookingXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(ConfirmBookingXml.class.getClassLoader());
            ConfirmBookingXml xmlTest = (ConfirmBookingXml) xstream.fromXML(result);
            
            bookPatientModel.setBookingID(xmlTest.getBody().getBookingResult().getBookingID());
            bookPatientModel.setNeedPay(xmlTest.getBody().getBookingResult().getNeedPay());
            if(bookPatientModel.getBookingID() != null && bookPatientModel.getBookingID() != "" ){
            	 GetPatientBookingDetailHead record = new GetPatientBookingDetailHead();
                 record.setAccessToken(bookPatientModel.getAccessToken());
                 record.setBookingID(bookPatientModel.getBookingID());
                 record.setOpenUserID(bookPatientModel.getOpenUserID());
            	 String status = null;
            	 status = GetPatientBookingDetail(record);
            	 bookPatientModel.setBookingStatus(status);
            	 bookingService.confirmBooking(bookPatientModel);
            	 entity.setSuccess(true);
            	 entity.setResult(bookPatientModel.getBookingID());
            	 entity.setMessage("预约成功");
            }else{
            	entity.setSuccess(false);
            	entity.setMessage("预约失败");
            }
           
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage(e.getMessage());
			e.printStackTrace();
		}
		
		
		return entity;
	}
	
	/**
	 * 22.7、取消预约
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/cancelbooking")
	@PostMapping
	public Entity CancelBooking(@RequestBody CancelBookingHead recordCardHead ){
		Entity entity=new Entity();
		String xml=bookingMode.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Cancel_Booking (xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(CancelBookingXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(CancelBookingXml.class.getClassLoader());
            CancelBookingXml xmlTest= (CancelBookingXml) xstream.fromXML(result);
            entity.setResult(xmlTest);
            
            //更新预约状态
            GetPatientBookingDetailHead record = new GetPatientBookingDetailHead();
            record.setAccessToken(recordCardHead.getAccessToken());
            record.setBookingID(recordCardHead.getBookingID());
            record.setOpenUserID(recordCardHead.getOpenUserID());
            String status=null;
            status = GetPatientBookingDetail(record);
            bookingService.updatePatient(status,record.getBookingID());
            
            entity.setSuccess(true);
    		entity.setMessage("取消成功");
    		
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage(e.getMessage());
			e.printStackTrace();
		}
		
		
		return entity;
	}
	
	/**
	 * 获取用户预约列表
	 * @param userModel
	 * @return
	 */
	@RequestMapping("/getpatientlist")
	@PostMapping
	public Entity getPatientList(@RequestBody UserModel userModel ){
		Entity entity=new Entity();
		try {
			List<UserModel> bookPatients = bookingService.getPatientList(userModel);
			entity.setResult(bookPatients);
			entity.setSuccess(true);
		} catch (Exception e) {
			entity.setMessage(e.toString());
			entity.setSuccess(false);
		}
		
		return entity;
	}
	
	/**
	 * 获取患者预约详情(获取医院网络版)
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/getpatientdata")
	@PostMapping
	public Entity getPatientData(@RequestBody GetPatientBookingDetailHead recordCardHead){
		Entity entity=new Entity();
		String status=null;
		List<BookPatientModel> books = bookingService.getPatientData(recordCardHead.getDataSource());//通过ID
		
		for (BookPatientModel bookPatientModel : books) {
			recordCardHead.setBookingID(bookPatientModel.getBookingID());
			status=GetPatientBookingDetail(recordCardHead);
			bookingService.updatePatient(status,bookPatientModel.getBookingID());
			bookPatientModel.setBookingStatus(status);
		}
		
		entity.setResult(books);
		entity.setSuccess(true);
		
		return entity;
	}
	
	
	/**
	 * 22.9、获取患者预约列表(接口文档版本)
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/getpatientbookinglist")
	@PostMapping
	public Entity GetPatientBookingList(@RequestBody GetPatientBookingListHead recordCardHead ){
		Entity entity=new Entity();
		String xml=bookingMode.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Get_Patient_Booking_List (xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(GetPatientBookingListXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(GetPatientBookingListXml.class.getClassLoader());
            GetPatientBookingListXml xmlTest= (GetPatientBookingListXml) xstream.fromXML(result);
            
            entity.setSuccess(true);
    		entity.setMessage(xmlTest.getBody().getResponseResult().getMessage());
    		
    		
    		entity.setResult(xmlTest.getBody());
    		
    		
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage(e.getMessage());
			e.printStackTrace();
		}
		
		
		return entity;
	}
	
	/**
	 * 22.10、获取患者预约详细(接口文档版本)
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/getpatientbookingdetail")
	@PostMapping
	public String GetPatientBookingDetail(@RequestBody GetPatientBookingDetailHead recordCardHead ){
		Entity entity=new Entity();
		String status=null;
		String xml=bookingMode.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Get_Patient_Booking_Detail (xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(GetPatientBookingDetailXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(GetPatientBookingDetailXml.class.getClassLoader());
            GetPatientBookingDetailXml xmlTest= (GetPatientBookingDetailXml) xstream.fromXML(result);
            
            entity.setSuccess(true);
    		if(xmlTest.getBody().getBookingDetail() != null){
    			if(xmlTest.getBody().getBookingDetail().getBookingStatus() != null){
                	status=xmlTest.getBody().getBookingDetail().getBookingStatus();
                }
    		}
            
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage(e.getMessage());
			e.printStackTrace();
		}
		
		
		return status;
	}
	
	/**
	 * 获取科室
	 * @return
	 */
	@RequestMapping("/getdept")
	@PostMapping
	public Entity getDept(@RequestBody DocModel model){
		Entity entity=new Entity();
		if(model.getHospitalID() != null){
			List<DocModel> dept=bookingService.getDept(model);
			entity.setResult(dept);
		}
		
		return entity;
	}
	
	
	
	
	
	
}
