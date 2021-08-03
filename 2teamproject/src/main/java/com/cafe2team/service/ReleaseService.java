package com.cafe2team.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe2team.dao.ReleaseMapper;
import com.cafe2team.domain.CarManagement;
import com.cafe2team.domain.Delivery;
import com.cafe2team.domain.Invoice;
import com.cafe2team.domain.Release;
import com.cafe2team.domain.ReleaseInfo;

@Service
@Transactional
public class ReleaseService {
	

	
	@Autowired
	private ReleaseMapper releaseMapper;
	
	public List<Release> getReleaseOrder(Map<String, Object> releaseParam){
		List<Release> release = releaseMapper.getReleaseOrder(releaseParam);
		return release;
	}
	
	public List<Delivery> getDeliveryInfo(){
		List<Delivery> delivery = releaseMapper.getDeliveryInfo();
		return delivery;
	}
	
	public List<Release> getOrderInfo(String releaseOrderCode){
		return releaseMapper.getOrderInfo(releaseOrderCode);
	}
	
	public int addDriveManagement(CarManagement carManagement) {
		return releaseMapper.addDriveManagement(carManagement);
	}
	
	 public List<CarManagement> getDriveManagement(String driveManageCode){ 
		 return releaseMapper.getDriveManagement(driveManageCode); 
	 }
	
	public int modifyDriveManagement(CarManagement carManagement) {
		return releaseMapper.modifyDriveManagement(carManagement);
	}

	public int modifyDriveManagementNotRelease(CarManagement carManagement) {
		return releaseMapper.modifyDriveManagementNotRelease(carManagement);
	}
	
	public List<CarManagement> addInvoiceInfo(String driveManageCode){
		return releaseMapper.addInvoiceInfo(driveManageCode);
	}
	
	public int addInvoice(Invoice invoice) {
		return releaseMapper.addInvoice(invoice);
	}
	
	public List<Invoice> getInvoiceInfo(String invoiceCode){
		return releaseMapper.getInvoiceInfo(invoiceCode);
	}
	
	public int modifyInvoiceInfo(Invoice invoice) {
		return releaseMapper.modifyInvoiceInfo(invoice);
	}
	
	public List<Release> addReleaseInfo(String releaseOrderCode){
		return releaseMapper.addReleaseInfo(releaseOrderCode);
	}
	
	public int addRelease(ReleaseInfo releaseInfo) {
		return releaseMapper.addRelease(releaseInfo);
	}
	public int releaseStock(ReleaseInfo releaseInfo) {
		return releaseMapper.releaseStock(releaseInfo);
	}
	
	public List<ReleaseInfo> getReleaseList(Map<String, Object> listParam){
		List<ReleaseInfo> releaseInfo = releaseMapper.getReleaseList(listParam);
		return releaseInfo;
	}
	
	//운송장 조회
	public List<Invoice> wayBillSearch(Map<String, Object> paramMap){
		
		return releaseMapper.wayBillSearch(paramMap);
	}
	
	public List<CarManagement> carManagementList(Map<String, Object> listParam){
		List<CarManagement> carManagement = releaseMapper.carManagementList(listParam);
		return carManagement;
	}
	
	public int deleteCarmanagement(String releaseOrderCode) {
		int invoiceResult = releaseMapper.deleteInvoice(releaseOrderCode);
		int carManagementResult = releaseMapper.deleteCarmanagement(releaseOrderCode);
		return invoiceResult+carManagementResult;
	}
}
