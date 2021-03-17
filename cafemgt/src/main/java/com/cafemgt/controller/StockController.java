package com.cafemgt.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafemgt.dto.ArticleDto;
import com.cafemgt.dto.SkkDto;
import com.cafemgt.dto.StockDto;
import com.cafemgt.dto.TotalStockDto;
import com.cafemgt.service.ArticleService;
import com.cafemgt.service.SkkService;
import com.cafemgt.service.StockService;
import com.cafemgt.service.TotalStockService;

@Controller
public class StockController {
	
	private final ArticleService articleService;
	private final SkkService skkService;
	private final StockService stockService;
	private final TotalStockService totalStockService;
	
	
	@Autowired
	public StockController(ArticleService articleService
						  ,SkkService skkService
						  ,StockService stockService
						  ,TotalStockService totalStockService) {
		this.articleService = articleService;
		this.skkService = skkService;
		this.stockService = stockService;
		this.totalStockService = totalStockService;
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("======================================");
		System.out.println("======= StockController bean 등록 ======");
		System.out.println("======================================");
	}
	
	@GetMapping("/addarticle")
	public String addarticle() {
		
		return "stock/addarticle";
	}
	
	@GetMapping("/addskk")
	public String addskk() {
		
		return "stock/addskk";
	}
	
	@GetMapping("/getarticle")
	public String getarticle(Model model, HttpSession session) {
		String sessionId = (String)session.getAttribute("S_ID");
		List<ArticleDto> articleList = articleService.getArticle(sessionId);
		model.addAttribute("articleList",articleList);
		
		return "stock/getarticle";
	}
	
	@GetMapping("/getskk")
	public String getskk(Model model, HttpSession session) {
		String sessionId = (String)session.getAttribute("S_ID");
		List<SkkDto> skkList = skkService.getSkk(sessionId);
		model.addAttribute("skkList",skkList);
		return "stock/getskk";
	}
	
	@GetMapping("/getstock")
	public String getstock(Model model, HttpSession session) {
		String sessionId = (String)session.getAttribute("S_ID");
		List<StockDto> stockList = stockService.getStock(sessionId);
		model.addAttribute("stockList",stockList);
		return "stock/getstock";
	}
	
	@GetMapping("/gettotalstock")
	public String gettotalstock(Model model, HttpSession session) {
		String sessionId = (String)session.getAttribute("S_ID");
		List<TotalStockDto> totalStockList = totalStockService.getTotalStock(sessionId);
		model.addAttribute("totalStockList",totalStockList);
		return "stock/gettotalstock";
	}
}
