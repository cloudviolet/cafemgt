package com.cafemgt.controller;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {
	
	
	@PostConstruct
	public void initialize() {
		System.out.println("======================================");
		System.out.println("======= CommonController bean 등록 ======");
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
	public String main() {
		
		return "index";
	}
	@GetMapping("/index")
	public String index(HttpSession session ,Model model) {
		String oid = (String)session.getAttribute("OID");
		String oname = (String)session.getAttribute("ONAME");
		model.addAttribute("oid",oid);
		model.addAttribute("oname",oname);
		return "index";
	}
	//required = get방식으로 전달하지 않아도 받기위해서  값이 필수적인가?,defaultValue= "get방식"
	
	
}
