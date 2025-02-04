package com.cafe2team.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe2team.domain.AdminApproval;
import com.cafe2team.domain.Member;
import com.cafe2team.domain.Shoppingmall;
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
	
//	@Autowired
//	private JavaMailSender javaMailSender;
	
	@Autowired
    private JavaMailSenderImpl javaMailSenderImpl;
	
	@Value("${spring.mail.username}")
	@Autowired
	private String from;
	
	
	 public Runnable createRunnable(final MimeMessage message) {
		 return new Runnable() {
		 	 @Override
			 public void run() {
		 		 
		 		 javaMailSenderImpl.send(message); //message에 담긴 메세지+인증코드 보내기
			 }			
		 };
	 }

	//회원 리스트 조회
	@GetMapping("/memberList")
	public String memberList(Model model,
			@RequestParam(name="levelCode", required = false) String levelCode,
			@RequestParam(name="firstDate", required = false) String firstDate , 
			@RequestParam(name="secondDate", required = false) String secondDate) {
		
	Map<String, Object> paramMap = new HashMap<String, Object>();
	
	paramMap.put("levelCode", levelCode);
	paramMap.put("firstDate", firstDate);
	paramMap.put("secondDate", secondDate);	
	
	model.addAttribute("memberList", memberService.getMemberList(paramMap));
	model.addAttribute("memberLevelCode", memberService.getMemberLevelCode());
	
	
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
	
	@PostMapping("/myShopPage")
	public String myShopPage(Shoppingmall shoppingmall) {
		
		memberService.updateShopMember(shoppingmall);
		
		return "redirect:/main";
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
			//memberService.adminIntotbAdminWare(approvalAdminId);
			memberService.adminApprovalStatusUpdate(approvalAdminId);
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
		
		Member member = memberService.getMemberInfoById(adminApprovalId);
		
		
		if(member !=null) idCheck= false;
		
		return idCheck;
	}
	
	@PostMapping("/accountMemberIdCheck")
	@ResponseBody
	public boolean accountMemberIdCheck(@RequestParam (name ="accountApprovalId", required = false) String accountApprovalId) {
		boolean idCheck = true;
		
		Shoppingmall shop = memberService.getsShopById(accountApprovalId);
		
		if(shop != null) idCheck = false;
		
		return idCheck;
		
	}
	
	
	@GetMapping("/adminsignup")
	public String adminSignUp(Model model) {
		model.addAttribute("title", "관리자 회원가입");
		
		return "signup/adminsignup";
	}
	
	@PostMapping("/adminsignup")
	public String adminSignUp(AdminApproval adminApproval) {
		
		log.info("=======================================admin컨트롤러 실행");
		
		memberService.adminSignUp(adminApproval);
		
		System.out.println(adminApproval);
		
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
				session.setAttribute("STATUS", shop.getShoppingmallStatus());
				
				String sidcehck = shop.getShoppingmallId();
				String status = shop.getShoppingmallStatus();
				
				
				log.info("========================={}" + sidcehck);
				log.info("========================={}" + status);
				
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
	
//	@RequestMapping("/memberListDetail")
//	public @ResponseBody List<Member> memberListDetail(
//			@RequestParam Map<String,Object> param,
//			@ModelAttribute("Member") Member member){
//
//		String selectLevelValue = (String)param.get("selectLevelValue");
//		
//		List<Member> data = memberService.getMemberListDetail(selectLevelValue);
//		
//		log.info("=============================== {} ", data);
//		
//		return data;
//		
//	}
	
	@GetMapping("/findId")
	public String findId() {
		
		return "member/findId";
	}
	
	
	@PostMapping("/findId")
	@ResponseBody
	public Map<String, Object> findId(@RequestParam(value = "memberEmail", required = false) String memberEmail,
						@RequestParam(value = "check", required = false) String check
						) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		if(check.equals("memberCheck")) {
			
			Member member = memberService.getAdminAjaxId(memberEmail);
			map.put("member", member);
				
		}else {
			Shoppingmall shop = memberService.getShopAjaxId(memberEmail);
			map.put("shop", shop);
		}
		
		return map;
		
		
	}
	
	@GetMapping("/adminUpdate")
	public String adminUpdate(Model model, @RequestParam(value = "memberId") String memberId) {
		
		Member member = memberService.getMemberInfoById(memberId);
		
		model.addAttribute("member", member);
	
		return "member/adminUpdate";
	}
	
	@PostMapping("/adminUpdate")
	public String adminUpdate(Member member) {
		
		memberService.updateMember(member);
		
		return "redirect:/memberList";
	}
	
	@PostMapping("/shopMemberDelete")
	@ResponseBody
	public int shopMemberDelete(	@RequestParam(value = "password") String password,
									@RequestParam(value = "shopMemberId") String shopMemberId,
									@RequestParam(value = "shopDeleteCheck") boolean shopDeleteCheck,
									HttpSession session) {
		
		String checkId = (String) session.getAttribute("SID");
		
		if(shopDeleteCheck = true && shopMemberId != "" && password != "" && shopMemberId.equals(checkId) ) {
			
			log.info("================{}",checkId);
			log.info(password);
			
			int shopWithdrawal = memberService.shopMemberDelete(password);
			
			session.invalidate();
			
			return shopWithdrawal;
			
		}else {
			
			
			return 0;
		}

	}
	
	@PostMapping("/cancleWatingAdmin")
	@ResponseBody
	public int cancleWatingAdmin(@RequestParam(value = "cancleDataArr[]") List<String> paramList) {
		
		
		int result = 0;
		
		result = memberService.cancleAdminWating(paramList);
		
		return result;
	}
	
	@GetMapping("/findPw")
	public String findPw(Model model) {
		
		return "member/findPW";
	}
	
	@PostMapping("/findPw") 
	@ResponseBody
	 public Map<String, Object> findPw(@RequestParam(name="mail", required = false) String memberEmail,
			  							@RequestParam(name = "check", required = false) String check ) throws MessagingException {
			  
			  
			  log.info("화면에서 받은 메일주소: " + memberEmail);
			  
			  Map<String, Object> map = new HashMap<String, Object>();
			  
			  String subject = "";
			  String msg = "";
			  
			  Shoppingmall shop = memberService.getShopAjaxId(memberEmail);
			  Member member = memberService.getAdminAjaxId(memberEmail);
			  
			  
			  
				  if(check.equals("memberCheck") && member != null) {
					  
					  
					  subject = "물류센터 비밀번호 입니다.";
					  msg += "<div align='center' style='border:1px solid black; font-family:verdana'>";
					  msg += "<h3 style='color: blue;'>";
					  msg += member.getMemberId() + "님의 비밀번호 입니다. 비밀번호를 변경하여 사용하세요.</h3>";
					  msg += "<p>비밀번호 : ";
					  msg += member.getMemberPw()+ "</p></div>";
					  
					    MimeMessage mimeMessage = javaMailSenderImpl.createMimeMessage();
				        mimeMessage.setFrom(new InternetAddress(from));
				        mimeMessage.addRecipient(RecipientType.TO, new InternetAddress(member.getMemberEmail()));
				        mimeMessage.setSubject(subject);
				        mimeMessage.setText(msg, "UTF-8", "html");

				        
					  Thread thread = new Thread(createRunnable(mimeMessage));
					  thread.start();
					  thread = null;
					
					  
					  
					  map.put("member", member);
					  return map;
				  }else if(check.equals("shopCheck") && shop != null) {
					  
					  
					  
					  subject = "물류센터 비밀번호 입니다.";
					  msg += "<div align='center' style='border:1px solid black; font-family:verdana'>";
					  msg += "<h3 style='color: blue;'>";
					  msg += shop.getShoppingmallId() + "님의 비밀번호 입니다. 비밀번호를 변경하여 사용하세요.</h3>";
					  msg += "<p>비밀번호 : ";
					  msg += shop.getShoppingmallPw()+ "</p></div>";
					  
					    MimeMessage mimeMessage = javaMailSenderImpl.createMimeMessage();
				        mimeMessage.setFrom(new InternetAddress(from));
				        mimeMessage.addRecipient(RecipientType.TO, new InternetAddress(shop.getShoppingmallEmail()));
				        mimeMessage.setSubject(subject);
				        mimeMessage.setText(msg, "UTF-8", "html");
					  
					  
					  Thread thread = new Thread(createRunnable(mimeMessage));
					  thread.start();
					  thread = null;
					
					  map.put("shop", shop);
					  return map;
					  
				  }else {
					  map.put("msg", "이메일과 등록된 아이디가 일치하지 않습니다");
					  return map;
				  }
				  
				  
		  }
		  
			  
		 
	  }

	
	



