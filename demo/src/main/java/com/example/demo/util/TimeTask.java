package com.example.demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.demo.controller.BookingController;
import com.example.demo.domain.Entity;
import com.example.demo.domain.Booking.BookingResource.BookingResourceHead;
import com.example.demo.domain.Booking.BookingResource.BookingResourceXml;
import com.example.demo.service.BookingService;
import com.example.demo.webService.HospitalWS;
import com.example.demo.webService.HospitalWSLocator;
import com.example.demo.webService.HospitalWSSoap;
import com.thoughtworks.xstream.XStream;


@Component
public class TimeTask {
	
	@Autowired
	BookingModel bookingMode;
	
	@Autowired
	BookingService bookingService;
	
	/**
	 * 定期更新医院信息
	 */
//	@Scheduled(cron="0/30 * * * * ?")
	@Scheduled(cron="0 0 1 * * ?")
	public void updateResource(){
		BookingResourceHead recordCardHead = new BookingResourceHead();
		
		recordCardHead.setAccessToken("800EBED9-63E5-4408-A184-BE693DA32CB6");//市区分部
		recordCardHead.setOpenUserID("2088022943884345");
		
		getResource(recordCardHead,"01");
		
		recordCardHead.setAccessToken("800EBED9-63E5-4408-A184-BE693DA32CB7");//金山总部
		getResource(recordCardHead,"02");
	}
	
	public void getResource(BookingResourceHead recordCardHead,String hostp){
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
            
            bookingService.GetBookingResource(xmlTest.getBody(),hostp);
    		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
