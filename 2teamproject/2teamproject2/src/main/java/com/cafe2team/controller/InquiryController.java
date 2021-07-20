package com.cafe2team.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe2team.domain.Inquiry;
import com.cafe2team.service.InquiryService;

@Controller

public class InquiryController {
	
	private final InquiryService inquiryService;
	
	public InquiryController(InquiryService inquiryService) {
		this.inquiryService = inquiryService;
	}

	
	//문의게시판 게시글 조회
	@GetMapping("/readInquiry")
	public String readInquiry(Model model,  
								@RequestParam(name = "boardQnaCode", required = false)String boardQnaCode) {
		model.addAttribute("title", "게시글 조회");
		model.addAttribute("readInquiry", inquiryService.readInquiry(boardQnaCode));
		
		return "inquiry/readInquiry";
	}
	
	//문의게시판 목록
	@GetMapping("/inquiryList")
	public String inquiryList(Model model) {
		List<Inquiry> inquiryList = inquiryService.getInquiryList();
		model.addAttribute("title", "문의게시판");
		model.addAttribute("inquiryList", inquiryList);
		
		return "inquiry/inquiryList";
	}
	
	//1:1문의글 작성
	@GetMapping("/sendOneByOne")
	public String sendOneByOne(Model model) {
		model.addAttribute("title", "1:1문의");
		
		return "inquiry/sendOneByOne";
	}
	
	//자주 묻는 FAQ
	@GetMapping("/oftenFaq")
	public String oftenFaq(Model model) {
		model.addAttribute("title", "자주 묻는 질문");
		
		return "inquiry/oftenFaq";
	}


}
