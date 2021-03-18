package com.cafemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafemgt.dao.SalesMapper;
import com.cafemgt.dto.SalesDto;

@Service
public class SalesService {
	
	private final SalesMapper salesMapper;
	
	public SalesService(SalesMapper salesMapper) {
		this.salesMapper = salesMapper;
	}

	
	public List<SalesDto> getSales(){
		List<SalesDto> salesList = salesMapper.getSales();
		return salesList;		
	}
}
