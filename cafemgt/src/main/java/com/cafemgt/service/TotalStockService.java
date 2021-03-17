package com.cafemgt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cafemgt.dao.TotalStockMapper;
import com.cafemgt.dto.TotalStockDto;


@Service
public class TotalStockService {

	private final TotalStockMapper totalStockMapper;
	
	public TotalStockService(TotalStockMapper totalStockMapper) {
		this.totalStockMapper= totalStockMapper;
	}
	
	public List<TotalStockDto> getTotalStock() {
		List<TotalStockDto> totalStockList = totalStockMapper.getTotalStock();
		for(int i = 0 ; i < totalStockList.size(); i++) {
			if(totalStockList.get(i).getDetailvolCheck() == 1) {
				totalStockList.get(i).setDetailvolCheckString("사용전");
			}else if(totalStockList.get(i).getDetailvolCheck() == 2) {
				totalStockList.get(i).setDetailvolCheckString("사용중");
			}else if(totalStockList.get(i).getDetailvolCheck() == 3) {
				totalStockList.get(i).setDetailvolCheckString("사용완료");
			}
		}
		return totalStockList;
	}
	
}
