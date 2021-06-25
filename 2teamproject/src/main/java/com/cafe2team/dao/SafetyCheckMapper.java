package com.cafe2team.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import com.cafe2team.domain.SafetyCheck;

@Mapper
public interface SafetyCheckMapper {
	//조회
	public List<SafetyCheck> getSafetyCheck(Map<String, Object>paramMap);
	
	//수정화면 뿌리기
	public SafetyCheck getSafetyCheckById(String facilityCode);
}
