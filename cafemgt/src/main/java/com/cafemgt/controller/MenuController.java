package com.cafemgt.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafemgt.dao.DailyVolMapper;
import com.cafemgt.dto.ArticleDto;
import com.cafemgt.dto.MenuDto;
import com.cafemgt.dto.RecipyDto;
import com.cafemgt.service.ArticleService;
import com.cafemgt.service.DailyVolService;
import com.cafemgt.service.MenuService;
import com.cafemgt.service.RecipyService;

@Controller
@RequestMapping("/menu")
public class MenuController {
	
	private final MenuService menuService;
	private final RecipyService recipyService;
	private final ArticleService articleService;
	private final DailyVolService dailyVolService;
	
	@Autowired
	public MenuController(MenuService menuService,RecipyService recipyService,ArticleService articleService, DailyVolService dailyVolService) {
		this.menuService = menuService;
		this.recipyService=recipyService;
		this.articleService=articleService;
		this.dailyVolService=dailyVolService;
	}

	@PostConstruct
	public void initialize() {
		System.out.println("======================================");
		System.out.println("======= MenuController bean 등록 ======");
		System.out.println("======================================");
	}
	//메뉴 등록
	@GetMapping("/addMenu")
	public String addMenu() {
		return "menu/addmenu";
	}
	
	@PostMapping("/addMenu")
	public String addMenu(MenuDto menuDto) {
		menuService.addMenu(menuDto);
		return "redirect:/menu/getMenu";
	}
	
	//레시피 등록
	@GetMapping("/addRecipy")
	public String addRecipy(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<MenuDto> menuList = menuService.getMenu(SSTORECODE);
		List<ArticleDto> articleList = articleService.getArticle(SSTORECODE);
		model.addAttribute("menuList",menuList);
		model.addAttribute("articleList",articleList);
		return "menu/addrecipy";
	}
	@PostMapping("/addRecipy")
	public String addRecipy( @RequestParam(value="articleCode")List<String> articleCode
							,@RequestParam(value="conVolume")List<String> conVolume
							,@RequestParam(value="conDan")List<String> conDan
							,RecipyDto inputRecipyDto) {
		String storeCode = inputRecipyDto.getStoreInfoCode();
		String menuCode = inputRecipyDto.getMenuCode();
		System.out.println(articleCode);
		for(int i = 0 ; i < articleCode.size(); i++) {
			RecipyDto recipyDto = new RecipyDto();
			recipyDto.setStoreInfoCode(storeCode);
			recipyDto.setMenuCode(menuCode);
			recipyDto.setArticleCode(articleCode.get(i));
			recipyDto.setConVolume(conVolume.get(i));
			recipyDto.setConDan(conDan.get(i));
			recipyService.addRecipy(recipyDto);
		}
		
		return "redirect:/menu/getRecipy";
	}
	
	@GetMapping("/getMenu")
	public String getMenu(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<MenuDto> menuList = menuService.getMenu(SSTORECODE);
		model.addAttribute("menuList",menuList);
		return "menu/getmenu";
	}
	
	@GetMapping("/getRecipy")
	public String getRecipy(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<RecipyDto> recipyList = recipyService.getRecipy(SSTORECODE);
		List<String> conCodeList = dailyVolService.getDailyVolByConCode(SSTORECODE);
		
		/*
		 * for(int i = 0; i < recipyList.size(); i++){ for(int j = 0 ; j<
		 * conCodeList.size(); j++) {
		 * if(recipyList.get(i).getConCode().equals(conCodeList.get(j))) {
		 * recipyList.get(i).setConRemoveString("불가"); break; }else {
		 * recipyList.get(i).setConRemoveString("삭제"); } } }
		 */
		
		model.addAttribute("recipyList",recipyList);
		model.addAttribute("conCodeList",conCodeList);
		return "menu/getrecipy";
	}
	
	@GetMapping("/modifyMenu")
	public String modifyMenu(Model model, String menuCode) {
		MenuDto menuDto = menuService.getMenuByMenuCode(menuCode);
		model.addAttribute("menuDto",menuDto);
		return "menu/modifymenu";
	}
	
	@PostMapping("/modifyMenu")
	public String modifyMenu(MenuDto menuDto) {
		menuService.modifyMenu(menuDto);
		return "redirect:/menu/getMenu";
	}
	
	@GetMapping("/modifyRecipy")
	public String modifyRecipy(Model model, String conCode, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		RecipyDto recipyDto = recipyService.getRecipyByConCode(conCode);
		List<MenuDto> menuList = menuService.getMenu(SSTORECODE);
		List<ArticleDto> articleList = articleService.getArticle(SSTORECODE);
		List<RecipyDto> recipyList = recipyService.getRecipy(SSTORECODE);
		model.addAttribute("recipyDto",recipyDto);
		model.addAttribute("menuList",menuList);
		model.addAttribute("articleList",articleList);
		model.addAttribute("recipyList",recipyList);
		return "menu/modifyrecipy";
	}
	
	@PostMapping("/modifyRecipy")
	public String modifyRecipy(RecipyDto recipyDto) {
		recipyService.modifyRecipy(recipyDto);
		return "redirect:/menu/getRecipy";
	}
	
	@GetMapping("/removeMenu")
	public String removeMenu(@RequestParam (value = "menuCode",required = false)String menuCode) {
		menuService.removeMenu(menuCode);
		return "redirect:/menu/getMenu";
	}
	@GetMapping("/removeRecipy")
	public String removeRecipy(@RequestParam (value="conCode", required = false) String conCode) {
		recipyService.removeRecipy(conCode);
		return "redirect:/menu/getRecipy";
	}
	
}
