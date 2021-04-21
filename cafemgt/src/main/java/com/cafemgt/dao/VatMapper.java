package com.cafemgt.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.VatDto;

@Mapper
public interface VatMapper {
	
	public int addVat(Map<String,String> vatList);
	
	public String getVatYear(String SSTORECODE);
	
	public int addIntendedTax(String intendedYearMonth,String vatIntendedTaxValue,String SSTORECODE);
	
	public VatDto getMyVat(String searchDays, String SSTORECODE);
}
