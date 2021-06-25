package com.cafe2team.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String adminWaiting(Model model) {
		
		List<WareAdmin> adminList = memberService.getAdminList();
		
		model.addAttribute("adminList", adminList);
		
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
	
	@GetMapping("/memberWithdrawal")
	public String memberWithdrawal(Model model) {
		model.addAttribute("title", "회원 탈퇴");
		
		return "member/memberWithdrawal";
	}
	
}



