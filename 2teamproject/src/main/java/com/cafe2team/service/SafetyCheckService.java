package com.cafe2team.service;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe2team.dao.SafetyCheckMapper;
import com.cafe2team.domain.SafetyCheck;

@Service
public class SafetyCheckService {
	@Autowired
	private SafetyCheckMapper safetyCheckMapper;
	
	private static final Logger log = LoggerFactory.getLogger(SafetyCheckService.class);

	@PostConstruct
	public void safetyCheckServiceInit() {
		log.info("=============================");
		log.info("SafetyCheckService 객체 생성");
		log.info("=============================");
	}
	
	public List<SafetyCheck> getSafetyCheck(Map<String, Object>paramMap){
		List<SafetyCheck> safetyCheck = safetyCheckMapper.getSafetyCheck(paramMap);
		return safetyCheck;
	}
	
	public SafetyCheck getSafetyCheckById(String facilityCode) {
		
		return safetyCheckMapper.getSafetyCheckById(facilityCode);
	}
}

