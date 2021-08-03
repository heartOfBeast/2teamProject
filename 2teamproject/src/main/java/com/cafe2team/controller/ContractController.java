package com.cafe2team.controller;


import java.awt.Color;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
import com.cafe2team.service.ShoppingmallService;
import com.cafe2team.service.UnitPriceService;

@Controller
public class ContractController {
		
	private final UnitPriceService unitPriceService;
	private final ContractService contractService;
	private final ShoppingmallService shoppingmallService;
	
	
	public ContractController(UnitPriceService unitPriceService, ContractService contractService, ShoppingmallService shoppingmallService) {
		this.unitPriceService = unitPriceService;
		this.contractService = contractService;
		this.shoppingmallService = shoppingmallService;
	}
	
	/******************************** 요금안내 시작 ********************************/
	
	// 요금안내 조회 
	@GetMapping("/priceList")
	public String getUnitPriceList(Model model
								  ,Price price
								  ,@RequestParam(name="wareHouseType", required = false) String wareHouseType) {
		
		System.out.println(wareHouseType +"창고종류 검색");
		
		Map<String, Object> paramWareHouse = new HashMap<String, Object>();
		paramWareHouse.put("wareHouseType", wareHouseType);
		List<Price> priceList = unitPriceService.getPriceList(paramWareHouse);
		
		model.addAttribute("title", "요금안내");
		model.addAttribute("priceList", priceList);
		
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
		System.out.println(price+"priceUpdate");
		
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
	

	
	
	
	
	/******************************** 계약 시작  
	 * @throws IOException ********************************/
	
	// 계약 신청 추가
	@GetMapping("/contractAdd")
	public String contractAdd(@RequestParam(name = "priceCode", required = false)String priceCode, Model model) {
		
		Price price = unitPriceService.priceInfo(priceCode);
		
		model.addAttribute("price", price);
		
		
		return "contract/contractAdd";
	}
		
		
	
	// 계약신청 추가Modal
	@PostMapping("/contractAdd")
	public String contractAdd(Contract contract){

		String start = contract.getContractFinalStart();
		String name = contract.getPriceName();
		System.out.println(start +"계약 시작 날짜");
		System.out.println(name +"계약 이름");
		System.out.println(contract);
		
		String[] namestr = name.split("_");
		for(int i =0; i <namestr.length; i++) {
			System.out.println(namestr[i] +"문자열 잘라서");
		}
		String numstr = namestr[2].replaceAll("[^0-9]",""); // 숫자만 추출
		System.out.println(name + " ==> " + numstr);
		
		int strnum = Integer.parseInt(numstr); // 숫자 정수화
		System.out.println(strnum + "기간 정수화 시킨거");
		
		DateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
		try {
			Date date = dateFormat.parse(start);
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.DATE,strnum);
			
			System.out.println(dateFormat.format(cal.getTime())); // 시작날짜에 계약 기간 더해서 종료일 계산
			contract.setContractFinalEnd(dateFormat.format(cal.getTime()));
			contractService.contractAdd(contract);
			
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		return "redirect:/priceList";
		
	}
	
	// 계약관리 리스트
	@GetMapping("/contractApproval")
	public String contractApproval(Model model
								  ,Contract contract
								  ,@RequestParam(name="contractApprovalDate", required = false) String contractApprovalDate) {
		
		
		System.out.println(contractApprovalDate + "$$ 검색 결과");
		
		String a = contract.getContractApprovalDate();
		System.out.println(a);
		// 년도 조회
		Map<String, Object> paramYear = new HashMap<String, Object>();
		paramYear.put("contractApprovalDate", contractApprovalDate);
		List<Contract> contractList = contractService.ContractList(paramYear);
		List<Contract> barGraph = contractService.barGraph();
		
			model.addAttribute("title", "계약 관리");
			model.addAttribute("contractList", contractList);
			model.addAttribute("barGraph", barGraph);
		
		return "contract/contractApproval";
	}
	
	// 계약 관리 승인
	@PostMapping("/contractApproval")
	public String contractApproval(Contract contract) {
		
		contractService.contractApproval(contract);
		
		return "redirect:/contractApproval";
	}
	
	// 계약 관리 승인 취소
	@PostMapping("/contractCancel")
	public String contractCancel(Contract contract) {
		
		contractService.contractCancel(contract);
		
		return "redirect:/contractApproval";
	}
	
	
	/******************************** 계약 종료 ********************************/
	
	
	// 스케줄 관리 페이지
	@GetMapping("/calendar")
	public String calendar(Model model) {
		model.addAttribute("title", "계약 일정관리");
		return "contract/calendar";
	}
	
	// 계약 스케줄관리
	@PostMapping("/calendar")
	@ResponseBody
	public List<Map<String, Object>> CalendarList() {
		List<Map<String, Object>> list = contractService.CalendarList();
		
		JSONObject jsonObj = new JSONObject();
		JSONArray jsonArr = new JSONArray();
		HashMap<String, Object> hash = new HashMap<String, Object>();		
		Color color = null;
		
		for(int i=0; i < list.size(); i++) {
			color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
			hash.put("title", list.get(i).get("contractFinalUserName")); //제목
			hash.put("start", list.get(i).get("contractFinalStart")); //시작일자
			hash.put("end", list.get(i).get("contractFinalEnd")); //종료일자
			hash.put("backgroundColor", "rgb("+color.getBlue()+","+color.getGreen()+","+color.getRed()+")"); //종료일자
			
			//Integer.toHexString(color.getRGB());
			System.out.println(color.getRGB());

			
			jsonObj = new JSONObject(hash); //중괄호 {key:value , key:value, key:value}
			jsonArr.add(jsonObj); // 대괄호 안에 넣어주기[{key:value , key:value, key:value},{key:value , key:value, key:value}]
		}
		
		System.out.println("jsonArrCheck: "+ jsonArr);
		
		return jsonArr;
	}
	 
		

		
		
}



