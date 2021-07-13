package com.cafe2team.dao;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Calendar;
import com.cafe2team.domain.Contract;



@Mapper
public interface ContractMapper {
	
	// 최종 계약 리스트 
	public List<Contract> ContractList();
	
	/* public Contract ContractInfo(String contractFinalCode); */
	
	// 계약 신청 등록
	public int ContractAdd(Contract contract);
	
	// 최종계약 캘린더
	public List<Calendar> ConreactCalendar();
	
}
