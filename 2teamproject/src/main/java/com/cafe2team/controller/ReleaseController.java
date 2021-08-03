package com.cafe2team.controller;

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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.RequestScope;

import com.cafe2team.domain.CarManagement;
import com.cafe2team.domain.Delivery;
import com.cafe2team.domain.Invoice;
import com.cafe2team.domain.Release;
import com.cafe2team.domain.ReleaseInfo;
import com.cafe2team.domain.Vehicle;
import com.cafe2team.service.ReleaseService;
import com.cafe2team.service.VehicleService;

import groovyjarjarantlr4.v4.parse.ANTLRParser.finallyClause_return;

@Controller
public class ReleaseController {
	
	
	private static final Logger log = LoggerFactory.getLogger(ReleaseController.class);

	private final ReleaseService releaseService;
	private final VehicleService vehicleService;
	
	@Autowired
	public ReleaseController (ReleaseService releaseService, VehicleService vehicleService) {
		this.releaseService = releaseService;
		this.vehicleService = vehicleService;
	}
	
	//출고지시서 조회
	@GetMapping("/releaseOrder")
	public String releaseOrder(Model model, 
								@RequestParam(name="firstDate", required = false)String firstDate
								,@RequestParam(name="secondDate", required = false)String secondDate) {
		Map<String, Object> releaseParam = new HashMap<String, Object>();
		releaseParam.put("firstDate", firstDate);
		releaseParam.put("secondDate", secondDate);
		List<Release> release = releaseService.getReleaseOrder(releaseParam);
		List<Vehicle> vehicle = vehicleService.getVehicleInfo(null);
		List<Delivery> delivery = releaseService.getDeliveryInfo();
		/* List<CarManagement> carManagement = releaseService.getDriveManagement(); */
		model.addAttribute("title", "출고 리스트");
		model.addAttribute("release", release);
		model.addAttribute("vehicle", vehicle);
		model.addAttribute("delivery", delivery);
		/* model.addAttribute("carManagement", carManagement); */
		return "release/releaseOrder";
	}
	
	//배차등록화면
	@GetMapping("/getOrderInfo")
	@ResponseBody
	public List<Release> getOrderInfo(@RequestParam(name="releaseOrderCode", required = false)String releaseOrderCode){
		List<Release> release = releaseService.getOrderInfo(releaseOrderCode);
		return release;
	}
	
	//배차등록
	@PostMapping("/addDriveManagement")
	public String addDriveManagement(CarManagement carManagement, HttpSession session) {
		String AdminId = (String) session.getAttribute("SID");
		if(AdminId != null) {
			carManagement.setWareAdminId(AdminId);
			releaseService.addDriveManagement(carManagement);
		}
		return "redirect:/releaseOrder";
	}
	
	//배차수정화면
	@GetMapping("/getDriveManagement")
	@ResponseBody
	public List<CarManagement> getDriveManagement(@RequestParam(name="driveManageCode", required = false)String driveManageCode){
		List<CarManagement> carManagement = releaseService.getDriveManagement(driveManageCode);
		return carManagement;
	}
	
	//배차수정
	@PostMapping("/modifyDriveManagement")
	public String modifyDriveManagement(CarManagement carManagement, HttpSession session){
		String addAdminID = (String) session.getAttribute("SID");
		if(addAdminID != null) {
			carManagement.setWareAdminId(addAdminID);
			releaseService.modifyDriveManagement(carManagement);
			log.info("carManagement : {}", carManagement);
		}
		return "redirect:/releaseOrder";
	}

	//배차수정(출고승인X)
	@PostMapping("/modifyDriveManagementNotRelease")
	public String modifyDriveManagementNotRelease(CarManagement carManagement, HttpSession session){
		String addAdminID = (String) session.getAttribute("SID");
		if(addAdminID != null) {
			carManagement.setWareAdminId(addAdminID);
			releaseService.modifyDriveManagementNotRelease(carManagement);
			log.info("carManagement : {}", carManagement);
		}
		return "redirect:/releaseOrder";
	}
	
