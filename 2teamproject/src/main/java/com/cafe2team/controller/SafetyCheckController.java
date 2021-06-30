package com.cafe2team.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cafe2team.domain.SafetyCheck;
import com.cafe2team.domain.Warehouse;
import com.cafe2team.service.SafetyCheckService;

@Controller
public class SafetyCheckController {
	
	private static final Logger log = LoggerFactory.getLogger(SafetyCheckController.class);
	
	private final SafetyCheckService safetyCheckService;
	
	@Autowired
	public SafetyCheckController(SafetyCheckService safetyCheckService) {
		this.safetyCheckService = safetyCheckService;
	}
	
	@PostConstruct
	public void safetyCheckControllerInit() {
		log.info("=============================");
		log.info("SafetyCheckControllerr 객체 생성");
		log.info("=============================");
	}
	
	//전체조회
	@GetMapping("/safetyCheck")
	public String safetyCheck(Model model) {
		List<SafetyCheck> safetyCheck = safetyCheckService.getSafetyCheck();
		model.addAttribute("title", "안전점검 내역조회");
		model.addAttribute("safetyCheck", safetyCheck);
		return "safe/safetyCheck";
	}
	
	//등록화면
	@GetMapping("/safetyCheckAdd")
	public String safetyCheckAdd(Model model) {
		List<Warehouse> warehouse = safetyCheckService.getWareHouseInfo();
		model.addAttribute("title", "안전점검등록");
		model.addAttribute("warehouse", warehouse);
		log.info("warehouse: {}", warehouse);
		return "safe/safetyCheckAdd";
	}
	
	//등록실행
	@PostMapping("/safetyCheckAdd")
	public String safetyCheckAdd(SafetyCheck safetyCheck, HttpSession session, RedirectAttributes reAttr) {
		String addAdminID = (String) session.getAttribute("SID");
		if(addAdminID != null) {
			safetyCheck.setWareAdminId(addAdminID);
			safetyCheckService.addSafetyCheck(safetyCheck);
			reAttr.addAttribute("wareAdminId", addAdminID);
			log.info("safetyCheck : {}", safetyCheck);
		}
		return "redirect:/safetyCheck";
	}
	
	//수정화면
	@GetMapping("/modifySafetyCheck")
	public String modifySafetyCheck(Model model, @RequestParam(name = "facilityCode" ,required = false)String facilityCode) {
		log.info("=============================");
		log.info("facilityCode : {}", facilityCode);
		log.info("=============================");
		SafetyCheck safetyCheck = safetyCheckService.getSafetyCheckById(facilityCode);
		List<Warehouse> warehouse = safetyCheckService.getWareHouseInfo();
		model.addAttribute("title", "안전점검수정");
		model.addAttribute("safetyCheck", safetyCheck);
		model.addAttribute("warehouse", warehouse);
		return "safe/modifySafetyCheck";
	}
	
	//삭제
	@PostMapping("/deleteSafetyCheck")
	@ResponseBody
	public int deleteSafetyCheck(@RequestParam(value="dataArr[]") String[] paramList) {
		int result = 1;
		System.out.println(paramList);
		int size = paramList.length;
		for(int i=0; i<size; i++) {
			log.info(paramList[i] + " <-삭제할 값");
			safetyCheckService.deleteSafetyCheck(paramList[i]);
		}
		return result;
	}
}
