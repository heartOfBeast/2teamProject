package com.cafe2team.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cafe2team.domain.Warehouse;
import com.cafe2team.service.WarehouseService;


@Controller
public class WarehouseController {
		
	private final WarehouseService warehouseservice;
	private static final Logger log = LoggerFactory.getLogger(MemberController.class);
	
	public WarehouseController(WarehouseService warehouseservice) {
		this.warehouseservice = warehouseservice;
	}
	
		@PostMapping("/warehouseCheck")
		@ResponseBody
		public boolean warehouseCheck(@RequestParam(name="warehouseName", required = false) String warehouseName){
			boolean nameCheck = true;
			
			Warehouse warehouse = warehouseservice.getWarehouseInfoByName(warehouseName);
			
			if(warehouse != null) nameCheck = false;
			
			return nameCheck;
		}
	
		@PostMapping("/warehouseUpdate")
		public String getWarehouseUpdate(Warehouse warehouse) {

			warehouseservice.warehouseUpdate(warehouse);
			
			return null;
		}
	
		@GetMapping("/warehouseUpdate")
		public String warehouseUpdate(Model model) {
			model.addAttribute("title", "창고정보수정");
			
			return "warehouse/warehouseUpdate";
			
		}
	
		
		@GetMapping("/warehouseList")
		public String getWarehouseList(Model model) {
			
			List<Warehouse> warehouseList = warehouseservice.getWarehouseList();
			model.addAttribute("title", "창고조회");
			model.addAttribute("warehouseList", warehouseList);
			
			return "warehouse/warehouseList";
		}
		
		@PostMapping("/addWarehouse")
			public String addWarehouse(Warehouse warehouse,
					HttpSession session, RedirectAttributes reAttr) {
			
			String adminId = (String) session.getAttribute("SID");
			if(adminId != null) {
				warehouse.setWareAdminId(adminId);
				warehouseservice.addWarehouse(warehouse);
				reAttr.addAttribute("wareAdminId", adminId);
			}
				warehouseservice.addWarehouse(warehouse);
				log.info("warehouse",warehouse);
				
				return "redirect:/warehouseList";
		}
		
		@GetMapping("/addWarehouse")
		public String getAddWarehouse(Model model) {
			
			model.addAttribute("title", "창고등록");
			return "warehouse/addWarehouse";
		}

			
		
}

