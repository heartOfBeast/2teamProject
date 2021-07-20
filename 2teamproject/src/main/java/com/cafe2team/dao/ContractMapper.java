package com.cafe2team.dao;



import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Contract;



@Mapper
public interface ContractMapper {
	
	// 최종 계약 리스트 
	public List<Contract> ContractList();
	
	/* public Contract ContractInfo(String contractFinalCode); */
	
	// 계약 신청 등록
	public int ContractAdd(Contract contract);
	
	// 계약 승인
	public int contractApproval(Contract contract);

	// 계약 승인 취소
	public int contrcatCancel(Contract contract);
	
	// 최종계약 캘린더
	public List<Map<String, Object>> CalendarList();


	
}
