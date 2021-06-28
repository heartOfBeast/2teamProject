package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Stock;

@Mapper
public interface StockMapper {
	
	//재고조회
	public List<Stock> getStockList();
	
	
}
