package com.cafe2team.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cafe2team.domain.Inquiry;
import com.cafe2team.domain.Notice;
import com.cafe2team.domain.Reply;
import com.cafe2team.service.BoardService;
import com.cafe2team.service.ReplyService;
@Controller
public class BoardController {

	private final BoardService boardService;
	private final ReplyService replyService;
	
	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	public BoardController(BoardService boardService, ReplyService replyService) {
		this.boardService = boardService;
		this.replyService = replyService;
	}

		//공지게시판 목록조회
		@GetMapping("/noticeList")
		public String noticeList(Model model) {
			List<Notice> noticeList = boardService.getNoticeList();
			model.addAttribute("title", "공지게시판");
			model.addAttribute("noticeList", noticeList);
			
			return "board/noticeList";
			
		}
		
		//공지글 수정
		@PostMapping("/modifyNotice")
		public String modifyNotice(Notice notice) {
			boardService.modifyNotice(notice);
			return "redirect:/noticeList";
		}
		
		//공지글 수정
		@GetMapping("/modifyNotice")
		public String modifyNotice(Model model,
									@RequestParam(name = "noticeCode", required = false)String noticeCode) {
			Notice notice = boardService.getNoticeInfo(noticeCode);
			model.addAttribute("title", "문의글 수정하기");
			model.addAttribute("notice", notice);
			return "inquiry/modifyNotice";
		}
	
		//공지글 삭제
		@PostMapping("/deleteNotice")
		@ResponseBody
		public int deleteNotice(@RequestParam(value = "noticeCode")String noticeCode) {
			int result = 1;
			boardService.deleteNotice(noticeCode);
			return result;
		}

		//공지게시판 게시글 조회
		@GetMapping("noticeRead")
		public String noticeRead(Model model,  
									@RequestParam(value = "noticeCode", required = false)String noticeCode) {
			//공지게시판 댓글조회
			List<Reply> noticeReply = replyService.getNoticeReply(noticeCode);
			int hitNum = boardService.addHHit(noticeCode);
			model.addAttribute("title", "게시글 조회");
			model.addAttribute("noticeRead", boardService.noticeRead(noticeCode));
			model.addAttribute("noticeReply", noticeReply);
			model.addAttribute("hitNum", hitNum);
			return "board/noticeRead";
		}
		
		//공지게시판 글쓰기
		@PostMapping("/noticeInsert")
		public String noticeInsert(Notice notice) {
			boardService.noticeInsert(notice);
			return "redirect:/noticeList";
		}
		
		//공지게시판 글쓰기
		@GetMapping("/noticeInsert")
		public String noticeInsert(Model model) {
			model.addAttribute("title", "문의글 작성하기");
			
			return "board/noticeInsert";
		
		}
		
		//공지게시판 글 댓글작성
		@GetMapping("/noticeReadInfo")
		@ResponseBody
		public String readInquiry(Reply reply, HttpSession session,
							RedirectAttributes reAttr,
							HttpServletResponse response,
							@RequestParam(value = "replyContent", required = false) String replyContent,
							@RequestParam(value = "noticeCode", required = false) String noticeCode
							) {
			String memberId = (String) session.getAttribute("SID");
			if(memberId !=null) {
				reply.setMemberId(memberId);
				reply.setReplyCommentContent(replyContent);
				reply.setNoticeCode(noticeCode);
				replyService.addNoticeReply(reply);
				reAttr.addAttribute("memberId", memberId);

			}	
				return "redirect:/noticeRead";

		}






}