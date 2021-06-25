package com.cafe2team.dao;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Estimate;

@Mapper
public interface EstimateMapper {

	
	//비회원 견적신청
	public int addEstimateAnother(Estimate estimate);
}
