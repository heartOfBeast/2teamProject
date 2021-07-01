package com.cafe2team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe2team.domain.Price;
import com.cafe2team.service.UnitPriceService;

@Controller
public class ContractController {
		
	private final UnitPriceService unitPriceService;
	
	public ContractController(UnitPriceService unitPriceService) {
		this.unitPriceService = unitPriceService;
	}
	
	/******************************** 요금안내 시작 ********************************/
	
	// 요금안내 조회
	@GetMapping("/priceList")
	public String getUnitPriceList(Model model) {
		
		model.addAttribute("title", "요금안내");
		model.addAttribute("priceList", unitPriceService.getPriceList());
		
		return "unitPrice/priceList";
	}
	
	// 요금안내 추가
	@GetMapping("/priceAdd") 
	public String getUnitPriceAdd(Model model) {
		
		model.addAttribute("title", "요금안내 추가");
		
		return "unitPrice/priceAdd";
	}
	
	// 요금안내 추가
	@PostMapping("/priceAdd")
	public String priceAdd(Price price) {
		
		unitPriceService.priceAdd(price);
		
		return "redirect:/priceList";
	}
	
	// 요금안내 수정
	@GetMapping("/priceUpdate")
	public String priceUpdate(@RequestParam(name = "price_Code", required = false)String price_Code, Model model) {
		
		Price price = unitPriceService.priceInfo(price_Code);
		
		model.addAttribute("title", "요금안내 수정");
		model.addAttribute("price", price);
		
		return "unitPrice/priceUpdate";
	}
	
	// 요금안내 수정
	@PostMapping("/priceUpdate")
	public String priceUpdate(Price price) {
		
		unitPriceService.priceUpdate(price);
		
		return "redirect:/priceList";
	}
	
	// 요금안내 삭제
	@PostMapping("/priceRemove")
	@ResponseBody
	public int priceRemove(@RequestParam(value="dataArr[]") String[] price) {
		int result = 1;
		System.out.println(price);
		int size = price.length;
		for(int i=0; i<size; i++) {
			unitPriceService.priceRemove(price[i]);
		}
		return result;
		
	}
	
	/******************************** 요금안내 종료 ********************************/
	
	// 계약 신청
	@GetMapping("/contractAdd")
	public String contractAdd() {
		
		return "contract/contractAdd";
	}
	
	
	
		

		
		
		
		
		
		
		
		
		
		
		
		
	}



