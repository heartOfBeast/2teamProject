package com.cafe2team.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafe2team.domain.Estimate;
import com.cafe2team.service.EstimateService;

@Controller
public class EstimateController {
	
	private final EstimateService estimateservice;
	private static final Logger log = LoggerFactory.getLogger(MemberController.class);
	
	public EstimateController(EstimateService estimateservice) {
		this.estimateservice = estimateservice;
	}
	
		@PostMapping("/estimateAnother")
		public String addEstimateAnother(Estimate estimate) {
			
			estimateservice.addEstimateAnother(estimate);
			log.info("estimate", estimate);
			
			return "redirect:/estimateLook";
			
		}
		
		@GetMapping("/estimateAnother")
		public String estimateAnother(Model model) {
			model.addAttribute("title", "비회원 견적신청");
			return "estimate/estimateAnother";
		}
	
		
		//견적신청 검토 - 견적신청 한 리스트조회
		@GetMapping("/estimatePermit")
		public String getEstimatePermit(Model model) {
			
			List<Estimate> estimatePermit = estimateservice.getEstimatePermit();
			model.addAttribute("title", "견적신청 검토");
			model.addAttribute("estimatePermit", estimatePermit);
			
			return "estimate/estimatePermit";
		}
		
		@GetMapping("/estimateLook")
		public String estimateLook(Model model) {
			
			model.addAttribute("title", "견적신청 조회하기");
			return "estimate/estimateLook";
		}
		
		@PostMapping("/addEstimate")
		public String addEstimate(Estimate estimate) {
			
			estimateservice.addEstimate(estimate);
			log.info("estimate", estimate);
			
			return "redirect:/estimateLook";
		}
		
		@GetMapping("/estimate")
		public String estimate(Model model) {
			
			model.addAttribute("title", "견적신청");
			return "estimate/estimate";
		}
		
	}



