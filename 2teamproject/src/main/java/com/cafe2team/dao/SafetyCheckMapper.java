package com.cafe2team.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import com.cafe2team.domain.SafetyCheck;
import com.cafe2team.domain.Warehouse;

@Mapper
public interface SafetyCheckMapper {
	//조회
	public List<SafetyCheck> getSafetyCheck();
	
	//수정화면 뿌리기
	public List<SafetyCheck> getSafetyCheckById(String facilityCode);
	
	//안전점검 등록
	public int addSafetyCheck(SafetyCheck safetyCheck);
	
	//삭제
	public int deleteSafetyCheckByCode(List<String> paramList);
	
	//등록화면 창고정보조회
	public List<Warehouse> getWareHouseInfo();
	
	//수정 실행
	public int modifySafeCheck(SafetyCheck safetyCheck);

} 