package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.DailyVolDto;

@Mapper
public interface DailyVolMapper {
	public List<DailyVolDto> getDailyVol(String SSTORECODE);

	public List<DailyVolDto> getDailyVolDeadLine(String SSTORECODE);
}
