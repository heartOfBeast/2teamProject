package com.cafe2team.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe2team.dao.UnitPriceMapper;
import com.cafe2team.domain.Price;


@Service
@Transactional
public class UnitPriceService {
	
	
	private final UnitPriceMapper unitPriceMapper;
	
	public UnitPriceService(UnitPriceMapper unitPriceMapper) {
		this.unitPriceMapper = unitPriceMapper;
	}
	
	
	// 요금안내 조회
	public List<Price> getPriceList(Map<String, Object> paramWareHouse){
		
		List<Price> priceList = unitPriceMapper.getPriceList(paramWareHouse);
		
		return priceList;
	}
	
	// 요금안내 추가
	public int priceAdd(Price price) {
		
		int result = unitPriceMapper.priceAdd(price);
		
		return result;
	}
	
	// 요금안내 수정을 위한 조회
	public Price priceInfo(String priceCode) {
		
		Price result = unitPriceMapper.priceInfo(priceCode);
		
		
		return result;
	}
	
	// 요금안내 수정
	public int priceUpdate(Price price) {
		
		int result = unitPriceMapper.priceUpdate(price);
		
		return result;
	}
	
	// 요금안내 삭제
	public int priceRemove(String price) {
		
		return unitPriceMapper.priceRemove(price);
	}
	

}
