package com.cafe2team.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.CarManagement;
import com.cafe2team.domain.Vehicle;

@Mapper
public interface VehicleMapper {
	//전체조회
	public List<Vehicle> getVehicleInfo(Map<String, Object> carKindParam);
	
	//등록
	public int addVehicle(Vehicle vehicle);
	
	//수정화면
	public List<Vehicle> getVehicleInfoByCode(String carCode);
	
	//수정
	public int modifyVehicle(Vehicle vehicle);
	
	//삭제
	public int deleteVehicle(List<String> paramList);
	
	//배차내역조회
	public List<CarManagement> getCarManagementInfo(String releaseOrderCode);
	
	//차량번호중복체크
	public int checkCarNumber(String carNumber);
}
