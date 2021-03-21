package com.cafemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafemgt.dao.StoreMapper;
import com.cafemgt.dto.StoreDto;

@Service
public class StoreService {
	private final StoreMapper storeMapper;
	
	@Autowired
	public StoreService(StoreMapper storeMapper) {
		this.storeMapper = storeMapper;
	}
	
	public List<StoreDto> getStoreadmin(){
		List<StoreDto> storeDtoList = storeMapper.getStoreadmin();
		
		return storeDtoList;
	}
	
	public List<StoreDto> getStore(){
		List<StoreDto> storeDtoList = storeMapper.getStore();
		
		return storeDtoList;
	}
	
	public List<StoreDto> getStoreInfoByOwnerId(String ownerId){
		List<StoreDto> storeDtoList = storeMapper.getStoreInfoByOwnerId(ownerId);
		
		return storeDtoList;
	}
	
	

}
