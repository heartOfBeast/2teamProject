package com.cafe2team.sample.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	return "sample/sample";
	
	}
	
	// 출고 요청 배열받기
	@PostMapping(value = "/samplePull")
	@ResponseBody
	public Map<String,Object> samplePush(@RequestParam(value = "pushDataArray[]") List<String> pushDataArray) {
		System.out.println("들어옴");
		System.out.println(pushDataArray);
		
		//01 update 
		//02 select 후 insert subquery 실행
		Map<String,Object> map = new HashMap<String,Object>();
		
		String sampleUpdate = sampleService.sampleUpdate(pushDataArray)+"";
		int sampleInsert = sampleService.sampleInsert(pushDataArray);
		
		map.put("sampleUpdate", sampleUpdate);
		map.put("sampleInsert", sampleInsert);
		System.out.println(map);
		
		
		return map;
	}
	
	
	
	
	@GetMapping("/releasePush")
	public String release() {
		
		return "sample/releasePush";
	}
}
