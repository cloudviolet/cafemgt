package com.cafemgt.scheduler;

import java.util.List;
import java.util.Map;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.cafemgt.dto.StockDto;
import com.cafemgt.service.SalesService;
import com.cafemgt.service.StockService;

@Component
public class StockScheduler {
	
	private final StockService stockService; 
	private final SalesService salesService; 
	
	public StockScheduler(StockService stockService, SalesService salesService) {
		this.stockService = stockService;
		this.salesService = salesService;
	}
	
	@Scheduled(cron = "0 0 0 * * *")
	public void addCostDetail() {
		List<StockDto> stockList = stockService.getStockAllStore();
		System.out.println(stockList);
		stockService.addStock(stockList);
		
		List<Map<String,String>> costDtList = salesService.getCostDetail();
		System.out.println(costDtList);
		if(costDtList.size() != 0){
			for(int i = 0 ; i< costDtList.size(); i++) {
				System.out.println(costDtList.get(i));
				salesService.addCostDetailByAddStock(costDtList.get(i));
			}
		}
		System.out.println(costDtList);
	}
}
