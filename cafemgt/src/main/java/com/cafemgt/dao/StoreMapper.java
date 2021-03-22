package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.StoreDto;

@Mapper
public interface StoreMapper {
	public List<StoreDto> getStoreadmin();
	
	public List<StoreDto> getStore(String SSTORECODE);
	
	public List<StoreDto> getStoreInfoByOwnerId(String ownerId);

}
