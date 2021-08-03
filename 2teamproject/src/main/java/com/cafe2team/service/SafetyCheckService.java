
package com.cafe2team.service;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe2team.dao.SafetyCheckMapper;
import com.cafe2team.domain.SafetyCheck;
import com.cafe2team.domain.Warehouse;

@Service
@Transactional
public class SafetyCheckService {
	@Autowired
	private SafetyCheckMapper safetyCheckMapper;
	
	public List<SafetyCheck> getSafetyCheck(Map<String, Object> warehouseCodeParam){
		List<SafetyCheck> safetyCheck = safetyCheckMapper.getSafetyCheck(warehouseCodeParam);
		return safetyCheck;
	}
	
    public List<SafetyCheck> getSafetyCheckById(String facilityCode) {
  
    	return safetyCheckMapper.getSafetyCheckById(facilityCode); 
    }
	 
	
	public int addSafetyCheck(SafetyCheck safetyCheck) {
		return safetyCheckMapper.addSafetyCheck(safetyCheck);
	}
	
	public int deleteSafetyCheck(List<String> paramList) {
		return safetyCheckMapper.deleteSafetyCheckByCode(paramList);
	}
	
	public List<Warehouse> getWareHouseInfo(){
		List<Warehouse> warehouse = safetyCheckMapper.getWareHouseInfo();
		return warehouse;
	}
	
	public int modifySafeCheck(SafetyCheck safetyCheck) {
		return safetyCheckMapper.modifySafeCheck(safetyCheck);
	}
	
	public List<SafetyCheck> getFollowUp(String facilityCode){
		return safetyCheckMapper.getFollowUp(facilityCode);
	}
	
	public int modifyFollowUp(SafetyCheck safetyCheck) {
		return safetyCheckMapper.modifyFollowUp(safetyCheck);
	}
}

