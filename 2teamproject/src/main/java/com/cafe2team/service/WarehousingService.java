package com.cafe2team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe2team.dao.WarehousingMapper;
import com.cafe2team.domain.Product;

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
	
}
