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
	//기존회원 정보 조회 후 리스트
	public List<Estimate> getEstimateLookList();
	//비회원 정보 조회 후 리스트
	public List<Estimate> getEstimateAnotherLookList();
	//비회원 정보조회
	public List<Estimate> getEstimateAnotherInfoCheck(String companyPhone, String companyEmail);
	//기존회원 정보조회
	public List<Estimate> getEstimateInfoCheck(String companyPhone, String companyEmail);
}
