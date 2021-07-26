package com.cafe2team.controller;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cafe2team.domain.Item;
import com.cafe2team.domain.Product;
import com.cafe2team.service.ProductService;

@Controller
public class ProductController {

	private static final Logger log = LoggerFactory.getLogger(ProductController.class);

	private final ProductService productService;

	// @Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;

	}


	
	// 창고별 물량
	@GetMapping("warehouseProduct")
	public String warehouseProduct(Model model,
									Product product,
									HttpSession session,
									RedirectAttributes reAttr,
									HttpServletResponse response) {
		String shoppingmallId = (String) session.getAttribute("SID");
		if(shoppingmallId !=null) {
			product.setShoppingmallUserId(shoppingmallId);
			reAttr.addAttribute("shoppingmallUserId", shoppingmallId);
		}
		List<Product> warehouseProductAmount = productService.getProductAmountPerWarehouse();
		model.addAttribute("title", "창고별물량");
		model.addAttribute("shoppingmallId", shoppingmallId);
		model.addAttribute("warehouseProductAmount", warehouseProductAmount);

		return "product/warehouseProduct";
	}

	//상품삭제
	@PostMapping("/deleteProduct")
	@ResponseBody
	public int deleteProduct(@RequestParam(value="dataArr[]") String[] productCode) {
		int result = 1;
		System.out.println(productCode);
		int size = productCode.length;
		for(int i=0; i<size; i++) {
			log.info(productCode[i] + " <-삭제할 값");
			productService.deleteProduct(productCode[i]);
		}
		return result;
	}
	
	// 상품수정
	@PostMapping("/modifyProduct")
	public String modifyProduct(Product product) {
		log.info("========================================");
		log.info("화면에서 입력받은 값(상품수정폼) product: {}", product);
		log.info("========================================");
		productService.modifyProduct(product);

		return "redirect:/productList";
	}

	// 상품코드를 통한 한가지 상품조회
	@GetMapping("/modifyProduct")
	public String modifyProduct(@RequestParam(name = "productCode", required = false) String productCode, Model model) {
		log.info("========================================");
		log.info("화면에서 입력받은 값(회원수정폼) productCode: {}", productCode);
		log.info("========================================");
		List<Item> BigCategory = productService.getItemBigCategoryInfo();
		Product product = productService.getProductInfoByCode(productCode);
		model.addAttribute("title", "상품수정");
		model.addAttribute("product", product);
		model.addAttribute("BigCategory", BigCategory);
		
		return "product/modifyProduct";
	}

	// 상풍목록
	@GetMapping("/productList")
	public String productList(Model model) {

		
		List<Product> productList = productService.getProductList();
		//대분류가져오기
		List<Item> BigCategory = productService.getItemBigCategoryInfo();

		log.info("========================================");
		log.info("화면에서 입력받은 값(회원수정폼) productList: {}", productList);
		log.info("========================================");
		model.addAttribute("title", "상품목록");
		model.addAttribute("productList", productList);
		model.addAttribute("BigCategory", BigCategory);

		return "product/productList";
	}

	// 상품추가

	@PostMapping("/addProduct")

	public String addProduct(Product product,
								HttpSession session,
								RedirectAttributes reAttr,
								HttpServletResponse response) {
		String shoppingmallId = (String) session.getAttribute("SID");
		if(shoppingmallId !=null) {
			product.setShoppingmallUserId(shoppingmallId);
			log.info("========================================");
			log.info("화면에서 입력받은 값(회원가입) product: {}", product);
			log.info("========================================");
			productService.addProduct(product);
			reAttr.addAttribute("shoppingmallUserId", shoppingmallId);
		}
		return "redirect:/productList";

	}
	// 상품추가

//	@ResponseBody
	@GetMapping("/addProduct")
	public String addProduct(Model model
//							@RequestParam(name = "itemBigCategory", required = false)String itemBigCategory
	) {


		List<Item> BigCategory = productService.getItemBigCategoryInfo();
//		List<Item> middleCategory = productService.getItemMiddleCategory(itemBigCategory);

		model.addAttribute("title", "상품등록");
		model.addAttribute("BigCategory", BigCategory);
//		model.addAttribute("middleCategory", middleCategory);
		System.out.println(BigCategory);

		return "product/addProduct";
	}

	//상품추가 중분류
	@PostMapping("getMiddleCate")
	@ResponseBody 
	public List<Item> getmiddlecate(Model model,
								@RequestParam Map<String, Object> param
								) {
		String itemBigCategory = (String) param.get("itemBigCategory");
		List<Item> getMiddleCategory = productService.getItemMiddleCategoryInfo(itemBigCategory);
		System.out.println(getMiddleCategory);
		
		return getMiddleCategory;
  
	}
	
	//상품추가 소분류 
	@PostMapping("getSmallCate")
	@ResponseBody 
	public List<Item> getSmallCate(Model model,
			@RequestParam Map<String, Object> param){
		String itemMiddleCategory = (String)param.get("itemMiddleCategory");
		List<Item> getSmallCategory =productService.getItemSmallCategoryInfo(itemMiddleCategory);
		System.out.println(getSmallCategory);
		
		return getSmallCategory;
		
	}
	//상품수정 중분류
	@PostMapping("getMiddleCateModal")
	@ResponseBody 
	public List<Item> getmiddlecateModal(Model model,
			@RequestParam Map<String, Object> param
			) {
		String itemBigCategory = (String) param.get("itemBigCategoryModal");
		List<Item> getMiddleCategoryModal = productService.getItemMiddleCategoryInfo(itemBigCategory);
		System.out.println(getMiddleCategoryModal);
		
		return getMiddleCategoryModal;
		
	}
	
	//상품수정 소분류
	@PostMapping("getSmallCateModal")
	@ResponseBody 
	public List<Item> getSmallCateModal(Model model,
								@RequestParam Map<String, Object> param){
		String itemMiddleCategory = (String)param.get("itemMiddleCategoryModal");
		List<Item> getSmallCategoryModal =productService.getItemSmallCategoryInfo(itemMiddleCategory);
		System.out.println(getSmallCategoryModal);
  
		return getSmallCategoryModal;
  
  }
	 
}
