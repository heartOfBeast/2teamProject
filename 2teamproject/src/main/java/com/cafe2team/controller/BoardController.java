package com.cafe2team.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafe2team.domain.Notice;
import com.cafe2team.service.BoardService;
@Controller
public class BoardController {

	private final BoardService boardService;
	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	//게시판 조회
	@GetMapping("/noticeList")
	public String getNoticeList(Model model) {		
		List<Notice> noticeList = boardService.getNoticeList();
		
		model.addAttribute("title", "공지게시판");
		model.addAttribute("noticeList",noticeList);
		return "board/noticeList";
	}

	
	
	
	
	
	
	
	
	
	@GetMapping("/noticeInsert")
	public String noticeInsert(Model model) {
		model.addAttribute("title", "공지작성");
		return "board/noticeInsert";
	} 
}
	
	/*
	 * @PostMapping("/noticeInsert") public String noticeInsert(NoticeIn noticeIn) {
	 * 
	 * memberService.noticeInsert(noticeIn)
	 * 
	 * return "redirect:/"; }
	 */
