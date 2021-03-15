package com.cafemgt.controller;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;

@Controller
public class StoreController {
	
	@PostConstruct
	public void initialize() {
		System.out.println("======================================");
		System.out.println("======= StoreController bean 등록 ======");
		System.out.println("======================================");
	}

}
