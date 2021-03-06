package com.cafemgt.dao;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.SalesDto;

@Mapper
public interface SalesMapper {
	public int addCostDetailByAddStock(Map<String,String> costDtMap);

	public List<Map<String,String>> getCostDetail();
	
	public int removeSales(String salesCode);
	
	public int modifySales(SalesDto salesDto);
	
	public SalesDto getSalesBySalesCode(String salesCode);
	
	public int addSales(SalesDto salesDto);
	
	public Map<String,Object> getTotalPandS(String searchFirstDate,String searchLastDate, String SSTORECODE);
	
	public List<SalesDto> salesDeadlineForTax(String SSTORECODE);
	
	public List<SalesDto> salesDeadlineForStock(String SSTORECODE);
	
	public List<SalesDto> getSales(String SSTORECODE);
	
}
