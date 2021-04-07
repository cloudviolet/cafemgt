package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.StoreDto;

@Mapper
public interface StoreMapper {
	//사업장이 2개이상일 경우 사업장 선택
	public List<StoreDto> storeChoice(String MID); 	
	//사업장 등록
	public int addStore(StoreDto storeDto);
	//사업장 조회 관리자
	public List<StoreDto> getStoreadmin();
	//사업장 관리 - 사업장 조회
	public List<StoreDto> getStore(String MID);
	//마이페이지 조회
	public List<StoreDto> getStoreMy(String SSTORECODE);

}
