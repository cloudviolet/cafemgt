package com.cafemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafemgt.dao.RecipyMapper;
import com.cafemgt.dto.RecipyDto;

@Service
@Transactional
public class RecipyService {

	private final RecipyMapper recipyMapper;
	
	public RecipyService(RecipyMapper recipyMapper) {
		this.recipyMapper= recipyMapper;
	}
	
	public List<RecipyDto> getRecipy(String SSTORECODE) {
		
		return recipyMapper.getRecipy(SSTORECODE);
	}
	
	public int addRecipy(RecipyDto recipyDto) {
		
		return recipyMapper.addRecipy(recipyDto);
	}
}
