package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Stock;

@Mapper
public interface StockMapper {
	
	//재고 상세 모달
	public List<Stock> getStockListDetailModal();
	//재고조회
	public List<Stock> getStockList(String product_code, String receivinging_code);
	//재고조회 ajax
	public List<Stock> getStockListDetail(String shoppingmall_name, String warehouse_name);
}
