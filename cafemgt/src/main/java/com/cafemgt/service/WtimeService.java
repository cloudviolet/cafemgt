package com.cafemgt.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafemgt.dao.WtimeMapper;
import com.cafemgt.dto.WtimeDto;

@Service
@Transactional
public class WtimeService {
	
	private final  WtimeMapper  wtimeMapper;
	
	public WtimeService(WtimeMapper wtimeMapper) {
		this.wtimeMapper= wtimeMapper;
	}
	
	public List<WtimeDto> getWtime(String SSTORECODE){
		List<WtimeDto> wtimeDto = wtimeMapper.getWtime(SSTORECODE);
		
		return wtimeDto;
	}
	
	public WtimeDto getWtimeByAttCode(String attCode) {
		
		return wtimeMapper.getWtimeByAttCode(attCode);
	}
	
	public int modifyWtime(WtimeDto wtimeDto) {
		
		return wtimeMapper.modifyWtime(wtimeDto);
	}
	
	public int addWtime(WtimeDto wtimeDto) {
			
		return wtimeMapper.addWtime(wtimeDto);
	}
}
