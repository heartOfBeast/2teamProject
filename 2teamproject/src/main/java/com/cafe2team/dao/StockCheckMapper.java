package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.StockCheck;

@Mapper
public interface StockCheckMapper {

	//재고실사 목록 조회
	public List<StockCheck> getStockCheckList();
	
	//재고실사 창고별 구역별 셀렉트 조회
	public List<StockCheck> getStockCheckListDetail(String warehouse_code, String sector_stock_status_code);

	//재고실사 수정
	public int stockCheckUpdate(StockCheck stockCheck);

	//재고실사 등록용 조회
	public List<StockCheck> getStockInfo();

	//재고실사등록을 위해 재고코드를 입력시 최종위치, 현재 재고수량 자동생성 
	public List<StockCheck> getSectorFinalCode(String stockCode);

}
