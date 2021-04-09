package com.cafemgt.controller;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;
import org.springframework.data.relational.core.sql.FalseCondition;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafemgt.dao.ArticleMapper;
import com.cafemgt.dao.CustomerMapper;
import com.cafemgt.dao.MenuMapper;
import com.cafemgt.dto.ArticleDto;
import com.cafemgt.dto.CustomerDto;
import com.cafemgt.dto.DealingDto;
import com.cafemgt.dto.MenuDto;
import com.cafemgt.dto.OtherPurchasesDto;
import com.cafemgt.dto.PurchasesDto;
import com.cafemgt.dto.SalesDto;
import com.cafemgt.dto.VatDto;
import com.cafemgt.service.MemberService;
import com.cafemgt.service.OtherPurchasesService;
import com.cafemgt.service.PurchasesService;
import com.cafemgt.service.SalesService;
import com.cafemgt.service.TaxService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Controller
@RequestMapping("/tax")
public class TaxController {
	
	private final SalesService salesService;
	private final PurchasesService purchasesService;
	private final OtherPurchasesService otherPurchasesService;
	private final MenuMapper menuMapper;
	private final CustomerMapper customerMapper;
	private final ArticleMapper articleMapper;
	private final MemberService memberService;
	private final TaxService taxService; 
	
	public TaxController(SalesService salesService
						 ,PurchasesService purchasesService
						 ,OtherPurchasesService otherPurchasesService
						 ,MenuMapper menuMapper
						 ,CustomerMapper customerMapper
						 ,ArticleMapper articleMapper
						 ,MemberService memberService
						 ,TaxService taxService) {
		this.salesService = salesService;
		this.purchasesService = purchasesService;
		this.otherPurchasesService = otherPurchasesService;
		this.menuMapper = menuMapper;
		this.customerMapper = customerMapper;
		this.articleMapper = articleMapper;
		this.memberService = memberService;
		this.taxService = taxService;
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
		return "redirect:/tax/getsales";
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
		return "redirect:/tax/getpurchases";
	}
	
	@GetMapping("/addotherpurchases")
	public String addOtherPurchases() {
		return "pands/addotherpurchases";
	}
	
