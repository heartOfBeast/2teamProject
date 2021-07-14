package com.cafe2team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cafe2team.dao.StockCheckMapper;
import com.cafe2team.dao.StockMapper;
import com.cafe2team.domain.Stock;
import com.cafe2team.domain.StockCheck;

@Service
public class StockService {
	
	@Autowired
	private StockMapper stockMapper;
	

	@Autowired
	private StockCheckMapper stockCheckMapper;
	
		
	//재고 실사조회
	public List<StockCheck> getStockCheckList(){
		
		List<StockCheck> stockCheckList = stockCheckMapper.getStockCheckList();
		
		return stockCheckList;
	}

	//창고별섹터별 실사조회
	public List<StockCheck> getStockCheckListDetail(String warehouse_code, String sector_stock_status_code) {
		List<StockCheck> stockCheckListDetail = stockCheckMapper.getStockCheckListDetail(warehouse_code, sector_stock_status_code);
		return stockCheckListDetail;
	}
	
	
	//대분류 가져요기
	public List<Stock> getStockBigCategoryInfo(){
		List<Stock> stock = stockMapper.getStockBigCategoryInfo();
		return stock;
	}
	//중분류 가져요기
	public List<Stock> getStockMiddleCategoryInfo(String bCate) {
		List<Stock> getStockMiddleCategoryInfo = stockMapper.getStockMiddleCategoryInfo(bCate);
		return getStockMiddleCategoryInfo;
	}
	
	//소분류 가져요기
	public List<Stock> getStockSmallCategoryInfo(String bCate, String mCate) {
		List<Stock> getStockSmallCategoryInfo = stockMapper.getStockSmallCategoryInfo(bCate, mCate);
		return getStockSmallCategoryInfo;
	}
	
	//모든분류 가져요기
	public List<Stock> getStockCategoryInfo(String bCate, String mCate, String sCate) {
		List<Stock> getStockCategoryInfo = stockMapper.getStockCategoryInfo(bCate, mCate, sCate);
		return getStockCategoryInfo;
	}
	

	//재고 상세 모달
	public List<Stock> getStockListDetailModal(){
		List<Stock> stockList = stockMapper.getStockListDetailModal();
		return stockList;
	}	
			
	//재고 조회
	public List<Stock> getStockList(){
		List<Stock> stockList = stockMapper.getStockList();
		return stockList;
	}
	//재고실사 업데이트
	public int stockCheckUpdate(StockCheck stockCheck) {
		return stockCheckMapper.stockCheckUpdate(stockCheck);
		
	}

	
}