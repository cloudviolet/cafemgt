package com.cafemgt.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.DealingDto;

@Mapper
public interface DealingMapper {
	
	public int modifyOtherPurchasesDeadLine(List<String> arrayOtherPurchases);
	
	public List<DealingDto> getOtherPurchasesByDealing(Map<String,Object> otherPurchasesInfoMap);
	
	public Map<String,String> getOldDateByDealing(String SSTORECODE);
	
	public int modifySalesDeadLineForTax(List<String> arraySales);
	
	public int addDealing(DealingDto dealingDto);
	
	public List<DealingDto> getSalesByDealing(Map<String,Object> salesInfoMap);

}
