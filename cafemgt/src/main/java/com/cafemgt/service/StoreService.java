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
	
	public List<StoreDto> getStoreadmin(){
		List<StoreDto> storeDtoList = storeMapper.getStoreadmin();
		
		return storeDtoList;
	}
	
	public List<StoreDto> getStore(String SSTORECODE){
		List<StoreDto> storeDtoList = storeMapper.getStore(SSTORECODE);
		
		return storeDtoList;
	}
	
	
	

}
