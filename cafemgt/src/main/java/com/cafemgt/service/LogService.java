package com.cafemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafemgt.dao.LogMapper;
import com.cafemgt.dto.LogDto;

@Service
@Transactional
public class LogService {
	private final LogMapper logMapper;
	
	@Autowired
	public LogService(LogMapper logMapper) {
		this.logMapper = logMapper;
	}
	
	public List<LogDto> getLog(){
		List<LogDto> storeDtoList = logMapper.getLog();
		
		return storeDtoList;
	}
	
	
}
