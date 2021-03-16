package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.PurchasesDto;

@Mapper
public interface PurchasesMapper {
	
	public List<PurchasesDto> getPurchases();
}
