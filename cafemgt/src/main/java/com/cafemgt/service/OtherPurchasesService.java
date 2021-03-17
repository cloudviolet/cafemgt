package com.cafemgt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cafemgt.dao.OtherPurchasesMapper;
import com.cafemgt.dto.OtherPurchasesDto;

@Service
public class OtherPurchasesService {
	
	private OtherPurchasesMapper otherPurchasesMapper;
	
	public OtherPurchasesService(OtherPurchasesMapper otherPurchasesMapper) {
		this.otherPurchasesMapper = otherPurchasesMapper;
	}
	
	public int addOtherPurchases(OtherPurchasesDto otherPurchasesDto) {
		otherPurchasesMapper.addOtherPurchases(otherPurchasesDto);
		
		return 0;		
	}

	public List<OtherPurchasesDto> getOtherPurchases(){
		List<OtherPurchasesDto> otherPurchasesList = otherPurchasesMapper.getOtherPurchases();
		return otherPurchasesList;		
	}
}
