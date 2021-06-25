package com.cafe2team.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafe2team.domain.Member;
import com.cafe2team.domain.WareAdmin;
import com.cafe2team.service.MemberService;




@Controller
public class MemberController {
	
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
	public String adminWaiting() {
		
		return "member/adminWaiting";
	}
	
	
	@GetMapping("/myPage")
	public String mypage() {
		
		return "member/myPage";
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
	
	@GetMapping("/memberWithdrawal")
	public String memberWithdrawal(Model model) {
		model.addAttribute("title", "회원 탈퇴");
		
		return "member/memberWithdrawal";
	}
	
}



