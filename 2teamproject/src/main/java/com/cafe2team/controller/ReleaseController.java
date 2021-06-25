package com.cafe2team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReleaseController {
	
	@GetMapping("/releaseApproval")
	public String releaseApproval(Model model) {
		model.addAttribute("title", "출고 승인");
		return "release/releaseApproval";
	}
	
	@GetMapping("/releaseInstructional")
	public String releaseInstructional(Model model) {
		model.addAttribute("title", "출고지시서");
		return "release/releaseInstructional";
	}

	@GetMapping("/releaseList")
	public String releaseLIst(Model model) {
		model.addAttribute("title", "출고리스트");
		return "release/releaseList";
	}

	@GetMapping("/customerReleaseList")
	public String customerReleaseList(Model model) {
		model.addAttribute("title", "출고리스트");
		return "release/customerReleaseList";
	}

	@GetMapping("/addWaybill")
	public String addWaybill(Model model) {
		model.addAttribute("title", "운송장등록");
		return "release/addWaybill";
	}

	@GetMapping("/searchWaybill")
	public String searchWaybill(Model model) {
		model.addAttribute("title", "운송장조회");
		return "release/searchWaybill";
	}

	@GetMapping("/assignmentInformation")
	public String assignmentInformation(Model model) {
		model.addAttribute("title", "운송장조회");
		return "release/assignmentInformation";
	}

	@GetMapping("/addShippingTime")
	public String addShippingTime(Model model) {
		model.addAttribute("title", "배송시간등록");
		return "release/addShippingTime";
	}
}
