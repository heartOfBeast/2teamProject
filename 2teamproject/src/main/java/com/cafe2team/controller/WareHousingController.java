package com.cafe2team.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe2team.domain.Item;
import com.cafe2team.domain.Member;
import com.cafe2team.domain.Product;
import com.cafe2team.domain.Shoppingmall;
import com.cafe2team.domain.Warehouse;
import com.cafe2team.service.MemberService;
import com.cafe2team.service.ProductService;
import com.cafe2team.service.WarehouseService;
import com.google.zxing.BarcodeFormat; 
import com.google.zxing.BinaryBitmap;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter; 
import com.google.zxing.common.BitMatrix; 
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.encoder.ByteMatrix;


@Controller
public class WareHousingController {
	
	private final ProductService productService;
	private final MemberService memberService;
	private final WarehouseService warehouseService;
	
	@Autowired
	public WareHousingController(ProductService productService, MemberService memberService, WarehouseService warehouseService) {
		this.productService = productService;
		this.memberService = memberService;
		this.warehouseService = warehouseService;
	}
	
	@GetMapping("/receivingRequest")
	public String receivingRequest(@RequestParam(value = "memberId", required = false) String memberId
									,Model model) {
		
		
		Shoppingmall shopmemberList = memberService.getsShopById(memberId);
		List<Warehouse> warehouseList = warehouseService.getWarehouseList();		
		List<Product> productList = productService.getProductList();
		
		
		model.addAttribute("productList", productList);
		model.addAttribute("shopmemberList", shopmemberList);
		model.addAttribute("warehouseList", warehouseList);
		
		return "warehousing/receivingRequest";
	}
	
	@PostMapping("/receivingRequest")
	public String receivingRequest() {
		
		
		return null;
	}
	
	//입고지시서 목록
	@GetMapping("/receivingOrder")
	public String receivingOrder(Model model) {
		
		return "warehousing/receivingOrder";
	}
	
	@GetMapping("/receivingWarehouseStatus")
	public String receivingWarehouseStatus(Model model) {
		
		return "warehousing/receivingWarehouseStatus";
	}
	@GetMapping("/receivingShopStatus")
	public String receivingShopStatus(Model model) {
		
		return "warehousing/receivingShopStatus";
	}
	
	
	@RequestMapping(value="/barCodeCreate", method = {RequestMethod.POST})
	@ResponseBody
	public int makeqr() throws WriterException, IOException {
		
		Random random = new Random();
		
		int randomBarcode = random.nextInt();
		String randomBarcodeUnsign = Integer.toUnsignedString(randomBarcode);
	
		
		String url = randomBarcodeUnsign;
		System.out.println(url);
		int width = 250;
		int height = 250;
		
		String file_path = "C:"+File.separator+"QR"+File.separator;
		String file_name = "QR.png";
		QRUtil.makeQR(url, width, height, file_path, file_name);
		
		return 1;
	}
	
}

	
