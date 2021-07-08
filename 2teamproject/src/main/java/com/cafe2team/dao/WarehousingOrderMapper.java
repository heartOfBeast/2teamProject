package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.WarehousingOrder;

@Mapper
public interface WarehousingOrderMapper {

	//입고지시서 목록
	public List<WarehousingOrder> getWarehousingOrderList();
	
	//입고취소
	public int cancleEntering(String warehousingOrderCode);
}
