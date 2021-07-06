package com.cafe2team.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe2team.dao.SalesMapper;
import com.cafe2team.domain.ShoppingmallCalculate;

@Service
public class SalesService {

	private static final Logger log = LoggerFactory.getLogger(SalesService.class);

	@Autowired
	private SalesMapper salesMapper;
	
	//매출리스트
	
	public List<ShoppingmallCalculate> salesList(){
		List<ShoppingmallCalculate> salesList = salesMapper.getSalesList();

		return salesList;
		
	}
}
