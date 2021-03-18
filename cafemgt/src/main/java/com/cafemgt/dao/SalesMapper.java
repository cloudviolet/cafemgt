package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.SalesDto;

@Mapper
public interface SalesMapper {
	
	public List<SalesDto> getSales();
	
}
