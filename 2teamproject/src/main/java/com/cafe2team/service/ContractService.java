package com.cafe2team.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe2team.dao.ContractMapper;
import com.cafe2team.dao.UnitPriceMapper;
import com.cafe2team.domain.Contract;
import com.cafe2team.domain.Price;


@Service
@Transactional
public class ContractService {

	private final ContractMapper contractMapper;
	private final UnitPriceMapper unitPriceMapper;
	
	public ContractService(ContractMapper contractMapper, UnitPriceMapper unitPriceMapper) {
		this.contractMapper = contractMapper;
		this.unitPriceMapper = unitPriceMapper;
	}
	
	// 최종 계약 리스트 
	public List<Contract> ContractList(){
		
		List<Contract> contractList = contractMapper.ContractList();
		
		return contractList;
	}
	
	// 계약신청을 위한 조회
	public Price priceInfo(String priceCode) {
		
		Price result = unitPriceMapper.priceInfo(priceCode);
		
		return result;
	}
	
	
	// 계약 신청 등록
	
	public int contractAdd(Contract contract) {
	  
	  int result = contractMapper.ContractAdd(contract);
	  
	  return result; 
	}
	 
	
	// 계약 승인
	public int contractApproval(Contract contract) {
		
		int result = contractMapper.contractApproval(contract);
		
		return result;
	}
	
	// 계약 승인 취소
	public int contractCancel(Contract contract) {
		
		int result = contractMapper.contractCancel(contract);
		
		return result;
	}
	
	// 계약 검색기능
	public List<Contract> contractState(Map<String, Object> paramMap){
		
		return contractMapper.contractState(paramMap);
	}
	
	
	// 최종계약 캘린더
	public List<Map<String, Object>>CalendarList(){
	
		return contractMapper.CalendarList();
	};


	
	
	
}
