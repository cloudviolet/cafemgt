package com.cafemgt.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafemgt.dto.ArticleDto;
import com.cafemgt.dto.DailyVolDto;
import com.cafemgt.dto.SkkDto;
import com.cafemgt.dto.StockDto;
import com.cafemgt.dto.TotalStockDto;
import com.cafemgt.service.ArticleService;
import com.cafemgt.service.DailyVolService;
import com.cafemgt.service.SkkService;
import com.cafemgt.service.StockService;
import com.cafemgt.service.TotalStockService;

@Controller
public class StockController {
	
	private final ArticleService articleService;
	private final SkkService skkService;
	private final StockService stockService;
	private final TotalStockService totalStockService;
	private final DailyVolService dailyVolService;
	
	@Autowired
	public StockController(ArticleService articleService
						  ,SkkService skkService
						  ,StockService stockService
						  ,TotalStockService totalStockService
						  ,DailyVolService dailyVolService) {
		this.articleService = articleService;
		this.skkService = skkService;
		this.stockService = stockService;
		this.totalStockService = totalStockService;
		this.dailyVolService = dailyVolService;
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("======================================");
		System.out.println("======= StockController bean 등록 ======");
		System.out.println("======================================");
	}
	
	@GetMapping("/addarticle")
	public String addArticle() {

		return "stock/addarticle";
	}
	@PostMapping("/addarticle")
	public String addArticle(ArticleDto articleDto) {
		articleService.addArticle(articleDto);
		return "redirect:/getarticle";
	}
	
	@GetMapping("/addskk")
	public String addSkk(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<ArticleDto> articleList = articleService.getArticle(SSTORECODE);
		model.addAttribute("articleList",articleList);
		return "stock/addskk";
	}
	
	@GetMapping("/getarticle")
	public String getArticle(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<ArticleDto> articleList = articleService.getArticle(SSTORECODE);
		model.addAttribute("articleList",articleList);
		return "stock/getarticle";
	}
	
	@GetMapping("/getskk")
	public String getSkk(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<SkkDto> skkList = skkService.getSkk(SSTORECODE);
		model.addAttribute("skkList",skkList);
		return "stock/getskk";
	}
	
	@GetMapping("/getstock")
	public String getStock(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<StockDto> stockList = stockService.getStock(SSTORECODE);
		model.addAttribute("stockList",stockList);
		return "stock/getstock";
	}
	
	@GetMapping("/getdailyvolume")
	public String getDailyVol(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<DailyVolDto> dailyVolList = dailyVolService.getDailyVol(SSTORECODE);
		model.addAttribute("dailyVolList",dailyVolList);
		return "stock/getdailyvol";
	}

	@GetMapping("/getdailyvolDeadLine")
	public String getDailyVolDeadLine(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<DailyVolDto> dailyVolDeadLineList = dailyVolService.getDailyVolDeadLine(SSTORECODE);
		List<TotalStockDto> totalStockList = totalStockService.getTotalStock(SSTORECODE);
		model.addAttribute("dailyVolDeadLineList",dailyVolDeadLineList);
		model.addAttribute("totalStockList",totalStockList);
		return "stock/getdailyvolDeadLine";
	}
	/* 일일 품목 소모량 조회에서 마감처리시 품목별 재고 총 수량 조회에 등록하는 컨트롤러  */
	@PostMapping("/getdailyvolDeadLine")
	public String getDailyVolDeadLine(
									  @RequestParam (value="volumeTotal", required = false) int volumeTotal
									 ,DailyVolDto dailyVolDto
									 ,TotalStockDto totalStockDto) {
		
		Map<String , String> incoMap = new HashMap<>();
		//이전용량
		int preVolume =(totalStockDto.getIncoVolumeSubtotal() - totalStockDto.getDetailvolRemainVolume());
		//소모용량
		int dtvVolumeTotal = totalStockDto.getDetailvolVolumeTotal();
		//(이전용량+소모용량) / 품목용량 = 몇개품목사용갯수 계산
		int conCount = (preVolume+dtvVolumeTotal)/totalStockDto.getArticleVolume();
			System.out.println((double)dtvVolumeTotal/totalStockDto.getArticleVolume());
			System.out.println(totalStockDto);
			System.out.println(conCount);
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
		dailyVolService.modifyDailyVolDeadLine(dailyVolDto.getDailyvolCode());
		totalStockService.addTotalStockOverVolume(totalStockDto);
		return "redirect:/getdailyvolDeadLine";
	}
	
	@GetMapping("/gettotalstock")
	public String getTotalStock(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<TotalStockDto> totalStockList = totalStockService.getTotalStock(SSTORECODE);
		model.addAttribute("totalStockList",totalStockList);
		return "stock/gettotalstock";
	}
	
	@ResponseBody
	@PostMapping("/getIncomeList")
	public List<TotalStockDto> getIncomeList(@RequestParam (value = "incoCode",required = false) String incoCode
			,Model model , HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<TotalStockDto> totalStockList = totalStockService.getTotalStockByIncoCode(SSTORECODE, incoCode);
		return totalStockList;
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
		return "redirect:/getarticle";
	}
	
	@ResponseBody
	@PostMapping("/salesDeadline")
	public String salesDeadline(@RequestParam (value = "arraySales[]", required = false) List<String> arraySales
								,HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		Map<String, Object> salesInfoMap = new HashMap<>();
		salesInfoMap.put("SSTORECODE", SSTORECODE);
		salesInfoMap.put("arraySales", arraySales);
		System.out.println(salesInfoMap);
		
		String returnValue ="값을 입력해주세요";
		int result = 0;

		
		  List<DailyVolDto> dailyVolList = dailyVolService.getSalesByDailyVol(salesInfoMap); 
		  for(int i =0 ; i <  dailyVolList.size(); i++) {
			  System.out.println(dailyVolList.get(i)); 
			  result  += dailyVolService.addDailyVol(dailyVolList.get(i)); 
		  }
		 
		dailyVolService.modifySalesDeadLine(arraySales);
		if(result >= 1) {
			returnValue = "정상처리";
		}
		
		return returnValue;
	}
	
	
}
