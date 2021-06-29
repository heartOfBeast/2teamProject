package com.cafe2team.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.SeekableByteChannel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe2team.domain.Member;
import com.cafe2team.domain.WareAdmin;
import com.cafe2team.service.MemberService;

import com.cafe2team.controller.MemberController;


@Controller
public class MemberController {
	
	private static final Logger log = LoggerFactory.getLogger(MemberController.class);

	
	private final MemberService memberService;
	
	@Autowired
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
		
	}


	@GetMapping("/memberList")
	public String memberList(Model model) {
			
	
	model.addAttribute("memberList", memberService.getMemberList());
	
	return "member/memberList";
	}
	
	@GetMapping("/accountInquiry")
	public String accountInquiry() {
		
		return "member/accountInquiry";
	}
	
	@GetMapping("/adminWaiting")
	public String adminWaiting(Model model) {
		
		List<WareAdmin> adminList = memberService.getAdminList();
		
		model.addAttribute("adminList", adminList);
		
		return "member/adminWaiting";
	}
	
	
	@GetMapping("/myPage")
	public String mypage(@RequestParam(value = "memberId", required = false) String memberId
			  			,Model model
			  			,HttpSession session) {
		
		Member member = memberService.getMemberInfoById(memberId);
		
		model.addAttribute("title", "회원 수정");
		model.addAttribute("member", member);
		
		String SID = (String)session.getAttribute("SID");
		String SNAME = (String)session.getAttribute("SNAME");
		String SPHONE = (String)member.getMemberPhone();
		
		log.info(SID);
		log.info(SNAME);
		log.info(SPHONE);
		
		return "member/myPage";
	}
	
	@PostMapping("/myPage")
	public String myPage(Member member) {
		
		log.info(member + "=====수정 받아온 값=====");
		
		memberService.updateMember(member);
		
		return "redirect:/main";
	}
	
	@PostMapping("/myPageModal")
	public String myPageModal(Member member) {
		memberService.updateMember(member);
		
		return "redirect:/memberList";
	}
	
	@GetMapping("/whzoneinquiry")
	public String whzoneinquiry() {
		
		return "member/whzoneinquiry";
	}
	
	@GetMapping("/accountsignup")
	public String accountsignup(Model model) {
		model.addAttribute("title", "거래처 회원가입");
		
		return "signup/accountsignup";
	}
	
	
	@PostMapping("/accountsignup")
	public String accountsignup(Member member) {
		
		memberService.memberShopInsert(member);
		
		return "redirect:/";
	}
	
	@GetMapping("/adminsignup")
	public String adminSignUp(Model model) {
		model.addAttribute("title", "관리자 회원가입");
		
		return "signup/adminsignup";
	}
	
	@PostMapping("/adminSignUp")
	public String adminSignUp(WareAdmin wareAdmin) {
		
		memberService.adminSignUp(wareAdmin);
		
		return "redirect:/";
	}
	
	//로그인
	
	@GetMapping("/memberlogin")
	public String login(Model model) {
		
		model.addAttribute("title", "로그인화면");
		
		return "memberlogin/memberlogin";
	}
	
	@PostMapping("/memberlogin")
	public String commonLoginPage(@RequestParam(value = "memberId", required = false) String memberId,
			@RequestParam(value = "memberPw", required = false) String memberPw, HttpSession session,
			// RedirectAttributes rAttr,
			HttpServletResponse response) throws IOException {


		log.info("로그인 화면에서 입력받은 값->" + memberId);
		log.info("로그인 화면에서 입력받은 값->" + memberPw);

		Member member = memberService.getMemberInfoById(memberId);

		if (memberId != null && memberPw != null && member != null && member.getMemberPw() != null
				&& memberPw.equals(member.getMemberPw())) {

			// 로그인 후 각 권한 체크하여 한글로 변환
			String userLevel = member.getMemberLevelcode();
			if (userLevel.equals("1")) {
				member.setMemberLevelcode("총관리자");
			} else if (userLevel.equals("2")) {
				member.setMemberLevelcode("창고관리자");
			} else if (userLevel.equals("3")) {
				member.setMemberLevelcode("구역관리자");
			} else if (userLevel.equals("4")) {
				member.setMemberLevelcode("일반직원");
			} else if (userLevel.equals("5")) {
				member.setMemberLevelcode("배송기사");
			} else {
				member.setMemberLevelcode("사업자");

			}
			
				if (member.getMemberLevelcode().equals("총관리자")) {
					session.setAttribute("SID", member.getMemberId());
					session.setAttribute("SLEVEL", member.getMemberLevelcode());
					session.setAttribute("SNAME", member.getMemberName());
					
				} else if (member.getMemberLevelcode().equals("창고관리자")) {
					session.setAttribute("SID", member.getMemberId());
					session.setAttribute("SLEVEL", member.getMemberLevelcode());
					session.setAttribute("SNAME", member.getMemberName());
					
				} else if (member.getMemberLevelcode().equals("일반직원")) {
					session.setAttribute("SID", member.getMemberId());
					session.setAttribute("SLEVEL", member.getMemberLevelcode());
					session.setAttribute("SNAME", member.getMemberName());
					
				} else if (member.getMemberLevelcode().equals("배송기사")) {
					session.setAttribute("SID", member.getMemberId());
					session.setAttribute("SLEVEL", member.getMemberLevelcode());
					session.setAttribute("SNAME", member.getMemberName());
					
				} else if (member.getMemberLevelcode().equals("창고관리자")) {
					session.setAttribute("SID", member.getMemberId());
					session.setAttribute("SLEVEL", member.getMemberLevelcode());
					session.setAttribute("SNAME", member.getMemberName());
					
				} else {
					session.setAttribute("SID", member.getMemberId());
					session.setAttribute("SLEVEL", member.getMemberLevelcode());
					session.setAttribute("SNAME", member.getMemberName());
					
				}
			
			String SID = (String) session.getAttribute("SID");
			String SLEVEL = (String) session.getAttribute("SLEVEL");
			String SNAME = (String) session.getAttribute("SNAME");
			
			log.info(SID + "SID <<현재 아이디");
			log.info(SLEVEL + "SLEVEL <<현재 권한");
			log.info(SNAME + "SNAME <<현재 이름");

		} else {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('아이디 혹은 비밀번호가 일치하지 않습니다.'); location.href='/memberlogin';</script>");
			out.flush();
			log.info(memberId + "로그인 실패");

			return "redirect:/memberlogin";
		}
		
		return "redirect:/main";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:/";
		
	}
	

	
	
	@GetMapping("/memberWithdrawal")
	public String memberWithdrawal(Model model) {
		model.addAttribute("title", "회원 탈퇴");
		
		return "member/memberWithdrawal";
	}
	
}



