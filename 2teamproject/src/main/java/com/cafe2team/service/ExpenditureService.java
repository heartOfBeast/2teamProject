package com.cafe2team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe2team.dao.ExpenditureMapper;
import com.cafe2team.domain.Expenditure;

@Service
public class ExpenditureService {

 @Autowired
 private final ExpenditureMapper expenditureMapper;
 
 	public ExpenditureService(ExpenditureMapper expenditureMapper) {
 		this.expenditureMapper = expenditureMapper;
 	}
 	
 	
 	 public List<Expenditure> getExpenditureList(){
 		 
 		List<Expenditure> expenditureList = expenditureMapper.getExpenditureList();
 		
 		return expenditureList;
 	 }
 	 
 	 public int expenditureinsert(Expenditure expenditure) {
 		 int result = expenditureMapper.expenditureinsert(expenditure);
 		 
 		 return result;
 	 }
}
