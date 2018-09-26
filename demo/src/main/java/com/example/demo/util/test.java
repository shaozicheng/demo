package com.example.demo.util;


import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.MedicalCard.RegistMedicalCard.RegistMedicalCardXml;
import com.example.demo.webService.HospitalWS;
import com.example.demo.webService.HospitalWSLocator;
import com.example.demo.webService.HospitalWSSoap;
import com.thoughtworks.xstream.XStream;

@RequestMapping("/test")
public class test {

	public static void main(String[] args) {
//		String serviceUrl="http://dpwsagent07.linkingcloud.cn:9001/linkingif.asmx";
//		String methodName="IF_Get_Hospital_MedicalCard_List";
		String AccessToken="800EBED9-63E5-4408-A184-BE693DA32CB6";
		String OpenUserID="1";
		String OpenUserName="张三";
		String OpenIDCard="330482199212251230";
		String OpenTel="13906538888";
		String Tel="13906538888";
		String CertType="0";
		String HomeAddress="330482199212251230";
		String IDCard="13906538888";
		String PatientName="0";
		String CardNo="12321321321321321";
		String CardType="0";
		String CardProperty="0";
		String VerCode="1234";
		String xml= sendStr( AccessToken, OpenUserID, OpenUserName, OpenIDCard,
				 OpenTel, Tel, CertType, HomeAddress, IDCard,
				 PatientName, CardNo, CardType, CardProperty, VerCode);
		try {
			HospitalWS hl = new HospitalWSLocator();
			HospitalWSSoap hs=hl.getHospitalWSSoap();
			String result =hs.IF_Get_Hospital_MedicalCard_List(xml);
			Object xmlObject = null;
			 XStream xstream = new XStream();
	            xstream.processAnnotations(RegistMedicalCardXml.class);
	            xstream.autodetectAnnotations(true);
	            xstream.setClassLoader(RegistMedicalCardXml.class.getClassLoader());
	            xmlObject= xstream.fromXML(result);
			
			System.out.println(xmlObject);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 
	 * @param AccessToken 
	 * @param OpenUserID 
	 * @param OpenUserName 
	 * @param OpenIDCard 
	 * @param OpenTel 
	 * @param Tel 
	 * @param CertType 
	 * @param HomeAddress 
	 * @param IDCard 
	 * @param PatientName
	 * @param CardNo 
	 * @param CardType 
	 * @param CardProperty 
	 * @param VerCode 
	 * @return
	 */
	public static String sendStr(
			String AccessToken,String OpenUserID,String OpenUserName,String OpenIDCard,
			String OpenTel,String Tel,String CertType,String HomeAddress,String IDCard,
			String PatientName,String CardNo,String CardType,String CardProperty,String VerCode) {
		StringBuffer intput = new StringBuffer();
		intput.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?><xml><head><AccessToken>");
		intput.append(AccessToken);
		intput.append("</AccessToken><OpenUserID>");
		intput.append(OpenUserID);
		intput.append("</OpenUserID><OpenUserName>");
		intput.append(OpenUserName);
		intput.append("</OpenUserName><OpenIDCard>");
		intput.append(OpenIDCard);
		intput.append("</OpenIDCard><OpenTel>");
		intput.append(OpenTel);
		intput.append("</OpenTel><Tel>");
		intput.append(Tel);
		intput.append("</Tel><CertType>");
		intput.append(CertType);
		intput.append("</CertType><HomeAddress>");
		intput.append(HomeAddress);
		intput.append("</HomeAddress><IDCard>");
		intput.append(IDCard);
		intput.append("</IDCard><PatientName>");
		intput.append(PatientName);
		intput.append("</PatientName><CardNo>");
		intput.append(CardNo);
		intput.append("</CardNo><CardType>");
		intput.append(CardType);
		intput.append("</CardType><CardProperty>");
		intput.append(CardProperty);
		intput.append("</CardProperty><VerCode>");
		intput.append(VerCode);
		intput.append("</VerCode></head><body></body><sign></sign></xml>");
		return intput.toString();
	       
	}

}
