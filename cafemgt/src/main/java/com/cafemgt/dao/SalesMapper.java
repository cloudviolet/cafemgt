package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.SalesDto;

@Mapper
public interface SalesMapper {
	
	public int addSales(SalesDto salesDto);
	
	public List<SalesDto> salesDeadlineForTax(String SSTORECODE);
	
	public List<SalesDto> salesDeadlineForStock(String SSTORECODE);
	
	public List<SalesDto> getSales(String SSTORECODE);
	
}
