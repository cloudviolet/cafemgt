package com.cafemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafemgt.dao.SkkMapper;
import com.cafemgt.dto.SkkDto;


@Service
@Transactional
public class SkkService {
	
	private final SkkMapper skkMapper;
	
	public SkkService(SkkMapper skkMapper) {
	
		this.skkMapper= skkMapper;
	}
	
	public List<SkkDto> getSkk(String SSTORECODE) {
		
		return skkMapper.getSkk(SSTORECODE);
	}
	
	public int addSkk(SkkDto skkDto) {
		return skkMapper.addSkk(skkDto);
	}
}
