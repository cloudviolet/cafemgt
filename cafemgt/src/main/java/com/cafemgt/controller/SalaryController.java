package com.cafemgt.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafemgt.dto.BonusDto;
import com.cafemgt.dto.DsalaryDto;
import com.cafemgt.dto.SalaryDto;
import com.cafemgt.dto.WtimeDto;
import com.cafemgt.service.SalaryService;
import com.cafemgt.service.WtimeService;
import com.cafemgt.service.BonusService;
import com.cafemgt.service.DsalaryService;

@Controller
public class SalaryController {
	
	private final SalaryService salaryService;
	private final DsalaryService dsalaryService;
	private final WtimeService wtimeService;
	private final BonusService bonusService;
	
	@Autowired
	public SalaryController(SalaryService salaryService
						   ,DsalaryService dsalaryService
						   ,WtimeService wtimeService
						   ,BonusService bonusService) {
		this.salaryService = salaryService;
		this.dsalaryService = dsalaryService;
		this.wtimeService = wtimeService;
		this.bonusService = bonusService;
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("======================================");
		System.out.println("======= SalaryController bean 등록 ======");
		System.out.println("======================================");
	}
	
	
	@GetMapping("/addsalary")
	public String addsalary(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<SalaryDto> salaryList = salaryService.getSalary(SSTORECODE);
		model.addAttribute("salaryList",salaryList);
		return "salary/addsalary";
	}
	
	@PostMapping("/addsalary")
	public String addsalary(SalaryDto salaryDto) {
		salaryService.addSalary(salaryDto);
		return "redirect:/getsalary";
	}
	
	
	@GetMapping("/getsalary")
	public String getsalary(Model model, HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<SalaryDto> salaryList = salaryService.getSalary(SSTORECODE);
		model.addAttribute("salaryList",salaryList);
		
		return "salary/getsalary";
	}
	
	
	
	@GetMapping("/adddsalary")
	public String adddsalary(Model model,HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<DsalaryDto> dsalaryList = dsalaryService.getDsalary(SSTORECODE);
		String OID = (String)session.getAttribute("OID");
		model.addAttribute("dsalaryList",dsalaryList);
		return "dsalary/adddsalary";
	}
	
	@PostMapping("/adddsalary")
	public String addDsalary(DsalaryDto dsalaryDto) {
		dsalaryService.addDsalary(dsalaryDto);	
		return "redirect:/getdsalary";
	}
	
	@GetMapping("/getdsalary")
	public String getdsalary(Model model,HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<DsalaryDto> dsalaryList = dsalaryService.getDsalary(SSTORECODE);
		model.addAttribute("dsalaryList",dsalaryList);
		
		return "dsalary/getdsalary";
	}
	
	@GetMapping("/addwtime")
	public String addwtime(Model model,HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<WtimeDto> wtimeList = wtimeService.getWtime(SSTORECODE);
		String OID = (String)session.getAttribute("OID");
		model.addAttribute("wtimeList",wtimeList);
		return "dsalary/addwtime";
	}
	
	@PostMapping("/addwtime")
	public String addwtime(WtimeDto wtimeDto) {
		wtimeService.addWtime(wtimeDto);	
		
		return "redirect:/getwtime";
	}
	
	@GetMapping("/getwtime")
	public String getwtime(Model model,HttpSession session) {
		String SSTORECODE = (String)session.getAttribute("SSTORECODE");
		List<WtimeDto> wtimeList = wtimeService.getWtime(SSTORECODE);
		model.addAttribute("wtimeList",wtimeList);
		
		return "dsalary/getwtime";
	}
	
	@GetMapping("/addbonus")
	public String addbonus(Model model,HttpSession session) {
		String SSTORECODE = (String) session.getAttribute("SSTORECODE");
		List<BonusDto> bonusList = bonusService.getBonus(SSTORECODE);
		String OID = (String)session.getAttribute("OID");
		model.addAttribute("bonusList",bonusList);
		return "bonus/addbonus";
	}
	
	@PostMapping("/addbonus")
	public String addbonus(BonusDto bonusDto) {
		bonusService.addBonus(bonusDto);
		return "redirect:/getbonus";
	}
	
	@GetMapping("/getbonus")
	public String getbonus(Model model,HttpSession session) {
		String SSTORECODE = (String) session.getAttribute("SSTORECODE");
		List<BonusDto> bonusList = bonusService.getBonus(SSTORECODE);
		model.addAttribute("bonusList",bonusList);
		
		return "bonus/getbonus";
	}
	
	@GetMapping("/modifySalary")
	public String modifySalary(Model model, String salaryCode) {
		SalaryDto salaryDto = salaryService.getSalaryBySalaryCode(salaryCode);
		model.addAttribute("salaryDto",salaryDto);
		return "salary/modifysalary";
	}
	
	@PostMapping("/modifySalary")
	public String modifySalary(SalaryDto salaryDto) {
		salaryService.modifySalary(salaryDto);
		return "redirect:/getsalary";
	}
	
	@GetMapping("/modifyDsalary")
	public String modifyDsalary(Model model, String sdCode) {
		DsalaryDto dsalaryDto = dsalaryService.getDsalaryBySdCode(sdCode);
		model.addAttribute("dsalaryDto",dsalaryDto);
		return "dsalary/modifydsalary";
	}
	
	@PostMapping("/modifyDsalary")
	public String modifyDsalary(DsalaryDto dsalaryDto) {
		dsalaryService.modifyDsalary(dsalaryDto);
		return "redirect:/getdsalary";
	}
	
	@GetMapping("/modifyWtime")
	public String modifyWtime(Model model, String attCode) {
		WtimeDto wtimeDto = wtimeService.getWtimeByAttCode(attCode);
		model.addAttribute("wtimeDto",wtimeDto);
		return "dsalary/modifywtime";
	}
	
	@PostMapping("/modifyWtime")
	public String modifyWtime(WtimeDto wtimeDto) {
		wtimeService.modifyWtime(wtimeDto);
		return "redirect:/getwtime";
	}
}
