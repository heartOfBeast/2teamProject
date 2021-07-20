package com.cafe2team.dao;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Item;
import com.cafe2team.domain.Product;

@Mapper
public interface ProductMapper {

	//상품삭제
	public int deleteProductByCode(String productCode);
	
	//쇼핑몰 사업자 창고별 재고보기
	public List<Product> getProductAmountPerWarehouse();
	
	//상품수정
	public int modifyProduct(Product product);
	//상품정보 가져오기
	public Product getProductInfoByCode(String productCode);
	//상품등록
	public int addProduct(Product product);
	//상품등록 위해 품목 대분류 가져오기
	public List<Item> getItemBigCategoryInfo();
	//상품목록
	public List<Product> getProductList();
	
	public List<Item> getItemMiddleCategoryInfo(String itemBigCategory);
	public List<Item> getItemSmallCategoryInfo(String itemMiddleCategory);

}
