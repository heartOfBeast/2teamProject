package com.cafe2team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WareHousingController {
	
	@GetMapping("/receivingRequest")
	public String receivingRequest(Model model) {
		
		return "warehousing/receivingRequest";
	}
	
	@GetMapping("/receivingOrder")
	public String receivingOrder(Model model) {
		
		return "warehousing/receivingOrder";
	}
	
	@GetMapping("/receivingWarehouseStatus")
	public String receivingWarehouseStatus(Model model) {
		
		return "warehousing/receivingWarehouseStatus";
	}
	@GetMapping("/receivingShopStatus")
	public String receivingShopStatus(Model model) {
		
		return "warehousing/receivingShopStatus";
	}
}
