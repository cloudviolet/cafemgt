package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.DsalaryDto;

@Mapper
public interface DsalaryMapper {
	public List<DsalaryDto> getDsalary(String SSTORECODE);
	
	public DsalaryDto getDsalaryBySdCode(String sdCode);
	
	public int modifyDsalary(DsalaryDto dsalaryDto);

	public int addDsalary(DsalaryDto dsalaryDto);
}
