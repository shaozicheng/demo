package com.example.demo.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.BookingDao;
import com.example.demo.domain.Booking.DocModel;
import com.example.demo.domain.Booking.BookingDeptNoSource.BookingDeptNoSourceBody;
import com.example.demo.domain.Booking.BookingDeptNoSource.DeptResourceDocNoSourceList;
import com.example.demo.domain.Booking.BookingDocResource.BookingDocResourceBody;
import com.example.demo.domain.Booking.BookingDocResource.DocResourceResourceList;
import com.example.demo.domain.Booking.BookingResource.BookingResourceBody;
import com.example.demo.domain.Booking.BookingResource.DeptLevel1List;
import com.example.demo.domain.Booking.BookingResource.DeptLevel2List;
import com.example.demo.domain.Booking.BookingResource.DeptResourceDocList;
import com.example.demo.domain.Booking.BookingResource.HospitalList;
import com.example.demo.domain.Booking.ConfirmBooking.BookPatientModel;
import com.example.demo.domain.MedicalCard.GetHospitalMedicalCardList.UserModel;

@Component
public class BookingService {

	@Autowired
	BookingDao bookingDao;
	
	/**
	 * 对现有医生数据进行新增 更新和逻辑删除
	 * 
	 */
	public void changeDocData(List<DocModel> docModelList,String hostp){
		
		List<String> oldDocModelList=new ArrayList<>();//从数据看获取已有的医生的医生编号
		oldDocModelList = bookingDao.getOldDoc(hostp);
		
		List<DocModel> newDocModelList = new ArrayList<>();//新增的医生
		List<DocModel> SameDocModelList = new ArrayList<>();//已存在的医生
		
		int num1= 0 ;
		
		for (DocModel docModel : docModelList) {
			
			num1 = 0;

			for (String docCode : oldDocModelList) {
				
				if(docModel.getDocCode().equals(docCode)){
					num1 = 1;
					SameDocModelList.add(docModel);
					break;
				}
			}
			
			if(num1 == 0){
				newDocModelList.add(docModel);
			}else{
				oldDocModelList.remove(docModel.getDocCode());
			}
			
		}
		
		if(newDocModelList != null){
			for (DocModel docModel : newDocModelList) {
				bookingDao.addNewDoc(docModel);
			}
			
		}
		
		if(SameDocModelList != null){
			for (DocModel docModel : SameDocModelList) {
				bookingDao.updateDoc(docModel);

			}
					
		}
		
		if(oldDocModelList != null){
			for (String docCode : oldDocModelList) {
				bookingDao.changeStatus(docCode);

			}
			
			
		}
		
	}
	
	/**
	 * 将原始数据整理成我们需要的格式
	 * @param body
	 * @return
	 */
	public List<DocModel> getDocData(BookingResourceBody body){
		
		List<DocModel> docModelList=new LinkedList<>();//医生整理后资料数组
		
		List<DeptResourceDocList> deptResourceDocList=body.getDeptResourceDocList();//医生资源列表
		
		List<DeptLevel2List> deptLevel2List=body.getDeptLevel2List();//二级科室
		
		List<DeptLevel1List> deptLevel1List=body.getDeptLevel1List();//一级科室列表
		
		List<HospitalList> hospitalList=body.getHospitalList();//院区列表
		
		for (DeptResourceDocList doc : deptResourceDocList) {
			
			DocModel docModel= new DocModel();
			
			for(DeptLevel2List level2 : deptLevel2List){
				
				if(doc.getDeptCode().equals(level2.getDeptCode())){
					
					for(DeptLevel1List level1 : deptLevel1List){
						
						if(level2.getParentDeptCode().equals(level1.getDeptCode())){
							
							for(HospitalList host : hospitalList){
								
								if(level1.getHospitalID().equals(host.getHospitalID())){
									
									docModel.setHospitalID(host.getHospitalID());
									docModel.setHospitalName(host.getHospitalName());
									docModel.setHospitalDesc(host.getHospitalDesc());
									break;
									
								}
								
							}
							
							docModel.setDeptCode1(level1.getDeptCode());
							docModel.setDeptDesc1(level1.getDeptDesc());
							docModel.setDeptName1(level1.getDeptName());
							docModel.setDeptPhotoPath1(level1.getDeptPhotoPath());
							docModel.setJsonMemo1(level1.getJsonMemo());
							break;
							
						}
					}
					
					docModel.setDeptCode2(level2.getDeptCode());
					docModel.setDeptDesc2(level2.getDeptDesc());
					docModel.setDeptName2(level2.getDeptName());
					docModel.setDeptPhotoPath2(level2.getDeptPhotoPath());
					docModel.setJsonMemo2(level2.getJsonMemo());
					break;
					
				}
			}
			
			docModel.setDocCode(doc.getDocCode());
			docModel.setDocDesc(doc.getDocDesc());
			docModel.setDocDuty(doc.getDocDuty());
			docModel.setDocName(doc.getDocName());
			docModel.setDocPhotoPath(doc.getDocPhotoPath());
			docModel.setJsonMemo(doc.getJsonMemo());
		
			docModelList.add(docModel);
		}
		return docModelList;
	}
	
