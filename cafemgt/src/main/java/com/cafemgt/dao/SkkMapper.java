package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.SkkDto;

@Mapper
public interface SkkMapper {
	public List<SkkDto> getSkk(String SSTORECODE);

	public List<SkkDto> getSkkByDeadLine(String SSTORECODE);

	public SkkDto getSkkBySkCode(String skCode);
	
	public int addSkk(SkkDto skkDto);
	
	public int modifySkk(SkkDto skkDto);
	
	public int modifySkkDeadlineCheck(String skCode);
	
	public int removeSkk(String skCode);
}
