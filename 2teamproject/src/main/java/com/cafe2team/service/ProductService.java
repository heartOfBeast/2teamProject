package com.cafe2team.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe2team.dao.ProductMapper;
import com.cafe2team.domain.Product;

@Service
public class ProductService {

	private static final Logger log = LoggerFactory.getLogger(ProductService.class);
	
	@Autowired
	private ProductMapper productMapper;
	
	//상품목록
	public List<Product> getProductList(){
		List<Product> productList = productMapper.getProductList();
	
		return productList;
	}

	//상품등록
	public int addProduct(Product product) {

		int result = productMapper.addProduct(product);
		
		return result;
		
	}
	
	//상품 수정 위해 상품코드 가져오기
	public Product getProductInfoByCode(String productCode) {
		return productMapper.getProductInfoByCode(productCode);
	}
	
	//상품 수정
	public int modifyProduct(Product product) {
		log.info("========================================");
		log.info("ProductService서비스  product: {}", product);
		log.info("========================================");
		return productMapper.modifyProduct(product);
	}
}
