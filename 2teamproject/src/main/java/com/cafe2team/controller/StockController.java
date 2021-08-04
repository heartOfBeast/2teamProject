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
import com.cafe2team.domain.Warehouse;
import com.cafe2team.domain.WarehouseSector;
import com.cafe2team.service.StockService;
import com.cafe2team.service.WarehouseService;

@Controller
public class StockController {
	
	private static final Logger log = LoggerFactory.getLogger(MemberController.class);
	private final StockService stockService;
	private final WarehouseService warehouseservice;

	public StockController(StockService stockService,  WarehouseService warehouseservice) {
		this.stockService = stockService;
		this.warehouseservice = warehouseservice;
	}
	//재고상세정보모달
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
	//재고 소분류
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
	//전체 분류
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
	 * 재고실사 목록조회 & 재고실사 창고별 구역별 조회를 위해 창고명과 구역명 가져오기
	 ************************************************************/
	@GetMapping("/stockCheckList")
	public String getStockCheckList(Model model) {
		List<StockCheck> stockCheckList = stockService.getStockCheckList();
		List<Warehouse> warehouseName = warehouseservice.getWarehouseName(); //창고명가져오기
		model.addAttribute("title", "재고실사조회");
		model.addAttribute("stockCheckList", stockCheckList);
		model.addAttribute("warehouseName", warehouseName);
		System.out.println(stockCheckList);
		return "stock/stockCheckList";
	}
	
	/************************************************************
	 * 재고실사 조회시 창고명 선택시 창고에 해당하는 구역가져오기
	 ************************************************************/
	@PostMapping("/stockCheckSector")
	@ResponseBody
	public List<WarehouseSector> stockCheckSector(@RequestParam Map<String, Object> param, Model model){
		
		String wareName = (String) param.get("wareName");
		System.out.println(wareName + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		List<WarehouseSector> warehouseSectorCode = warehouseservice.getWarehouseSector(wareName);
		System.out.println(warehouseSectorCode+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		return warehouseSectorCode;
	}
	
	@PostMapping("/stockCheckSectorList")
	@ResponseBody
	public List<StockCheck> stockCheckSectorList(@RequestParam Map<String, Object> param, Model model){
		String wareName = (String) param.get("wareName");
		String sectorName = (String) param.get("sectorName");
		System.out.println(">>wareName: "+wareName+"  /sectorName:"+sectorName);
		List<StockCheck> stockCheckList = stockService.getStockCheckListDetail(wareName, sectorName);
		System.out.println(stockCheckList.toString());
		return stockCheckList;
	}
	
	
	
	/************************************************************
	 * 재고실사등록
	 ************************************************************/
	@GetMapping("/stockCheckInsert")
	public String stockCheckInsert(Model model) {
		List<StockCheck> stock = stockService.getStockInfo();
		model.addAttribute("title", "재고실사결과등록");
		model.addAttribute("stock", stock);
		return "stock/stockCheckInsert";
	}
	
	@PostMapping("/stockCheckInsert")
	public String stockCheckInsert(StockCheck stockCheck) {
		stockService.stockCheckInsert(stockCheck);
			
		return "redirect:/stockCheckList";
		
	}
	/************************************************************
	 * 재고실사등록을 위해 재고코드를 입력시 최종위치, 현재 재고수량, 창고코드, 구역코드 자동생성 
	 ************************************************************/
	@PostMapping("/getSectorFinalCode")
	@ResponseBody
	public List<StockCheck> getsectorFinalCode(Model model,
										  @RequestParam Map<String, Object> param
										  ){
		String stockCode = (String) param.get("stockCode");
		List<StockCheck> getSectorFinal = stockService.getSectorFinalCode(stockCode);
		return getSectorFinal;
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
