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
		System.out.println("======= StockController bean 등록 ======");
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
		//이전용량
		int preVolume =(totalStockDto.getIncoVolumeSubtotal() - totalStockDto.getDetailvolRemainVolume());
		
		//소모용량
		int dtvVolumeTotal = totalStockDto.getDetailvolVolumeTotal();
		
		int conCount = 0;
		
		// 입고수량 == 입고용량 일때, 소모수량 = 소모용량
		if(totalStockDto.getIncoCount() == totalStockDto.getIncoVolumeSubtotal()) {
			conCount = totalStockDto.getDetailvolVolumeTotal();
		}else {
			//(이전용량+소모용량) / 품목용량 = 몇개품목사용갯수 계산
			conCount = (preVolume+dtvVolumeTotal)/totalStockDto.getArticleDto().getArticleVolume();
				System.out.println((double)dtvVolumeTotal/totalStockDto.getArticleDto().getArticleVolume());
				System.out.println(totalStockDto);
				System.out.println(conCount);	
		}
		if(conCount > totalStockDto.getDetailvolRemainCount()) {
			//소모수량이 잔여수량보다 클 경우 div를 잔여용량으로
			conCount = totalStockDto.getDetailvolRemainCount();
		}
		
		incoMap.put("incoCode", totalStockDto.getIncoCode());
		if(volumeTotal >= 0) {
			/* 소모량이 잔여량보다 작음 
			 * detailvol에 소모량(volumeTotal) insert
			 * incoCheck 2단계로
			 * */
			int haveVolTotal = (totalStockDto.getDetailvolRemainVolume() - dtvVolumeTotal);//(전)잔여용량 - 소모용량
			totalStockDto.setDetailvolRemainVolume(haveVolTotal);//(현)잔여용량 input
			totalStockDto.setDetailvolConCount(conCount);//소모수량 input
			
			//(전)잔여수량 -소모수량 => (현)잔여수량 input
			totalStockDto.setDetailvolRemainCount(totalStockDto.getDetailvolRemainCount()-conCount);
			
			if(volumeTotal ==0) {
				incoMap.put("incoCheck", "3");
			}else {
				incoMap.put("incoCheck", "2");
			}
			skkService.modifySkkDeadlineCheck(skkDto.getSkCode());
		}else {
			/* 소모량이 잔여량보다 큼
			 * skk에 -된만큼 insert
			 * detailvol에 소모량(volumeTotal) insert
			 * incoCheck에 단계 3으로
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
			skkDto.setSkEtc("소모용량이 잔여용량보다 많아 계산된 용량만큼 재등록 되었습니다.");
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
	
	/* 일일 품목 소모량 조회에서 마감처리시 품목별 재고 총 수량 조회에 등록하는 컨트롤러  */
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
		//이전용량
		int preVolume =(totalStockDto.getIncoVolumeSubtotal() - totalStockDto.getDetailvolRemainVolume());
		
		//소모용량
		int dtvVolumeTotal = totalStockDto.getDetailvolVolumeTotal();
		
		int conCount = 0;
		
		// 입고수량 == 입고용량 일때, 소모수량 = 소모용량
		if(totalStockDto.getIncoCount() == totalStockDto.getIncoVolumeSubtotal()) {
			conCount = totalStockDto.getDetailvolVolumeTotal();
		}else {
			//(이전용량+소모용량) / 품목용량 = 몇개품목사용갯수 계산
			conCount = (preVolume+dtvVolumeTotal)/totalStockDto.getArticleDto().getArticleVolume();
				System.out.println((double)dtvVolumeTotal/totalStockDto.getArticleDto().getArticleVolume());
				System.out.println(totalStockDto);
				System.out.println(conCount);	
		}
		if(conCount > totalStockDto.getDetailvolRemainCount()) {
			//소모수량이 잔여수량보다 클 경우 div를 잔여용량으로
			conCount = totalStockDto.getDetailvolRemainCount();
		}
		
		incoMap.put("incoCode", totalStockDto.getIncoCode());
		//마감확인 컬럼을 품목코드를 조건으로 해서 'o'로 변경
		dailyVolService.modifyDailyVolDeadLine(articleDto.getArticleCode());
		if(volumeTotal >= 0) {
			/* 소모량이 잔여량보다 작음 
			 * detailvol에 소모량(volumeTotal) insert
			 * incoCheck 2단계로
			 * */
			int haveVolTotal = (totalStockDto.getDetailvolRemainVolume() - dtvVolumeTotal);//(전)잔여용량 - 소모용량
			totalStockDto.setDetailvolRemainVolume(haveVolTotal);//(현)잔여용량 input
			totalStockDto.setDetailvolConCount(conCount);//소모수량 input
			
			//(전)잔여수량 -소모수량 => (현)잔여수량 input
			totalStockDto.setDetailvolRemainCount(totalStockDto.getDetailvolRemainCount()-conCount);
			
			if(volumeTotal ==0) {
				incoMap.put("incoCheck", "3");
			}else {
				incoMap.put("incoCheck", "2");
			}
			
		}else {
			/* 소모량이 잔여량보다 큼
			 * dailyvol에 -된만큼 insert
			 * detailvol에 소모량(volumeTotal) insert
			 * incoCheck에 단계 3으로
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
			
			dailyVolDto.setDailyvolSubtotal(volumeTotal); //계산 후 남은용량 insert 하기위해서
			dailyVolDto.setSalesCount(haveSalesCount);//계산 후 남은 판매수량 insert 하기위해서
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
		
		String returnValue ="값을 입력해주세요";
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
		for(int j = 0 ; j < arraySales.size() ; j++) {
			salesService.addCostDetail(arraySales.get(j), SSTORECODE);
		}
		
		dailyVolService.modifySalesDeadLine(arraySales);
		taxService.modifySalesDeadLineForTax(arraySales);
		 
		if(result >= 1) {
			returnValue = "정상처리";
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
			rtString = "정상 동작";
		}else {
			rtString = "insert 실패";
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
