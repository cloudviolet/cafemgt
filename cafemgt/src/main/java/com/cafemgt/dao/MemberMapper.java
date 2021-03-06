package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.MemberDto;

@Mapper
public interface MemberMapper {	
	
	public List<MemberDto> getStoreChoice(String MID);
	
	public String getyear(String MID);
	
	public List<MemberDto> addMemberUser(String SSTORECODE);
	
	public int addUserjoin(MemberDto memberDto);
	//관리자 회원조회
	public List<MemberDto> getMemberadmin();
	//관리자 탈퇴회원조회
	public List<MemberDto> getoutmemberadmin();
	
	public int updateMemberMy(MemberDto memberDto);
	
	public int updateMember(MemberDto memberDto);
	
	public MemberDto getinfoMember(String memberId);
	
	public List<MemberDto> getMember(String MID);
	
	public List<MemberDto> getMemberU(String MID);
	
	public int addMember(MemberDto memberDto);
	
}
