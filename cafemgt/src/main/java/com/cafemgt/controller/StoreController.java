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
import com.cafemgt.dto.MemberDto;
import com.cafemgt.dto.StoreDto;
import com.cafemgt.dto.UserDto;
import com.cafemgt.service.CustomerService;
import com.cafemgt.service.MemberService;
import com.cafemgt.service.StoreService;
import com.cafemgt.service.UserService;

@Controller
public class StoreController {
	
	private final UserService userService;
	private final CustomerService customerService;
	private final MemberService memberService;
	private final StoreService storeService;
	
	
	@Autowired
	public StoreController(UserService userService
						  ,CustomerService customerService
						  ,MemberService memberService
						  ,StoreService storeService) {
		this.userService = userService;
		this.customerService = customerService;
		this.memberService = memberService;
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
	public String login(@RequestParam(value="inId", required = false)String memberId
					   ,@RequestParam(value="inPw", required = false)String memberPw
					   ,HttpSession session) {
		System.out.println(memberId + "++++++++++++++++++++++++id");
		System.out.println(memberPw + "++++++++++++++++++++++++pw");
		if((memberId != null && !"".equals(memberId)) &&
		   (memberPw != null && !"".equals(memberPw))) {
			String result = memberService.login(memberId, memberPw);
			System.out.println(result +"++++++로그인성공++++++");
			if(result.equals("로그인 성공")) {				
				  MemberDto memberDto = memberService.getinfoMember(memberId);
				  
				  System.out.println(memberDto.getMemberId());
				  System.out.println(memberDto.getMemberName());
				  System.out.println(memberDto.getStoreInfoCode());
				  
				  session.setAttribute("MID", memberDto.getMemberId());
				  session.setAttribute("MNAME", memberDto.getMemberName());				 		 
				  session.setAttribute("SSTORECODE", memberDto.getStoreInfoCode());				 
				  session.setAttribute("SLEVEL", memberDto.getLevelCode());				 
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
		
		return "member/join";	
	}
	@PostMapping("/join")
	public String join(Model model) {
		
		return "redirect:/index";	
	}
	
	@GetMapping("/modifyuser")
	public String modifyuser(Model model, String memberId) {
		System.out.println("직원 추가등록/수정 화면 ");
		System.out.println(memberId);
		MemberDto memberDto = memberService.getinfoMember(memberId);
		UserDto userDto = userService.getinfoUser(memberId);		
		model.addAttribute("userDto", userDto);
		model.addAttribute("memberDto", memberDto);
		return "store/modifyuser";		
	}
	
	@PostMapping("/modifyuser")
	public String modifyuser(UserDto userDto, MemberDto memberDto) {
		//0329 수정해야함 
		
		return "redirect:/getuser";		
	}
	
	@GetMapping("/modifystore")
	public String modifystore() {
		System.out.println("사업장 수정화면");
		return "store/modifystore";		
	}

	
	@GetMapping("/addmember")
	public String addmember() {
		
		return "member/addmember";		
	}
	
	@GetMapping("/getmember")
	public String getmember(Model model, HttpSession session) {
		String MID = (String)session.getAttribute("MID");
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<MemberDto> memberDtoList = memberService.getMember(MID);
		List<StoreDto> storeDtoList = storeService.getStore(SSTORECODE);
		model.addAttribute("memberList", memberDtoList);
		model.addAttribute("storeDtoList",storeDtoList);
		
		return "member/getmember";		
	}
	
	
	@GetMapping("/getmemberU")
	public String getmemberU(Model model, HttpSession session) {
		String MID = (String)session.getAttribute("MID");
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<MemberDto> memberDtoList = memberService.getMember(MID);
		List<StoreDto> storeDtoList = storeService.getStore(SSTORECODE);
		model.addAttribute("memberList", memberDtoList);
		model.addAttribute("storeDtoList",storeDtoList);
		
		return "member/getmemberU";		
	}
		
	@GetMapping("/getmemberadmin")
	public String getmemberadmin(Model model) {
		List<MemberDto> memberDtoList = memberService.getMemberadmin();
		model.addAttribute("memberList", memberDtoList);
		return "admin/getmemberadmin";		
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

	/*직원 추가정보 등록을 위한 메서드 member.~ 파일에서 작업함*/
	@GetMapping("/adduser")
	public String adduser(Model model, HttpSession session) {		
		
		 String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		 List<MemberDto> MemberUserList = memberService.addMemberUser(SSTORECODE);
		 model.addAttribute("MemberUserList", MemberUserList);
		
		return "store/adduser";	
	} 
	
	@PostMapping("/adduser")
	public String adduser(UserDto userDto) {
		userService.addUser(userDto);		
		
		return "redirect:/getuser";			
	}
	
	@PostMapping("/addstore")
	public String addstore(StoreDto storeDto) {
		
		return "redirect:/getstore";		
	}
	
	@PostMapping("/modifystore")
	public String modifystore(StoreDto storeDto) {
		
		return "redirect:/getstore";		
	}
	

	@GetMapping("/getstoreadmin")
	public String getstoreadmin(Model model) {
		List<StoreDto> storeDtoList = storeService.getStoreadmin();
		model.addAttribute(storeDtoList);
		
		return "admin/getstoreadmin";	
	}
	
	

	


}
