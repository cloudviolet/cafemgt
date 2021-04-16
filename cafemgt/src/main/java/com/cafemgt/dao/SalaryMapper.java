package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.SalaryDto;

@Mapper
public interface SalaryMapper {
	public List<SalaryDto> getSalary(String SSTORECODE);
	
	public SalaryDto getSalaryBySalaryCode(String salaryCode);

	public int modifySalary(SalaryDto salaryDto);
	
	public int addSalary(SalaryDto salaryDto);
	
	public int removeSalary(String salaryCode);
}
