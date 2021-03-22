package com.cafemgt.service;

import java.util.List;

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

	public int addSales(SalesDto salesDto) {
		return salesMapper.addSales(salesDto);
	}
	
	public List<SalesDto> getSales(){
		List<SalesDto> salesList = salesMapper.getSales();
		return salesList;		
	}
}
