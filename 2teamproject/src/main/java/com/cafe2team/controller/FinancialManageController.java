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
	
	//지출목록 조회
	@GetMapping("/expenditure")
	public String expenditure(Model model) {
		List<Expenditure> expenditureList = expenditureSerivce.getExpenditureList();
		model.addAttribute("title", "지출내역조회");
		model.addAttribute("expenditureList",expenditureList);
		return "financialmanage/expenditure";
	}	
	
	
	//지출등록
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
	
	//지출삭제
	@PostMapping("/deleteExpenditure")
	@ResponseBody
	public int deleteExpenditure(@RequestParam(value="dataArr[]") List<String> paramList) {
		int result = 0;
		result = expenditureSerivce.expenditureDelete(paramList);
		return result;
	}
	
	
	 //지출내역 수정
	 @PostMapping("/modifyExpenditure") 
	 public String modifyExpenditure(Expenditure expenditure) {
		 expenditureSerivce.modifyExpenditure(expenditure);
		 return "redirect:/expenditure";
		 }
	 
	 
	//지출내역 연도별 조회 필터
	@GetMapping("/getExpenseYear")
	@ResponseBody
	public List<Expenditure> getExpenseYear(
			@RequestParam Map<String, Object> param
			, Model model) {		
		String expenditure_data = (String) param.get("expenditure_data");
		log.info("expenditure_data",expenditure_data);
		List<Expenditure> expenseYear = expenditureSerivce.getExpenseYear(expenditure_data);
		log.info("expenseYear",expenseYear);
	
		
		return expenseYear;
	}
}
	


