package com.cafe2team.sample.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cafe2team.sample.domain.Sample;
import com.cafe2team.sample.service.SampleService;

@Controller
@RequestMapping("/shop")
public class SampleController {
	
	private final SampleService sampleService;
	
	public SampleController(SampleService sampleService) {
		this.sampleService = sampleService;
	}
	
	// 샘플 출고 요청 리스트
	@GetMapping("/sample")
	public String sample(Model model) {
		
	List<Sample> sampleList = sampleService.getSampleList();
		
	model.addAttribute("title", "샘플 쇼핑몰 출고요청"); 
	model.addAttribute("sampleList", sampleList);
	
	System.out.println(sampleList + "@@@@@@@@@@@@@@@@@@@@");
		 
	return "sample/sample";
	
	}
}
