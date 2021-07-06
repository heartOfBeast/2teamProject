package com.cafe2team.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@GetMapping("/stockListDetailModal")
	public List<Stock> stockListDetailModal(Model model){
		
		List<Stock> stockList = stockService.getStockListDetailModel();
		model.addAttribute("stockList", stockList);
		
		return stockList;
	}
	
	/************************************************************
	 * 재고조회
	 ************************************************************/
	@GetMapping("/stockList")
	public String stockList(Model model) {
		
		List<Stock> stockList = stockService.getStockList();
		model.addAttribute("title", "재고목록조회");
		model.addAttribute("stockList", stockList);

		return "stock/stockList";
	}
	/************************************************************
	 * 재고조회 필터 
	 ************************************************************/
	@GetMapping("/StockListDetail")
	@ResponseBody
	public List<Stock> StockListDetail(@RequestParam Map<String, Object> param, Model model){
		
		String shoppingmall_name = (String) param.get("shoppingmall_name");
		String warehouse_name = (String) param.get("warehouse_name");
		List<Stock> stockList = stockService.getStockListDetail(shoppingmall_name, warehouse_name);
		System.out.println(stockList);
		return stockList;
		
	}
	
	/************************************************************
	 * 재고실사
	 ************************************************************/
	
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
	/************************************************************
	 * 재고실사수정
	 ************************************************************/
	
	@PostMapping("/stockCheckModal")
	public String stockCheckModal(StockCheck stockCheck, HttpSession session) {
		String UpmemberId = (String) session.getAttribute("SID");
		if(UpmemberId !=null) {
			stockCheck.setMemberid(UpmemberId);;
			stockService.stockCheckUpdate(stockCheck);
		}
		return "redirect:/stockCheckList";
	}
	
	
	
	
}