	/**
	 * 22.1、获取预约资源
	 * @param BookingResourceBody
	 * @return
	 */
	public void GetBookingResource(BookingResourceBody body,String hostp) {

		List<DocModel> docModelList=getDocData(body);//获得整理后的医生数组
		changeDocData(docModelList,hostp);//对现有医生数据进行新增 更新和逻辑删除
		
	}

	/**
	 * 22.2、更新预约科室资源
	 * @param recordCardHead
	 * @return
	 */
	@Transactional
	public List<DeptResourceDocNoSourceList> GetBookingDeptNoSource(BookingDeptNoSourceBody body,String deptCode,String day) {
		
		List<DeptResourceDocNoSourceList> dept = new ArrayList<DeptResourceDocNoSourceList>();
		
		bookingDao.deleteDept(deptCode);
		
		for (DeptResourceDocNoSourceList deptResource : body.getDeptResourceDocNoSourceList()) {
			
			deptResource.setDeptCode(deptCode);
			bookingDao.addDept(deptResource);
			
		}
		
		dept=bookingDao.getDept(day,deptCode);
		
		return dept;
	}

	/**
	 * 更新医生预约号源
	 * @param day 要查找的日期
	 * @param body 要更新的医生信息
	 * @param docCode 要更新的医生编号
	 */
	public List<DocResourceResourceList> getBookingDocResource(String day, BookingDocResourceBody body, String docCode) {

		List<DocResourceResourceList> doc = new ArrayList<>();
		
		bookingDao.deleteDoc(docCode);
		
		for (DocResourceResourceList docResource : body.getDocResourceResourceList()) {
			docResource.setDocCode(docCode);
			bookingDao.addDoc(docResource);
		}
		
		doc = bookingDao.getDoc(day,docCode);
		
		return doc;
	}

	/**
	 * 保存预约相关信息
	 * @param bookPatientModel
	 */
	public void confirmBooking(BookPatientModel bookPatientModel) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date();
		String loginTime=df.format(date);
		bookPatientModel.setCreateTime(loginTime);
		bookingDao.confirmBooking(bookPatientModel);
		
	}

	/**
	 * 获取患者预约记录
	 * @param patientID
	 * @return
	 */
	public List<BookPatientModel> getPatientData(String patientID) {
		
		List<BookPatientModel> books = bookingDao.getPatientData(patientID);
		
		return books;
	}

	/**
	 * 更新预约状态
	 * @param status
	 * @param bookingID
	 */
	public void updatePatient(String status, String bookingID) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date();
		String updateTime=df.format(date);
		bookingDao.updatePatient(status,bookingID,updateTime);
		
	}

	/**
	 * 获取科室
	 * @param hospitalID
	 * @return
	 */
	public List<DocModel> getDept(DocModel model) {
		return bookingDao.getDeptList(model);
	}

	/**
	 * 获取用户预约列表
	 * @param userModel
	 * @return
	 */
	public List<UserModel> getPatientList(UserModel userModel) {

		List<UserModel> list = bookingDao.getPatientList(userModel);
		for (UserModel model : list) {
			String a = model.getIdCard().replaceAll("(\\d{4})\\d{10}(\\w{4})","$1*****$2");
			String b =model.getTel().replaceAll("(\\d{3})\\d{4}(\\d{4})","$1****$2");
			model.setIdCard(a);
			model.setTel(b);
		}
		return list;
	}

	
	
	
	
	
	
	
	
}
