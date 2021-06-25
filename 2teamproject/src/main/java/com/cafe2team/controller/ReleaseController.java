package com.cafe2team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReleaseController {
	
	@GetMapping("/releaseOrder")
	public String releaseOrder(Model model) {
		model.addAttribute("title", "출고 리스트");
		return "release/releaseOrder";
	}
	
}
