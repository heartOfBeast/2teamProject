package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Receiving;
import com.cafe2team.domain.WarehousingOrder;

@Mapper
public interface WarehousingOrderMapper {

	
	//입고지시서 목록
	public List<WarehousingOrder> getWarehousingOrderList();
	
	//입고취소
	public int cancleEntering(String warehousingOrderCode);
	
	//입고 현황 리스트
	public List<Receiving> getReceivingList();
	
	//입고 후 입고지시서 상태 변환
	public int changeWarehousingStatus(List<String> confirmWarehousingDataArr);
	
	//입고 후 입고테이블 데이터 저장
	public int addReceiving(List<String> confirmWarehousingDataArr);


}
