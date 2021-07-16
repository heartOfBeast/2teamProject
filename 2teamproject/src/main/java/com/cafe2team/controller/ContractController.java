package com.cafe2team.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe2team.domain.Contract;
import com.cafe2team.domain.Price;
import com.cafe2team.service.ContractService;
import com.cafe2team.service.UnitPriceService;

@Controller
public class ContractController {
		
	private final UnitPriceService unitPriceService;
	private final ContractService contractService;
	
	
	public ContractController(UnitPriceService unitPriceService, ContractService contractService) {
		this.unitPriceService = unitPriceService;
		this.contractService = contractService;
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
	
	
	// 요금안내 수정 Modal
	@PostMapping("/priceUpdate")
	public String priceUpdate(Price price) {
		
		unitPriceService.priceUpdate(price);
		
		return "redirect:/priceList";
		
	}
	
	// 요금안내 삭제
	@PostMapping("/priceRemove")
	@ResponseBody
	public int priceRemove(@RequestParam(value="deletArr[]") String[] price) {
		int result = 1;
		System.out.println(price);
		int size = price.length;
		for(int i=0; i<size; i++) {
			unitPriceService.priceRemove(price[i]);
		}
		return result;
		
	}
	
	/******************************** 요금안내 종료 ********************************/
	

	
	
	
	
	/******************************** 계약 시작  ********************************/
	
	// 계약 신청 추가
	@GetMapping("/contractAdd")
	public String contractAdd(@RequestParam(name = "priceCode", required = false)String priceCode, Model model) {
		
		Price price = unitPriceService.priceInfo(priceCode);
		
		model.addAttribute("price", price);
		model.addAttribute("contractList", contractService.ContractList());
		
		
		return "contract/contractAdd";
	}
	
	// 계약신청 추가Modal
	@PostMapping("/contractAdd")
	public String contractAdd(Contract contract) {
		
		contractService.contractAdd(contract);
		
		return "redirect:/priceList";
		
	}
	
	
	// 계약관리 리스트
	@GetMapping("/contractApproval")
	public String contractApproval(Model model) {
		
		List<Contract> contractList = contractService.ContractList();

		model.addAttribute("title", "계약 관리");
		model.addAttribute("contractList", contractList);
		
		return "contract/contractApproval";
	}
	
	// 계약 관리 승인
	@PostMapping("/contrcatApproval")
	public String contractApproval(Contract contract) {
		
		
		
		return "redirect:/contractApproval";
	}
	
	
	/******************************** 계약 종료 ********************************/
	
	
	
	// 스케줄 관리 페이지
	@GetMapping("/calendar")
	public String calendar(Model model) {
		model.addAttribute("title", "계약 일정관리");
		return "contract/calendar";
	}
	
	@PostMapping("/calendar")
	@ResponseBody
	public List<Map<String, Object>> CalendarList() {
		List<Map<String, Object>> list = contractService.CalendarList();
		
		JSONObject jsonObj = new JSONObject();
		JSONArray jsonArr = new JSONArray();
		HashMap<String, Object> hash = new HashMap<String, Object>();		
		
		for(int i=0; i < list.size(); i++) {			
			hash.put("title", list.get(i).get("contractFinalUserName")); //제목
			hash.put("start", list.get(i).get("contractFinalStart")); //시작일자
			hash.put("end", list.get(i).get("contractFinalEnd")); //종료일자
			
			jsonObj = new JSONObject(hash); //중괄호 {key:value , key:value, key:value}
			jsonArr.add(jsonObj); // 대괄호 안에 넣어주기[{key:value , key:value, key:value},{key:value , key:value, key:value}]
		}
		
		System.out.println("jsonArrCheck: "+ jsonArr);
		
		return jsonArr;
	}
	 
		

		
		
}



