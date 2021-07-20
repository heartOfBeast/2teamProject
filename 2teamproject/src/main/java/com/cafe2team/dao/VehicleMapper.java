package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.CarManagement;
import com.cafe2team.domain.Vehicle;

@Mapper
public interface VehicleMapper {
	//전체조회
	public List<Vehicle> getVehicleInfo();
	
	//등록
	public int addVehicle(Vehicle vehicle);
	
	//수정
	public int modifyVehicle(Vehicle vehicle);
	
	//삭제
	public int deleteVehicle(List<String> paramList);
	
	//배차내역조회
	public List<CarManagement> getCarManagementInfo(String releaseOrderCode);
}
