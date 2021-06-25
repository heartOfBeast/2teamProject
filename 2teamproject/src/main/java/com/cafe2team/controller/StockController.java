package com.cafe2team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StockController {

	
	@GetMapping("stockList")
	public String stock() {
		return "stock/stockList";
	}
}
