package com.cafemgt.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.TotalStockDto;

@Mapper
public interface TotalStockMapper {
	public List<TotalStockDto> getTotalStock(String SSTORECODE);
	
	public List<TotalStockDto> getTotalStockByIncoCode(String SSTORECODE, String incoCode);
	
	public int addTotalStock(Map<String, Object> purchasesMap);

	public int addTotalStockOverVolume(TotalStockDto totalStockDto);
	
	public int modifyTotalStockDeadLine(TotalStockDto totalStockDto);
	
	public int modifyIncoCheck(Map<String, String> map);
	
	public int modifyIncoDeadLine(String incoCode);
}
