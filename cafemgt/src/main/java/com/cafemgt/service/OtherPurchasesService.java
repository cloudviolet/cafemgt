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
	
	public int removeOtherPurchases(String oeCode) {
		return otherPurchasesMapper.removeOtherPurchases(oeCode);
	}
	
	public int modifyOtherPurchases(OtherPurchasesDto otherPurchasesDto) {
		return otherPurchasesMapper.modifyOtherPurchases(otherPurchasesDto);
	}
	
	public OtherPurchasesDto getOtherPurchasesByOeCode(String oeCode){
		return otherPurchasesMapper.getOtherPurchasesByOeCode(oeCode);
	}
	
	public int addOtherPurchases(OtherPurchasesDto otherPurchasesDto) {				
		return otherPurchasesMapper.addOtherPurchases(otherPurchasesDto);
	}
	
	public List<OtherPurchasesDto> otherPurchasesDeadline(String SSTORECODE){
		return otherPurchasesMapper.otherPurchasesDeadline(SSTORECODE);
	}

	public List<OtherPurchasesDto> getOtherPurchases(String SSTORECODE){
		List<OtherPurchasesDto> otherPurchasesList = otherPurchasesMapper.getOtherPurchases(SSTORECODE);
		return otherPurchasesList;		
	}
}
