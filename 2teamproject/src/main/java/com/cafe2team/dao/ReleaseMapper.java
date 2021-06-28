package com.cafe2team.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Release;

@Mapper
public interface ReleaseMapper {
	public List<Release> gerReleaseOrder();
}
