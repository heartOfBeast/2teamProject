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
	 
	
}
