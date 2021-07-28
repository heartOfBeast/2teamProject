package com.cafe2team.controller;

import java.io.IOException;
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

import com.cafe2team.domain.Warehouse;
import com.cafe2team.service.WarehouseService;

@Controller
public class WarehouseController {

	private final WarehouseService warehouseservice;
	private static final Logger log = LoggerFactory.getLogger(MemberController.class);

	public WarehouseController(WarehouseService warehouseservice) {
		this.warehouseservice = warehouseservice;
	}

	/************************************************************
	 * 창고정보수정 모달
	 ************************************************************/
	@PostMapping("/warehouseUpdateModal")
	public String warehouseUpdateModal(Warehouse warehouse) {
		
		log.info("warehouse", warehouse);
		warehouseservice.warehouseUpdateModal(warehouse);

		return "redirect:/warehouseList";
	}
	
	//창고상세정보 주소
	@PostMapping("/warehouseListDetailAddr")
	@ResponseBody
	public List<Warehouse> warehouseListDetailAddr(@RequestParam Map<String, Object> param, Model model){
		String warehouse_addr = (String) param.get("warehouse_addr");

		log.info("addr", warehouse_addr);
		
		List<Warehouse> warehouseList = warehouseservice.getWarehouseListDetailAddr(warehouse_addr);
		log.info("warehouseList", warehouseList);
		return warehouseList;
	}
	
	//창고상세정보 창고이름
	@PostMapping("/warehouseListDetailName")
	@ResponseBody
	public List<Warehouse> warehouseListDetailName(@RequestParam Map<String, Object> param, Model model){
		String warehouse_addr = (String) param.get("warehouse_addr");
		String warehouse_name = (String) param.get("warehouse_name");
		
		log.info("addr", warehouse_addr);
		log.info("name", warehouse_name);
		
		List<Warehouse> warehouseList = warehouseservice.getWarehouseListDetailName(warehouse_addr, warehouse_name);
		log.info("warehouseList", warehouseList);
		return warehouseList;
	}
	
	//창고상세정보 창고종류
	@PostMapping("/warehouseListDetailCate")
	@ResponseBody
	public List<Warehouse> warehouseListDetailCate(@RequestParam Map<String, Object> param, Model model){
		String warehouse_name = (String) param.get("warehouse_name");
		String warehouse_addr = (String) param.get("warehouse_addr");
		String warehouse_cate = (String) param.get("warehouse_cate");
		
		log.info("name", warehouse_name);
		log.info("addr", warehouse_addr);
		log.info("cate", warehouse_cate);
		
		List<Warehouse> warehouseList = warehouseservice.getWarehouseListDetailCate(warehouse_name, warehouse_addr, warehouse_cate);
		log.info("warehouseList", warehouseList);
		return warehouseList;
	}
	
	 //창고조회
	@GetMapping("/warehouseList")
	public String getWarehouseList(Model model) {

		List<Warehouse> warehouseList = warehouseservice.getWarehouseList();
		model.addAttribute("title", "창고조회");
		model.addAttribute("warehouseList", warehouseList);

		return "warehouse/warehouseList";
	}

	//창고등록
	@PostMapping("/addWarehouse")
	public String addWarehouse(Warehouse warehouse
								,HttpSession session
								,RedirectAttributes reAttr
								,HttpServletResponse response) throws IOException {

		String SID = (String) session.getAttribute("SID");
		String SLEVEL = (String) session.getAttribute("SLEVEL");
		System.out.println(SID);
		System.out.println(SLEVEL);
		
		if (SID != null && SLEVEL.equals("총관리자")) {
			warehouse.setWareAdminId(SID);
			warehouse.setWareSectorAdminId(SID);
			warehouseservice.addWarehouse(warehouse);
			warehouseservice.addWarehouseSector(warehouse);
			warehouse.setWareSectorAdminId(SID);
			warehouseservice.addWarehouseFinalSector(warehouse);
			reAttr.addAttribute("wareAdminId", SID);
			log.info("warehouse", warehouse);
		}
//		else 
//	
//			response.setContentType("text/html; charset=UTF-8");
//			 
//			PrintWriter out = response.getWriter();
//			 
//			out.println("<script>alert('test'); location.href='/warehouseList'; </script>");
//			 
//			out.flush();

		return "redirect:/warehouseList";
	}

	@GetMapping("/addWarehouse")
	public String getAddWarehouse(Model model) {

		model.addAttribute("title", "창고등록");
		return "warehouse/addWarehouse";
	}
	
	@PostMapping("/getWarehouseLocation")
	@ResponseBody
	public List<Warehouse> getWarehouseLocation(Model model) {
		List<Warehouse> getWarehouseLocation = warehouseservice.getWarehouseLocation();
		
		return getWarehouseLocation;
	}

	@GetMapping("/warehouse")
	public String getWarehouse(Model model) {
		
		List<Warehouse> getWarehouse = warehouseservice.getWarehouseList();
		model.addAttribute("title", "창고현황");
		model.addAttribute("getWarehouse", getWarehouse);
		
		return "warehouse/warehouse";
	}

}
