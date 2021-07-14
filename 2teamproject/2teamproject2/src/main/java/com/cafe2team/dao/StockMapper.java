package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Stock;

@Mapper
public interface StockMapper {
	
	//재고 상세 모달
	public List<Stock> getStockListDetailModal();
	//재고조회
	public List<Stock> getStockList();
	//재고조회 ajax	
	public List<Stock> getStockBigCategoryInfo();
	public List<Stock> getStockMiddleCategoryInfo(String bCate);
	public List<Stock> getStockSmallCategoryInfo(String bCate, String mCate);
	public List<Stock> getStockCategoryInfo(String bCate, String mCate, String sCate);
}
