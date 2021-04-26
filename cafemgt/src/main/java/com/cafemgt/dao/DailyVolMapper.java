package com.cafemgt.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.DailyVolDto;

@Mapper
public interface DailyVolMapper {
	public List<DailyVolDto> getDailyVol(String SSTORECODE);

	public List<DailyVolDto> getDailyVolDeadLine(String SSTORECODE);
	
	public List<String> getDailyVolByConCode(String SSTORECODE);
	
	public int addDailyVolDeadLine(DailyVolDto dailyVolDto);

	public int modifyDailyVolDeadLine(String dailyVolCode);
	
	//getSalesByDailyVol 가져온 값 -> addDailyVol insert
	public List<DailyVolDto> getSalesByDailyVol(Map<String,Object> map);

	public int addDailyVol(DailyVolDto dailyVolDto);
	
	public int modifySalesDeadLine(List<String> arraySales);
}
