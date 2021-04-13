package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.BonusDto;

@Mapper
public interface BonusMapper {
	public List<BonusDto> getBonus(String SSTORECODE);
	
	public BonusDto getBonusByUbCode(String ubCode);
	
	public int modifyBonus(BonusDto bonusDto);

	public int addBonus(BonusDto bonusDto);
}
