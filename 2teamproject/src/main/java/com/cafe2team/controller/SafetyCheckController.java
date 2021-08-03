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
	public String safetyCheck(Model model ,@RequestParam(name="warehouseCode", required = false) String warehouseCode
								,@RequestParam(name="firstDate", required = false) String firstDate , @RequestParam(name="secondDate", required = false) String secondDate) {
		Map<String, Object> warehouseCodeParam = new HashMap<String, Object>();
		warehouseCodeParam.put("warehouseCode", warehouseCode);
		warehouseCodeParam.put("firstDate", firstDate);
		warehouseCodeParam.put("secondDate", secondDate);
		List<SafetyCheck> safetyCheck = safetyCheckService.getSafetyCheck(warehouseCodeParam);
		List<Warehouse> warehouse = safetyCheckService.getWareHouseInfo();
		model.addAttribute("title", "안전점검 내역조회");
		model.addAttribute("safetyCheck", safetyCheck);
		model.addAttribute("warehouse", warehouse);
		return "safe/safetyCheck";
	}
	
	//등록화면
	@GetMapping("/safetyCheckAdd")
	public String safetyCheckAdd(Model model) {
		List<Warehouse> warehouse = safetyCheckService.getWareHouseInfo();
		model.addAttribute("title", "안전점검등록");
		model.addAttribute("warehouse", warehouse);
		return "safe/safetyCheckAdd";
	}
	
	//등록실행
	@PostMapping("/safetyCheckAdd")
	public String safetyCheckAdd(SafetyCheck safetyCheck, HttpSession session) {
		String addAdminID = (String) session.getAttribute("SID");
		if(addAdminID != null) {
			safetyCheck.setWareAdminId(addAdminID);
			safetyCheckService.addSafetyCheck(safetyCheck);
			log.info("safetyCheck : {}", safetyCheck);
		}
		return "redirect:/safetyCheck";
	}
	
	//수정화면
	@GetMapping("/modifySafetyCheck") 
	@ResponseBody
	public List<SafetyCheck> modifySafetyCheck(@RequestParam(name = "facilityCode" ,required = false)String facilityCode){
		List<SafetyCheck> safetyCheck = safetyCheckService.getSafetyCheckById(facilityCode); 
		return safetyCheck; 
	}
	
	
	//수정실행
	@PostMapping("/modifySafetyCheck")
	public String modifySafetyCheck(SafetyCheck safetyCheck, HttpSession session) {
		String addAdminID = (String) session.getAttribute("SID");
		if(addAdminID != null) {
			safetyCheck.setWareAdminId(addAdminID);
			safetyCheckService.modifySafeCheck(safetyCheck);
			log.info("safetyCheck : {}", safetyCheck);
		}
		return "redirect:/safetyCheck";
	}
	
	//삭제
	@PostMapping("/deleteSafetyCheck")
	@ResponseBody
	public int deleteSafetyCheck(@RequestParam(value="dataArr[]") List<String> paramList) {
		int result = 0;
		result = safetyCheckService.deleteSafetyCheck(paramList);
		return result;
	}
}
