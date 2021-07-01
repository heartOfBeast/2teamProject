package com.cafe2team.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe2team.sample.dao.SampleMapper;
import com.cafe2team.sample.domain.Sample;

@Service
@Transactional
public class SampleService {
	private final SampleMapper sampleMapper;
	
	public SampleService(SampleMapper sampleMapper) {
		this.sampleMapper = sampleMapper;
	}
	
	// 샘플 출고 요청 리스트
	public List<Sample> getSampleList(){
	 
	List<Sample> sampleList = sampleMapper.getSampleList();
	 
	return sampleList; 
	 
	}
	 
	// 샘플 출고 요청 내용 삭제 및 줄고 지시서 정보 등록
	
	public int releasesInsert(String release) {
		
		
		return sampleMapper.releasesInsert(release);
	}
	
	/*
	 * public int releasesRemove(String releaseD) {
	 * 
	 * int releaseD = sampleMapper.releasesRemove(releaseD);
	 * 
	 * return releaseD; }
	 */
	
	
	
}
