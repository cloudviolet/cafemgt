package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.UserDto;

@Mapper
public interface UserMapper {
	
	public int addUser(UserDto userDto);
	
	public List<UserDto> getUseradmin();
	
	public UserDto getinfoUser(String memberId);
	
	public List<UserDto> getUser(String SSTORECODE);

}
