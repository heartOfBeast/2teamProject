package com.cafe2team.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe2team.domain.CarManagement;
import com.cafe2team.domain.Delivery;
import com.cafe2team.domain.Invoice;
import com.cafe2team.domain.Release;
import com.cafe2team.domain.Vehicle;
import com.cafe2team.service.ReleaseService;
import com.cafe2team.service.VehicleService;

@Controller
public class ReleaseController {
	
	
	private static final Logger log = LoggerFactory.getLogger(ReleaseController.class);

	private final ReleaseService releaseService;
	private final VehicleService vehicleService;
	
	@Autowired
	public ReleaseController (ReleaseService releaseService, VehicleService vehicleService) {
		this.releaseService = releaseService;
		this.vehicleService = vehicleService;
	}
	
	//출고지시서 조회
	@GetMapping("/releaseOrder")
	public String releaseOrder(Model model) {
		
		List<Release> release = releaseService.gerReleaseOrder();
		List<Vehicle> vehicle = vehicleService.getVehicleInfo();
		List<Delivery> delivery = releaseService.getDeliveryInfo();
		/* List<CarManagement> carManagement = releaseService.getDriveManagement(); */
		model.addAttribute("title", "출고 리스트");
		model.addAttribute("release", release);
		model.addAttribute("vehicle", vehicle);
		model.addAttribute("delivery", delivery);
		/* model.addAttribute("carManagement", carManagement); */
		return "release/releaseOrder";
	}
	
	//배차등록
	@PostMapping("/addDriveManagement")
	public String addDriveManagement(CarManagement carManagement, HttpSession session) {
		String AdminId = (String) session.getAttribute("SID");
		if(AdminId != null) {
			carManagement.setWareAdminId(AdminId);
			releaseService.addDriveManagement(carManagement);
		}
		return "redirect:/releaseOrder";
	}
	
	//배차수정
	@PostMapping("/modifyDriveManagement")
	public String modifyDriveManagement(CarManagement carManagement, HttpSession session){
		String addAdminID = (String) session.getAttribute("SID");
		if(addAdminID != null) {
			carManagement.setWareAdminId(addAdminID);
			releaseService.modifyDriveManagement(carManagement);
			log.info("carManagement : {}", carManagement);
		}
		return "redirect:/releaseOrder";
	}
	
	//운송장등록
	@PostMapping("/addInvoice")
	public String addInvoice(Invoice invoice, HttpSession session) {
		String addAdminID = (String) session.getAttribute("SID");
		if(addAdminID != null) {
			invoice.setWareAdminId(addAdminID);
			releaseService.addInvoice(invoice);
			log.info("invoice : {}", invoice);
		}
		return "redirect:/releaseOrder";
	}
}
