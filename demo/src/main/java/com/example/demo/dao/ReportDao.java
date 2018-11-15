package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Report.GetJianyanReportDetail.ReportInspectionItemList;
import com.example.demo.domain.Report.GetJianyanReportList.ReportList;

@Component
public interface ReportDao {

	/**
	 * 更新检验报告列表数据
	 * @param reportList
	 */
	void addJianyanReportList(@Param(value = "report") ReportList reportList);

	/**
	 * 删除旧的检验报告列表数据
	 * @param patientId
	 */
	void deleteOldReportList(@Param(value = "patientId") String patientId);

	/**
	 * 获取检验报告列表o
	 * @param 
	 * @return
	 */
	List<ReportList> GetJianyanReport(@Param(value = "dataSource")  String dataSource,@Param(value = "openUserID")  String openUserID);

	/**
	 * 删除旧的检验报告详细数据
	 * @param patientId
	 */
	void deleteOldDetail(@Param(value = "reportNo") String reportNo);

	/**
	 * 更新检验报告详细数据
	 * @param patientId
	 */
	void addDetail( @Param(value = "reportDetail") ReportInspectionItemList reportInspectionItemList);

	/**
	 * 获取当前患者的总报告数
	 * @param openUserID
	 * @return
	 */
	int getjianyanReportSumCount(@Param(value = "openUserID")  String openUserID);

}
