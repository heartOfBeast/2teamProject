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
		public int warehouseUpdate(Warehouse warehouse) {
			return warehouseMapper.warehouseUpdate(warehouse);
		}
	
		//창고이름 정보 가져오기
		public Warehouse getWarehouseInfoByName(String warehouseName) {
			return warehouseMapper.getWarehouseInfoByName(warehouseName);
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
}
