package com.cafe2team.sample.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Release;
import com.cafe2team.sample.domain.Sample;

@Mapper
public interface SampleMapper {
	
	// 샘플 출고 요청 리스트
	public List<Sample> getSampleList();
	
	// 샘플 출고지시서 등록
	public int releasesInsert(String release);
	
	// 샘플 출고 요청 기본 데이터 삭제
	public int releasesRemove(String releaseD);
	
}
