package com.cafe2team.sample.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.sample.domain.Sample;

@Mapper
public interface SampleMapper {
	
	// 샘플 출고 요청 리스트
	public List<Sample> getSampleList();
	
}
