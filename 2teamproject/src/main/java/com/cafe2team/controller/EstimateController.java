package com.cafe2team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstimateController {

		@GetMapping("/estimate")
		public String estimate(Model model) {
			
			model.addAttribute("title", "견적신청");
			return "estimate/estimate";
		}
		
		@GetMapping("/estimateLook")
		public String estimateLook(Model model) {
			
			model.addAttribute("title", "견적신청 조회하기");
			return "estimate/estimateLook";
		}
		
	}



