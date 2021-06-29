package com.cafe2team.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe2team.domain.Stock;
import com.cafe2team.domain.StockCheck;
import com.cafe2team.service.StockService;

@Controller
public class StockController {

	private final StockService stockService;

	public StockController(StockService stockService) {
		this.stockService = stockService;
	}
	@GetMapping("/stockList")
	public String stockList(Model model) {
		
		List<Stock> stockList = stockService.getStockList();
		model.addAttribute("title", "재고목록조회");
		model.addAttribute("stockList", stockList);

		return "stock/stockList";
	}
	
	@GetMapping("/stockCheckList")
	public String getStockCheckList(Model model) {
		List<StockCheck> stockCheckList = stockService.getStockCheckList();
;
		model.addAttribute("title", "재고실사조회");
		model.addAttribute("stockCheckList", stockCheckList);
		System.out.println(stockCheckList);
		return "stock/stockCheckList";
	}
	
	@GetMapping("/stockCheckInsert")
	public String stockCheckInsert(Model model) {
		model.addAttribute("title", "재고실사결과등록");
		return "stock/stockCheckInsert";
	}
	
	@GetMapping("/stockCheckListDetail")
	@ResponseBody
	public List<StockCheck> stockCheckListDetail(
//										@RequestParam(value = "warehouse_code", required = false) String warehouse_code,
//										@RequestParam(value = "sector_stock_status_code", required = false, defaultValue = "") String sector_stock_status_code,
										@RequestParam Map<String, Object> param,
										Model model) {
		System.out.println();
		System.out.println(param.toString());
		System.out.println("1");
		//warehouse_code=w002, sector_stock_status_code=s001
		String warehouse_code = (String) param.get("warehouse_code");
		String sector_stock_status_code = (String) param.get("sector_stock_status_code");
		List<StockCheck> stockCheckList = stockService.getStockCheckListDetail(warehouse_code, sector_stock_status_code);
		System.out.println(stockCheckList);
		System.out.println("2");
//		model.addAttribute("stockCheckList", stockCheckList);
		
		return stockCheckList;
	}
	
	
	
}
