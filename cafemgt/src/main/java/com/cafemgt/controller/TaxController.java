package com.cafemgt.controller;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
		String MID = (String)session.getAttribute("MID");
		String MNAME = (String)session.getAttribute("MNAME");
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
		String MID = (String)session.getAttribute("MID");
		String MNAME = (String)session.getAttribute("MNAME");
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
	
	@GetMapping("/salesdeadlineforstock")
	public String salesDeadlineForStock(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<SalesDto> salesCheckList = salesService.salesDeadlineForStock(SSTORECODE);
		model.addAttribute("salesCheckList", salesCheckList);
		return "pands/salesdeadlineforstock";
	}
	
	@GetMapping("/salesdeadlinefortax")
	public String salesDeadlineForTax(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<SalesDto> salesTaxCheckList = salesService.salesDeadlineForTax(SSTORECODE);
		model.addAttribute("salesTaxCheckList", salesTaxCheckList);
		return "pands/salesdeadlinefortax";
	}
	
	@GetMapping("/otherpurchasesdeadline")
	public String otherPurchasesDeadline(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<OtherPurchasesDto> otherPurchasesCheckList = otherPurchasesService.otherPurchasesDeadline(SSTORECODE);
		model.addAttribute("otherPurchasesCheckList", otherPurchasesCheckList);
		return "pands/otherpurchasesdeadline";
	}
	
	@GetMapping("/getotherpurchases")
	public String getOtherPurchases(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<OtherPurchasesDto> otherPurchasesList = otherPurchasesService.getOtherPurchases(SSTORECODE);
		model.addAttribute("otherPurchasesList", otherPurchasesList);
		return "pands/getotherpurchases";
	}
	
	@GetMapping("/gettotalpands")
	public String getTotalPandS(HttpSession session) {
		String MID = (String)session.getAttribute("MID");
		System.out.println(MID+"<<<<<<<<<<<<<<<<<<<<<<<<<");
		return "tax/gettotalpands";
	}
	
	@ResponseBody
	@PostMapping("/gettotalpands")
	public Map<String,Object> getTotalPandS(
			@RequestParam (value = "searchFirstDate",required = false)String searchFirstDate 
			,@RequestParam (value = "searchLastDate",required = false)String searchLastDate 
			,Model model , HttpSession session){
		System.out.println(searchFirstDate);
		System.out.println(searchLastDate);
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		Map<String, Object> map = new HashMap<>();	
		map = salesService.getTotalPandS(searchFirstDate,searchLastDate,SSTORECODE);
			return map;			
	}
	
	@ResponseBody
	@PostMapping("/getmyvat")
	public int getmyvat(@RequestParam(value = "MID",required = false)String MID, 
						Model model){
		System.out.println(MID);
		return 0;
		
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
	
	@GetMapping("/modifyotherpurchases")
	public String modifyOtherPurchases() {
		return "pands/modifyotherpurchases";
	}
}
