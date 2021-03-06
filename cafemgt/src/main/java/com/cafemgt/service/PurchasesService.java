package com.cafemgt.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafemgt.dao.PurchasesMapper;
import com.cafemgt.dto.PurchasesDto;

@Service
@Transactional
public class PurchasesService {
	
	private final PurchasesMapper purchasesMapper;
	
	public PurchasesService(PurchasesMapper purchasesMapper) {
		this.purchasesMapper = purchasesMapper;
	}
	
	public List<PurchasesDto> getPurchasesDeadlineTax(String SSTORECODE){
		return purchasesMapper.getPurchasesDeadlineTax(SSTORECODE);
	}
	
	public int removePurchases(String incoCode) {
		return purchasesMapper.removePurchases(incoCode);
	}
	
	public int modifyPurchases(PurchasesDto purchasesDto) {
		return purchasesMapper.modifyPurchases(purchasesDto);
	}
	
	public PurchasesDto getPurchasesByIncoCode(String incoCode) {
		return purchasesMapper.getPurchasesByIncoCode(incoCode);
	}
	
	public List<PurchasesDto> purchasesDeadline(String SSTORECODE){
		return purchasesMapper.purchasesDeadline(SSTORECODE);
	}
	
	public List<PurchasesDto> getPurchasesByArticleCode(String SSTORECODE, String articleCode){
		return purchasesMapper.getPurchasesByArticleCode(SSTORECODE, articleCode);
	}
	
	public int addPurchases(PurchasesDto purchasesDto) {
		return purchasesMapper.addPurchases(purchasesDto);
	}
	
	public List<PurchasesDto> getPurchases(String SSTORECODE){
		List<PurchasesDto> purchasesList = purchasesMapper.getPurchases(SSTORECODE);
		return purchasesList;		
	}
}
