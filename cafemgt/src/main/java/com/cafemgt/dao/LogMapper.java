package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.LogDto;


@Mapper
public interface LogMapper {
	//로그인 이력 조회
	public List<LogDto> getLog();
}
