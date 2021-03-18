package com.cafemgt.controller;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {
	
	@PostConstruct
	public void initialize() {
		System.out.println("======================================");
		System.out.println("======= CommonController bean 등록======");
		System.out.println("======================================");
	}
	
	@GetMapping("/addowner")
	public String addowner() {
		
		return "owner/addowner";		
	}
	
	@GetMapping("/getowner")
	public String getowner() {
		return "owner/getowner";		
	}
	
	@GetMapping("/")
	public String main(HttpSession session) {
		session.setAttribute("S_ID", "owner_01");
		return "index";
	}
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	
}
