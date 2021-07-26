package com.cafe2team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe2team.dao.WarehousingOrderMapper;
import com.cafe2team.domain.Receiving;
import com.cafe2team.domain.Shoppingmall;
import com.cafe2team.domain.WareSector;
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
	
	//입고 현황 리스트
	public List<Receiving> getReceivingListForWarehouse(){
		return warehousingOrderMapper.getReceivingList();
	}
	
	//입고 확정후 입고지시서 상태 변환
	public int changeWarehousingStatus(List<String> confirmWarehousingDataArr) {
		return warehousingOrderMapper.changeWarehousingStatus(confirmWarehousingDataArr);
	}
	//입고 확정 후 입고 테이블 데이터 저장
	public int addReceiving(List<String> confirmWarehousingDataArr) {
		return warehousingOrderMapper.addReceiving(confirmWarehousingDataArr);
	}
	
	//모달 창 통해 입고
	public int receivingFromModal(Receiving receiving) {
		int result = warehousingOrderMapper.receivingFromModal(receiving);
		return result;
	}
	
	//창고코드값 통해 구역 받아오기
	public List<WareSector> getWarehouseSectorByCode(String warehouseCode){
		List<WareSector> warehouseSector = warehousingOrderMapper.getWarehouseSector(warehouseCode);
		return warehouseSector;
	}
	
	//모달 통해 입고 확인 후 입고지시서 상태 변환
	public int changeWarehousingStatusFromModal(String warehousingOrderCode) {
		return warehousingOrderMapper.changeWarehousingStatusFromModal(warehousingOrderCode);
	}
	
	//입고 후 재고테이블에 재고 추가 혹은 재고수량 수정
	public int insertOrUpdateStock(Receiving receiving) {
		return warehousingOrderMapper.insertOrUpdateStock(receiving);
	}
	
	//입고지시서 검색 조건 중 쇼핑몰 명 검색
	public List<Shoppingmall> getShoppingmallUserName(){
		return warehousingOrderMapper.getShoppingmallUserName();
	}
}
