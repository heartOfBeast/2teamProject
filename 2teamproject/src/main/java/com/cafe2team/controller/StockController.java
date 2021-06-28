package com.cafe2team.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
	
	
	
	
}
