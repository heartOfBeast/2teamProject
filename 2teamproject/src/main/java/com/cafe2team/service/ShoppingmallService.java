package com.cafe2team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe2team.dao.MemberMapper;
import com.cafe2team.dao.ShoppingmallMapper;
import com.cafe2team.domain.Shoppingmall;

@Service
@Transactional
public class ShoppingmallService {


	
	@Autowired
	private final ShoppingmallMapper shoppingmallMapper;
	/* private MemberMapper memberMapper; */
	
	public ShoppingmallService(ShoppingmallMapper shoppingmallMapper, MemberMapper memberMapper) {
		this.shoppingmallMapper = shoppingmallMapper;
		/* this.memberMapper = memberMapper; */
	}
	
/******************************** 계약 시작 ********************************/
	// 계약 리스트 조회
	public List<Shoppingmall> getShoppingmallList(){
		
		List<Shoppingmall> shoppingmallList = shoppingmallMapper.getShoppingmallList();
		
		return shoppingmallList;
	}
	
/******************************** 계약 종료 ********************************/
}
