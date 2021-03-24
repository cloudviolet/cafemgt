package com.cafemgt.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafemgt.dao.ArticleMapper;
import com.cafemgt.dao.CustomerMapper;
import com.cafemgt.dao.MenuMapper;
import com.cafemgt.dto.ArticleDto;
import com.cafemgt.dto.CustomerDto;
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
	private final CustomerMapper customerMapper;
	private final ArticleMapper articleMapper;
	
	public TaxController(SalesService salesService
						 ,PurchasesService purchasesService
						 ,OtherPurchasesService otherPurchasesService
						 ,MenuMapper menuMapper
						 ,CustomerMapper customerMapper
						 ,ArticleMapper articleMapper) {
		this.salesService = salesService;
		this.purchasesService = purchasesService;
		this.otherPurchasesService = otherPurchasesService;
		this.menuMapper = menuMapper;
		this.customerMapper = customerMapper;
		this.articleMapper = articleMapper;
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
		String OID = (String)session.getAttribute("OID");
		String ONAME = (String)session.getAttribute("ONAME");
		List<MenuDto> menuList = menuMapper.getMenu(SSTORECODE);
		List<CustomerDto> customerList = customerMapper.getCustomer(SSTORECODE);
		model.addAttribute("menuList", menuList);
		model.addAttribute("customerList", customerList);
		return "pands/addsales";
	}
	
	@PostMapping("/addsales")
	public String addSales(SalesDto salesDto) {
		salesService.addSales(salesDto);
		return "redirect:/getsales";
	}
	
	@GetMapping("/addpurchases")
	public String addpurchases(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		String OID = (String)session.getAttribute("OID");
		String ONAME = (String)session.getAttribute("ONAME");
		List<ArticleDto> articleList = articleMapper.getArticle(SSTORECODE);
		List<CustomerDto> customerList = customerMapper.getCustomer(SSTORECODE);
		model.addAttribute("articleList", articleList);
		model.addAttribute("customerList", customerList);
		return "pands/addpurchases";
	}
	
	@PostMapping("/addpurchases")
	public String addPurchases(PurchasesDto purchasesDto) {
		purchasesService.addPurchases(purchasesDto);
		return "redirect:/getpurchases";
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
	public String getSales(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<SalesDto> salesList = salesService.getSales(SSTORECODE);
		model.addAttribute("salesList", salesList);
		return "pands/getsales";
	}
	
	@GetMapping("/getpurchases")
	public String getPurchases(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<PurchasesDto> purchasesList = purchasesService.getPurchases(SSTORECODE);
		model.addAttribute("purchasesList", purchasesList);
		return "pands/getpurchases";
	}
	
	@GetMapping("/purchasesdeadline")
	public String purchasesDeadline(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<PurchasesDto> purchasesCheckList = purchasesService.purchasesDeadline(SSTORECODE);
		model.addAttribute("purchasesCheckList", purchasesCheckList);
		return "pands/purchasesdeadline";
	}
	
	@GetMapping("/getotherpurchases")
	public String getOtherPurchases(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<OtherPurchasesDto> otherPurchasesList = otherPurchasesService.getOtherPurchases(SSTORECODE);
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
