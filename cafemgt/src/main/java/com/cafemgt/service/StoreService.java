package com.cafemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafemgt.dao.StoreMapper;
import com.cafemgt.dto.StoreDto;

@Service
@Transactional
public class StoreService {
	private final StoreMapper storeMapper;
	
	@Autowired
	public StoreService(StoreMapper storeMapper) {
		this.storeMapper = storeMapper;
	}
	// 사업장 등록
	public int addStore(StoreDto storeDto) {
		System.out.println("사업장 등록서비스 확인");
		return storeMapper.addStore(storeDto);		
	}
	//사업장이 2개이상일 경우 사업장 선택
	public List<StoreDto> storeChoice(String MID){
		List<StoreDto> storeDtoList = storeMapper.storeChoice(MID);
		
		return storeDtoList;
	}
	
	public List<StoreDto> getStoreadmin(){
		List<StoreDto> storeDtoList = storeMapper.getStoreadmin();
		
		return storeDtoList;
	}
	//사업장 관리에서 사업장 조회
	public List<StoreDto> getStore(String MID){
		List<StoreDto> storeDtoList = storeMapper.getStore(MID);
		
		return storeDtoList;
	}
	//마이페이지 조회
	public List<StoreDto> getStoreMy(String SSTORECODE){
		List<StoreDto> storeDtoList = storeMapper.getStoreMy(SSTORECODE);
		
		return storeDtoList;
	}
	
	
	

}
