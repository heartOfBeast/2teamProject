package com.cafe2team.controller;


import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafe2team.domain.Product;
import com.cafe2team.service.ProductService;

@Controller
public class ProductController {

	private final ProductService productService;
	//@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;

	}
		
	
	//창고별 물량
	@GetMapping("warehouseProduct")
	public String warehouseProduct(Model model) {
		model.addAttribute("title", "창고별물량");
		
		return "product/warehouseProduct";
	}
	//상품수정
	@GetMapping("modifyProduct")
	public String modifyProduct(Model model) {
		model.addAttribute("title", "상품수정");
		
		return "product/modifyProduct";
	}
	
	//상풍목록
	@GetMapping("/productList")
	public String productList(Model model) {
		List<Product> productList = productService.getProductList();
		model.addAttribute("title", "상품목록");
		model.addAttribute("productList", productList);
		return "product/productList";
	}
	
	
	
	//상품추가
	
	@PostMapping("/addProduct")
	public String addProduct(Product product) {
		productService.addProduct(product);
		return "redirect:/productList";
	}
	
	@GetMapping("addProduct")
	public String addProduct(Model model) {
		

		

		
		model.addAttribute("title", "상품등록");


		return "product/addProduct";
	}
}
