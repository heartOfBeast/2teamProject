package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Item;

@Mapper
public interface ItemMapper {

	//품목리스트
	public List<Item> getItemList();
}
