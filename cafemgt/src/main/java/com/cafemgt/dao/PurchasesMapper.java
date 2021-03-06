package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.PurchasesDto;

@Mapper
public interface PurchasesMapper {
	
	public List<PurchasesDto> getPurchasesDeadlineTax(String SSTORECODE);
	
	public int removePurchases(String incoCode);
	
	public int modifyPurchases(PurchasesDto purchasesDto);
	
	public PurchasesDto getPurchasesByIncoCode(String incoCode);
	
	public List<PurchasesDto> purchasesDeadline(String SSTORECODE);
	
	public int addPurchases(PurchasesDto purchasesDto);
	
	public List<PurchasesDto> getPurchasesByArticleCode(String SSTORECODE, String articleCode);
	
	public List<PurchasesDto> getPurchases(String SSTORECODE);
}
