package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.TotalStockDto;

@Mapper
public interface TotalStockMapper {
	public List<TotalStockDto> getTotalStock(String sessionId);
}
