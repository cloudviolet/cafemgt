package com.cafemgt.service;

import java.util.List;

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
	
}
