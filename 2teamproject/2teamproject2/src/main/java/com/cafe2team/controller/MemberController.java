package com.cafe2team.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.SeekableByteChannel;
import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe2team.domain.AdminApproval;
import com.cafe2team.domain.Member;
import com.cafe2team.domain.Shoppingmall;
import com.cafe2team.domain.WareAdmin;
import com.cafe2team.service.MemberService;

import com.cafe2team.controller.MemberController;


@Controller
public class MemberController {
	
	private static final Logger log = LoggerFactory.getLogger(MemberController.class);


	private static final int ArrayList = 0;

	
	private final MemberService memberService;
	
	@Autowired
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
		
	}

	//회원 리스트 조회
	@GetMapping("/memberList")
	public String memberList(Model model) {
	
	model.addAttribute("memberList", memberService.getMemberList());
	
	return "member/memberList";
	}
	
	@GetMapping("/accountInquiry")
	public String getShoppingmallList(Model model) {
		
		
		model.addAttribute("getshopList", memberService.getShoppingmallList());
		
		return "member/accountInquiry";
	}
	
	@GetMapping("/adminWaiting")
	public String adminWaiting(Model model) {
		
		List<AdminApproval> approvalAdminList = memberService.getApprovalList();
		
		model.addAttribute("adminList", approvalAdminList);
		
		return "member/adminWaiting";
	}
	
	
	
	//관리자 마이페이지
	@GetMapping("/myPage")
	public String mypage(@RequestParam(value = "memberId", required = false) String memberId
			  			,Model model
			  			,HttpSession session) {
		
		Member member = memberService.getMemberInfoById(memberId);
		
		model.addAttribute("member", member);
		
		
		model.addAttribute("title", "회원 수정");
		
		String SID = (String)session.getAttribute("SID");
		String SNAME = (String)session.getAttribute("SNAME");
		String SPHONE = (String)member.getMemberPhone();
		
		log.info(SID);
		log.info(SNAME);
		log.info(SPHONE);
		
		return "member/myPage";
	}
	
	//마이 샵페이지
	@GetMapping("/myShopPage")
	public String myShopPage(@RequestParam(value = "memberId", required = false) String memberId
			,Model model
			,HttpSession session) {
		
		Shoppingmall shop = memberService.getsShopById(memberId);
		
		model.addAttribute("shop", shop);
		
		model.addAttribute("title", "회원 수정");
		
		return "member/myShopPage";
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
	
	@PostMapping("/memberDeleteCheck")
	@ResponseBody
	public int deleteSafetyCheck(@RequestParam(value = "dataArr[]") String[] paramList) {
		
		System.out.println(paramList.toString());
		
		for(String memberId : paramList) {
			memberService.deleteMember(memberId); 
		}
		
		int result= 1;
		
		/*
		 * int size = paramList.length; for(int i=0; i<size; i++) {
		 */
		
		return result;
	}
	
	@PostMapping("/wareAdminApproval")
	@ResponseBody
	public int wareAdminApproval(@RequestParam(value = "dataArr[]") List<String> paramList) {
		
		int reuslt = 1;
		
		for(String approvalAdminId : paramList) {
			memberService.adminIntotbAdminWare(approvalAdminId);
			memberService.adminIntotbMember(approvalAdminId);
			memberService.deleteWareAdmin(approvalAdminId);
		}
		
		return reuslt;
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
	public String accountsignup(Shoppingmall shoppingMall) {
		
		memberService.memberShopInsert(shoppingMall);
		
		return "redirect:/";
	}
	
	@PostMapping("/adminMemberIdCheck")
	@ResponseBody
	public boolean adminMemberIdCheck(@RequestParam(name = "adminApprovalId", required = false) String adminApprovalId) {
		boolean idCheck = true;
		
		AdminApproval adminApproval = memberService.getApprovalById(adminApprovalId);
		
		if(adminApproval != null) idCheck= false;
		
		return idCheck;
	}
	
	@GetMapping("/adminsignup")
	public String adminSignUp(Model model) {
		model.addAttribute("title", "관리자 회원가입");
		
		return "signup/adminsignup";
	}
	
	@PostMapping("/adminSignUp")
	public String adminSignUp(AdminApproval adminApproval) {
		
		memberService.adminSignUp(adminApproval);
		
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
								@RequestParam(value = "memberPw", required = false) String memberPw,
								@RequestParam(value = "Check", required = false) String memberCheck,
								HttpSession session,
								// RedirectAttributes rAttr,
								HttpServletResponse response) throws IOException {
		

		log.info("로그인 화면에서 입력받은 값->" + memberId);
		log.info("로그인 화면에서 입력받은 값->" + memberPw);
		log.info("로그인 화면에서 입력받은 값->" + memberCheck);
		

		if (memberCheck.equals("memberCheck")) {

			Member member = memberService.getMemberInfoById(memberId);
			if (member != null && memberId != null && memberPw != null && memberPw.equals(member.getMemberPw())) {
				String userLevel = member.getMemberLevelcode();

				if (userLevel.equals("1")) {
					member.setMemberLevelcode("총관리자");
				} else if (userLevel.equals("2")) {
					member.setMemberLevelcode("창고관리자");
				} else if (userLevel.equals("3")) {
					member.setMemberLevelcode("구역관리자");
				} else if (userLevel.equals("4")) {
					member.setMemberLevelcode("일반직원");
				} else {
					member.setMemberLevelcode("배송기사");
				}
				
				session.setAttribute("SID", member.getMemberId());
				session.setAttribute("SLEVEL", member.getMemberLevelcode());
				session.setAttribute("SNAME", member.getMemberName());

				log.info(member.getMemberId());
				log.info(member.getMemberLevelcode());
				log.info(member.getMemberName());
				
				return "redirect:/main";

			} else {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>alert('아이디 혹은 비밀번호가 일치하지 않습니다.'); location.href='/memberlogin';</script>");
				out.flush();

				return "redirect:/memberlogin";

			}

		} else if (memberCheck.equals("shopCheck")) {
			Shoppingmall shop = memberService.getsShopById(memberId);

			if (shop!=null && memberId != null && memberPw != null && memberPw.equals(shop.getShoppingmallPw())) {
				String shopLevel = shop.getShoppingmallLevel();

				if (shopLevel.equals("6")) shop.setShoppingmallLevel("사업자");
				
				session.setAttribute("SID", shop.getShoppingmallId());
				session.setAttribute("SLEVEL", shop.getShoppingmallLevel());
				session.setAttribute("SNAME", shop.getShoppingmallName());

				return "redirect:/main";

			} else {
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println("<script>alert('아이디 혹은 비밀번호가 일치하지 않습니다.'); location.href='/memberlogin';</script>");
				out.flush();

				return "redirect:/memberlogin";
			}

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
	
	@RequestMapping("/memberListDetail")
	public @ResponseBody List<Member> memberListDetail(
			@RequestParam Map<String,Object> param,
			@ModelAttribute("Member") Member member){

		String selectLevelValue = (String)param.get("selectLevelValue");
		
		List<Member> data = memberService.getMemberListDetail(selectLevelValue);
		
		log.info("=============================== {} ", data);
		
		return data;
		
	}
	
}



