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
		System.out.println("직원 등록서비스 확인");
		return userMapper.addUser(userDto);
	}

	// 직원관리-> 직원조회-> 수정페이지 업데이트 user
	public int updateUser(UserDto userDto) {
		return userMapper.updateUser(userDto);		
	}
	
	public UserDto getinfoUser(String memberId) {
		return userMapper.getinfoUser(memberId);
		
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
