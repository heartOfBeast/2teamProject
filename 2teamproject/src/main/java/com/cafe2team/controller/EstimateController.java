package com.cafe2team.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe2team.domain.Estimate;
import com.cafe2team.service.EstimateService;

@Controller
public class EstimateController {
	
	private final EstimateService estimateservice;
	private static final Logger log = LoggerFactory.getLogger(MemberController.class);
	
	public EstimateController(EstimateService estimateservice) {
		this.estimateservice = estimateservice;
	}
	
	
		//견적신청 검토 - 견적신청 한 리스트조회
		@GetMapping("/estimatePermit")
		public String getEstimatePermit(Model model) {
			
			List<Estimate> estimatePermit = estimateservice.getEstimatePermit();
			model.addAttribute("title", "견적신청 검토");
			model.addAttribute("estimatePermit", estimatePermit);
			
			return "estimate/estimatePermit";
		}
		
		/************************************************************
		 * 비회원 견적신청
		 ************************************************************/			
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
		
		/************************************************************
		 * 비회원 견적신청 조회
		 ************************************************************/		
		@GetMapping("/estimateLook")
		public String estimateLook(Model model) {
			
			model.addAttribute("title", "견적신청 조회하기");

			return "estimate/estimateLook";
		}
	
		/************************************************************
		 * 견적신청 조회 데이터검색
		 ************************************************************/	

		@PostMapping("/estimateCheck")
		public String estimateLook(Model model, String companyPhone, String companyEmail,HttpServletResponse response) throws IOException {
			boolean estimateCheck = true;
			
			Estimate estimate = estimateservice.getEstimateInfoCheck(companyPhone, companyEmail); 
			if(estimate != null) estimateCheck = false;
			log.info("estimate", estimate);
			log.info("companyPhone", companyPhone);
			log.info("companyEmail", companyEmail);
			
			if(estimateCheck) {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>alert('없는 데이터입니다. 다시 확인하여 입력해주세요.');</script>");
				out.flush();
				return "estimate/estimateLook";
			}else {
				model.addAttribute("estimate", estimate);
					log.info("estimate", estimate);
				return "estimate/estimateLookList";
			}
			
		}
		
//		 비회원 견적신청 조회 리스트
		@GetMapping("estimateLookList")
		public String getEistmateLookList(Model model) {
			
			List<Estimate> estimateLookList = estimateservice.getEstimateLookList();
			
			
			model.addAttribute("title", "견적신청 조회");
			model.addAttribute("estimateLookList");
			log.info("estimateLookList", estimateLookList);
			
			return "estimate/estimateLookList";
		}
		/************************************************************
		 * 비회원 견적신청 조회 끝
		 ************************************************************/		
		
		
		
		/************************************************************
		 * 기존 쇼핑몰회원 새 견적신청 시작
		 ************************************************************/	
		@GetMapping("/estimate")
		public String estimate(Model model) {
			
			model.addAttribute("title", "견적신청");
			return "estimate/estimate";
		}
		
		@PostMapping("/addEstimate")
		public String addEstimate(Estimate estimate) {
			
			estimateservice.addEstimate(estimate);
			log.info("estimate", estimate);
			
			return "redirect:/estimateLook";
		}
		
		/************************************************************
		 * 기존 쇼핑몰회원 새 견적신청 끝
		 ************************************************************/	
	}



