package com.cafe2team.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe2team.domain.Release;
import com.cafe2team.service.ReleaseService;

@Controller
public class ReleaseController {
	
	
	private static final Logger log = LoggerFactory.getLogger(ReleaseController.class);

	private final ReleaseService releaseService;
	
	@Autowired
	public ReleaseController (ReleaseService releaseService) {
		this.releaseService = releaseService;
	}
	
	@PostConstruct
	public void safetyCheckControllerInit() {
		log.info("=============================");
		log.info("ReleaseController 객체 생성");
		log.info("=============================");
	}
	
	@GetMapping("/releaseOrder")
	public String releaseOrder(Model model) {
		
		List<Release> release = releaseService.gerReleaseOrder();
		model.addAttribute("title", "출고 리스트");
		model.addAttribute("release", release);
		return "release/releaseOrder";
	}
	
}
