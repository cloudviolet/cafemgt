package com.cafemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafemgt.dao.UserMapper;
import com.cafemgt.dto.UserDto;

@Service
public class UserService {
	
	private final UserMapper userMapper;
	
	@Autowired
	public UserService(UserMapper userMapper) {
		this.userMapper= userMapper;
	}
	
	public List<UserDto> getUser(){
		List<UserDto> userDtoList = userMapper.getUser();
		
		return userDtoList;
	}

}