	//운송장등록화면
	@GetMapping("/addInvoiceInfo")
	@ResponseBody
	public List<CarManagement> addInvoiceInfo(@RequestParam(name = "driveManageCode", required = false)String driveManageCode){
		List<CarManagement> carManagement = releaseService.addInvoiceInfo(driveManageCode);
		return carManagement;
	}
	
	//운송장등록
	@PostMapping("/addInvoice")
	public String addInvoice(Invoice invoice, HttpSession session) {
		String addAdminID = (String) session.getAttribute("SID");
		if(addAdminID != null) {
			invoice.setWareAdminId(addAdminID);
			releaseService.addInvoice(invoice);
			log.info("invoice : {}", invoice);
		}
		return "redirect:/releaseOrder";
	}
	
	//운송장수정화면
	@GetMapping("/getInvoiceInfo")
	@ResponseBody
	public List<Invoice> getInvoiceInfo(@RequestParam(name="invoiceCode", required = false)String invoiceCode){
		List<Invoice> invoice = releaseService.getInvoiceInfo(invoiceCode);
		return invoice;
	}
	//운송장수정
	@PostMapping("/modifyInvoiceInfo")
	public String modifyInvoiceInfo(Invoice invoice, HttpSession session) {
		String addAdminID = (String) session.getAttribute("SID");
		if(addAdminID != null) {
			invoice.setWareAdminId(addAdminID);
			releaseService.modifyInvoiceInfo(invoice);
			log.info("invoice : {}", invoice);
		}
		return "redirect:/releaseOrder";
	}
	
	//출고승인화면
	@GetMapping("/addReleaseInfo")
	@ResponseBody
	public List<Release> addReleaseInfo(@RequestParam(name = "releaseOrderCode", required = false) String releaseOrderCode){
		List<Release> release = releaseService.addReleaseInfo(releaseOrderCode);
		return release;
	}
	
	//출고승인
	@PostMapping("/addRelease")
	public String addRelease(ReleaseInfo releaseInfo, HttpSession session) {
		String addAdminID = (String) session.getAttribute("SID");
		if(addAdminID != null) {
			releaseInfo.setWareAdminId(addAdminID);
			releaseService.addRelease(releaseInfo);
			releaseService.releaseStock(releaseInfo);
		}
		return "redirect:/releaseOrder";
	}
	
	//출고리스트조회
	@GetMapping("/realReleaseList")
	public String realReleaseList(Model model, 
								@RequestParam(name="firstDate", required = false)String firstDate
								,@RequestParam(name="secondDate", required = false)String secondDate) {
		Map<String, Object> listParam = new HashMap<String, Object>();
		listParam.put("firstDate", firstDate);
		listParam.put("secondDate", secondDate);
		List<ReleaseInfo> releaseInfo = releaseService.getReleaseList(listParam);
		model.addAttribute("title", "출고 리스트");
		model.addAttribute("releaseInfo", releaseInfo);
		return "release/realReleaseList";
	}
	
	//운송장조회
	@GetMapping("/wayBillSearch")
	public String wayBillSearch(Model model
							   ,@RequestParam(name="invoiceCode", required = false) String invoiceCode) {
		
		System.out.println(invoiceCode + "@@ 검색 결과");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("invoiceCode", invoiceCode);
		
		List<Invoice> InvoiceList = releaseService.wayBillSearch(paramMap);
		 model.addAttribute("title", "운송장 조회"); 
		 model.addAttribute("InvoiceList", InvoiceList);
		
		return "release/wayBillSearch";
	}
	
	//배차목록화면
	@GetMapping("/carManagementList")
	public String carManagementList(Model model) {
		List<CarManagement> carManagement = releaseService.carManagementList();
		model.addAttribute("title", "배차목록");
		model.addAttribute("carManagement", carManagement);
		return "release/carManagementList";
	}
	
	//배차취소
	@GetMapping("/deleteCarmanagement")
	@ResponseBody
	public int deleteCarmanagement(@RequestParam(name="releaseOrderCode", required = false)String releaseOrderCode) {
		int result = 0;
		result= releaseService.deleteCarmanagement(releaseOrderCode);
		return result;
	}
}
