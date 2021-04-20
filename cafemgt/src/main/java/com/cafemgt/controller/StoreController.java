package com.cafemgt.controller;

import java.util.List;


import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafemgt.dto.CustomerDto;
import com.cafemgt.dto.MemberDto;
import com.cafemgt.dto.StoreDto;
import com.cafemgt.dto.UserDto;
import com.cafemgt.service.CustomerService;
import com.cafemgt.service.MemberService;
import com.cafemgt.service.StoreService;
import com.cafemgt.service.UserService;

@Controller
@RequestMapping("/store")
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
				  System.out.println(memberDto.getLevelCode());
				 String SLEVEL = memberDto.getLevelCode();
				  session.setAttribute("MID", memberDto.getMemberId());
				  session.setAttribute("MNAME", memberDto.getMemberName());				 			 
				  session.setAttribute("SLEVEL", SLEVEL);				 
			
				  
				  List<MemberDto> memberDtoList = memberService.getStoreChoice(memberDto.getMemberId());
				  if("level_01".equals(SLEVEL)) {
					  
					  if(memberDtoList.size() >= 2) {
						  for(int i=0; i<memberDtoList.size(); i++) {
							  System.out.println(memberDtoList.get(i).getStoreInfoName()+"<---상호명");
	
						  }
						  
						  return "redirect:/store/storechoice";
					  }else if(memberDtoList.size() == 1) {
						  String MID = (String)session.getAttribute("MID");
						  System.out.println(MID+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
						  session.setAttribute("SSTORECODE", memberDtoList.get(0).getStoreInfoCode());				 
						  session.setAttribute("SSTORENAME", memberDtoList.get(0).getStoreInfoName());		
						  System.out.println(memberDtoList.get(0).getStoreInfoCode());
						  System.out.println(session.getAttribute("SSTORECODE"));
						  System.out.println(memberDtoList.get(0).getStoreInfoName()+"<<<<<<<<<<<<<<<<<<<<<!!!!!!!!!!!!<<<<<<");
						  
						  
					  }else {
						  return "redirect:/store/addstore";
					  }
					  
				  }
				  else if("level_02".equals(SLEVEL)||"level_03".equals(SLEVEL) ) {
					  UserDto userDto = userService.userLogin(memberId);
					  
					  session.setAttribute("SSTORECODE", userDto.getStoreInfoCode());				 
					  session.setAttribute("SSTORENAME", userDto.getStoreInfoName());				 
				  }
				  System.out.println(memberDtoList+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

			}else {
				return "redirect:/store/login";	
			}
			return "redirect:/";			
		}
		return "redirect:/store/login";
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		
		return "store/login";	
	}
	//사업장이 2개이상일 경우 사업장 선택
	@GetMapping("storechoice")
	public String storechoice(Model model, HttpSession session) {
		String MID = (String)session.getAttribute("MID");
		List<StoreDto> storeList = storeService.storeChoice(MID);
		System.out.println(MID+"<<<<<<<<MID");
		model.addAttribute("storeList", storeList);
		System.out.println(storeList+"<<<<<storeList");
		
		
		return "store/storechoice";
	}
	@GetMapping("/join")
	public String join() {
		
		return "member/join";	
	}
	//직원관리에서 직원 회원가입
	@GetMapping("/adduserjoin")
	public String adduserjoin() {

		
		return "store/adduserjoin";	
	}
	
	@PostMapping("/adduserjoin")
	public String adduserjoin(MemberDto memberDto, UserDto userDto) {
		memberService.addUserjoin(memberDto);
		System.out.println(memberDto);
		System.out.println(userDto);
		userService.addUserjoin1(userDto);
		return "redirect:/store/adduserjoin";	
	}
	
	@RequestMapping(value = "/idCheck", method = RequestMethod.POST)
	public @ResponseBody boolean idCheck(@RequestParam(value = "memberId", required = false) String memberId) {
		System.out.println(memberId+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<< 입력받은 아이디");
		boolean checkResult = false;
		
		if(memberId != null && !"".equals(memberId)) {
			MemberDto memberDto = memberService.getinfoMember(memberId);
			System.out.println(memberDto+"<<<<<<<<<<<<memberDto");
			if(memberDto != null) {
				checkResult = true;
			}
		}		
		System.out.println(memberId +"<--StoreController.java");		
		return checkResult;
	}
	
	@PostMapping("/join")
	public String addMember(MemberDto memberDto) {
		memberService.addMember(memberDto);
		return "redirect:/store/login";	
	}
	
	
	//거래처 삭제
	@GetMapping("/deletecustomer")
	public String deleteCustomer(String custCode) {
	
		customerService.deleteCustomer(custCode);
		
		
		return "redirect:/store/getcustomer";		
	}
	@GetMapping("/modifycustomer")
	public String modifycustomer(Model model,  String custCode, HttpSession session) {
		System.out.println("거래처 수정 화면 ");
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		StoreDto storeDto = storeService.getinfoStore(SSTORECODE);
		CustomerDto customerDto = customerService.getinfoCustomer(custCode);
		System.out.println(customerDto);
		model.addAttribute("storeDto", storeDto);
		model.addAttribute("customerDto", customerDto);

		return "store/modifycustomer";		
	}
	
	@PostMapping("/modifycustomer")
	public String modifycustomer(CustomerDto customerDto) {
		customerService.updateCustomer(customerDto);
		System.out.println(customerDto +"<--customerDto");
		return "redirect:/store/getcustomer";	
	}
	
	//직원 삭제
	@GetMapping("/deleteMemberUser")
	public String deleteMemberUser(String memberId) {
	
		userService.deleteMemberUser(memberId);
		System.out.println(memberId + "<---직원삭제 memberId");
		
		return "redirect:/store/getuser";		
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
		userService.updateUser(userDto);
		memberService.updateMember(memberDto);
		
		return "redirect:/store/getuser";		
	}
	
	//사업장 삭제
	@GetMapping("/deleteStore")
		public String deleteStore(String storeInfoCode) {		
			storeService.deleteStore(storeInfoCode);	
			System.out.println(storeInfoCode);
			return "redirect:/store/getstore";		
		}

	@GetMapping("/modifystore")
	public String modifystore(Model model, HttpSession session, @RequestParam(value="storeInfoCode") String storeInfoCode) {
		System.out.println("사업장 수정화면");		
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		StoreDto storeDto = storeService.getinfoStore(storeInfoCode);
		System.out.println(storeDto);
		model.addAttribute("storeDto", storeDto);
		return "store/modifystore";		
	}
	@PostMapping("/modifystore")
	public String modifystore(StoreDto storeDto) {
		storeService.updateStore(storeDto);
		System.out.println(storeDto);
		
		return "redirect:/store/getstore";
	}
	
	//사업주 마이페이지 수정화면
	@GetMapping("/modifymember")
	public String modifymember(Model model, String memberId) {
		System.out.println("마이페이지 수정화면");
		System.out.println(memberId);
		MemberDto memberDto = memberService.getinfoMember(memberId);
		model.addAttribute("memberDto", memberDto);
		return "member/modifymember";		
	}
	//사업 마이페이지 수정 
	@PostMapping("/modifymember")
	public String modifymember(MemberDto memberDto) {
		memberService.updateMemberMy(memberDto);
		
		return "redirect:/store/getmember";		
	}
	
	//직원 마이페이지
		@GetMapping("/modifymemberU")
		public String modifymemberU(Model model, String memberId) {
			System.out.println("마이페이지 수정화면");
			System.out.println(memberId);
			MemberDto memberDto = memberService.getinfoMember(memberId);
			model.addAttribute("memberDto", memberDto);
			return "member/modifymemberU";		
		}
	
	//직원 마이페이지 수정 
	@PostMapping("/modifymemberU")
	public String modifymemberU(MemberDto memberDto) {
		memberService.updateMemberMy(memberDto);
		
		return "redirect:/store/getmemberU";		
	}
	
	//직원 마이페이지
	@GetMapping("/getmemberU")
	public String getmemberU(Model model, HttpSession session) {
		String MID = (String)session.getAttribute("MID");
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<MemberDto> memberDtoList = memberService.getMember(MID);
		List<StoreDto> storeDtoList = storeService.getStoreMy(SSTORECODE);
		model.addAttribute("memberList", memberDtoList);
		model.addAttribute("storeDtoList",storeDtoList);
		
		return "member/getmemberU";		
	}

	
	//마이페이지
	@GetMapping("/getmember")
	public String getmember(Model model, HttpSession session) {
		String MID = (String)session.getAttribute("MID");
		System.out.println(MID+"<-----getmember");
	
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		System.out.println(SSTORECODE+"<<<SSTORECODE");
		List<MemberDto> memberDtoList = memberService.getMember(MID);
		List<StoreDto> storeDtoList = storeService.getStoreMy(SSTORECODE);
		model.addAttribute("memberList", memberDtoList);
		model.addAttribute("storeDtoList",storeDtoList);
		System.out.println(memberDtoList+"<<memberDtoList");
		System.out.println(storeDtoList+"<<storeDtoList");
		
		return "member/getmember";		
	}
	
	
		
	@GetMapping("/getmemberadmin")
	public String getmemberadmin(Model model) {
		List<MemberDto> memberDtoList = memberService.getMemberadmin();
		model.addAttribute("memberList", memberDtoList);
		return "admin/getmemberadmin";		
	}
	//사업장 관리 사업장 조회
	@GetMapping("/getstore")
	   public String getstore(Model model, HttpSession session) {
		String MID = (String)session.getAttribute("MID");
		List<StoreDto> storeDtoList =storeService.getStore(MID);
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
	
	@GetMapping("/getoutmemberadmin")
	public String getoutmemberadmin(Model model) {
		List<MemberDto> memberDtoList = memberService.getoutmemberadmin();
		model.addAttribute("memberList", memberDtoList);
		return "admin/getoutmemberadmin";		
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
	
	@PostMapping("/addstore")
	public String addstore(StoreDto storeDto) {
		storeService.addStore(storeDto);
		
		return "redirect:/store/getstore";		
	}
	
	@GetMapping("/addcustomer")
	public String addcustomer(Model model) {
		
		return "store/addcustomer";	
	}
	
	@PostMapping("/addcustomer")
	public String addcustomer(CustomerDto customerDto) {
		customerService.addCustomer(customerDto);
		
		return "redirect:/store/getcustomer";	
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
		
		return "redirect:/store/getuser";			
	}

	@GetMapping("/getstoreadmin")
	public String getstoreadmin(Model model) {
		List<StoreDto> storeDtoList = storeService.getStoreadmin();
		model.addAttribute(storeDtoList);
		
		return "admin/getstoreadmin";	
	}
	//직원조회 관리자
   @GetMapping("/getuseradmin")
   public String getuseradmin(Model model) {
      List<UserDto> userDtoList = userService.getUseradmin();
      model.addAttribute("userList", userDtoList);
      
      return "admin/getuseradmin";   
   }

}
