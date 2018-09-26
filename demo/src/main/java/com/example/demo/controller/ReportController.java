package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Entity;
import com.example.demo.domain.Report.GetBingliReportDetail.GetBingliReportDetailXml;
import com.example.demo.domain.Report.GetBingliReportList.GetBingliReportListXml;
import com.example.demo.domain.Report.GetChaoShengReportList.GetChaoShengReportListXml;
import com.example.demo.domain.Report.GetChaoshengReportDetail.GetChaoshengReportDetailXml;
import com.example.demo.domain.Report.GetFangsheReportDetail.GetFangsheReportDetailXml;
import com.example.demo.domain.Report.GetFangsheReportList.GetFangsheReportListXml;
import com.example.demo.domain.Report.GetJianyanReportDetail.GetJianyanReportDetailHead;
import com.example.demo.domain.Report.GetJianyanReportDetail.GetJianyanReportDetailXml;
import com.example.demo.domain.Report.GetJianyanReportList.GetJianyanReportListHead;
import com.example.demo.domain.Report.GetJianyanReportList.GetJianyanReportListXml;
import com.example.demo.util.ReportMode;
import com.example.demo.webService.HospitalWS;
import com.example.demo.webService.HospitalWSLocator;
import com.example.demo.webService.HospitalWSSoap;
import com.thoughtworks.xstream.XStream;

/***
 * 报告相关
 * @author 邵子城 2018/7/23
 *
 */
@Controller
@RestController
@CrossOrigin
@RequestMapping("/report")
public class ReportController {

	final static Logger logger = LoggerFactory.getLogger(ReportController.class);
	
	@Autowired
	ReportMode reportMode;
	
	/**
	 * 8.1、获取检验报告列表
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/getjianyanreportlist")
	@PostMapping
	public Entity GetJianyanReportList(@RequestBody GetJianyanReportListHead recordCardHead ){
		Entity entity=new Entity();
		String xml=reportMode.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Get_Jianyan_Report_List(xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(GetJianyanReportListXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(GetJianyanReportListXml.class.getClassLoader());
            GetJianyanReportListXml xmlTest= (GetJianyanReportListXml) xstream.fromXML(result);
            
            entity.setSuccess(true);
    		entity.setMessage(xmlTest.getBody().getResponseResult().getMessage());
    		entity.setResult(xmlTest.getBody().getReportList());
    		
    		
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage(e.getMessage());
			e.printStackTrace();
		}
		
		
		return entity;
	}
	
	/**
	 * 8.2、获取检验报告详细
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/getjianyanreportdetail")
	@PostMapping
	public Entity GetJianyanReportDetail(@RequestBody GetJianyanReportDetailHead recordCardHead ){
		Entity entity=new Entity();
		String xml=reportMode.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Get_Jianyan_Report_Detail(xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(GetJianyanReportDetailXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(GetJianyanReportDetailXml.class.getClassLoader());
            GetJianyanReportDetailXml xmlTest= (GetJianyanReportDetailXml) xstream.fromXML(result);
            
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
	 * 8.3、获取放射报告列表
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/getfangshereportlist")
	@PostMapping
	public Entity GetFangsheReportList(@RequestBody GetJianyanReportListHead recordCardHead ){
		Entity entity=new Entity();
		String xml=reportMode.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Get_Fangshe_Report_List (xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(GetFangsheReportListXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(GetFangsheReportListXml.class.getClassLoader());
            GetFangsheReportListXml xmlTest= (GetFangsheReportListXml) xstream.fromXML(result);
            
            entity.setSuccess(true);
    		entity.setMessage(xmlTest.getBody().getResponseResult().getMessage());
    		entity.setResult(xmlTest.getBody().getReportList());
    		
    		
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage(e.getMessage());
			e.printStackTrace();
		}
		
		
		return entity;
	}
	
	/**
	 * 8.4、获取放射报告详细
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/getfangshereportdetail")
	@PostMapping
	public Entity GetFangsheReportDetail(@RequestBody GetJianyanReportDetailHead recordCardHead ){
		Entity entity=new Entity();
		String xml=reportMode.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Get_Fangshe_Report_Detail (xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(GetFangsheReportDetailXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(GetFangsheReportDetailXml.class.getClassLoader());
            GetFangsheReportDetailXml xmlTest= (GetFangsheReportDetailXml) xstream.fromXML(result);
            
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
	 * 8.5、获取超声报告列表
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/getchaoshengreportlist")
	@PostMapping
	public Entity GetChaoShengReportList(@RequestBody GetJianyanReportListHead recordCardHead ){
		Entity entity=new Entity();
		String xml=reportMode.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Get_ChaoSheng_Report_List (xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(GetChaoShengReportListXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(GetChaoShengReportListXml.class.getClassLoader());
            GetChaoShengReportListXml xmlTest= (GetChaoShengReportListXml) xstream.fromXML(result);
            
            entity.setSuccess(true);
    		entity.setMessage(xmlTest.getBody().getResponseResult().getMessage());
    		entity.setResult(xmlTest.getBody().getReportList());
    		
    		
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage(e.getMessage());
			e.printStackTrace();
		}
		
		
		return entity;
	}
	
	/**
	 * 8.6、获取超声报告详细 
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/getchaoshengreportdetail")
	@PostMapping
	public Entity GetChaoshengReportDetail(@RequestBody GetJianyanReportDetailHead recordCardHead ){
		Entity entity=new Entity();
		String xml=reportMode.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Get_Chaosheng_Report_Detail (xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(GetChaoshengReportDetailXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(GetChaoshengReportDetailXml.class.getClassLoader());
            GetChaoshengReportDetailXml xmlTest= (GetChaoshengReportDetailXml) xstream.fromXML(result);
            
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
	 * 8.7、获取病理报告列表
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/getbinglireportlist")
	@PostMapping
	public Entity GetBingliReportList(@RequestBody GetJianyanReportListHead recordCardHead ){
		Entity entity=new Entity();
		String xml=reportMode.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Get_Bingli_Report_List (xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(GetBingliReportListXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(GetBingliReportListXml.class.getClassLoader());
            GetBingliReportListXml xmlTest= (GetBingliReportListXml) xstream.fromXML(result);
            
            entity.setSuccess(true);
    		entity.setMessage(xmlTest.getBody().getResponseResult().getMessage());
    		entity.setResult(xmlTest.getBody().getReportList());
    		
    		
		} catch (Exception e) {
			entity.setSuccess(false);
			entity.setMessage(e.getMessage());
			e.printStackTrace();
		}
		
		
		return entity;
	}
	
	/**
	 * 8.8、获取病理报告详细
	 * @param recordCardHead
	 * @return
	 */
	@RequestMapping("/getbinglireportdetail")
	@PostMapping
	public Entity GetBingliReportDetail(@RequestBody GetJianyanReportDetailHead recordCardHead ){
		Entity entity=new Entity();
		String xml=reportMode.sendStr(recordCardHead);
		try {
			
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Get_Bingli_Report_Detail (xml);
			
			XStream xstream = new XStream();
	        xstream.processAnnotations(GetBingliReportDetailXml.class);
            xstream.autodetectAnnotations(true);
            xstream.setClassLoader(GetBingliReportDetailXml.class.getClassLoader());
            GetBingliReportDetailXml xmlTest= (GetBingliReportDetailXml) xstream.fromXML(result);
            
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
