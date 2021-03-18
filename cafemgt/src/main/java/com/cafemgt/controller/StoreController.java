package com.cafemgt.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafemgt.dto.CustomerDto;
import com.cafemgt.dto.UserDto;
import com.cafemgt.service.CustomerService;
import com.cafemgt.service.UserService;

@Controller
public class StoreController {
	
	private final UserService userService;
	private final CustomerService customerService;
	
	
	@Autowired
	public StoreController(UserService userService
						  ,CustomerService customerService) {
		this.userService = userService;
		this.customerService = customerService;
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("======================================");
		System.out.println("======= StoreController bean 등록 ======");
		System.out.println("======================================");
	}
	
	
	@GetMapping("/login")
	public String login(Model model) {
		
		return "store/login";	
	}
	@GetMapping("/join")
	public String join(Model model) {

		return "store/join";	
	}
	@GetMapping("/getuser")
	public String getuser(Model model) {
		List<UserDto> userDtoList = userService.getUser();
		model.addAttribute("userList", userDtoList);
		
		return "store/getuser";	
	}
	
	@GetMapping("/getuseradmin")
	public String getuseradmin(Model model) {
		List<UserDto> userDtoList = userService.getUser();
		model.addAttribute("userList", userDtoList);
		
		return "admin/getuseradmin";	
	}
	
	@GetMapping("/getusermy")
	public String getusermy(Model model) {
		List<UserDto> userDtoList = userService.getUser();
		model.addAttribute("userList", userDtoList);
		
		return "store/getusermy";	
	}
	
	@GetMapping("/getcustomer")
	public String getcustomer(Model model) {
		List<CustomerDto> customerDtoList = customerService.getCustomer();
		model.addAttribute("customerList", customerDtoList);
		
		return "store/getcustomer";	
	}
	
	@GetMapping("/getcustomeradmin")
	public String getcustomeradmin() {
		
		return "admin/getcustomeradmin";	
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
	@GetMapping("/getstoreadmin")
	public String getstoreadmin() {
		
		return "admin/getstoreadmin";	
	}
	
	

	


}
