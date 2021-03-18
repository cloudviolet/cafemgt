package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.StoreDto;

@Mapper
public interface StoreMapper {
	public List<StoreDto> getStore();
	
	public List<StoreDto> getStoreInfoByOwnerId(String ownerId);

}
