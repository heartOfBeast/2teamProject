package com.cafe2team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VehicleController {
	
	@GetMapping("/vehicleList")
	public String vehicleList(Model model) {
		model.addAttribute("title", "차량목록 조회");
		return "vehicle/vehicleList";
	}
	
	@GetMapping("/vehicleAdd")
	public String vehicleAdd(Model model) {
		model.addAttribute("title", "차량등록");
		return "vehicle/vehicleAdd";
	}
	
	@PostMapping("/vehicleAdd")
	public String vehicleAdd() {
		return "redirect:/vehicleList";
	}
	
	@PostMapping("/vehicleList")
	public String vehicleList() {
		return "redirect:/vehicleList";
	}
	
	@GetMapping("/modifyVehicle")
	public String modifyVehicle(Model model) {
		model.addAttribute("title", "차량수정");
		return "vehicle/modifyVehicle";
	}
	
	
	
	@GetMapping("/dispatchList")
	public String dispatchList(Model model) {
		model.addAttribute("title", "배차조회");
		return "vehicle/dispatchList";
	}
	
	@GetMapping("/modifyDispatch")
	public String modifyDispatch(Model model) {
		model.addAttribute("title", "배차수정");
		return "vehicle/modifyDispatch";
	}
	
	@PostMapping("/dispatchList")
	public String modifyDispatch() {
		return "redirect:/dispatchList";
	}
}
