package com.cafemgt.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafemgt.dao.OtherPurchasesMapper;
import com.cafemgt.dto.OtherPurchasesDto;

@Service
@Transactional
public class OtherPurchasesService {
	
	private OtherPurchasesMapper otherPurchasesMapper;
	
	public OtherPurchasesService(OtherPurchasesMapper otherPurchasesMapper) {
		this.otherPurchasesMapper = otherPurchasesMapper;
	}
	
	public int addOtherPurchases(OtherPurchasesDto otherPurchasesDto) {				
		return otherPurchasesMapper.addOtherPurchases(otherPurchasesDto);
	}

	public List<OtherPurchasesDto> getOtherPurchases(){
		List<OtherPurchasesDto> otherPurchasesList = otherPurchasesMapper.getOtherPurchases();
		return otherPurchasesList;		
	}
}
