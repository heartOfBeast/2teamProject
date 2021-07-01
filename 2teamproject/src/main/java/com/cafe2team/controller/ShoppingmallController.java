package com.cafe2team.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe2team.domain.Member;
import com.cafe2team.domain.Shoppingmall;
import com.cafe2team.service.MemberService;
import com.cafe2team.service.ShoppingmallService;


@Controller
public class ShoppingmallController {
	
	private final ShoppingmallService shoppingmallService;
	private final MemberService memberService;
	
	@Autowired
	public ShoppingmallController(ShoppingmallService shoppingmallService, MemberService memberService) {
		this.shoppingmallService = shoppingmallService;
		this.memberService = memberService;
	}
	
	
/******************************* 거래처 등록 시작 *******************************/
	
	
	
	// 거래처 사업자 번호 확인
	@GetMapping("/shoppingmallAdd")
	public String shoppingmallAdd(@RequestParam(value = "memberId", required = false) String memberId
  								  ,Model model
  								  ,HttpSession session) {
		
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		Member member = memberService.getMemberInfoById(memberId);
		
		
		String SID = (String)session.getAttribute("SID");
		String SNAME = (String)session.getAttribute("SNAME");
		String SLEVEL = (String)session.getAttribute("SLEVEL");
		String SPW = (String)member.getMemberPw();
		String SADDR = (String)member.getMemberAddress();
		String SEMAILL = (String)member.getMemberEmail();
		String SPHONE = (String)member.getMemberPhone();
		String ACCOUNT = (String)member.getMemberAccountStatus();
		
		System.out.println(SID);
		System.out.println(SNAME);
		System.out.println(SLEVEL);
		System.out.println(SPW);
		System.out.println(SADDR);
		System.out.println(SEMAILL);
		System.out.println(SPHONE);
		System.out.println(ACCOUNT);
		
		model.addAttribute("title", "사업자 등록");
		model.addAttribute("member", member);
		
		System.out.println(member+"###########################");
		
		return "shoppingmall/shoppingmallAdd";
	}
	
	// 쇼핑몰 사업자 등록
	@PostMapping("/shoppingmallAdd")
	public String shoppingmallAdd(Shoppingmall shoppingmall, HttpSession session) {
		
		String SDID = (String)session.getAttribute("SID");
		shoppingmall.setShoppingmallId(SDID);
		shoppingmallService.shoppingmallAdd(shoppingmall);
		
		System.out.println(shoppingmallService.shoppingmallAdd(shoppingmall)+"@@@@@@@@@@@@@@@");
		
		return "redirect:/approval";
	}
	
	

/******************************* 거래처 등록 종료 *******************************/
	

/*############################### 계약 및 권한 승인 페이지 시작 ###############################*/	

	// 계약 및 권한 승인 페이지 시작
	@GetMapping("/approval")
	public String approval(Model model) {
		
		model.addAttribute("title", "계약 및 권한 승인 페이지");
		model.addAttribute("shoppingmallList", shoppingmallService.ShoppingmallList());
		
		System.out.println(shoppingmallService.ShoppingmallList() +"shoppingmallControllerList");
		
		return "shoppingmall/approval";
	}
	
	@PostMapping("/approval")
	public String approval1() {
		
		return "redirect:/approval";
	}
/*############################### 계약 및 권한 승인 페이지 종료 ###############################*/	

	
	
	
	
	/*Tab test*/
	@GetMapping("/test")
	public String test() {
		return "test/test";
	}
	
}
