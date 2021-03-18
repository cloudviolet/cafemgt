package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.OwnerDto;

@Mapper
public interface OwnerMapper {
	
	public OwnerDto getinfoOwner(String ownerId);
	
	public List<OwnerDto> getOwner();
	

}
