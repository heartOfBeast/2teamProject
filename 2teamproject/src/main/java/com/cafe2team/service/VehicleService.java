package com.cafe2team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe2team.dao.VehicleMapper;
import com.cafe2team.domain.CarManagement;
import com.cafe2team.domain.Vehicle;

@Service
@Transactional
public class VehicleService {
	@Autowired
	private VehicleMapper vehicleMapper;
	
	public List<Vehicle> getVehicleInfo(){
		List<Vehicle> vehicle = vehicleMapper.getVehicleInfo();
		return vehicle; 		
	}
	
	public int addVehicle(Vehicle vehicle) {
		return vehicleMapper.addVehicle(vehicle);
	}
	
	public List<Vehicle> getVehicleInfoByCode(String carCode){
		List<Vehicle> vehicle = vehicleMapper.getVehicleInfoByCode(carCode);
		return vehicle;
	}
	
	public int modifyVehicle(Vehicle vehicle) {
		return vehicleMapper.modifyVehicle(vehicle);
	}
	
	public int deleteVehicle(List<String> paramList) {
		return vehicleMapper.deleteVehicle(paramList);
	}
	
	public List<CarManagement> getCarManagementInfo(String releaseOrderCode) {
		List<CarManagement> carManagement = vehicleMapper.getCarManagementInfo(releaseOrderCode);
		return carManagement;
	}
	
	public int checkCarNumber(String carNumber) {
		return vehicleMapper.checkCarNumber(carNumber);
	}	
}
