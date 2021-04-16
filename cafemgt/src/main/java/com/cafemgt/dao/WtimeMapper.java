package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.WtimeDto;

@Mapper
public interface WtimeMapper {
	public List<WtimeDto> getWtime(String SSTORECODE);
	
	public int addWtime(WtimeDto wtimeDto);
	
	public WtimeDto getWtimeByAttCode(String attCode);
	
	public int modifyWtime(WtimeDto wtimeDto);

	public int removeWtime(String attCode);
}
