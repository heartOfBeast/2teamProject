package com.cafe2team.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafe2team.domain.Item;
import com.cafe2team.service.ItemService;

@Controller
public class ItemController {
	
	private static final Logger log = LoggerFactory.getLogger(ProductController.class);

	private final ItemService itemService;
	
	public ItemController(ItemService itemService) {
		this.itemService = itemService;
	}
	
	
	

	//품목리스트
	@GetMapping("/itemList")
	public String itemList(Model model) {
		List<Item> itemList = itemService.getItemList();
		model.addAttribute("title", "품목리스트");
		model.addAttribute("itemList", itemList);
		
		return "item/itemList";
	}
}
