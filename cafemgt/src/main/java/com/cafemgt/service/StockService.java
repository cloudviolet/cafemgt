package com.cafemgt.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafemgt.dao.StockMapper;
import com.cafemgt.dto.StockDto;


@Service
@Transactional
public class StockService {

	private final StockMapper stockMapper;
	
	public StockService(StockMapper stockMapper) {
		this.stockMapper= stockMapper;
	}
	
	public List<StockDto> getStock(String SSTORECODE) {
		
		return stockMapper.getStock(SSTORECODE);
	}
	
}
