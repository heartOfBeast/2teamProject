package com.cafe2team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	@GetMapping("/priceRemove")
	public String priceRemove(@RequestParam(value = "price_Code", required = false)String price_Code, Model model) {
		
		Price price = unitPriceService.priceInfo(price_Code);
		
		model.addAttribute("title", "요금안내 삭제");
		model.addAttribute("price", price);
		
		return "unitPrice/priceRemove";
	}
	
	@PostMapping("priceRemove")
	public String priceRemove(Price price) {
		
		unitPriceService.priceRemove(price);
		
		return "redirect:/priceList";
	}
	
	/******************************** 요금안내 종료 ********************************/
	
	
	
	
	
	
	
	
	/******************************** 계약 시작 ********************************/
	
		// 거래계약 등록
		@GetMapping("/contractList")
		public String contractList() {
			
			return "contract/contractList";
		}
		
		@GetMapping("/warContractList")
		public String  warContractList() {
			
			return "contract/warContractList";
		}
		
	/******************************** 계약 종료 ********************************/
		
	
		
		
	/******************************** 거래 계약 등록 ********************************/
		
		// 계약신청페이지
		@GetMapping("/contractPage")
		public String getContractPage() {
			
			return "contract/contractPage";
		}
		
		// 계약신청 사업자 번호 확인
		@GetMapping("contractAdd")
		public String contractAdd(Model model) {
			
			model.addAttribute("title", "계약신청");
			
			return "contract/contractAdd";
		}
		
	/******************************** 거래 계약 종료 ********************************/
		
		
		
		
		
		
		
		
		
		
		
		
	}



