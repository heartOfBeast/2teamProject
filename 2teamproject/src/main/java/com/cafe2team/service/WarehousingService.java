package com.cafe2team.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe2team.dao.WarehousingMapper;
import com.cafe2team.domain.Contract;
import com.cafe2team.domain.Product;
import com.cafe2team.domain.Request;
import com.cafe2team.domain.SafetyCheck;
import com.cafe2team.domain.WarehousingOrder;

@Service
public class WarehousingService {

	WarehousingMapper warehousingMapper;
	
	@Autowired
	public WarehousingService(WarehousingMapper warehousingMapper) {
		this.warehousingMapper = warehousingMapper;
	}
	
	public List<Product> getProductCode(String getProductCode) {
		
		List<Product> getProductCodeInfo = warehousingMapper.getProductCode(getProductCode);
		
		return getProductCodeInfo;
		
	}
	
	public int addRequest(Request request) {
		
		return warehousingMapper.addRequest(request);
	}
	
	public List<Contract> getContractList(){

		return warehousingMapper.getContractList();
	}
	
	public int addRequestOrder(List<String> paramList) {
		return warehousingMapper.addRequestOrder(paramList);
	}
	
	public Map<String,Object> wareHouseListDetail(Map<String,Object> paramMap){
		return warehousingMapper.wareHouseListDetail(paramMap);
	}
	
	public int cancleReuqestWareHouse(List<String> paramList) {
		
		return warehousingMapper.cancleReuqestWareHouse(paramList);
	}
	
	public List<Request> receivingRequestWaiting(Map<String, Object> warehouseCodeParam){
		
		List<Request> requestCheck = warehousingMapper.receivingRequestWaiting(warehouseCodeParam);
		
		return requestCheck;
	}
	
	
}
