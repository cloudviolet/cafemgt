package com.cafemgt.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafemgt.dao.DailyVolMapper;
import com.cafemgt.dto.DailyVolDto;


@Service
@Transactional
public class DailyVolService {

	private final DailyVolMapper dailyVolMapper;
	
	public DailyVolService(DailyVolMapper dailyVolMapper) {
		this.dailyVolMapper= dailyVolMapper;
	}
	
	public List<DailyVolDto> getDailyVol(String SSTORECODE) {
		
		return dailyVolMapper.getDailyVol(SSTORECODE);
	}
	public List<DailyVolDto> getDailyVolDeadLine(String SSTORECODE) {
		
		return dailyVolMapper.getDailyVolDeadLine(SSTORECODE);
	}
	
	public int addDailyVolDeadLine(DailyVolDto dailyVolDto) {
		dailyVolMapper.addDailyVolDeadLine(dailyVolDto);
		return 0;
	}
	
	public int modifyDailyVolDeadLine(String dailyVolCode) {
		dailyVolMapper.modifyDailyVolDeadLine(dailyVolCode);
		return 0;
	}
	
	public List<DailyVolDto> getSalesByDailyVol(Map<String,Object> map){
		List<DailyVolDto> DailyVolList = dailyVolMapper.getSalesByDailyVol(map);
		return DailyVolList;
	}
	
	public int addDailyVol(DailyVolDto dailyVolDto) {
		int result = 0;
		result = dailyVolMapper.addDailyVol(dailyVolDto);
		return result;
	}
	
	public int modifySalesDeadLine(List<String> arraySales) {
		dailyVolMapper.modifySalesDeadLine(arraySales);
		return 0;
	}
	
	
}
