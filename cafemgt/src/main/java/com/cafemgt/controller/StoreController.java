package com.cafemgt.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafemgt.dto.UserDto;
import com.cafemgt.service.UserService;

@Controller
public class StoreController {
	
	private final UserService userService;
	
	@Autowired
	public StoreController(UserService userService) {
		this.userService = userService;
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("======================================");
		System.out.println("======= StoreController bean 등록 ======");
		System.out.println("======================================");
	}
	
	
	@GetMapping("/getuser")
	public String getuser(Model model) {
		List<UserDto> userDtoList = userService.getUser();
		model.addAttribute("userList", userDtoList);
		
		return "store/getuser";	
	}
	
	@GetMapping("/addstore")
	public String addstore(Model model) {
		
		return "store/addstore";		
	}
	
	@GetMapping("/addcustomer")
	public String addcustomer() {
		
		return "store/addcustomer";	
	}
	
	@GetMapping("/adduser")
	public String adduser() {
		
		return "store/adduser";	
	}
	
	@GetMapping("/getstore")
	public String getstore() {
		
		return "store/getstore";	
	}
	
	@GetMapping("/getcustomer")
	public String getcustomer() {
		
		return "store/getcustomer";	
	}
	


}
