package com.cafe2team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe2team.dao.ShoppingmallMapper;
import com.cafe2team.domain.Shoppingmall;

@Service
@Transactional
public class ShoppingmallService {

	
	@Autowired
	private final ShoppingmallMapper shoppingmallMapper;
	
	public ShoppingmallService(ShoppingmallMapper shoppingmallMapper) {
		this.shoppingmallMapper = shoppingmallMapper;
	}
	
	
	// 쇼핑몰 사업자 등록
	public int shoppingmallAdd(Shoppingmall shoppingmall) {
		
		int result = shoppingmallMapper.shoppingmallAdd(shoppingmall);
		
		return result;
	}
	
	
/******************************** 계약 시작 ********************************/
	// 계약 리스트 조회
	public List<Shoppingmall> shoppingmallList(){
		
		List<Shoppingmall> shoppingmallList = shoppingmallMapper.shoppingmallList();
		
		return shoppingmallList;
	}
	
	/*
	 * public Shoppingmall shoppingmallInfo(String shoppingmallId) {
	 * 
	 * Shoppingmall result = shoppingmallMapper.shoppingmallInfo(shoppingmallId);
	 * 
	 * return result; }
	 */
	
	
	
	
	
	
	
	
	
/******************************** 계약 종료 ********************************/
}
