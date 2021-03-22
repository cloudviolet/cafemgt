package com.cafemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafemgt.dao.SalaryMapper;
import com.cafemgt.dto.SalaryDto;

@Service
@Transactional
public class SalaryService {
	
	private final  SalaryMapper  salaryMapper;
	
	@Autowired
	public SalaryService(SalaryMapper salaryMapper) {
		this.salaryMapper= salaryMapper;
	}
	
	public List<SalaryDto> getSalary(){
		List<SalaryDto> salaryDto = salaryMapper.getSalary();
		
		return salaryDto;
	}
}
