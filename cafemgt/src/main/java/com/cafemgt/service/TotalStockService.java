package com.cafemgt.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafemgt.dao.TotalStockMapper;
import com.cafemgt.dto.TotalStockDto;


@Service
@Transactional
public class TotalStockService {

	private final TotalStockMapper totalStockMapper;
	
	public TotalStockService(TotalStockMapper totalStockMapper) {
		this.totalStockMapper= totalStockMapper;
	}
	
	public List<TotalStockDto> getTotalStock(String SSTORECODE) {
		List<TotalStockDto> totalStockList = totalStockMapper.getTotalStock(SSTORECODE);
		for(int i = 0 ; i < totalStockList.size(); i++) {
			if(totalStockList.get(i).getIncoCheck() == 1) {
				totalStockList.get(i).setDetailvolCheckString("사용 전");
			}else if(totalStockList.get(i).getIncoCheck() == 2) {
				totalStockList.get(i).setDetailvolCheckString("사용 중");
			}else if(totalStockList.get(i).getIncoCheck() == 3) {
				totalStockList.get(i).setDetailvolCheckString("사용 완료");
			}
		}
		return totalStockList;
	}
	public List<TotalStockDto> getTotalStockByIncoCode(String SSTORECODE, String incoCode){
		List<TotalStockDto> totalStockList = totalStockMapper.getTotalStockByIncoCode(SSTORECODE,incoCode);
		for(int i = 0 ; i < totalStockList.size(); i++) {
			if(totalStockList.get(i).getIncoCheck() == 1) {
				totalStockList.get(i).setDetailvolCheckString("사용 전");
			}else if(totalStockList.get(i).getIncoCheck() == 2) {
				totalStockList.get(i).setDetailvolCheckString("사용 중");
			}else if(totalStockList.get(i).getIncoCheck() == 3) {
				totalStockList.get(i).setDetailvolCheckString("사용 완료");
			}
		}
		return totalStockList;
	}
	
	public int addTotalStock(Map<String, Object> purchasesMap) {
		
		return totalStockMapper.addTotalStock(purchasesMap);
	}
	
	public int addTotalStockOverVolume(TotalStockDto totalStockDto) {
		totalStockMapper.addTotalStockOverVolume(totalStockDto);
		totalStockMapper.modifyTotalStockDeadLine(totalStockDto);
		
		return 0;
	}
	
	public int modifyIncoCheck(Map<String, String> incoMap) {
			totalStockMapper.modifyIncoCheck(incoMap);
		return 0;
	}
	
	public int modifyIncoDeadLine(String incoCode) {
		totalStockMapper.modifyIncoDeadLine(incoCode);
		return 0;
	}
	
}
