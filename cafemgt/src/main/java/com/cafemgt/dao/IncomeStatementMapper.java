package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.IncomeStatementDto;

@Mapper
public interface IncomeStatementMapper {
	
	public IncomeStatementDto getIncomeStatement(String SSTORECODE, String searchYear);
	
	public int addIncomeStatement(IncomeStatementDto incomestatemnetList);
	
	public List<IncomeStatementDto> getIncomeStatementByDealing();

}
