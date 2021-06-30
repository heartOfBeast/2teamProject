package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Expenditure;

@Mapper
public interface ExpenditureMapper {

	 public List<Expenditure> getExpenditureList();
	 
	 public int expenditureinsert(Expenditure expenditure);
	 
	 public int expenditureDeleteByCode(String paramList);
}
