package com.cafemgt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cafemgt.dao.PurchasesMapper;
import com.cafemgt.dto.PurchasesDto;

@Service
public class PurchasesService {
	
	private final PurchasesMapper purchasesMapper;
	
	public PurchasesService(PurchasesMapper purchasesMapper) {
		this.purchasesMapper = purchasesMapper;
	}
	
	public List<PurchasesDto> getPurchases(){
		List<PurchasesDto> purchasesList = purchasesMapper.getPurchases();
		return purchasesList;		
	}
}
