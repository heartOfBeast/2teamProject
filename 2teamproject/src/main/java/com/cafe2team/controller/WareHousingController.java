package com.cafe2team.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cafe2team.dao.WarehousingMapper;
import com.cafe2team.domain.Contract;
import com.cafe2team.domain.Member;
import com.cafe2team.domain.Product;
import com.cafe2team.domain.Receiving;
import com.cafe2team.domain.Request;
import com.cafe2team.domain.Shoppingmall;
import com.cafe2team.domain.Warehouse;
import com.cafe2team.domain.WarehousingOrder;
import com.cafe2team.service.ContractService;
import com.cafe2team.service.MemberService;
import com.cafe2team.service.ProductService;
import com.cafe2team.service.WarehouseService;
import com.cafe2team.service.WarehousingOrderService;
import com.cafe2team.service.WarehousingService;


@Controller
public class WareHousingController {
	
	
	private static final Logger log = LoggerFactory.getLogger(WareHousingController.class);

	
	private final ProductService productService;
	private final MemberService memberService;
	private final WarehousingService warehousingService;
	private final WarehouseService warehouseService;
	private final WarehousingOrderService warehousingOrderService;
	private final WarehousingMapper warehosingMapper;
	private final ContractService contractService;
	
	@Autowired
	public WareHousingController(ProductService productService, MemberService memberService,
			WarehousingService warehousingService, WarehouseService warehouseService, 
			WarehousingOrderService warehousingOrderService,
			WarehousingMapper warehosingMapper, ContractService contractService) {
		
		this.productService = productService;
		this.memberService = memberService;
		this.warehousingService = warehousingService;
		this.warehouseService = warehouseService;
		this.warehousingOrderService = warehousingOrderService;
		this.warehosingMapper = warehosingMapper;
		this.contractService = contractService;
	}
	
	//입고요청시 뿌려주는 리스트
	@GetMapping("/receivingRequest")
	public String receivingRequest(@RequestParam(value = "memberId", required = false) String memberId
									,Model model) {
		
		Member memberList = memberService.getMemberInfoById(memberId);
		Shoppingmall shopmemberList = memberService.getsShopById(memberId);
		List<Warehouse> warehouseList = warehouseService.getWarehouseList();		
		List<Product> productList = productService.getProductList();
		List<Contract> contractList = contractService.ContractList();
		
		model.addAttribute("memberList", memberList);
		model.addAttribute("productList", productList);
		model.addAttribute("shopmemberList", shopmemberList);
		model.addAttribute("warehouseList", warehouseList);
		model.addAttribute("contractList", contractList);
		
		return "warehousing/receivingRequest";
	}
	
	//상품코드구하는 AJAX 처리
	@PostMapping("/productCodeList")
	@ResponseBody
	public List<Product> productCodeList(@RequestParam Map<String,Object> param) {
		
		String getCodeList = (String) param.get("productName");
		
		List<Product> getCodeListInfo = warehousingService.getProductCode(getCodeList);
		
		log.info("================= getCodeList {} ", getCodeList);
		log.info("=================getCodeListInfo {} ", getCodeListInfo);
		
		return getCodeListInfo;
	}
	
	//입고지시서 목록
	@GetMapping("/receivingOrder")
	public String receivingOrder(Model model) {
		List<WarehousingOrder> WarehousingOrderList = warehousingOrderService.getWarehousingOrderList();
		model.addAttribute("title", "입고지시서 목록");
		model.addAttribute("WarehousingOrderList", WarehousingOrderList);
		return "warehousing/receivingOrder";
	}
	//입고현황 - 관리자
	@GetMapping("/receivingWarehouseStatus")
	public String receivingWarehouseStatus(Model model) {
		List<Receiving> receivingStatusForWarehouse = warehousingOrderService.getReceivingListForWarehouse();
		model.addAttribute("title", "입고현황-관리자전용");
		model.addAttribute("receivingStatusListForWarehouse", receivingStatusForWarehouse);
		return "warehousing/receivingWarehouseStatus";
	}
	@GetMapping("/receivingShopStatus")
	public String receivingShopStatus(Model model) {
		
		return "warehousing/receivingShopStatus";
	}
	
	
	//바코드 자동생성
	@GetMapping("/barCodeCreateInfo")
	@ResponseBody
	public String barCodeCreateInfo() {
		String maxGoodsCode = warehosingMapper.maxGoodsCode();
		System.out.println(maxGoodsCode);
		
		return maxGoodsCode;
	}
	
	//입고
	@PostMapping("/receivingRequest")
	public String receivingRequest(Request request, HttpSession session, RedirectAttributes reAtrr) {
		
			String requestId = (String) session.getAttribute("SID");
		
			if(requestId != null) {
				String maxRequestCode = warehosingMapper.maxGoodsCode();
				
				request.setRequsetCode(maxRequestCode);
				request.setShoppingUserId(requestId);
				
				warehosingMapper.addRequest(request);
				reAtrr.addAttribute("memberId", requestId);
			}
		
		return "redirect:/receivingRequestWaiting";
	}
	
	//입고리스트
	@GetMapping("/receivingRequestWaiting")
	public String receivingRequestWaiting(Model model) {
		model.addAttribute("title", "입고리스트");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		List<Request> requestList = warehosingMapper.getRequestList(paramMap);
		
		model.addAttribute("requestList", requestList);
		
		return "warehousing/receivingRequestWaiting";
	}
	
	//큐알찍기 확인
	@GetMapping("/receivingRequest/{requestCode}")
	public String requsetCode(Model model
							,@PathVariable(value = "requestCode", required = false) String requestCode) {
		
		Request request = warehosingMapper.getRequestCode(requestCode);
		
		List<Request> requestInfo = new ArrayList<Request>();
		
		requestInfo.add(request);
		
		model.addAttribute("requestCode", request);
		
		
		return "warehousing/requestInfo";
		
	}
	
	
	//입고요청대기 -> 입고지시서
	@PostMapping("/addOrderWarehousing")
	@ResponseBody
	public int addOrderWarehousing(@RequestParam(value="addOrderWarehousing[]") List<String> paramList) {
		
		int result = 0;
		result = warehosingMapper.addRequestOrder(paramList);
		return result;
	}
	
	//데이터테이블 이용 ajax (미완성)
	@PostMapping("/wareHouseListDetail")
	public @ResponseBody Map<String,Object> wareHouseListDetail(
				@RequestParam Map<String,Object> paramMap){
		
			Map<String, Object> data = warehousingService.wareHouseListDetail(paramMap);
		
		return data;
		
	}
	
	@PostMapping("/cancleReuqestWareHouse")
	@ResponseBody
	public int cancleReuqestWareHouse(@RequestParam(value = "cancleDataArr[]") List<String> paramList) {
		
		log.info("================={}" + paramList);
		
		int result =0;
		result = warehousingService.cancleReuqestWareHouse(paramList);
		
		log.info("================result={}" + result);

		return result;
	}
	

	
}

	
