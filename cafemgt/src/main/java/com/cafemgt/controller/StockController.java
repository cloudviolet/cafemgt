package com.cafemgt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafemgt.dto.ArticleDto;
import com.cafemgt.dto.DailyVolDto;
import com.cafemgt.dto.DealingDto;
import com.cafemgt.dto.SkkDto;
import com.cafemgt.dto.StockDto;
import com.cafemgt.dto.TotalStockDto;
import com.cafemgt.service.ArticleService;
import com.cafemgt.service.DailyVolService;
import com.cafemgt.service.SalesService;
import com.cafemgt.service.SkkService;
import com.cafemgt.service.StockService;
import com.cafemgt.service.TaxService;
import com.cafemgt.service.TotalStockService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Controller
@RequestMapping("/stock")
public class StockController {
	
	private final ArticleService articleService;
	private final SkkService skkService;
	private final StockService stockService;
	private final TotalStockService totalStockService;
	private final DailyVolService dailyVolService;
	private final TaxService taxService;
	private final SalesService salesService;
	
	@Autowired
	public StockController(ArticleService articleService
						  ,SkkService skkService
						  ,StockService stockService
						  ,TotalStockService totalStockService
						  ,DailyVolService dailyVolService
						  ,TaxService taxService
						  ,SalesService salesService) {
		this.articleService = articleService;
		this.skkService = skkService;
		this.stockService = stockService;
		this.totalStockService = totalStockService;
		this.dailyVolService = dailyVolService;
		this.taxService = taxService;
		this.salesService = salesService;
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("======================================");
		System.out.println("======= StockController bean ?????? ======");
		System.out.println("======================================");
	}
	
	/** article */
	@GetMapping("/addArticle")
	public String addArticle() {

		return "stock/addarticle";
	}
	
	@PostMapping("/addArticle")
	public String addArticle(ArticleDto articleDto) {
		articleService.addArticle(articleDto);
		return "redirect:/stock/getArticle";
	}
	
	@GetMapping("/getArticle")
	public String getArticle(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<ArticleDto> articleList = articleService.getArticle(SSTORECODE);
		model.addAttribute("articleList",articleList);
		return "stock/getarticle";
	}
	
	
	@GetMapping("/modifyArticle")
	public String modifyArticle(@RequestParam (value="articleCode", required = false) String articleCode
							   ,Model model) {
		ArticleDto articleDto = articleService.getArticleByArticleCode(articleCode);
		model.addAttribute("articleDto",articleDto);
		return "stock/modifyarticle";
	}
	
	@PostMapping("/modifyArticle")
	public String modifyArticle(ArticleDto articleDto) {
		articleService.modifyArticle(articleDto);
		return "redirect:/stock/getArticle";
	}
	@PostMapping("/removeArticle")
	@ResponseBody
	public String removeArticle(@RequestParam(value = "articleCode" , required = false)String articleCode) {
		List<String> articleCodeList = articleService.getArticleByRemove();
		boolean checking = true;
		String returnString = "?????? ???????????????.";
		//?????? ???????????? ??????????????? ??????
		if(articleCode !=null && !"".equals(articleCode)) {
			for(int i=0; i < articleCodeList.size();i++ ) {
				if(articleCode.equals(articleCodeList.get(i))) {
					checking = false;
					returnString = "?????? ??? ??? ????????????.";
					return returnString;
				}
			}
		}
		//???????????? ????????? ??????
		if(checking) {
			articleService.removeArticle(articleCode);
		}
		System.out.println(articleCodeList);
		return returnString;
	}
	
	/** Skk */
	@GetMapping("/addSkk")
	public String addSkk(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<ArticleDto> articleList = articleService.getArticle(SSTORECODE);
		model.addAttribute("articleList",articleList);
		return "stock/addskk";
	}
	
	@PostMapping("/addSkk")
	public String addSkk(SkkDto skkDto) {
		skkService.addSkk(skkDto);
		return "redirect:/stock/getSkkDeadLine";
	}
	
	@GetMapping("/getSkk")
	public String getSkk(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<SkkDto> skkList = skkService.getSkk(SSTORECODE);
		model.addAttribute("skkList",skkList);
		return "stock/getskk";
	}
	
