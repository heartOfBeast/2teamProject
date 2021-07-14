package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Estimate;

@Mapper
public interface EstimateMapper {

	//견적신청 검토 - 견적신청 등록된 리스트 조회
	public List<Estimate> getEstimatePermit();
	
	//견적신청 검토 - 견적신청 등록된 리스트 조회
	public List<Estimate> getEstimateAnotherPermit();
	
	//비회원 견적신청
	public int addEstimateAnother(Estimate estimate);
	
	//기존 쇼핑몰회원 견적신청
	public int addEstimate(Estimate estimate);
	
	public List<Estimate> getEstimateLookList();
	
	public List<Estimate> getEstimateAnotherLookList();
	
	public Estimate getEstimateAnotherInfoCheck(String companyPhone, String companyEmail);
	
	public Estimate getEstimateInfoCheck(String companyPhone, String companyEmail);
}
