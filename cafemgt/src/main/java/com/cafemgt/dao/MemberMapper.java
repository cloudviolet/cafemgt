package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.MemberDto;

@Mapper
public interface MemberMapper {	
	
	public String getyear(String MID);
	
	public List<MemberDto> addMemberUser(String SSTORECODE);
	
	public List<MemberDto> getMemberadmin();
	
	public MemberDto getinfoMember(String memberId);
	
	public List<MemberDto> getMember(String MID);
	
	
	public List<MemberDto> getMemberU(String MID);
	

}
