package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Entity;
import com.example.demo.domain.Booking.BookingDeptNoSource.BookingDeptNoSourceHead;
import com.example.demo.domain.Booking.BookingDocResource.BookingDocResourceHead;
import com.example.demo.domain.Booking.BookingResource.BookingResourceHead;
import com.example.demo.domain.Regist.CancelRegist.CancelRegistHead;
import com.example.demo.domain.Regist.CancelRegist.CancelRegistXml;
import com.example.demo.domain.Regist.ConfirmRegist.ConfirmRegistHead;
import com.example.demo.domain.Regist.ConfirmRegist.ConfirmRegistXml;
import com.example.demo.domain.Regist.GetPatientRegistDetail.GetPatientRegistDetailHead;
import com.example.demo.domain.Regist.GetPatientRegistDetail.GetPatientRegistDetailXml;
import com.example.demo.domain.Regist.GetPatientRegistList.GetPatientRegistListHead;
import com.example.demo.domain.Regist.GetPatientRegistList.GetPatientRegistListXml;
import com.example.demo.domain.Regist.GetRegistDeptNoSource.GetRegistDeptNoSourceXml;
import com.example.demo.domain.Regist.GetRegistDocResource.GetRegistDocResourceXml;
import com.example.demo.domain.Regist.GetRegistResource.GetRegistResourceXml;
import com.example.demo.util.RegistModel;
import com.example.demo.webService.HospitalWS;
import com.example.demo.webService.HospitalWSLocator;
import com.example.demo.webService.HospitalWSSoap;
import com.thoughtworks.xstream.XStream;

/***
 * 挂号相关
 * @author 邵子城 2018/7/23
 *
 */
@RestController
@CrossOrigin
@RequestMapping("/regist")
public class RegistController {
	
	final static Logger logger = LoggerFactory.getLogger(RegistController.class);
	
	@Autowired
	RegistModel registModel;

	/**
	 * 23.1、获取挂号资源
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/getregistresource")
	@PostMapping
	public Entity GetRegistResource(@RequestBody BookingResourceHead recordCardHead ){
		Entity entity=new Entity();
		String xml=registModel.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Get_Regist_Resource (xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(GetRegistResourceXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(GetRegistResourceXml.class.getClassLoader());
            GetRegistResourceXml xmlTest= (GetRegistResourceXml) xstream.fromXML(result);
            
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
	 * 23.2、获取科室挂号号源
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/getregistdeptnosource")
	@PostMapping
	public Entity GetRegistDeptNoSource(@RequestBody BookingDeptNoSourceHead recordCardHead ){
		Entity entity=new Entity();
		String xml=registModel.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Get_Regist_Dept_NoSource (xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(GetRegistDeptNoSourceXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(GetRegistDeptNoSourceXml.class.getClassLoader());
            GetRegistDeptNoSourceXml xmlTest= (GetRegistDeptNoSourceXml) xstream.fromXML(result);
            
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
	 * 23.3、获取医生挂号号源
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/getregistdocresource")
	@PostMapping
	public Entity GetRegistDocResource(@RequestBody BookingDocResourceHead recordCardHead ){
		Entity entity=new Entity();
		String xml=registModel.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Get_Regist_Doc_Resource (xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(GetRegistDocResourceXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(GetRegistDocResourceXml.class.getClassLoader());
            GetRegistDocResourceXml xmlTest= (GetRegistDocResourceXml) xstream.fromXML(result);
            
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
	 * 23.6、确认挂号
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/confirmregist")
	@PostMapping
	public Entity ConfirmRegist(@RequestBody ConfirmRegistHead recordCardHead ){
		Entity entity=new Entity();
		String xml=registModel.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Confirm_Regist (xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(ConfirmRegistXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(ConfirmRegistXml.class.getClassLoader());
            ConfirmRegistXml xmlTest= (ConfirmRegistXml) xstream.fromXML(result);
            
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
	 * 23.7、取消挂号
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/cancelregist")
	@PostMapping
	public Entity CancelRegist(@RequestBody CancelRegistHead recordCardHead ){
		Entity entity=new Entity();
		String xml=registModel.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Cancel_Regist (xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(CancelRegistXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(CancelRegistXml.class.getClassLoader());
            CancelRegistXml xmlTest= (CancelRegistXml) xstream.fromXML(result);
            
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
	 * 23.8、获取患者挂号列表
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/getpatientregistlist")
	@PostMapping
	public Entity GetPatientRegistList(@RequestBody GetPatientRegistListHead recordCardHead ){
		Entity entity=new Entity();
		String xml=registModel.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Get_Patient_Regist_List (xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(GetPatientRegistListXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(GetPatientRegistListXml.class.getClassLoader());
            GetPatientRegistListXml xmlTest= (GetPatientRegistListXml) xstream.fromXML(result);
            
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
	 * 23.9、获取患者挂号详细
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/getpatientregistdetail")
	@PostMapping
	public Entity GetPatientRegistDetail(@RequestBody GetPatientRegistDetailHead recordCardHead ){
		Entity entity=new Entity();
		String xml=registModel.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Get_Patient_Regist_Detail (xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(GetPatientRegistDetailXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(GetPatientRegistDetailXml.class.getClassLoader());
            GetPatientRegistDetailXml xmlTest= (GetPatientRegistDetailXml) xstream.fromXML(result);
            
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
	
}
