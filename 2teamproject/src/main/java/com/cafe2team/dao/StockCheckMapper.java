package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.StockCheck;

@Mapper
public interface StockCheckMapper {

	public List<StockCheck> getStockCheckList();
}
