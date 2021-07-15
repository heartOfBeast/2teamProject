package com.cafe2team.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe2team.dao.ReleaseMapper;
import com.cafe2team.domain.CarManagement;
import com.cafe2team.domain.Delivery;
import com.cafe2team.domain.Invoice;
import com.cafe2team.domain.Release;
import com.cafe2team.domain.ReleaseInfo;
import com.cafe2team.domain.Stock;

@Service
@Transactional
public class ReleaseService {
	
	private static final Logger log = LoggerFactory.getLogger(ReleaseService.class);

	
	@Autowired
	private ReleaseMapper releaseMapper;
	
	public List<Release> gerReleaseOrder(){
		List<Release> release = releaseMapper.gerReleaseOrder();
		return release;
	}
	
	public List<Delivery> getDeliveryInfo(){
		List<Delivery> delivery = releaseMapper.getDeliveryInfo();
		return delivery;
	}
	
	public int addDriveManagement(CarManagement carManagement) {
		return releaseMapper.addDriveManagement(carManagement);
	}
	
	/*
	 * public List<CarManagement> getDriveManagement(){ List<CarManagement>
	 * carManagement = releaseMapper.getDriveManagement(); return carManagement; }
	 */
	
	public int modifyDriveManagement(CarManagement carManagement) {
		return releaseMapper.modifyDriveManagement(carManagement);
	}
	
	public int addInvoice(Invoice invoice) {
		return releaseMapper.addInvoice(invoice);
	}
	
	public int modifyInvoiceInfo(Invoice invoice) {
		return releaseMapper.modifyInvoiceInfo(invoice);
	}
	
	public int addRelease(ReleaseInfo releaseInfo) {
		return releaseMapper.addRelease(releaseInfo);
	}
	public int releaseStock(ReleaseInfo releaseInfo) {
		return releaseMapper.releaseStock(releaseInfo);
	}
	
	public List<ReleaseInfo> getReleaseList(){
		List<ReleaseInfo> releaseInfo = releaseMapper.getReleaseList();
		return releaseInfo;
	}
}
