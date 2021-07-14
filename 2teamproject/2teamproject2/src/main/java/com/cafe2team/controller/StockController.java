package com.cafe2team.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	private static final Logger log = LoggerFactory.getLogger(MemberController.class);
	private final StockService stockService;

	public StockController(StockService stockService) {
		this.stockService = stockService;
	}
	
	@GetMapping("/stockListDetailModal")
	public List<Stock> stockListDetailModal(Model model){
		
		List<Stock> stockList = stockService.getStockListDetailModal();
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
		log.info("stockList", "stockList");

		return "stock/stockList";
	}
	/************************************************************
	 * 재고조회 필터 
	 ************************************************************/
	/*
	 * @PostMapping("/StockListDetail")
	 * 
	 * @ResponseBody public List<Stock> StockListDetail(@RequestParam Map<String,
	 * Object> param, Model model){
	 * 
	 * String shoppingmall_name = (String) param.get("shoppingmall_name"); String
	 * warehouse_name = (String) param.get("warehouse_name"); List<Stock> stockList
	 * = stockService.getStockListDetail(shoppingmall_name, warehouse_name);
	 * System.out.println(stockList); return stockList;
	 * 
	 * }
	 */
	
	
	//재고 중분류
	@PostMapping("/getStockMiddleCate")
	@ResponseBody 
	public List<Stock> getStockMiddleCate(Model model,@RequestParam Map<String, Object> param) {
		String bCate = (String) param.get("bCate");
		log.info("bCate", bCate);
		List<Stock> getMiddleCategory = stockService.getStockMiddleCategoryInfo(bCate);
		log.info("getMiddleCategory", getMiddleCategory);
		
		return getMiddleCategory;
  
	}
	
	@PostMapping("/getStockSmallCate")
	@ResponseBody 
	public List<Stock> getStockSmallCate(Model model,@RequestParam Map<String, Object> param) {
		String bCate = (String) param.get("bCate");
		String mCate = (String) param.get("mCate");
		log.info("mCate", mCate);
		List<Stock> getSmallCategory = stockService.getStockSmallCategoryInfo(bCate, mCate);
		System.out.println(getSmallCategory);
		
		return getSmallCategory;
  
	}	
	
	@PostMapping("/getStockCate")
	@ResponseBody 
	public List<Stock> getStockCate(Model model,@RequestParam Map<String, Object> param) {
		String bCate = (String) param.get("bCate");
		String mCate = (String) param.get("mCate");
		String sCate = (String) param.get("sCate");
		log.info("sCate", sCate);
		List<Stock> getStockCategory = stockService.getStockCategoryInfo(bCate, mCate, sCate);
		System.out.println(getStockCategory);
		
		return getStockCategory;
		
	}	
	
	
	
	
	
	/************************************************************
	 * 재고실사 목록조회
	 ************************************************************/
	@GetMapping("/stockCheckList")
	public String getStockCheckList(Model model) {
		List<StockCheck> stockCheckList = stockService.getStockCheckList();

		model.addAttribute("title", "재고실사조회");
		model.addAttribute("stockCheckList", stockCheckList);
		System.out.println(stockCheckList);
		return "stock/stockCheckList";
	}
	
	/************************************************************
	 * 재고실사등록
	 ************************************************************/
	@GetMapping("/stockCheckInsert")
	public String stockCheckInsert(Model model) {
		model.addAttribute("title", "재고실사결과등록");
		return "stock/stockCheckInsert";
	}
	
	/************************************************************
	 * 재고실사 필터 조회
	 ************************************************************/
	@GetMapping("/stockCheckListDetail")
	@ResponseBody
	public List<StockCheck> stockCheckListDetail(
										@RequestParam Map<String, Object> param,
										Model model) {
		System.out.println();
		System.out.println(param.toString());
		System.out.println("1");
		String warehouse_code = (String) param.get("warehouse_code");
		String sector_stock_status_code = (String) param.get("sector_stock_status_code");
		List<StockCheck> stockCheckList = stockService.getStockCheckListDetail(warehouse_code, sector_stock_status_code);
		System.out.println(stockCheckList);
		System.out.println("2");
		
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
