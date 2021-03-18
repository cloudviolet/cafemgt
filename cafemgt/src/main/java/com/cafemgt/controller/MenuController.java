package com.cafemgt.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafemgt.dto.MenuDto;
import com.cafemgt.dto.RecipyDto;
import com.cafemgt.service.MenuService;
import com.cafemgt.service.RecipyService;

@Controller
public class MenuController {
	
	private final MenuService menuService;
	private final RecipyService recipyService;
	
	@Autowired
	public MenuController(MenuService menuService,RecipyService recipyService) {
		this.menuService = menuService;
		this.recipyService=recipyService;
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("======================================");
		System.out.println("======= MenuController bean 등록 ======");
		System.out.println("======================================");
	}
	//메뉴 등록
	@GetMapping("/addmenu")
	public String addmenu(Model model, HttpSession session) {
		String sessionId = (String)session.getAttribute("S_ID");
		System.out.println(sessionId);
		model.addAttribute("sessionId",sessionId);
		return "menu/addmenu";
	}
	@PostMapping("/addmenu")
	public String addmenu(MenuDto menuDto) {
		System.out.println(menuDto.getMenuName());
		System.out.println(menuDto.getMenuCate());
		System.out.println(menuDto.getMenuPrice());
		/* menuService.addMenu(menuDto); */
		return "redirect:/getmenu";
	}
	
	//레시피 등록
	@GetMapping("/addrecipy")
	public String addrecipy(Model model, HttpSession session) {
		String sessionId = (String)session.getAttribute("S_ID");
		List<MenuDto> menuList = menuService.getMenu(sessionId);
		model.addAttribute("menuList",menuList);
		return "menu/addrecipy";
	}
	
	@GetMapping("/getmenu")
	public String getmenu(Model model, HttpSession session) {
		String sessionId = (String)session.getAttribute("S_ID");
		List<MenuDto> menuList = menuService.getMenu(sessionId);
		model.addAttribute("menuList",menuList);
		return "menu/getmenu";
	}
	
	@GetMapping("/getrecipy")
	public String getrecipy(Model model, HttpSession session) {
		String sessionId = (String)session.getAttribute("S_ID");
		List<RecipyDto> recipyList = recipyService.getRecipy(sessionId);
		model.addAttribute("recipyList",recipyList);
		return "menu/getrecipy";
	}
	
	
	
}
