package com.cafemgt.controller;

import java.util.List;

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
import com.cafemgt.dto.PurchasesDto;
import com.cafemgt.dto.SkkDto;
import com.cafemgt.dto.StockDto;
import com.cafemgt.dto.TotalStockDto;
import com.cafemgt.service.ArticleService;
import com.cafemgt.service.DailyVolService;
import com.cafemgt.service.PurchasesService;
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
	private final PurchasesService purchasesService;
	
	@Autowired
	public StockController(ArticleService articleService
						  ,SkkService skkService
						  ,StockService stockService
						  ,TotalStockService totalStockService
						  ,DailyVolService dailyVolService
						  ,PurchasesService purchasesService) {
		this.articleService = articleService;
		this.skkService = skkService;
		this.stockService = stockService;
		this.totalStockService = totalStockService;
		this.dailyVolService = dailyVolService;
		this.purchasesService = purchasesService;
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
		List<PurchasesDto> purchasesDtoList = purchasesService.getPurchases(SSTORECODE);
		model.addAttribute("dailyVolDeadLineList",dailyVolDeadLineList);
		model.addAttribute("purchasesDtoList",purchasesDtoList);
		return "stock/getdailyvolDeadLine";
	}
	/* 이거  */
	@PostMapping("/getdailyvolDeadLine")
	public String getDailyVolDeadLine(
									  @RequestParam (value="volumeTotal", required = false) int volumeTotal
									 ,@RequestParam (value="salesTotal", required = false) int salesTotal
									 ,DailyVolDto dailyVolDto
									 ,TotalStockDto totalStockDto) {
		
		int incoCheck = totalStockDto.getIncoCheck();
		int articleVolume = totalStockDto.getArticleVolume();
		int dtvVolumeTotal = totalStockDto.getDetailvolVolumeTotal();
		int div = dtvVolumeTotal/articleVolume;

		
		System.out.println(div);
		if(volumeTotal >= 0) {
			/* 소모량이 잔여량보다 작음 
			 * detailvol에 소모량(volumeTotal) insert
			 * incoCheck 2단계로
			 * */
			
			if(incoCheck == 1) {
				/* 1이면 입고용량에서 빼기 */
				if(div > totalStockDto.getIncoCount() ) {
					//소모수량이 입고수량보다 클 경우  div를 입고용량으로
					div = totalStockDto.getIncoCount();
				}
				
			}else if(incoCheck == 2){
				/* 2이면 잔여용량에서 빼기*/
				if(div > totalStockDto.getDetailvolRemainCount()) {
					//소모수량이 잔여수량보다 클 경우 div를 잔여용량으로
					div = totalStockDto.getDetailvolRemainCount();
				}
				
			}
			
		}else {
			/* 소모량이 잔여량보다 큼
			 * dailyvol에 -된만큼 insert
			 * detailvol에 소모량(volumeTotal) insert
			 * incoCheck에 단계 3으로
			 * */
			if(incoCheck == 1) {
				/* 1이면 입고용량에서 빼기 */
				if(div > totalStockDto.getIncoCount() ) {
					//소모수량이 입고수량보다 클 경우  div를 입고용량으로
					div = totalStockDto.getIncoCount();
				}
				
			}else if(incoCheck == 2){
				/* 2이면 잔여용량에서 빼기*/
				if(div > totalStockDto.getDetailvolRemainCount()) {
					//소모수량이 잔여수량보다 클 경우 div를 잔여용량으로
					div = totalStockDto.getDetailvolRemainCount();
				}
				totalStockDto.setDetailvolConCount(div);
				totalStockDto.setDetailvolVolumeTotal(totalStockDto.getDetailvolRemainVolume());
				totalStockDto.setDetailvolRemainVolume(0);
				totalStockDto.setDetailvolRemainCount(0);
				
			}else {
				System.out.println("예상치 못한 에러");
			}
			System.out.println(dailyVolDto);
			//totalStockService.addTotalStockOverVolume(totalStockDto);
			volumeTotal = (volumeTotal * -1);
		}
		
		return "redirect:/getdailyvolDeadLine";
	}
	
	@GetMapping("/gettotalstock")
	public String getTotalStock(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<TotalStockDto> totalStockList = totalStockService.getTotalStock(SSTORECODE);
		//System.out.println(totalStockList.get(0).getIncoDto().getIncoCount());
		model.addAttribute("totalStockList",totalStockList);
		return "stock/gettotalstock";
	}
	
	@ResponseBody
	@PostMapping("/getIncomeList")
	public List<TotalStockDto> getIncomeList(@RequestParam (value = "articleCode",required = false) String articleCode
			,Model model , HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<TotalStockDto> totalStockList = totalStockService.getTotalStockByIncoCode(SSTORECODE, articleCode);
		return totalStockList;
	}
	
}
