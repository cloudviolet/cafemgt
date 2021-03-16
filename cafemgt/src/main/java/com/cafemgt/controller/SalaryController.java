package com.cafemgt.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafemgt.dto.SalaryDto;
import com.cafemgt.service.SalaryService;

@Controller
public class SalaryController {
	
	private final SalaryService salaryService;
	
	@Autowired
	public SalaryController(SalaryService salaryService) {
		this.salaryService = salaryService;
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("======================================");
		System.out.println("======= SalaryController bean 등록 ======");
		System.out.println("======================================");
	}
	
	@GetMapping("/addsalary")
	public String addsalary() {

		return "salary/addsalary";
	}
	
	@GetMapping("/getsalary")
	public String getsalary(Model model) {
		
		List<SalaryDto> salaryList = salaryService.getSalary();
		model.addAttribute("salaryList",salaryList);
		
		return "salary/getsalary";
	}
	
	
	
	@GetMapping("/adddsalary")
	public String adddsalary() {
		
		return "dsalary/adddsalary";
	}
	
	@GetMapping("/getdsalary")
	public String getdsalary() {
		
		return "dsalary/getdsalary";
	}
	
	
	
	@GetMapping("/addwtime")
	public String addwtime() {
		
		return "dsalary/addwtime";
	}
	
	@GetMapping("/getwtime")
	public String getwtime() {
		
		return "dsalary/getwtime";
	}
	
	
	@GetMapping("/addbonus")
	public String addbonus() {
		
		return "bonus/addbonus";
	}
	
	@GetMapping("/getbonus")
	public String getbonus() {
		
		return "bonus/getbonus";
	}
	
}
