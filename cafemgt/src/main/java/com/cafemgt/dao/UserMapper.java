package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.UserDto;

@Mapper
public interface UserMapper {
	public List<UserDto> getUser(String SSTORECODE);

}
