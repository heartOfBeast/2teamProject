package com.cafe2team.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cafe2team.domain.Inquiry;
import com.cafe2team.domain.Reply;
import com.cafe2team.service.InquiryService;
import com.cafe2team.service.ReplyService;

@Controller

public class InquiryController {
	
	private final InquiryService inquiryService;
	private final ReplyService replyService;
	
	public InquiryController(InquiryService inquiryService, ReplyService replyService) {
		this.inquiryService = inquiryService;
		this.replyService = replyService;
	}

	
	//문의게시판 글 댓글작성
	@GetMapping("/readInquiryinfo")
	@ResponseBody
	public String readInquiry(Reply reply, HttpSession session,
						RedirectAttributes reAttr,
						HttpServletResponse response,
						@RequestParam(value = "replyContent", required = false) String replyContent,
						@RequestParam(value = "boardQnaCode", required = false) String boardQnaCode
						) {
		String memberId = (String) session.getAttribute("SID");
		if(memberId !=null) {
			reply.setMemberId(memberId);
			reply.setReplyCommentContent(replyContent);
			reply.setBoardQnaCode(boardQnaCode);
			replyService.addReply(reply);
			reAttr.addAttribute("memberId", memberId);
			System.out.println(memberId);

		}	
			return "redirect:/readInquiry";

	}
	
	
	//문의게시판 게시글 조회
	@GetMapping("readInquiry")
	public String readInquiry(Model model,  
								@RequestParam(value = "boardQnaCode", required = false)String boardQnaCode) {
		//문의게시판 댓글조회
		List<Reply> inquiryReply = replyService.getInquiryReply(boardQnaCode);
		
		model.addAttribute("title", "게시글 조회");
		model.addAttribute("readInquiry", inquiryService.readInquiry(boardQnaCode));
		model.addAttribute("inquiryReply", inquiryReply);
		
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
