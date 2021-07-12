package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Member;
import com.cafe2team.domain.Product;
import com.cafe2team.domain.Request;

@Mapper
public interface WarehousingMapper {
	
	//코드 가져오기
	public List<Product> getProductCode(String productCode);
	
	public int addRequest(Request request);
	
}
