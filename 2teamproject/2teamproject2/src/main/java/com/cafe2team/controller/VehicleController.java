package com.cafe2team.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe2team.domain.Vehicle;
import com.cafe2team.service.VehicleService;

@Controller
public class VehicleController {
	
	
	private static final Logger log = LoggerFactory.getLogger(VehicleController.class);

	
	@Autowired
	private final VehicleService vehicleService;
	
	public VehicleController(VehicleService vehicleService) {
		this.vehicleService = vehicleService;
	}
	//차량조회화면
	@GetMapping("/vehicleList")
	public String vehicleList(Model model) {
		List<Vehicle> vehicle = vehicleService.getVehicleInfo();
		model.addAttribute("title", "차량목록 조회");
		model.addAttribute("vehicle", vehicle);
		return "vehicle/vehicleList";
	}
	
	//등록화면
	@GetMapping("/vehicleAdd")
	public String vehicleAdd(Model model) {
		model.addAttribute("title", "차량등록");
		return "vehicle/vehicleAdd";
	}
	
	//등록실행
	@PostMapping("/vehicleAdd")
	public String vehicleAdd(Vehicle vehicle, HttpSession session) {
		String addAdminID = (String) session.getAttribute("SID");
		if(addAdminID != null) {
			vehicle.setWareAdminId(addAdminID);
			vehicleService.addVehicle(vehicle);
			log.info("vehicle : {}", vehicle);
		}
		return "redirect:/vehicleList";
	}
	
	//수정실행
	@PostMapping("modifyVehicle")
	public String modifyVehicle(Vehicle vehicle, HttpSession session) {
		String addAdminID = (String) session.getAttribute("SID");
		if(addAdminID != null) {
			vehicle.setWareAdminId(addAdminID);
			vehicleService.modifyVehicle(vehicle);
		}
		return "redirect:/vehicleList";
	}
	
	//삭제
	@PostMapping("deleteVehicle")
	@ResponseBody
	public int deleteVehicle(@RequestParam(value="dataArr[]") List<String> paramList) {
		int result = 0;
		result = vehicleService.deleteVehicle(paramList);
		return result;
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