	@GetMapping("/modifySkk")
	public String modifySkk(@RequestParam (value="skCode",required = false) String skCode
							,Model model , HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		SkkDto skkDto = skkService.getSkkBySkCode(skCode);
		List<ArticleDto> articleList = articleService.getArticle(SSTORECODE);
		model.addAttribute("skkDto",skkDto);
		model.addAttribute("articleList",articleList);
		return "stock/modifySkk";
	}
	
	@PostMapping("/modifySkk")
	public String modifySkk(SkkDto skkDto) {
		skkService.modifySkk(skkDto);
		System.out.println(skkDto);
		return "redirect:/stock/getSkk";
	}
	@GetMapping("/removeSkk")
	public String removeSkk(String skCode) {
		skkService.removeSkk(skCode);
		
		return "redirect:/stock/getSkk";
	}
	@GetMapping("/getSkkDeadLine")
	public String getskkDeadLine(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<SkkDto> skkList = skkService.getSkkByDeadLine(SSTORECODE);
		List<TotalStockDto> totalStockList = totalStockService.getTotalStock(SSTORECODE);
		model.addAttribute("skkList",skkList);
		model.addAttribute("totalStockList",totalStockList);
		return "stock/getskkDeadLine";
	}
	
	@PostMapping("/getSkkDeadLine")
	public String getskkDeadLine( 
								@RequestParam (value="volumeTotal", required = false) int volumeTotal
								,SkkDto skkDto
								,TotalStockDto totalStockDto
								,ArticleDto articleDto) {
		System.out.println(skkDto);
		System.out.println(totalStockDto);
		System.out.println(articleDto);
		System.out.println(volumeTotal);
		
		totalStockDto.setArticleDto(articleDto);
		Map<String , String> incoMap = new HashMap<>();
		//????????????
		int preVolume =(totalStockDto.getIncoVolumeSubtotal() - totalStockDto.getDetailvolRemainVolume());
		
		//????????????
		int dtvVolumeTotal = totalStockDto.getDetailvolVolumeTotal();
		
		int conCount = 0;
		
		// ???????????? == ???????????? ??????, ???????????? = ????????????
		if(totalStockDto.getIncoCount() == totalStockDto.getIncoVolumeSubtotal()) {
			conCount = totalStockDto.getDetailvolVolumeTotal();
		}else {
			//(????????????+????????????) / ???????????? = ???????????????????????? ??????
			conCount = (preVolume+dtvVolumeTotal)/totalStockDto.getArticleDto().getArticleVolume();
				System.out.println((double)dtvVolumeTotal/totalStockDto.getArticleDto().getArticleVolume());
				System.out.println(totalStockDto);
				System.out.println(conCount);	
		}
		if(conCount > totalStockDto.getDetailvolRemainCount()) {
			//??????????????? ?????????????????? ??? ?????? div??? ??????????????????
			conCount = totalStockDto.getDetailvolRemainCount();
		}
		
		incoMap.put("incoCode", totalStockDto.getIncoCode());
		if(volumeTotal >= 0) {
			/* ???????????? ??????????????? ?????? 
			 * detailvol??? ?????????(volumeTotal) insert
			 * incoCheck 2?????????
			 * */
			int haveVolTotal = (totalStockDto.getDetailvolRemainVolume() - dtvVolumeTotal);//(???)???????????? - ????????????
			totalStockDto.setDetailvolRemainVolume(haveVolTotal);//(???)???????????? input
			totalStockDto.setDetailvolConCount(conCount);//???????????? input
			
			//(???)???????????? -???????????? => (???)???????????? input
			totalStockDto.setDetailvolRemainCount(totalStockDto.getDetailvolRemainCount()-conCount);
			
			if(volumeTotal ==0) {
				incoMap.put("incoCheck", "3");
			}else {
				incoMap.put("incoCheck", "2");
			}
			skkService.modifySkkDeadlineCheck(skkDto.getSkCode());
		}else {
			/* ???????????? ??????????????? ???
			 * skk??? -????????? insert
			 * detailvol??? ?????????(volumeTotal) insert
			 * incoCheck??? ?????? 3??????
			 * */
			
			incoMap.put("incoCheck", "3");
			
			if(volumeTotal < 0) {
				volumeTotal = (volumeTotal * -1);
			}
			int stockMinUnit = skkDto.getSkErrorPriceTotal()/skkDto.getSkErrorVolume();
			int beforeSkProbeVolume = skkDto.getSkProbeVolume();
			int beforeSkErrorVolume =skkDto.getSkErrorVolume();
			int dtvRemain = totalStockDto.getDetailvolRemainVolume();
			
			totalStockDto.setDetailvolVolumeTotal(totalStockDto.getDetailvolRemainVolume());
			totalStockDto.setDetailvolConCount(conCount);
			totalStockDto.setDetailvolRemainVolume(0);
			totalStockDto.setDetailvolRemainCount(0);
			
			//skk update 
			skkDto.setSkProbeVolume(beforeSkProbeVolume + volumeTotal);
			skkDto.setSkErrorVolume(beforeSkErrorVolume - volumeTotal);
			skkDto.setSkErrorPriceTotal(skkDto.getSkErrorVolume() * stockMinUnit );
			System.out.println(skkDto);
			skkService.modifySkk(skkDto);
			
			
			//skk insert
			skkDto.setSkNowVolume(skkDto.getSkNowVolume() - dtvRemain);
			skkDto.setSkProbeVolume(beforeSkProbeVolume);
			skkDto.setSkErrorVolume(volumeTotal);
			skkDto.setSkErrorPriceTotal(skkDto.getSkErrorVolume()*stockMinUnit);
			skkDto.setSkEtc("??????????????? ?????????????????? ?????? ????????? ???????????? ????????? ???????????????.");
			System.out.println(skkDto);
			skkService.addSkk(skkDto);
			
		}
		totalStockService.modifyIncoCheck(incoMap);
		totalStockService.addTotalStockOverVolume(totalStockDto);
		return "redirect:/stock/getSkkDeadLine";
	}
	
