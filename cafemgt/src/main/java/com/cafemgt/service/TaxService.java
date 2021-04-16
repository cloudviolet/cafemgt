package com.cafemgt.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafemgt.dao.DealingMapper;
import com.cafemgt.dao.IncomeStatementMapper;
import com.cafemgt.dao.VatMapper;
import com.cafemgt.dto.DealingDto;
import com.cafemgt.dto.IncomeStatementDto;
import com.cafemgt.dto.VatDto;

@Service
@Transactional
public class TaxService {
	
	private final VatMapper vatMapper;
	private final DealingMapper dealingMapper;
	private final IncomeStatementMapper incomeStatementMapper;
	
	public TaxService(VatMapper vatMapper
					 ,DealingMapper dealingMapper
					 ,IncomeStatementMapper incomeStatementMapper) {
		this.vatMapper = vatMapper;
		this.dealingMapper = dealingMapper;
		this.incomeStatementMapper = incomeStatementMapper;
	}
	
	public List<IncomeStatementDto> getIncomeStatement(String SSTORECODE, String searchYear){
		return incomeStatementMapper.getIncomeStatement(SSTORECODE, searchYear);
	}
	
	public int addIncomeStatement(IncomeStatementDto incomestatemnetList) {
		return incomeStatementMapper.addIncomeStatement(incomestatemnetList);
	}
	
	public List<IncomeStatementDto> getIncomeStatementByDealing(){
		return incomeStatementMapper.getIncomeStatementByDealing();
	}
	
	public Map<String,String> getYearFromDealing(String SSTORECODE) {
		return dealingMapper.getYearFromDealing(SSTORECODE);
	}
	
	public Map<String,Object> getTotalpandsPeriod(Map<String, Object> map){
		return dealingMapper.getTotalpandsPeriod(map);
	}
	
	public Map<String,Object> getTotalpands(Map<String, Object> map){
		return dealingMapper.getTotalpands(map);
	}
	
	public int modifyPurchasesDeadLineTax(List<String> arrayPurchases) {
		return dealingMapper.modifyPurchasesDeadLineTax(arrayPurchases);
	}
	
	public List<DealingDto> getPurchasesByDealing(Map<String,Object> purchasesInfoMap){
		return dealingMapper.getPurchasesByDealing(purchasesInfoMap);
	}
	
	public int modifyOtherPurchasesDeadLine(List<String> arrayOtherPurchases) {
		return dealingMapper.modifyOtherPurchasesDeadLine(arrayOtherPurchases);
	}
	
	public List<DealingDto> getOtherPurchasesByDealing(Map<String,Object> otherPurchasesInfoMap){
		return dealingMapper.getOtherPurchasesByDealing(otherPurchasesInfoMap);
	}
	
	public String getVatYear(String SSTORECODE) {
		return vatMapper.getVatYear(SSTORECODE);
	}
	
	public Map<String,String> getOldDateByDealing(String SSTORECODE) {
		return dealingMapper.getOldDateByDealing(SSTORECODE);
	}
	
	public int modifySalesDeadLineForTax(List<String> arraySales) {
		return dealingMapper.modifySalesDeadLineForTax(arraySales);
	}
	
	public int addDealing(DealingDto dealingDto) {
		return dealingMapper.addDealing(dealingDto);
	}
	
	public List<DealingDto> getSalesByDealing(Map<String,Object> salesInfoMap){
		return dealingMapper.getSalesByDealing(salesInfoMap);
	}
	
	public int addIntendedTax(String intendedYearMonth,String vatIntendedTaxValue,String SSTORECODE) {
		return vatMapper.addIntendedTax(intendedYearMonth,vatIntendedTaxValue,SSTORECODE);
	}
	
	public VatDto getMyVat(String searchDays, String SSTORECODE){
		return vatMapper.getMyVat(searchDays, SSTORECODE);
	}

}
