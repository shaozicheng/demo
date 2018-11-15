package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.AES.anno.Decrypt;
import com.example.demo.AES.anno.Encrypt;
import com.example.demo.domain.Entity;
import com.example.demo.domain.Booking.BookingResource.BookingResourceHead;
import com.example.demo.domain.Booking.BookingResource.BookingResourceXml;
import com.example.demo.domain.Sign.GetSignList.GetSignListHead;
import com.example.demo.util.BookingModel;
import com.example.demo.util.SignModel;
import com.example.demo.webService.HospitalWS;
import com.example.demo.webService.HospitalWSLocator;
import com.example.demo.webService.HospitalWSSoap;
import com.thoughtworks.xstream.XStream;

/***
 * 取号签证相关
 * @author 邵子城 2018/9/30
 *
 */
@RestController
@CrossOrigin
@RequestMapping("/sign")
public class SignController {
	
	final static Logger logger = LoggerFactory.getLogger(SignController.class);
	
	@Autowired
	SignModel signModel;
	
	/**
	 * 39.1、获取签到取号列表
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/getsignlist")
	@PostMapping
//	@Encrypt
//	@Decrypt
	public Entity getSignList(@RequestBody GetSignListHead recordCardHead ){
		Entity entity=new Entity();
//		BookingModel bookingModes = new BookingModel();
//		BookingService bookingS = new BookingService();
		String xml=signModel.sendStr(recordCardHead);
		
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Get_Booking_Resource (xml);//不正确接口 需改正
			
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
	
	
	
	
	
}
