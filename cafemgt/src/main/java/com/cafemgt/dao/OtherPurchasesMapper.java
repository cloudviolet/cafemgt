package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.OtherPurchasesDto;

@Mapper
public interface OtherPurchasesMapper {
	
	public int addOtherPurchases(OtherPurchasesDto otherPurchasesDto);
	
	public List<OtherPurchasesDto> getOtherPurchases();
}
