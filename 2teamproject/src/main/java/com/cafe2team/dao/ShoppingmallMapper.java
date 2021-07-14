package com.cafe2team.dao;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Shoppingmall;


@Mapper
public interface ShoppingmallMapper {
	
	
	// 쇼핑몰 회원조회
	public List<Shoppingmall> shoppingmallList();
	
	// 쇼핑몰 사업자 등록
	public int shoppingmallAdd(Shoppingmall shoppingmall);
	
	// 쇼핑몰 사업자 권한 승인을 위한 조회 
	public Shoppingmall shoppingmallInfo(String shoppingmallId);
	 
	// 쇼핑몰 사업자 권한 승인
	public int shoppingmallApproval(Shoppingmall shoppingmall);
	
	// 쇼핑몰 사업자 권한 보류
	public int shoppingmallCancel(Shoppingmall shoppingmall);
}
