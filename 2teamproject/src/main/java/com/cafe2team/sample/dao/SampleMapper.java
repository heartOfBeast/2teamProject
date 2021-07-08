package com.cafe2team.sample.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.sample.domain.Sample;

@Mapper
public interface SampleMapper {
	
	// 샘플 출고 요청 리스트
	public List<Sample> getSampleList();
	
	// 샘플 출고 요청시 조회
	public Sample releaseInfo(String releasesStatus);
	
	// 샘플 출고지시서 수정
	public int releaseUpdate(String releaseCode);
	
	// 샘플 출고지시서 등록
	public int releasesInsert(String releaseCode);

	// 출고 요청 배열받기
	public int samplePush(List<String> pushArr);
	
	
}
