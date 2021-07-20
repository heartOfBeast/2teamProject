package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Expenditure;

@Mapper
public interface ExpenditureMapper {

	 public List<Expenditure> getExpenditureList();
	 
	 public int expenditureinsert(Expenditure expenditure);
	 
	 public int expenditureDeleteByCode(List<String> paramList);

	 public List<Expenditure> getCaculate();

	 public List<Expenditure> getsales();

	 //수정
	public int modifyExpenditure(Expenditure expenditure);

	//연도조회
	public List<Expenditure> getExpenseYear(String expenditure_data);
}
