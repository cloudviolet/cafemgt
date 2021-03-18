package com.cafemgt.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafemgt.dto.CustomerDto;
import com.cafemgt.dto.OwnerDto;
import com.cafemgt.dto.UserDto;
import com.cafemgt.service.CustomerService;
import com.cafemgt.service.OwnerService;
import com.cafemgt.service.UserService;

@Controller
public class StoreController {
	
	private final UserService userService;
	private final CustomerService customerService;
	private final OwnerService ownerService;
	
	
	@Autowired
	public StoreController(UserService userService
						  ,CustomerService customerService
						  ,OwnerService ownerService) {
		this.userService = userService;
		this.customerService = customerService;
		this.ownerService = ownerService;
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("======================================");
		System.out.println("======= StoreController bean 등록 ======");
		System.out.println("======================================");
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam(value="inId", required = false)String ownerId
					   ,@RequestParam(value="inPw", required = false)String ownerPw
					   ,HttpSession session) {
		System.out.println(ownerId + "++++++++++++++++++++++++id");
		System.out.println(ownerPw + "++++++++++++++++++++++++pw");
		if((ownerId != null && !"".equals(ownerId)) &&
		   (ownerPw != null && !"".equals(ownerPw))) {
			String result = ownerService.login(ownerId, ownerPw);
			System.out.println(result +"++++++로그인성공++++++");
			if(result.equals("로그인 성공")) {				
				  OwnerDto ownerDto = ownerService.getinfoOwner(ownerId);
				  System.out.println(ownerDto.getOwnerId());
				  System.out.println(ownerDto.getOwnerName());
				  session.setAttribute("OID", ownerDto.getOwnerId());
				  session.setAttribute("ONAME", ownerDto.getOwnerName());				 
			}		
			return "redirect:/";			
		}
		return "redirect:/login";
	}
	
	
	@GetMapping("/login")
	public String login(Model model) {
		
		return "store/login";	
	}
	@GetMapping("/join")
	public String join() {
		
		return "owner/join";	
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
	
	@GetMapping("/getcustomer")
	public String getcustomer(Model model) {
		List<CustomerDto> customerDtoList = customerService.getCustomer();
		model.addAttribute("customerList", customerDtoList);
		
		return "store/getcustomer";	
	}

	
	@GetMapping("/getcustomeradmin")
	public String getcustomeradmin(Model model) {
		List<CustomerDto> customerDtoList = customerService.getCustomer();
		model.addAttribute("customerList", customerDtoList);
		
		return "admin/getcustomeradmin";	
	}
	
	@GetMapping("/getusermy")
	public String getusermy(Model model) {
		List<UserDto> userDtoList = userService.getUser();
		model.addAttribute("userList", userDtoList);
		
		return "store/getusermy";	
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
