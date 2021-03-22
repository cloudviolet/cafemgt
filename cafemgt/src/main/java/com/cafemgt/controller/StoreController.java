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
import com.cafemgt.dto.StoreDto;
import com.cafemgt.dto.UserDto;
import com.cafemgt.service.CustomerService;
import com.cafemgt.service.OwnerService;
import com.cafemgt.service.StoreService;
import com.cafemgt.service.UserService;

@Controller
public class StoreController {
	
	private final UserService userService;
	private final CustomerService customerService;
	private final OwnerService ownerService;
	private final StoreService storeService;
	
	
	@Autowired
	public StoreController(UserService userService
						  ,CustomerService customerService
						  ,OwnerService ownerService
						  ,StoreService storeService) {
		this.userService = userService;
		this.customerService = customerService;
		this.ownerService = ownerService;
		this.storeService = storeService;
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
				  
				  List<StoreDto> storeDtoList = storeService.getStoreInfoByOwnerId(ownerId);
				  String storeInfoCode = storeDtoList.get(0).getStoreInfoCode();
				  
				  System.out.println(ownerDto.getOwnerId());
				  System.out.println(ownerDto.getOwnerName());
				  System.out.println(storeInfoCode);
				  
				  session.setAttribute("OID", ownerDto.getOwnerId());
				  session.setAttribute("ONAME", ownerDto.getOwnerName());				 
				  session.setAttribute("SSTORECODE", storeInfoCode);				 
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
	@PostMapping("/join")
	public String join(Model model) {
		
		return "redirect:/index";	
	}
	
	@GetMapping("/addowner")
	public String addowner() {
		
		return "owner/addowner";		
	}
	
	@GetMapping("/getowner")
	public String getowner(Model model, HttpSession session) {
		String OID = (String)session.getAttribute("OID");
		List<OwnerDto> ownerDtoList = ownerService.getOwner(OID);
		model.addAttribute("ownerList", ownerDtoList);
		
		return "owner/getowner";		
	}
	
	
	@GetMapping("/getowneradmin")
	public String getowneradmin(Model model) {
		List<OwnerDto> ownerDtoList = ownerService.getOwneradmin();
		model.addAttribute("ownerList", ownerDtoList);
		return "admin/getowneradmin";		
	}
	
	@GetMapping("/getstore")
	public String getstore(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<StoreDto> storeDtoList = storeService.getStore(SSTORECODE);
		model.addAttribute("storeDtoList",storeDtoList);
		
		return "store/getstore";	
	}
		
	@GetMapping("/getuser")
	public String getuser(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<UserDto> userDtoList = userService.getUser(SSTORECODE);
		model.addAttribute("userList", userDtoList);
		
		return "store/getuser";	
	}
	
	@GetMapping("/getuseradmin")
	public String getuseradmin(Model model) {
		List<UserDto> userDtoList = userService.getUseradmin();
		model.addAttribute("userList", userDtoList);
		
		return "admin/getuseradmin";	
	}

	@GetMapping("/getusermy")
	public String getusermy(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<UserDto> userDtoList = userService.getUser(SSTORECODE);
		model.addAttribute("userList", userDtoList);
		
		return "store/getusermy";	
	}
	
	@GetMapping("/getcustomer")
	public String getcustomer(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<CustomerDto> customerDtoList = customerService.getCustomer(SSTORECODE);
		model.addAttribute("customerList", customerDtoList);
		
		return "store/getcustomer";	
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
	
	@PostMapping("/adduser")
	public String adduser(UserDto userDto, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		userDto.toString();
		System.out.println(userDto.toString());
		userService.addUser(userDto);
		
		return "redirect:/getuser";			
	}
	

	@GetMapping("/getstoreadmin")
	public String getstoreadmin(Model model) {
		List<StoreDto> storeDtoList = storeService.getStoreadmin();
		model.addAttribute(storeDtoList);
		
		return "admin/getstoreadmin";	
	}
	
	

	


}