	/**  dailyVol */
	@GetMapping("/getDailyvolume")
	public String getDailyVol(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<DailyVolDto> dailyVolList = dailyVolService.getDailyVol(SSTORECODE);
		model.addAttribute("dailyVolList",dailyVolList);
		return "stock/getdailyvol";
	}

	@GetMapping("/getDailyvolDeadLine")
	public String getDailyVolDeadLine(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<DailyVolDto> dailyVolDeadLineList = dailyVolService.getDailyVolDeadLine(SSTORECODE);
		List<TotalStockDto> totalStockList = totalStockService.getTotalStock(SSTORECODE);
		model.addAttribute("dailyVolDeadLineList",dailyVolDeadLineList);
		model.addAttribute("totalStockList",totalStockList);
		return "stock/getdailyvolDeadLine";
	}
	
	/* ?????? ?????? ????????? ???????????? ??????????????? ????????? ?????? ??? ?????? ????????? ???????????? ????????????  */
	@PostMapping("/getDailyvolDeadLine")
	public String getDailyVolDeadLine(
									  @RequestParam (value="volumeTotal", required = false) int volumeTotal
									 ,DailyVolDto dailyVolDto
									 ,TotalStockDto totalStockDto
									 ,ArticleDto articleDto) {
		totalStockDto.setArticleDto(articleDto);
		System.out.println(totalStockDto);
		System.out.println(dailyVolDto);
		
		Map<String , String> incoMap = new HashMap<>();
		//????????????
		int preVolume =(totalStockDto.getIncoVolumeSubtotal() - totalStockDto.getDetailvolRemainVolume());
		
		//????????????
		int dtvVolumeTotal = totalStockDto.getDetailvolVolumeTotal();
		
		int conCount = 0;
		
		// ???????????? == ???????????? ??????, ???????????? = ????????????
		if(totalStockDto.getIncoCount() == totalStockDto.getIncoVolumeSubtotal()) {
			conCount = totalStockDto.getDetailvolVolumeTotal();
		}else {
			//(????????????+????????????) / ???????????? = ???????????????????????? ??????
			conCount = (preVolume+dtvVolumeTotal)/totalStockDto.getArticleDto().getArticleVolume();
				System.out.println((double)dtvVolumeTotal/totalStockDto.getArticleDto().getArticleVolume());
				System.out.println(totalStockDto);
				System.out.println(conCount);	
		}
		if(conCount > totalStockDto.getDetailvolRemainCount()) {
			//??????????????? ?????????????????? ??? ?????? div??? ??????????????????
			conCount = totalStockDto.getDetailvolRemainCount();
		}
		
		incoMap.put("incoCode", totalStockDto.getIncoCode());
		//???????????? ????????? ??????????????? ???????????? ?????? 'o'??? ??????
		dailyVolService.modifyDailyVolDeadLine(articleDto.getArticleCode());
		if(volumeTotal >= 0) {
			/* ???????????? ??????????????? ?????? 
			 * detailvol??? ?????????(volumeTotal) insert
			 * incoCheck 2?????????
			 * */
			int haveVolTotal = (totalStockDto.getDetailvolRemainVolume() - dtvVolumeTotal);//(???)???????????? - ????????????
			totalStockDto.setDetailvolRemainVolume(haveVolTotal);//(???)???????????? input
			totalStockDto.setDetailvolConCount(conCount);//???????????? input
			
			//(???)???????????? -???????????? => (???)???????????? input
			totalStockDto.setDetailvolRemainCount(totalStockDto.getDetailvolRemainCount()-conCount);
			
			if(volumeTotal ==0) {
				incoMap.put("incoCheck", "3");
			}else {
				incoMap.put("incoCheck", "2");
			}
			
		}else {
			/* ???????????? ??????????????? ???
			 * dailyvol??? -????????? insert
			 * detailvol??? ?????????(volumeTotal) insert
			 * incoCheck??? ?????? 3??????
			 * */
			
			incoMap.put("incoCheck", "3");
			
			if(volumeTotal < 0) {
				volumeTotal = (volumeTotal * -1);
			}
			int haveSalesCount = (volumeTotal/(dtvVolumeTotal/dailyVolDto.getSalesCount()));
			
			totalStockDto.setDetailvolVolumeTotal(totalStockDto.getDetailvolRemainVolume());
			totalStockDto.setDetailvolConCount(conCount);
			totalStockDto.setDetailvolRemainVolume(0);
			totalStockDto.setDetailvolRemainCount(0);
			
			dailyVolDto.setDailyvolSubtotal(volumeTotal); //?????? ??? ???????????? insert ???????????????
			dailyVolDto.setSalesCount(haveSalesCount);//?????? ??? ?????? ???????????? insert ???????????????
			dailyVolService.addDailyVolDeadLine(dailyVolDto);
		}
		totalStockService.modifyIncoCheck(incoMap);
		totalStockService.addTotalStockOverVolume(totalStockDto);
		return "redirect:/stock/getDailyvolDeadLine";
	}
	
