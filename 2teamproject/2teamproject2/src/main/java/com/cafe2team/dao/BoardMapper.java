package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Notice;

@Mapper
public interface BoardMapper {

	public List<Notice> getNoticeList(); 
}
