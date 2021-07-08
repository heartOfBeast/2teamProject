package com.cafe2team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe2team.dao.WarehousingOrderMapper;
import com.cafe2team.domain.WarehousingOrder;



@Service
public class WarehousingOrderService {

	@Autowired
	private WarehousingOrderMapper warehousingOrderMapper;
	
	
	//입고지시서 목록
	public List<WarehousingOrder> getWarehousingOrderList(){
		List<WarehousingOrder> getWarehousingOrderList = warehousingOrderMapper.getWarehousingOrderList();
		return getWarehousingOrderList;
	}
	
	//입고취소
	public int cancleEntering(String warehousingOrderCode) {
		return warehousingOrderMapper.cancleEntering(warehousingOrderCode);
	}
}
