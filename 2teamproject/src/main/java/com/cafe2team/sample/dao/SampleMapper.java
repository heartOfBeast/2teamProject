package com.cafe2team.sample.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.sample.domain.Sample;

@Mapper
public interface SampleMapper {
	
	// 샘플 출고 요청 리스트
	public List<Sample> getSampleList();
	
	 
	// 출고 요청 배열 상태 수정
	public int sampleUpdate(List<String> pushArr);
	
	
	// 출고 지시서 등록 및 조회
	public int sampleInsert(List<String> pushArr);
	 
	
}
