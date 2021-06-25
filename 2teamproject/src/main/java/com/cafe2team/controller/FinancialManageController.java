package com.cafe2team.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FinancialManageController {

	//매출현황
	@GetMapping("/currentSalesState")
	public String currentSalesState(Model model) {
		model.addAttribute("title", "정산내역조회");
		return "financialmanage/currentSalesState";
	}
	
	@GetMapping("/calculate")
	public String calculate(Model model) {
		model.addAttribute("title", "정산내역조회");
		return "financialmanage/calculate";
	}
	
	@GetMapping("/expenditure")
	public String expenditure(Model model) {
		model.addAttribute("title", "지출내역조회");
		return "financialmanage/expenditure";
	}	
	@GetMapping("/expenditureinsert")
	public String expenditureinsert(Model model) {
		model.addAttribute("title", "지출내역등록");
		return "financialmanage/expenditureinsert";
	}	

}
