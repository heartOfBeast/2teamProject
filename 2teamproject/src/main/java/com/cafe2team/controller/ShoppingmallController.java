package com.cafe2team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShoppingmallController {
	
	// 거래처 등록
	@GetMapping("/shoppingmallAdd")
	public String shoppingmallAdd() {
		
		return "shoppingmall/shoppingmallAdd";
	}
	
	// 거래처 리스트
	@GetMapping("/shoppingmallList")
	public String shoppingmallList() {
		
		return "shoppingmall/shoppingmallList";
	}
	
	
	@GetMapping("/shoppingmallMypage")
	public String shoppingmallMypage() {
		
		return "shoppingmall/shoppingmallMypage";
	}
}
