package com.cafe2team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InquiryController {

	//문의게시판 목록
	@GetMapping("/inquiryList")
	public String inquiryList(Model model) {
		model.addAttribute("title", "문의게시판");
		
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

	//문의글 읽기
	@GetMapping("/readInquiry")
	public String readInquiry(Model model) {
		model.addAttribute("title", "문의게시판");
		
		return "inquiry/readInquiry";
	}
}
