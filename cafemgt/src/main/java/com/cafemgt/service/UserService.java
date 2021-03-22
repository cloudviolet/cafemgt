package com.cafemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafemgt.dao.UserMapper;
import com.cafemgt.dto.UserDto;

@Service
@Transactional
public class UserService {
	
	private final UserMapper userMapper;
	
	@Autowired
	public UserService(UserMapper userMapper) {
		this.userMapper= userMapper;
	}
	
	public int addUser(UserDto userDto) {
		userMapper.addUser(userDto);
		
		return 0;
	}
	
	public List<UserDto> getUseradmin(){
		List<UserDto> userDtoList = userMapper.getUseradmin();
		
		return userDtoList;
	}
	
	public List<UserDto> getUser(String SSTORECODE){
		List<UserDto> userDtoList = userMapper.getUser(SSTORECODE);
		
		return userDtoList;
	}

}
