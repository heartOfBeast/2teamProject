package com.cafe2team.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe2team.dao.ReleaseMapper;
import com.cafe2team.domain.Release;

@Service
public class ReleaseService {
	@Autowired
	private ReleaseMapper releaseMapper;
	
	public List<Release> gerReleaseOrder(){
		List<Release> release = releaseMapper.gerReleaseOrder();
		return release;
	}
}
