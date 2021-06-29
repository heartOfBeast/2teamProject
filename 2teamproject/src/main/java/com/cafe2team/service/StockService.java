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
		
		//재고 조회
		public List<Stock> getStockList(){
			List<Stock> stockList = stockMapper.getStockList();
			return stockList;
		}
	
}
