package com.cafemgt.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafemgt.dto.ArticleDto;
import com.cafemgt.service.ArticleService;

@Controller
public class StockController {
	
	private final ArticleService articleService;
	
	@Autowired
	public StockController(ArticleService articleService) {
		this.articleService = articleService;
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
	public String getarticle(Model model) {
		List<ArticleDto> articleList = articleService.getArticle();
		model.addAttribute("articleList",articleList);
		
		return "stock/getarticle";
	}
	
	@GetMapping("/getskk")
	public String getskk() {
		
		return "stock/getskk";
	}
	
	@GetMapping("/getstock")
	public String getstock() {
		
		return "stock/getstock";
	}
	
	@GetMapping("/gettotalstock")
	public String gettotalstock() {
		
		return "stock/gettotalstock";
	}
}
