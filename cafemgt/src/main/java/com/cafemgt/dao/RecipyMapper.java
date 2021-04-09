package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.RecipyDto;

@Mapper
public interface RecipyMapper {
	public List<RecipyDto> getRecipy(String SSTORECODE);
	
	public int addRecipy(RecipyDto recipyDto);

	public RecipyDto getRecipyByConCode(String conCode);
	
	public int modifyRecipy(RecipyDto recipyDto);
	
	public int removeRecipy(String conCode);
	
}
