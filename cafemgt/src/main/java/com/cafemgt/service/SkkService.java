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
	public List<SkkDto> getSkkByDeadLine(String SSTORECODE) {
		
		return skkMapper.getSkkByDeadLine(SSTORECODE);
	}
	public SkkDto getSkkBySkCode(String skCode){
		
		return skkMapper.getSkkBySkCode(skCode);
	}
	public int addSkk(SkkDto skkDto) {
		return skkMapper.addSkk(skkDto);
	}
	
	public int modifySkk(SkkDto skkDto) {
		
		return skkMapper.modifySkk(skkDto);
	}
	
	public int modifySkkDeadlineCheck(String skCode) {
		return skkMapper.modifySkkDeadlineCheck(skCode);
	}
	
	public int removeSkk(String skCode) {
		return skkMapper.removeSkk(skCode);
	}
}
