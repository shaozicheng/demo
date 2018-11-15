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
import com.example.demo.domain.OutPatientTrade.CheckHospitalTrade.CheckHospitalTradeHead;
import com.example.demo.domain.OutPatientTrade.CheckHospitalTrade.CheckHospitalTradeXml;
import com.example.demo.domain.OutPatientTrade.OutPatientChargedTradeDetail.OutPatientChargedTradeDetailHead;
import com.example.demo.domain.OutPatientTrade.OutPatientChargedTradeDetail.OutPatientChargedTradeDetailXml;
import com.example.demo.domain.OutPatientTrade.OutPatientChargedTradeList.OutPatientChargedTradeListHead;
import com.example.demo.domain.OutPatientTrade.OutPatientChargedTradeList.OutPatientChargedTradeListXml;
import com.example.demo.domain.OutPatientTrade.OutPatientUnchargeTradeDetail.OutPatientUnchargeTradeDetailHead;
import com.example.demo.domain.OutPatientTrade.OutPatientUnchargeTradeDetail.OutPatientUnchargeTradeDetailXml;
import com.example.demo.domain.OutPatientTrade.OutPatientUnchargeTradeList.OutPatientUnchargeTradeListHead;
import com.example.demo.domain.OutPatientTrade.OutPatientUnchargeTradeList.OutPatientUnchargeTradeListXml;
import com.example.demo.util.OutPatientTradeModel;
import com.example.demo.webService.HospitalWS;
import com.example.demo.webService.HospitalWSLocator;
import com.example.demo.webService.HospitalWSSoap;
import com.thoughtworks.xstream.XStream;


/***
 * 诊间缴费相关
 * @author 邵子城 2018/10/8
 *
 */
@RestController
@CrossOrigin
@RequestMapping("/outpatienttrade")
public class OutPatientTradeController {

	final static Logger logger = LoggerFactory.getLogger(OutPatientTradeController.class);
	
	@Autowired
	OutPatientTradeModel outPatientTradeModel;
	
	/**
	 * 5.1、获取诊间未缴费账单列表 
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/getoutpatientunchargetradelist")
	@PostMapping
	public Entity GetOutPatientUnchargeTradeList(@RequestBody OutPatientUnchargeTradeListHead recordCardHead ){
		Entity entity=new Entity();
		String xml=outPatientTradeModel.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Get_OutPatient_Uncharge_Trade_List(xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(OutPatientUnchargeTradeListXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(OutPatientUnchargeTradeListXml.class.getClassLoader());
            OutPatientUnchargeTradeListXml xmlTest= (OutPatientUnchargeTradeListXml) xstream.fromXML(result);
            
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
	 * 5.2、获取未付诊间缴费明细 
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/getoutpatientunchargetradedetail")
	@PostMapping
	public Entity GetOutPatientUnChargeTradeDetail(@RequestBody OutPatientUnchargeTradeDetailHead recordCardHead ){
		Entity entity=new Entity();
		String xml=outPatientTradeModel.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Get_OutPatient_UnCharge_Trade_Detail(xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(OutPatientUnchargeTradeDetailXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(OutPatientUnchargeTradeDetailXml.class.getClassLoader());
            OutPatientUnchargeTradeDetailXml xmlTest= (OutPatientUnchargeTradeDetailXml) xstream.fromXML(result);
            
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
	 * 5.3、获取诊间已缴费列表
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/getoutpatientchargedtradelist")
	@PostMapping
	public Entity GetOutPatientChargedTradeList(@RequestBody OutPatientChargedTradeListHead recordCardHead ){
		Entity entity=new Entity();
		String xml=outPatientTradeModel.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Get_OutPatient_Charged_Trade_List(xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(OutPatientChargedTradeListXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(OutPatientChargedTradeListXml.class.getClassLoader());
            OutPatientChargedTradeListXml xmlTest= (OutPatientChargedTradeListXml) xstream.fromXML(result);
            
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
	 * 5.4、获取诊间费用详细  
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/getoutpatientchargedtradedetail")
	@PostMapping
	public Entity GetOutPatientChargedTradeDetail(@RequestBody OutPatientChargedTradeDetailHead recordCardHead ){
		Entity entity=new Entity();
		String xml=outPatientTradeModel.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Get_OutPatient_Charged_Trade_Detail(xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(OutPatientChargedTradeDetailXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(OutPatientChargedTradeDetailXml.class.getClassLoader());
            OutPatientChargedTradeDetailXml xmlTest= (OutPatientChargedTradeDetailXml) xstream.fromXML(result);
            
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
	 * 5.5、诊间未缴费订单验证接口（院方）
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/checkhospitaltrade")
	@PostMapping
	public Entity CheckHospitalTrade(@RequestBody CheckHospitalTradeHead recordCardHead ){
		Entity entity=new Entity();
		String xml=outPatientTradeModel.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Check_Hospital_Trade(xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(CheckHospitalTradeXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(CheckHospitalTradeXml.class.getClassLoader());
            CheckHospitalTradeXml xmlTest= (CheckHospitalTradeXml) xstream.fromXML(result);
            
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
