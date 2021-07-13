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
	
	
	// 쇼핑몰 회원조회
	public List<Shoppingmall> shoppingmallList(){
		
		List<Shoppingmall> shoppingmallList = shoppingmallMapper.shoppingmallList();
		
		return shoppingmallList;
	}
	
	// 쇼핑몰 사업자 권한 승인을 위한 조회 
	public Shoppingmall shoppingmallInfo(String shoppingmallId) {
	  
	  Shoppingmall result = shoppingmallMapper.shoppingmallInfo(shoppingmallId);
	  
	  return result;
	  
	}
	 
	
	// 쇼핑몰 사업자 권한 승인
	public int shoppingmallApproval(Shoppingmall shoppingmall) {
		
		int result = shoppingmallMapper.shoppingmallApproval(shoppingmall);
		
		return result;
	}
	
	public int shoppingmallCancel(Shoppingmall shoppingmall) {
		
		int result = shoppingmallMapper.shoppingmallCancel(shoppingmall);
		
		return result;
				
	}
	
	
	
	
}
