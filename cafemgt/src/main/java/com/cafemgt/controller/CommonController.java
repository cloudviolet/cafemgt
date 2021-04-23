package com.cafemgt.controller;


import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CommonController {
	
	
	@PostConstruct
	public void initialize() {
		System.out.println("======================================");
		System.out.println("======= CommonController bean 등록======");
		System.out.println("======================================");
	}
	
	
	@GetMapping("/")
		public String main(@RequestParam(value="storeInfoCode", required = false)String storeInfoCode
							,HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		if(SSTORECODE == null) {
			session.setAttribute("SSTORECODE",storeInfoCode);				 
		}
			 System.out.println(storeInfoCode);
		    

		return "index";
	}
	@GetMapping("/index")
	public String index() {

		return "index";
	}
	
	
}
