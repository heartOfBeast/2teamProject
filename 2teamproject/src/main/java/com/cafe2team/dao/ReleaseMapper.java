package com.cafe2team.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.CarManagement;
import com.cafe2team.domain.Delivery;
import com.cafe2team.domain.Invoice;
import com.cafe2team.domain.Release;
import com.cafe2team.domain.ReleaseInfo;
import com.cafe2team.domain.Stock;

@Mapper
public interface ReleaseMapper {
	//출고지시서 조회
	public List<Release> gerReleaseOrder();
	
	//배송기사 조회
	public List<Delivery> getDeliveryInfo();
	
	//배차등록
	public int addDriveManagement(CarManagement carManagement);
	
	//배차조회
	/* public List<CarManagement> getDriveManagement(); */
	
	//배차수정
	public int modifyDriveManagement(CarManagement carManagement);
	
	//운송장등록
	public int addInvoice(Invoice invoice);
	
	//운송장 수정
	public int modifyInvoiceInfo(Invoice invoice);
	
	//출고요청승인
	public int addRelease(ReleaseInfo releaseInfo);
	public int releaseStock(ReleaseInfo releaseInfo);
	
	//출고리스트조회
	public List<ReleaseInfo> getReleaseList();
}
