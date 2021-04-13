package com.cafemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafemgt.dao.BonusMapper;
import com.cafemgt.dto.BonusDto;

@Service
@Transactional
public class BonusService {
	
	private final  BonusMapper  bonusMapper;
	
	@Autowired
	public BonusService(BonusMapper bonusMapper) {
		this.bonusMapper= bonusMapper;
	}
	
	public List<BonusDto> getBonus(String SSTORECODE){
		List<BonusDto> bonusDto = bonusMapper.getBonus(SSTORECODE);
		
		return bonusDto;
	}
	
	public int addBonus(BonusDto bonusDto) {
		
		return bonusMapper.addBonus(bonusDto);
	}
	public BonusDto getBonusByUbCode(String ubCode) {
		
		return bonusMapper.getBonusByUbCode(ubCode);
	}
	
	public int modifyBonus(BonusDto bonusDto) {
		
		return bonusMapper.modifyBonus(bonusDto);
	}
}
