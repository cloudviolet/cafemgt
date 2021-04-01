package com.cafemgt.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafemgt.dao.VatMapper;
import com.cafemgt.dto.VatDto;

@Service
@Transactional
public class TaxService {
	
	private final VatMapper vatMapper;
	
	public TaxService(VatMapper vatMapper) {
		this.vatMapper = vatMapper;
	}
	
	public int addIntendedTax(String intendedDays,String vatIntendedTax,String SSTORECODE) {
		return vatMapper.addIntendedTax(intendedDays,vatIntendedTax,SSTORECODE);
	}
	
	public VatDto getMyVat(String searchDays, String SSTORECODE){
		return vatMapper.getMyVat(searchDays, SSTORECODE);
	}

}
