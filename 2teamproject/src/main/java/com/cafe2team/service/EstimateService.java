package com.cafe2team.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe2team.dao.EstimateMapper;
import com.cafe2team.domain.Estimate;

@Service
public class EstimateService {

@Autowired
private EstimateMapper estimateMapper;

	public int addEstimateAnother(Estimate estimate) {
		int result = estimateMapper.addEstimateAnother(estimate);
		
		return result;
	}
}
