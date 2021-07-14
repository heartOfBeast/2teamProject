package com.cafe2team.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe2team.dao.ContractMapper;
import com.cafe2team.dao.UnitPriceMapper;
import com.cafe2team.domain.Calendar;
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
	
	/*
	 * public Contract ContractInfo(String contractFinalCode) {
	 * 
	 * Contract result1 = contractMapper.ContractInfo(contractFinalCode);
	 * 
	 * return result1; }
	 */
	
	// 계약 신청 등록
	public int contractAdd(Contract contract) {
		
		int result = contractMapper.ContractAdd(contract);
		
		return result;
	}
	
	// 최종계약 캘린더
	public List<Calendar> ConreactCalendar(){
		
		
		return contractMapper.ConreactCalendar();
	}
	
	
	
}
