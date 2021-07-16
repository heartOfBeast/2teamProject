package com.cafe2team.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Contract;
import com.cafe2team.domain.Product;
import com.cafe2team.domain.Request;
import com.cafe2team.domain.WarehousingOrder;

@Mapper
public interface WarehousingMapper {
	
	//코드 가져오기
	public List<Product> getProductCode(String productCode);
	
	public int addRequest(Request request);
	
	//상품코드 증가
	public String maxGoodsCode();
	
	//상품 QR등록
	public int addGoodsQR(Request request);
	
	public List<Request> getRequestList(Map<String,Object> paramMap);
	
	public Request getRequestCode(String requestCode);
	
	public List<Contract> getContractList();
	
	public int addRequestOrder(List<String> paramList);
}
