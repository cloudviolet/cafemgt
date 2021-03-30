package com.cafemgt.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafemgt.dao.DsalaryMapper;
import com.cafemgt.dto.DsalaryDto;

@Service
@Transactional
public class DsalaryService {
	
	private final  DsalaryMapper  dsalaryMapper;
	
	
	public DsalaryService(DsalaryMapper dsalaryMapper) {
		this.dsalaryMapper= dsalaryMapper;
	}
	
	public List<DsalaryDto> getDsalary(String SSTORECODE){
		List<DsalaryDto> dsalaryDto = dsalaryMapper.getDsalary(SSTORECODE);
		
		return dsalaryDto;
	}
		
	public DsalaryDto getDsalaryBySdCode(String sdCode) {
		
		return dsalaryMapper.getDsalaryBySdCode(sdCode);
	}
	
	public int modifyDsalary(DsalaryDto dsalaryDto) {
		
		return dsalaryMapper.modifyDsalary(dsalaryDto);
	}
	
	public int addDsalary(DsalaryDto dsalaryDto) {
		
		return dsalaryMapper.addDsalary(dsalaryDto);
	}
}
