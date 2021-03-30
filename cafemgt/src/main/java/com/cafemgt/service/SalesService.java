package com.cafemgt.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafemgt.dao.SalesMapper;
import com.cafemgt.dto.SalesDto;

@Service
@Transactional
public class SalesService {
	
	private final SalesMapper salesMapper;
	
	public SalesService(SalesMapper salesMapper) {
		this.salesMapper = salesMapper;
	}
	
	public int removeSales(String salesCode) {
		return salesMapper.removeSales(salesCode);
	}
	
	public int modifySales(SalesDto salesDto) {
		return salesMapper.modifySales(salesDto);
	}
	
	public SalesDto getSalesBySalesCode(String salesCode) {
		return salesMapper.getSalesBySalesCode(salesCode);
	}
	
	public Map<String,Object> getTotalPandS(String searchFirstDate,String searchLastDate, String SSTORECODE){
		return salesMapper.getTotalPandS(searchFirstDate,searchLastDate,SSTORECODE);
	}

	public int addSales(SalesDto salesDto) {
		return salesMapper.addSales(salesDto);
	}
	
	public List<SalesDto> salesDeadlineForTax(String SSTORECODE){
		return salesMapper.salesDeadlineForTax(SSTORECODE);
	}
	
	public List<SalesDto> salesDeadlineForStock(String SSTORECODE){
		return salesMapper.salesDeadlineForStock(SSTORECODE);
	}
	
	public List<SalesDto> getSales(String SSTORECODE){
		List<SalesDto> salesList = salesMapper.getSales(SSTORECODE);
		return salesList;		
	}
}