	@PostMapping("/addotherpurchases")
	public String addOtherPurchases(OtherPurchasesDto otherPurchasesDto) {
		otherPurchasesService.addOtherPurchases(otherPurchasesDto);
		return "redirect:/tax/getotherpurchases";		
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
	
	@GetMapping("/purchasesdeadlinetax")
	public String purchasesDeadlineTax(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<PurchasesDto> purchasesTaxCheckList = purchasesService.getPurchasesDeadlineTax(SSTORECODE);
		model.addAttribute("purchasesTaxCheckList", purchasesTaxCheckList);
		return "pands/purchasesdeadlinetax";
	}
	
	@PostMapping("/purchasesdeadlinetax")
	@ResponseBody
	public String purchasesDeadlineTax(@RequestParam(value = "arrayPurchases[]",required = false)List<String> arrayPurchases
									   ,HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		System.out.println(arrayPurchases+"<<<<<<<<<<<<<<<<");
		Map<String, Object> purchasesInfoMap = new HashMap<>();
		purchasesInfoMap.put("SSTORECODE", SSTORECODE);
		purchasesInfoMap.put("arrayPurchases", arrayPurchases);
		List<DealingDto> getPurchsesList = taxService.getPurchasesByDealing(purchasesInfoMap);
		String resultValue = "실패";
		int result = 0;
		for(int i=0; i<getPurchsesList.size();i++) {
			result += taxService.addDealing(getPurchsesList.get(i));
		}
		taxService.modifyPurchasesDeadLineTax(arrayPurchases);
		if(result>=1) {
			resultValue ="성공";
		}		
		return resultValue;
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
	
	@PostMapping("/salesDeadlineForTax")
	@ResponseBody
	public String salesDeadlineForTax(@RequestParam(value = "arraySales[]",required = false)List<String> arraySales
									  ,HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		System.out.println(arraySales);
		Map<String, Object> salesInfoMap = new HashMap<>();
		salesInfoMap.put("arraySales", arraySales);
		salesInfoMap.put("SSTORECODE", SSTORECODE);
		System.out.println(salesInfoMap);
		
		String resultValue = "실패";
		int result = 0;
		List<DealingDto> getSalesList = taxService.getSalesByDealing(salesInfoMap);
		for(int i =0; i<getSalesList.size(); i++) {
			System.out.println(getSalesList.get(i));
			result += taxService.addDealing(getSalesList.get(i));			
		}
		for(int j = 0 ; j < arraySales.size() ; j++) {
			salesService.addCostDetail(arraySales.get(j), SSTORECODE);
		}
		taxService.modifySalesDeadLineForTax(arraySales);
		if(result>=1) {
			resultValue = "정상";
		}
		return resultValue;
	}
	
	@GetMapping("/otherpurchasesdeadline")
	public String otherPurchasesDeadline(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<OtherPurchasesDto> otherPurchasesCheckList = otherPurchasesService.otherPurchasesDeadline(SSTORECODE);
		model.addAttribute("otherPurchasesCheckList", otherPurchasesCheckList);
		return "pands/otherpurchasesdeadline";
	}
	
	@PostMapping("/otherpurchasesdeadline")
	@ResponseBody
	public String otherPurchasesDeadline(@RequestParam(value = "arrayOtherPurchases[]",required = false)List<String> arrayOtherPurchases
										 ,HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		Map<String, Object> otherPurchasesInfoMap = new HashMap<>();
		otherPurchasesInfoMap.put("SSTORECODE", SSTORECODE);
		otherPurchasesInfoMap.put("arrayOtherPurchases", arrayOtherPurchases);
		System.out.println(otherPurchasesInfoMap+"<<<<<<<<<<<<<<<<<");
		
		String resultValue = "실패";
		int result = 0;
		List<DealingDto> otherPurchasesCheckList = taxService.getOtherPurchasesByDealing(otherPurchasesInfoMap);
		for(int i=0; i<otherPurchasesCheckList.size();i++) {
			System.out.println(otherPurchasesCheckList.get(i));
			result += taxService.addDealing(otherPurchasesCheckList.get(i));
		}
		taxService.modifyOtherPurchasesDeadLine(arrayOtherPurchases);
		if(result>=1) {
			resultValue = "성공";
		}
		return resultValue;
	}
	
	@GetMapping("/getotherpurchases")
	public String getOtherPurchases(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<OtherPurchasesDto> otherPurchasesList = otherPurchasesService.getOtherPurchases(SSTORECODE);
		model.addAttribute("otherPurchasesList", otherPurchasesList);
		return "pands/getotherpurchases";
	}
	
	@GetMapping("/gettotalpands")
	public String getTotalPandS(Model model , HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		//dealing테이블에서 가장 오래된 날짜 가져오기
		Map<String, String> dateList = new HashMap<>();	
		dateList = taxService.getOldDateByDealing(SSTORECODE);
		System.out.println(dateList+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		model.addAttribute("dateList", dateList);
		return "tax/gettotalpands";
	}
	
	@PostMapping("/gettotalpands")
	@ResponseBody
	public Map<String,Object> getTotalPandS(
			@RequestParam (value = "searchFirstDate",required = false)String searchFirstDate 
			,@RequestParam (value = "searchLastDate",required = false)String searchLastDate 
			,Model model , HttpSession session){
		System.out.println(searchFirstDate);
		System.out.println(searchLastDate);
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		Map<String, Object> map = new HashMap<>();	
		map = salesService.getTotalPandS(searchFirstDate,searchLastDate,SSTORECODE);
		System.out.println(map);
			return map;			
	}
		
	@PostMapping("/getmyvat")
	@ResponseBody
	public VatDto getMyVat( @RequestParam(value = "searchDays", required = false)String searchDays 
						   ,HttpSession session){
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		System.out.println(searchDays);
		VatDto vatList = taxService.getMyVat(searchDays, SSTORECODE);
		System.out.println(vatList);
		return vatList;		
	}
	
	@GetMapping("/getvat")
	public String getVat(HttpSession session,Model model) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		String MNAME = (String)session.getAttribute("MNAME");	
		model.addAttribute("getYear", taxService.getVatYear(SSTORECODE));
		model.addAttribute("MNAME", MNAME);
		return "tax/getvat";
	}
	
	@PostMapping("/addintendedtax")
	@ResponseBody
	public boolean addIntendedTax(@RequestParam(value = "intendedDays",required = false)String intendedDays
								 ,@RequestParam(value = "vatIntendedTax",required = false)String vatIntendedTax
								 ,HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");	
		int result = taxService.addIntendedTax(intendedDays,vatIntendedTax,SSTORECODE);
		System.out.println(result);
		boolean addIntendedTaxResult = false;
		if(result==1) {
			addIntendedTaxResult = true;
		}
		return addIntendedTaxResult;
	}
	
	@GetMapping("/getincomestatement")
	public String getIncomeStatement() {
		return "tax/getincomestatement";
	}
	
	@GetMapping("/modifyotherpurchases")
	public String modifyOtherPurchases(Model model, String oeCode) {
		OtherPurchasesDto OtherPurchasesDto = otherPurchasesService.getOtherPurchasesByOeCode(oeCode);
		model.addAttribute("OtherPurchasesDto", OtherPurchasesDto);
		return "pands/modifyotherpurchases";
	}
		
	@PostMapping("/modifyotherpurchases")
	public String modifyOtherPurchases(OtherPurchasesDto otherPurchasesDto) {
		otherPurchasesService.modifyOtherPurchases(otherPurchasesDto);
		return "redirect:/tax/getotherpurchases";
	}
	
	@GetMapping("/modifypurchases")
	public String modifyPurchases(Model model, String incoCode, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		PurchasesDto purchasesDto = purchasesService.getPurchasesByIncoCode(incoCode);
		List<ArticleDto> articleList = articleMapper.getArticle(SSTORECODE);
		List<CustomerDto> customerList = customerMapper.getCustomer(SSTORECODE);
		model.addAttribute("purchasesDto", purchasesDto);
		model.addAttribute("articleList", articleList);
		model.addAttribute("customerList", customerList);
		return "pands/modifypurchases";
	}
	
	@PostMapping("/modifypurchases")
	public String modifyPurchases(PurchasesDto purchasesDto) {
		purchasesService.modifyPurchases(purchasesDto);
		return "redirect:/tax/getpurchases";
	}
	
	@GetMapping("/modifysales")
	public String modifySales(Model model, String salesCode, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		SalesDto salesDto = salesService.getSalesBySalesCode(salesCode);
		List<MenuDto> menuList = menuMapper.getMenu(SSTORECODE);
		List<CustomerDto> customerList = customerMapper.getCustomer(SSTORECODE);
		model.addAttribute("menuList", menuList);
		model.addAttribute("customerList", customerList);
		model.addAttribute("salesDto", salesDto);
		return "pands/modifysales";
	}
	
	@PostMapping("/modifysales")
	public String modifySales(SalesDto salesDto) {
		salesService.modifySales(salesDto);
		return "redirect:/tax/getsales";
	}
	
	@GetMapping("/removePurchases")
	public String removePurchases(@RequestParam(value = "incoCode", required = false)String incoCode) {
		purchasesService.removePurchases(incoCode);
		return "redirect:/tax/getpurchases";
	}
	
	@GetMapping("/removeSales")
	public String removeSales(@RequestParam(value = "salesCode", required = false)String salesCode) {
		salesService.removeSales(salesCode);
		return "redirect:/tax/getsales";
	}
	
	@GetMapping("/removeOtherPurchases")
	public String removeOtherPurchases(@RequestParam(value = "oeCode", required = false)String oeCode) {
		otherPurchasesService.removeOtherPurchases(oeCode);
		return "redirect:/tax/getotherpurchases";
	}
	
	@GetMapping("/gettotalsalary")
	public String getTotalSalary() {
		return "tax/gettotalsalary";
	}

}
