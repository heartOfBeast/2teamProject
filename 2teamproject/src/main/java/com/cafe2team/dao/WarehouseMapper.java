package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Warehouse;

@Mapper
public interface WarehouseMapper {
	
	//창고정보조회
	public Warehouse getWarehouseInfoByName(String warehouseName);
	//창고조회
	public List<Warehouse> getWarehouseList();
	//창고등록
	public int addWarehouse(Warehouse warehouse);
	
	
}
