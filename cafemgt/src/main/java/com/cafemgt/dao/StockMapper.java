package com.cafemgt.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.StockDto;

@Mapper
public interface StockMapper {
	public List<StockDto> getStock(Map<String,Object> map);
	
	public List<StockDto> getStockByArticleCode(Map<String,Object> map);
	
	public List<StockDto> getStockByTable(String SSTORECODE);

	public int addStock(StockDto stockDto);
	
	
	
}
