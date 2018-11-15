package com.example.demo.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.ReportDao;
import com.example.demo.domain.Report.GetJianyanReportDetail.ReportInspectionItemList;
import com.example.demo.domain.Report.GetJianyanReportList.ReportList;


@Component
public class ReportService {
	
	@Autowired
	ReportDao reportDao;

	//处理报告列表格式
		public List<ReportList> dealList(List<ReportList> list,String patientId){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date=new Date();
			String createTime=sdf.format(date);
			for (ReportList report : list) {
				String[] reportNo = report.getReportNo().split("\\|");
				report.setCreateTime(createTime);
				report.setCreateUser("sys");
				report.setPatientName(reportNo[2]);
				report.setReportType(reportNo[5]);
				report.setOpenUserId(patientId);
			}
			return list;
		}
	
	/**
	 * 处理从医院获取的检验报告
	 * @param openid
	 * @return
	 */
	@Transactional
	public boolean GetJianyanReportList(List<ReportList> reportList,String patientId) {
		try {
			List<ReportList> reportlists = dealList(reportList,patientId);
			reportDao.deleteOldReportList(patientId);
			for (ReportList reportList2 : reportlists) {
				reportDao.addJianyanReportList(reportList2);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	
	}

	/**
	 * 获取检验报告列表
	 * @param 
	 * @return
	 */
	public List<ReportList> GetJianyanReport(String dataSource, String openUserID) {
		return reportDao.GetJianyanReport(dataSource,openUserID);
		 
	}
	
	/**
	 * 8.2、更新检验报告详细
	 * @param recordCardHead
	 * @return
	 */
	public void GetJianyanReportDetail(List<ReportInspectionItemList> reportInspectionItemList,String reportNo) {
		reportDao.deleteOldDetail(reportNo);
		for (ReportInspectionItemList reportlist : reportInspectionItemList) {
			reportlist.setReportNo(reportNo);
			reportDao.addDetail(reportlist);
		}
		
	}

	/**
	 * 获取当前患者的总报告数
	 * @param openUserID
	 * @return
	 */
	public int getjianyanReportSumCount(String openUserID) {
		
		return reportDao.getjianyanReportSumCount(openUserID);
	}
	

}
