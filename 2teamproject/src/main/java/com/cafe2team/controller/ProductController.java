package com.cafe2team.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe2team.dao.ProductMapper;
import com.cafe2team.domain.Product;
import com.cafe2team.service.ProductService;

@Controller
public class ProductController {

	private static final Logger log = LoggerFactory.getLogger(ProductController.class);
	
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
	@PostMapping("/modifyProduct")
	public String modifyProduct(Product product) {
		log.info("========================================");
		log.info("화면에서 입력받은 값(회원수정폼) product: {}", product);
		log.info("========================================");
		productService.modifyProduct(product);
		
		return "redirect:/productList";
	}
	
	//상품코드를 통한 한가지 상품조회
	@GetMapping("/modifyProduct")
	public String modifyProduct(@RequestParam(name = "productCode", required = false) String productCode
								,Model model) {
		log.info("========================================");
		log.info("화면에서 입력받은 값(회원수정폼) productCode: {}", productCode);
		log.info("========================================");

		Product product = productService.getProductInfoByCode(productCode);
		model.addAttribute("title", "상품수정");
		model.addAttribute("product", product);

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
		
		log.info("========================================");
		log.info("화면에서 입력받은 값(회원가입) product: {}", product);
		log.info("========================================");
		productService.addProduct(product);
		return "redirect:/productList";
	}
	
	@GetMapping("addProduct")
	public String addProduct(Model model) {
		

		

		
		model.addAttribute("title", "상품등록");


		return "product/addProduct";
	}
}
