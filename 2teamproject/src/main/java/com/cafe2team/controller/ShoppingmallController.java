package com.cafe2team.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe2team.domain.Shoppingmall;
import com.cafe2team.service.ShoppingmallService;


@Controller
public class ShoppingmallController {
	
	private final ShoppingmallService shoppingmallService;
	
	@Autowired
	public ShoppingmallController(ShoppingmallService shoppingmallService) {
		this.shoppingmallService = shoppingmallService;
	}
	
	
/******************************* 거래처 등록 시작 *******************************/
	
	
	
	// 거래처 사업자 번호 확인
	@GetMapping("/shoppingmallAdd")
	public String shoppingmallAdd(@RequestParam(name = "shoppingmallId", required = false) String shoppingmallId
								  ,HttpSession session
								  ,Model model) {
		
		Shoppingmall shoppingmall = shoppingmallService.shoppingmallInfo(shoppingmallId);	
		
		String SID = (String)session.getAttribute("SID");
		String SNAME = (String)session.getAttribute("SNAME");
		String SLEVEL = (String)session.getAttribute("SLEVEL");
		String SPW = (String)shoppingmall.getShoppingmallPw();
		String SADDR = (String)shoppingmall.getShoppingmallAddr();
		String SEMAILL = (String)shoppingmall.getShoppingmallEmail();
		String SPHONE = (String)shoppingmall.getShoppingmallPhone();
		String ACCOUNT = (String)shoppingmall.getShoppingmallStatus();
		
		System.out.println(SID);
		System.out.println(SNAME);
		System.out.println(SLEVEL);
		System.out.println(SPW);
		System.out.println(SADDR);
		System.out.println(SEMAILL);
		System.out.println(SPHONE);
		System.out.println(ACCOUNT);
		
		
		System.out.println(SID);
		
		model.addAttribute("title", "거래처등록");
		model.addAttribute("shoppingmall", shoppingmall);
		
		
		
		System.out.println(shoppingmall+"@@");
		
		return "shoppingmall/shoppingmallAdd";
	}
	
	// 쇼핑몰 사업자 등록
	@PostMapping("/shoppingmallAdd")
	public String shoppingmallAdd(Shoppingmall shoppingmall) {
		
	
		shoppingmallService.shoppingmallAdd(shoppingmall);
		
		
		
		return "redirect:/shoppingmallApproval";
	}
	
	

/******************************* 거래처 등록 종료 *******************************/
	





/******************************* 거래처 권한 관리 시작 *******************************/
	
	  // 거래처 권한 관리 리스트
	  @GetMapping("/shoppingmallApproval") 
	  public String Approval(Model model) {
	  
		  List<Shoppingmall> shoppingmallList = shoppingmallService.shoppingmallList();
		  model.addAttribute("title", "계약 및 권한 승인 페이지");
		  model.addAttribute("shoppingmallList", shoppingmallList);
		  
		  return "shoppingmall/shoppingmallApproval"; 
	  }
	  
	  // 권한 승인
	  @PostMapping("/shoppingmallApproval") 
	  public String shoppingmallApproval(Shoppingmall shoppingmall) {
	  
		  shoppingmallService.shoppingmallApproval(shoppingmall);
		  
		  return "redirect:/shoppingmallApproval"; 
	  }
	  
	  // 권한 취소
	  @PostMapping("/shoppingmallCancel")
	  public String shoppingmallCancel(Shoppingmall shoppingmall) {
		  
		  shoppingmallService.shoppingmallCancel(shoppingmall);
		  
		  return "redirect:/shoppingmallApproval";
	  }

	
  /******************************* 거래처 권한 관리 종료 *******************************/	
	
	
	
}
