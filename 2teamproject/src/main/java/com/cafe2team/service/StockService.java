package com.cafe2team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cafe2team.dao.StockCheckMapper;
import com.cafe2team.domain.StockCheck;

@Service
public class StockService {
	@Autowired
	private final StockCheckMapper stockCheckMapper;
	
	public StockService(StockCheckMapper stockCheckMapper) {
		this.stockCheckMapper = stockCheckMapper;
	}
	
	//재고 실사조회
	public List<StockCheck> getStockCheckList(){
		
		List<StockCheck> stockCheckList = stockCheckMapper.getStockCheckList();
		
		return stockCheckList;
		
		
	}
}
