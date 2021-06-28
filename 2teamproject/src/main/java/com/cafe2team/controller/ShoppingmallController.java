package com.cafe2team.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafe2team.service.ShoppingmallService;


@Controller
public class ShoppingmallController {
	
	private final ShoppingmallService shoppingmallService;
	
	@Autowired
	public ShoppingmallController(ShoppingmallService shoppingmallService) {
		this.shoppingmallService = shoppingmallService;
	}
	
	
/******************************* 거래처 등록 시작 *******************************/
	
	// 거래처 사업자 번호 확인
	@GetMapping("/shoppingmallAdd")
	public String shoppingmallAdd(Model model) {
		 
		model.addAttribute("title", "사업자 등록");
		/* model.addAttribute("memberList", shoppingmallService.getMemberList()); */
		
		return "shoppingmall/shoppingmallAdd";
	}

/******************************* 거래처 등록 종료 *******************************/
	

/*############################### 계약 및 권한 승인 페이지 시작 ###############################*/	

	// 계약 및 권한 승인 페이지 시작
	@GetMapping("/approval")
	public String approval() {
		
		return "shoppingmall/approval";
	}
/*############################### 계약 및 권한 승인 페이지 종료 ###############################*/	

	
	
/******************************* 거래처 마이페이지 시작 *******************************/
	
	// 거래처 마이페이지
	@GetMapping("/shoppingmallMypage")
	public String shoppingmallMypage() {
		
		return "shoppingmall/shoppingmallMypage";
	}
	
/******************************* 거래처 마이페이지 동료 *******************************/
	
	
	
	
	
/*############################### 거래처 조회 시작 ###############################*/
	
	// 거래처 리스트
	@GetMapping("/shoppingmallList")
	public String shoppingmallList(Model model) {
		
		model.addAttribute("title", "거래처 조회");
		model.addAttribute("shoppingmallList", shoppingmallService.getShoppingmallList());
		
		return "shoppingmall/shoppingmallList";
	}
	
/*############################### 거래처 조회 종료 ###############################*/
	
	@GetMapping("/test")
	public String test() {
		return "test/test";
	}
	
}
