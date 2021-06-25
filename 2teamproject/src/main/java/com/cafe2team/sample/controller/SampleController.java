package com.cafe2team.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop")
public class SampleController {
	
	@GetMapping("/sample")
	public String sample(Model model) {
		
		return "sample/sample";
	}
}
