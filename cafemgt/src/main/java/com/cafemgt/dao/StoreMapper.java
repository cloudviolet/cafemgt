package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.StoreDto;

@Mapper
public interface StoreMapper {
	
	
	public int addStore(StoreDto storeDto);
	
	public List<StoreDto> getStoreadmin();
	//사업장 관리 - 사업장 조회
	public List<StoreDto> getStore(String MID);
	//마이페이지 조회
	public List<StoreDto> getStoreMy(String SSTORECODE);

}
