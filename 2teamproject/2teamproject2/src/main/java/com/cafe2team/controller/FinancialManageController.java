package com.cafe2team.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafe2team.domain.Expenditure;
import com.cafe2team.service.ExpenditureService;

@Controller
public class FinancialManageController {
	private ExpenditureService expenditureSerivce;
	private static final Logger log = LoggerFactory.getLogger(FinancialManageController.class);
	//매출현황
	
	public FinancialManageController(ExpenditureService expenditureSerivce) {
		this.expenditureSerivce =expenditureSerivce;
	}
	
	@GetMapping("/currentSalesState")
	public String currentSalesState(Model model) {
		model.addAttribute("title", "정산내역조회");
		return "financialmanage/currentSalesState";
	}
	
	//창고 총정산내용 조회
	@GetMapping("/calculate")
	public String calculate(Model model) {
		List<Expenditure> calculate = expenditureSerivce.getCalculate();
		List<Expenditure> sales = expenditureSerivce.getsales();
		// 클라이언트에게 데이터를 보내기 전에 양식에 맞게 정리
		List<Expenditure> calculated = expenditureSerivce.getSalesCal(calculate, sales); 
		model.addAttribute("title", "정산내역조회");
		model.addAttribute("calculate", calculate);
		model.addAttribute("sales", sales);
		model.addAttribute("result", calculated);
		
		return "financialmanage/calculate";
	}
	
	@GetMapping("/expenditure")
	public String expenditure(Model model) {
		List<Expenditure> expenditureList = expenditureSerivce.getExpenditureList();
		model.addAttribute("title", "지출내역조회");
		model.addAttribute("expenditureList",expenditureList);
		return "financialmanage/expenditure";
	}	
	
	
	@GetMapping("/expenditureinsert")
	public String expenditureinsert(Model model) {
		model.addAttribute("title", "지출내역등록");
		return "financialmanage/expenditureinsert";
	}	
	
	@PostMapping("/expenditureinsert")
	public String expenditureinsert(Expenditure expenditure) {
		
		expenditureSerivce.expenditureinsert(expenditure);
		log.info("expenditure", expenditure);
		
		return "redirect:/expenditure";
	}
	
	
	
	

}
