package com.cafemgt.service;

import java.util.List;
import java.util.Map;

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
	
	public List<StockDto> getStock(Map<String,Object> map) {
		
		return stockMapper.getStock(map);
	}
	
	public int addStock(List<StockDto> stockList) {

		int result = 0;
		if(stockList.size() != 0) {
			for(int i = 0 ; i < stockList.size() ; i++) {
				StockDto stockDto = stockList.get(i);
				result += stockMapper.addStock(stockDto);
			}
		}
		return result;
	}
	
}
