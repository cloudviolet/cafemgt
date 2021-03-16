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
	
	public List<StoreDto> getStore(){
		List<StoreDto> StoreDtoList = storeMapper.getStore();
		
		return StoreDtoList;
	}

}
