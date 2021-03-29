package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.OtherPurchasesDto;

@Mapper
public interface OtherPurchasesMapper {
	
	public int modifyOtherPurchases(OtherPurchasesDto otherPurchasesDto);
	
	public OtherPurchasesDto getOtherPurchasesByOeCode(String oeCode);
	
	public int addOtherPurchases(OtherPurchasesDto otherPurchasesDto);
	
	public List<OtherPurchasesDto> otherPurchasesDeadline(String SSTORECODE);
	
	public List<OtherPurchasesDto> getOtherPurchases(String SSTORECODE);
}
