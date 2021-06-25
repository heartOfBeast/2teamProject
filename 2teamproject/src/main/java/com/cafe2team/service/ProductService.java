package com.cafe2team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe2team.dao.ProductMapper;
import com.cafe2team.domain.Product;

@Service
public class ProductService {

	@Autowired
	private ProductMapper productMapper;
	
	public List<Product> getProductList(){
		List<Product> productList = productMapper.getProductList();
	
		return productList;
	}

	//상품등록
	public int addProduct(Product product) {

		int result = productMapper.addProduct(product);
		
		return result;
		
	}
}
