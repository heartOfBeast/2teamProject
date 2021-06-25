package com.cafe2team.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe2team.domain.Warehouse;
import com.cafe2team.service.WarehouseService;


@Controller
public class WarehouseController {
		
	private final WarehouseService warehouseservice;
	private static final Logger log = LoggerFactory.getLogger(MemberController.class);
	
	public WarehouseController(WarehouseService warehouseservice) {
		this.warehouseservice = warehouseservice;
	}
	
		@GetMapping("/warehouseUpdate")
		public String getWarehouseUpdate(Model model) {
			model.addAttribute("title", "창고정보수정");
			
			return "warehouse/warehouseUpdate";
			
		}
	
	
		
		@PostMapping("/warehouseNameCheck")
		@ResponseBody
		public boolean warehouseNameCheck(@RequestParam(name="warehouseName", required = false) String warehouseName) {
			boolean idCheck = true;
			
			//namecheck 중복된 아이디있는 경우에는 false
			Warehouse warehouse = warehouseservice.getWarehouseInfoByName(warehouseName);
			
			if(warehouse != null) idCheck = false;
			
			return idCheck;
		}
		
		@GetMapping("/warehouseList")
		public String getWarehouseList(Model model) {
			
			List<Warehouse> warehouseList = warehouseservice.getWarehouseList();
			model.addAttribute("title", "창고조회");
			model.addAttribute("warehouseList", warehouseList);
			
			return "warehouse/warehouseList";
		}
		
		@PostMapping("/addWarehouse")
			public String addWarehouse(Warehouse warehouse) {
			
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

