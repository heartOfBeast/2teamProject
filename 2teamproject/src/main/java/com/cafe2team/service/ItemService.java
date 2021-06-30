package com.cafe2team.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe2team.dao.ItemMapper;
import com.cafe2team.domain.Item;

@Service
public class ItemService {

	private static final Logger log = LoggerFactory.getLogger(ProductService.class);
	
	@Autowired
	private ItemMapper itemMapper;
	
	//품목리스트
	public List<Item> getItemList(){
		List<Item> itemList = itemMapper.getItemList();
		return itemList;
	}
}
