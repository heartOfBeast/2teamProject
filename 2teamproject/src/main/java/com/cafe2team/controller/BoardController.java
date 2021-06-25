package com.cafe2team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class BoardController {

	@GetMapping("/noticelist")
	public String noticelist(Model model) {
		model.addAttribute("title", "공지게시판");
		return "board/noticelist";
	}

	@GetMapping("/noticeInsert")
	public String noticeInsert(Model model) {
		model.addAttribute("title", "공지작성");
		return "board/noticeInsert";
	} 
	

}
