package com.cafe2team.sample.service;

import java.util.ArrayList;
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

	// 출고 요청 배열받기
	public int samplePush(List<String> pushArr) {
		
		
		return sampleMapper.samplePush(pushArr);
	}
	 
	
	// 샘플 출고 요청 내용 삭제 및 줄고 지시서 정보 등록
	/*
	 * public int releasesInsert(Sample sample) {
	 * 
	 * 
	 * return sampleMapper.releasesInsert(sample); }
	 */

	/*
	 * public boolean smaplePush(String releasesCode) {
	 * 
	 * boolean smapePush = false;
	 * 
	 * Sample sampleInfo = sampleMapper.releaseInfo(releasesCode);
	 * 
	 * System.out.println(sampleInfo);
	 * 
	 * if(sampleInfo != null) { if(sampleInfo.getReleasesStatus().equals("요청대기")) {
	 * sampleMapper.releaseUpdate(sampleInfo.getReleasesCode()); }else
	 * if(sampleInfo.getReleasesStatus().equals("요청")) {
	 * sampleMapper.releasesInsert(sampleInfo.getReleasesCode()); }
	 * 
	 * smapePush = true; }
	 * 
	 * return smapePush; }
	 */
	
	
	
}
