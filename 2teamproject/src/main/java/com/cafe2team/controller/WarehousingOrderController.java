package com.cafe2team.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe2team.service.WarehousingOrderService;

@Controller
public class WarehousingOrderController {
	private final WarehousingOrderService warehousingOrderService;
	@Autowired
	public WarehousingOrderController(WarehousingOrderService warehousingOrderService) {
		this.warehousingOrderService = warehousingOrderService;
	}
	
	private static final Logger log = LoggerFactory.getLogger(WarehousingOrderController.class);

	@PostMapping("/cancleEntering")
	@ResponseBody
	public int cancleEntering(@RequestParam(value = "dataArr[]")String[] warehousingOrderCode) {
		int result = 1;
		int size = warehousingOrderCode.length;
		for(int i = 0; i<size;i++) {
			warehousingOrderService.cancleEntering(warehousingOrderCode[i]);
		}
		return result;
		
	}
}
