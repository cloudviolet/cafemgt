package com.cafemgt.dao;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.VatDto;

@Mapper
public interface VatMapper {
	
	public int addIntendedTax(String intendedDays,String vatIntendedTax,String SSTORECODE);
	
	public VatDto getMyVat(String searchDays, String SSTORECODE);
}
