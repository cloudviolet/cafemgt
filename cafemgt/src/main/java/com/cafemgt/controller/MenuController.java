package com.cafemgt.controller;

import java.util.ArrayList;
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

import com.cafemgt.dto.ArticleDto;
import com.cafemgt.dto.MenuDto;
import com.cafemgt.dto.RecipyDto;
import com.cafemgt.service.ArticleService;
import com.cafemgt.service.MenuService;
import com.cafemgt.service.RecipyService;

@Controller
public class MenuController {
	
	private final MenuService menuService;
	private final RecipyService recipyService;
	private final ArticleService articleService;
	@Autowired
	public MenuController(MenuService menuService,RecipyService recipyService,ArticleService articleService) {
		this.menuService = menuService;
		this.recipyService=recipyService;
		this.articleService=articleService;
	}

	@PostConstruct
	public void initialize() {
		System.out.println("======================================");
		System.out.println("======= MenuController bean 등록 ======");
		System.out.println("======================================");
	}
	//메뉴 등록
	@GetMapping("/addmenu")

	public String addmenu() {
		return "menu/addmenu";
	}
	
	@PostMapping("/addmenu")
	public String addmenu(MenuDto menuDto) {
		menuService.addMenu(menuDto);
		return "redirect:/getmenu";
	}
	
	//레시피 등록
	@GetMapping("/addrecipy")
	public String addrecipy(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<MenuDto> menuList = menuService.getMenu(SSTORECODE);
		List<ArticleDto> articleList = articleService.getArticle(SSTORECODE);
		model.addAttribute("menuList",menuList);
		model.addAttribute("articleList",articleList);
		return "menu/addrecipy";
	}
	@PostMapping("/addrecipy")
	public String addrecipy(@RequestParam(value="conName")List<String> conName
							,@RequestParam(value="conVolume")List<String> conVolume
							,@RequestParam(value="conDan")List<String> conDan
							,RecipyDto inputRecipyDto) {
		String storeCode = inputRecipyDto.getStoreInfoCode();
		String menuCode = inputRecipyDto.getMenuCode();
		System.out.println(conName);
		for(int i = 0 ; i < conName.size(); i++) {
			RecipyDto recipyDto = new RecipyDto();
			recipyDto.setStoreInfoCode(storeCode);
			recipyDto.setMenuCode(menuCode);
			recipyDto.setConName(conName.get(i));
			recipyDto.setConVolume(conVolume.get(i));
			recipyDto.setConDan(conDan.get(i));
			recipyService.addRecipy(recipyDto);
		}
		
		return "redirect:/getrecipy";
	}
	
	@GetMapping("/getmenu")
	public String getmenu(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<MenuDto> menuList = menuService.getMenu(SSTORECODE);
		model.addAttribute("menuList",menuList);
		return "menu/getmenu";
	}
	
	@GetMapping("/getrecipy")
	public String getrecipy(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<RecipyDto> recipyList = recipyService.getRecipy(SSTORECODE);
		model.addAttribute("recipyList",recipyList);
		return "menu/getrecipy";
	}
	
	
	
}