	/** Stock */
	@GetMapping("/getStock")
	public String getStock(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		Map<String, Object> stockMap = new HashMap<>();
		stockMap.put("SSTORECODE", SSTORECODE);
		List<StockDto> stockList = stockService.getStock(stockMap);
		List<StockDto> getStockTableList = stockService.getStockByTable(SSTORECODE);
		model.addAttribute("stockList",stockList);
		model.addAttribute("getStockTableList",getStockTableList);
		return "stock/getstock";
	}
	
	
	/** TotalStock */
	@GetMapping("/getTotalStock")
	public String getTotalStock(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<TotalStockDto> totalStockList = totalStockService.getTotalStock(SSTORECODE);
		model.addAttribute("totalStockList",totalStockList);
		return "stock/gettotalstock";
	}
	
	
	/** ajax */
	@PostMapping("/salesDeadline")
	@ResponseBody
	public String salesDeadline(@RequestParam (value = "arraySales[]", required = false) List<String> arraySales
								,HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		System.out.println(arraySales);
		
		Map<String, Object> salesInfoMap = new HashMap<>();
		salesInfoMap.put("SSTORECODE", SSTORECODE);
		salesInfoMap.put("arraySales", arraySales);
		System.out.println(salesInfoMap);
		
		String returnValue ="?????? ??????????????????";
		int result = 0;
		
		  List<DailyVolDto> dailyVolList = dailyVolService.getSalesByDailyVol(salesInfoMap); 
		  List<DealingDto> getSalesList = taxService.getSalesByDealing(salesInfoMap);
		  
		for(int i =0 ; i <  dailyVolList.size(); i++) {
			System.out.println(dailyVolList.get(i)); 
			result += dailyVolService.addDailyVol(dailyVolList.get(i));
		}
		for(int k=0; k<getSalesList.size(); k++) {
			System.out.println(getSalesList.get(k)); 
			result += taxService.addDealing(getSalesList.get(k));
		}
		
		dailyVolService.modifySalesDeadLine(arraySales);
		taxService.modifySalesDeadLineForTax(arraySales);
		 
		if(result >= 1) {
			returnValue = "????????????";
		}

		return returnValue;
	}
	
