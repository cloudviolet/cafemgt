package com.cafemgt.scheduler;

import java.util.List;
import java.util.Map;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.cafemgt.dto.IncomeStatementDto;
import com.cafemgt.service.TaxService;

@Component
public class TaxScheduler {
	
	private final TaxService taxService; 
	
	public TaxScheduler(TaxService taxService) {
		this.taxService = taxService;
	}
	
	@Scheduled(cron = "0 0 0 * * *")
	public void addIncomeStatement() {
		List<IncomeStatementDto> incomestatemnetList = taxService.getIncomeStatementByDealing();
		if(incomestatemnetList != null) {
			for(int i = 0; i <incomestatemnetList.size(); i++) {				
				taxService.addIncomeStatement(incomestatemnetList.get(i));
			}		
		}
		List<Map<String,String>> vatList = taxService.getDealingForVAT();
		if(vatList !=null) {
			for(int i = 0; i<vatList.size();i++) {
				taxService.addVat(vatList.get(i));
			}
		}
	}
}
