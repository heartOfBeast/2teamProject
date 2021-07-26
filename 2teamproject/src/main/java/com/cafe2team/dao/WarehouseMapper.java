package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Warehouse;

@Mapper
public interface WarehouseMapper {
	
	//창고정보수정
	public int warehouseUpdateModal(Warehouse warehouse);
	//창고정보조회
	public Warehouse getWarehouseInfoByCode(String warehouseCode);
	//
	public List<Warehouse> getWarehouseListDetailAddr(String warehouse_addr);
	
	public List<Warehouse> getWarehouseListDetailName(String warehouse_addr, String warehouse_name);
	
	public List<Warehouse> getWarehouseListDetailCate(String warehouse_name, String warehouse_addr, String warehouse_cate);
	//창고조회
	public List<Warehouse> getWarehouseList();
	//창고등록
	public int addWarehouse(Warehouse warehouse);
	//창고구역등록(admin003,id004,사용가능)
	public int addWarehouseSector(Warehouse warehouse);
	
	public List<Warehouse> getWarehouseLocation();
}
