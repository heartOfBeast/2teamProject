package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Contract;
import com.cafe2team.domain.ShoppingmallCalculate;

@Mapper
public interface SalesMapper {

	public List<Contract> getSalesList();
}
