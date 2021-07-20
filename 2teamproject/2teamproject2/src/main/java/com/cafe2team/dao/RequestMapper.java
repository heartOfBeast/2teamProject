package com.cafe2team.dao;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Request;

@Mapper
public interface RequestMapper {

	//입고대기에 추가
	public int addRequestWait(Request request);
	
}
