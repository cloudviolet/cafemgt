package com.cafemgt.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafemgt.dao.SalaryMapper;
import com.cafemgt.dto.SalaryDto;

@Service
@Transactional
public class SalaryService {
	
	private final  SalaryMapper  salaryMapper;
	
	
	public SalaryService(SalaryMapper salaryMapper) {
		this.salaryMapper= salaryMapper;
	}
	
	public List<SalaryDto> getSalary(String SSTORECODE){
		List<SalaryDto> salaryDto = salaryMapper.getSalary(SSTORECODE);
		
		return salaryDto;
	}
	
	public SalaryDto getSalaryBySalaryCode(String salaryCode) {
		
		return salaryMapper.getSalaryBySalaryCode(salaryCode);
	}
	
	public int modifySalary(SalaryDto salaryDto) {
		
		return salaryMapper.modifySalary(salaryDto);
	}
	
	public int addSalary(SalaryDto salaryDto) {
		
		return salaryMapper.addSalary(salaryDto);
	}
	
	
	
}
