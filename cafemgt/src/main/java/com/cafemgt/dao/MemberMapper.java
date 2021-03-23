package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.MemberDto;

@Mapper
public interface MemberMapper {	
	
	public List<MemberDto> getMemberadmin();
	
	public MemberDto getinfoMember(String memberId);
	
	public List<MemberDto> getMember(String memberId);
	

}
