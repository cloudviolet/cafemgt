package com.cafemgt.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafemgt.dao.MenuMapper;
import com.cafemgt.dto.MenuDto;
import com.cafemgt.dto.OtherPurchasesDto;
import com.cafemgt.dto.PurchasesDto;
import com.cafemgt.dto.SalesDto;
import com.cafemgt.service.OtherPurchasesService;
import com.cafemgt.service.PurchasesService;
import com.cafemgt.service.SalesService;

@Controller
public class TaxController {
	
	private final SalesService salesService;
	private final PurchasesService purchasesService;
	private final OtherPurchasesService otherPurchasesService;
	private final MenuMapper menuMapper;
	
	public TaxController(SalesService salesService
						 ,PurchasesService purchasesService
						 ,OtherPurchasesService otherPurchasesService
						 ,MenuMapper menuMapper) {
		this.salesService = salesService;
		this.purchasesService = purchasesService;
		this.otherPurchasesService = otherPurchasesService;
		this.menuMapper = menuMapper;
	}
	
	@PostConstruct
	public void initialize() {				
		System.out.println("======================================");
		System.out.println("======= TaxController bean 등록!!!! ======");
		System.out.println("======================================");
	}
	
	@GetMapping("/addsales")
	public String addsales(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<MenuDto> menuList = menuMapper.getMenu(SSTORECODE);
		model.addAttribute("menuList", menuList);
		return "pands/addsales";
	}
	
	@GetMapping("/addpurchases")
	public String addpurchases() {
		return "pands/addpurchases";
	}
	
	@GetMapping("/addotherpurchases")
	public String addOtherPurchases() {
		return "pands/addotherpurchases";
	}
	
	@PostMapping("/addotherpurchases")
	public String addOtherPurchases(OtherPurchasesDto otherPurchasesDto) {
		otherPurchasesService.addOtherPurchases(otherPurchasesDto);
		return "redirect:/getotherpurchases";		
	}
	
	@GetMapping("/getsales")
	public String getSales(Model model) {
		List<SalesDto> salesList = salesService.getSales();
		model.addAttribute("salesList", salesList);
		return "pands/getsales";
	}
	
	@GetMapping("/getpurchases")
	public String getPurchases(Model model) {
		List<PurchasesDto> purchasesList = purchasesService.getPurchases();
		model.addAttribute("purchasesList", purchasesList);
		return "pands/getpurchases";
	}
	
	@GetMapping("/getotherpurchases")
	public String getOtherPurchases(Model model) {
		List<OtherPurchasesDto> otherPurchasesList = otherPurchasesService.getOtherPurchases();
		model.addAttribute("otherPurchasesList", otherPurchasesList);
		return "pands/getotherpurchases";
	}
	
	@GetMapping("/gettotalpands")
	public String getTotalPandS() {
		return "tax/gettotalpands";
	}
	
	@GetMapping("/gettotalsalary")
	public String getTotalSalary() {
		return "tax/gettotalsalary";
	}
	
	@GetMapping("/getvat")
	public String getVat() {
		return "tax/getvat";
	}
	
	@GetMapping("/getincomestatement")
	public String getIncomeStatement() {
		return "tax/getincomestatement";
	}
}
