package com.cafe2team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe2team.dao.WarehouseMapper;
import com.cafe2team.domain.Warehouse;

@Service
public class WarehouseService {
	
	@Autowired
	private WarehouseMapper warehouseMapper;
		
		//창고정보 수정
		public int warehouseUpdateModal(Warehouse warehouse) {
			
			return warehouseMapper.warehouseUpdateModal(warehouse);
		}
	
		//창고 정보 가져오기
		public Warehouse getWarehouseInfoByCode(String warehouseCode) {
			return warehouseMapper.getWarehouseInfoByCode(warehouseCode);
		}
		
		//창고주소 가져오기
		public List<Warehouse> getWarehouseListDetailAddr(String warehouse_addr){
			List<Warehouse> warehouseListDetailAddr = warehouseMapper.getWarehouseListDetailAddr(warehouse_addr);
			return warehouseListDetailAddr;
		}
		//창고이름 가져오기
		public List<Warehouse> getWarehouseListDetailName(String warehouse_addr, String warehouse_name){
			List<Warehouse> warehouseListDetailName = warehouseMapper.getWarehouseListDetailName(warehouse_addr, warehouse_name);
			return warehouseListDetailName;
		}
		//창고종류 가져오기
		public List<Warehouse> getWarehouseListDetailCate(String warehouse_name, String warehouse_addr, String warehouse_cate){
			List<Warehouse> warehouseListDetailCate = warehouseMapper.getWarehouseListDetailCate(warehouse_name, warehouse_addr, warehouse_cate);
			return warehouseListDetailCate;
		}
		
		//창고조회
		public List<Warehouse> getWarehouseList() {
			List<Warehouse> warehouseList = warehouseMapper.getWarehouseList();
			return warehouseList;
		}
		
		//창고등록
		public int addWarehouse(Warehouse warehouse) {
			int result = warehouseMapper.addWarehouse(warehouse);
			return result;
		}
		
		//창고섹터등록
		public int addWarehouseSector(Warehouse warehouse) {
			int result = warehouseMapper.addWarehouseSector(warehouse);
			return result;
		}
		
		//창고최종위치등록
		public int addWarehouseFinalSector(Warehouse warehouse) {
			int result = warehouseMapper.addWarehouseFinalSector(warehouse);
			return result;
		}
		
		//창고위치
		public List<Warehouse> getWarehouseLocation() {
			List<Warehouse> getWarehouseLocation = warehouseMapper.getWarehouseLocation();
			return getWarehouseLocation;
		}
		
}
