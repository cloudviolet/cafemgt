package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.UserDto;

@Mapper
public interface UserMapper {
	
	
	//직원가입
	public int addUserjoin1(UserDto userDto);
	//직원로그인
	public UserDto userLogin(String memberId);
	
	//직원정보추가
	public int addUser(UserDto userDto);
	//직원정보수정
	public int updateUser(UserDto userDto);
	//직원 정보 관리자
	public List<UserDto> getUseradmin();
	
	public UserDto getinfoUser(String memberId);
	
	public List<UserDto> getUser(String SSTORECODE);

}