	@PostMapping("/getIncomeList")
	@ResponseBody
	public List<TotalStockDto> getIncomeList(@RequestParam (value = "incoCode",required = false) String incoCode
			,Model model , HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<TotalStockDto> totalStockList = totalStockService.getTotalStockByIncoCode(SSTORECODE, incoCode);
		return totalStockList;
	}
	
	@PostMapping("/getStockByArticleCode")
	@ResponseBody
	public List<StockDto> getStockByArticleCode(
			 @RequestParam (value="articleCode", required = false) String articleCode
			,HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("articleCode", articleCode);
		resultMap.put("SSTORECODE", SSTORECODE);
		
		List<StockDto> stockList =stockService.getStockByArticleCode(resultMap);
		return stockList;
	}
	
	@PostMapping("/addStock")
	@ResponseBody
	public String addStock(@RequestParam(value = "arrayStock[]", required = false) List<String> arrayStock
						  ,@RequestParam(value = "SSTORECODE", required = false) String SSTORECODE) {

		Map<String, Object> stockMap = new HashMap<>();
		stockMap.put("SSTORECODE", SSTORECODE);
		stockMap.put("arrayStock", arrayStock);
		List<StockDto> stockList = stockService.getStock(stockMap);
		int result = stockService.addStock(stockList);
		
		String rtString = "";
		if(result > 0 ) {
			
			rtString = "?????? ??????";
		}else {
			
			rtString = "insert ??????";
		}
			
		return rtString;
	}

	@PostMapping("/addTotalStock")
	@ResponseBody
	public String addTotalStock( @RequestParam(value = "arrayPurchases", required = false) String arrayPurchases
								,HttpSession session) {
		
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		System.out.println(arrayPurchases);
		try {
			if(!"".equals(arrayPurchases)) {
				List<Map<String,Object>> info = new Gson().fromJson(arrayPurchases, 
												new TypeToken<List<Map<String, Object>>>(){}.getType());
				List<String> arrayPurchasesTax = new ArrayList<>();
				for(int i = 0 ; i < info.size(); i++) {
					Map<String, Object> purchasesMap = new HashMap<>();
					purchasesMap.put("storeInfoCode",info.get(i).get("storeInfoCode")); 
					purchasesMap.put("incoCode",info.get(i).get("incoCode")); 
					purchasesMap.put("articleCode",info.get(i).get("articleCode")); 
					purchasesMap.put("incoVolumeSubtotal",info.get(i).get("incoVolumeSubtotal")); 
					purchasesMap.put("incoCount",info.get(i).get("incoCount")); 
					System.out.println(purchasesMap);
					
					String incoCode = (String) info.get(i).get("incoCode");
					arrayPurchasesTax.add(incoCode);
					
					totalStockService.addTotalStock(purchasesMap);
					totalStockService.modifyIncoDeadLine(incoCode);
				}
				
				Map<String, Object> purchasesInfoMap = new HashMap<>();
				
				purchasesInfoMap.put("SSTORECODE", SSTORECODE);
				purchasesInfoMap.put("arrayPurchases", arrayPurchasesTax);
				
				List<DealingDto> getPurchsesList = taxService.getPurchasesByDealing(purchasesInfoMap);
				for(int i=0; i<getPurchsesList.size();i++) {
					taxService.addDealing(getPurchsesList.get(i));
				}
				taxService.modifyPurchasesDeadLineTax(arrayPurchasesTax);
			}
		}catch (Exception e) {
		}
		
		String rtString = "";
			
		return rtString;
	}
}
