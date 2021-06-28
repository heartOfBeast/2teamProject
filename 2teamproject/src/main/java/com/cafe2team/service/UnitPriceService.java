package com.cafe2team.service;

import java.util.List;

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
	public List<Price> getPriceList(){
		
		
		List<Price> priceList = unitPriceMapper.getPriceList();
		
		
		return priceList;
	}
	
	// 요금안내 추가
	public int priceAdd(Price price) {
		
		int result = unitPriceMapper.priceAdd(price);
		
		return result;
	}
	
	// 요금안내 수정을 위한 조회
	public Price priceInfo(String price_Code) {
		
		Price result = unitPriceMapper.priceInfo(price_Code);
		
		return result;
	}
	
	// 요금안내 수정
	public int priceUpdate(Price price) {
		
		int result = unitPriceMapper.priceUpdate(price);
		
		return result;
	}
	
	// 요금안내 삭제
	public int priceRemove(Price price) {
		
		int result = unitPriceMapper.priceRemove(price);
		
		return result;
	}
	

}
