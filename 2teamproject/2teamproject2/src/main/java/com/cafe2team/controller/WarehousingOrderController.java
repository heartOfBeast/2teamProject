package com.cafe2team.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	//입고확정
	@PostMapping("/confirmWarehousing")
	@ResponseBody
	public Map<String,Object> entering(@RequestParam(value = "confirmWarehousingDataArr[]")List<String> confirmWarehousingDataArr) {
		Map<String,Object> paramMap = new HashMap<String, Object>();
		
		String changeWarehousingOrderStatus = warehousingOrderService.changeWarehousingStatus(confirmWarehousingDataArr)+"";
		int addReceiving = warehousingOrderService.addReceiving(confirmWarehousingDataArr);
		
		paramMap.put("changeWarehousingOrderStatus", changeWarehousingOrderStatus);
		paramMap.put("addReceiving", addReceiving);
		
		return paramMap;
	}
	
	
	//입고 취소
	@PostMapping("/cancleWarehousing")
	@ResponseBody
	public int cancleEntering(@RequestParam(value = "cancleDataArr[]")String[] warehousingOrderCode) {
		int result = 1;
		int size = warehousingOrderCode.length;
		for(int i = 0; i<size;i++) {
			warehousingOrderService.cancleEntering(warehousingOrderCode[i]);
		}
		return result;
		
	}
	
	//입고현황리스트
	
}
