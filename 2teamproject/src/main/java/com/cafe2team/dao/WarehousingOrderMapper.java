package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Receiving;
import com.cafe2team.domain.Shoppingmall;
import com.cafe2team.domain.WareSector;
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

	//모달 통해 입고
	public int receivingFromModal(Receiving receiving);

	//창고코드 통해 구역 받아오기
	public List<WareSector> getWarehouseSector(String warehouseCode);
	
	//모달 통해 입고 후 입고지시서 상태 변환
	public int changeWarehousingStatusFromModal(String warehousingOrderCode,String sectorColumnFinalCode);
	//재고테이블에 재고 추가 혹은 재고수량 수정
	public int insertOrUpdateStock(Receiving receiving);
	
	//입고지시서에서 검색조건 중 쇼핑몰명
	public List<Shoppingmall> getShoppingmallUserName();

}
