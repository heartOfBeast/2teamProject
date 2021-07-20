package com.cafe2team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReleaseController2 {
	
	@GetMapping("/realReleaseList")
	public String realReleaseList(Model model) {
		model.addAttribute("title", "출고 리스트");
		return "release/realReleaseList";
	}

	@GetMapping("/wayBillSearch")
	public String wayBillSearch(Model model) {
		model.addAttribute("title", "운송장 조회");
		return "release/wayBillSearch";
	}
	
}
