package com.cafemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafemgt.dao.MemberMapper;
import com.cafemgt.dto.MemberDto;

@Service
@Transactional
public class MemberService {
	
	private final MemberMapper memberMapper;
	
	@Autowired
	public MemberService(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}
	
	public String login(String memberId, String memberPw) {
		String result = "로그인 성공 실패";
		if(memberId != null && !"".equals(memberId) &&
		   memberPw != null && !"".equals(memberPw)) {			
			MemberDto memberDto = memberMapper.getinfoMember(memberId);
			if(memberId.equals(memberDto.getMemberId())) {
				if(memberPw.equals(memberDto.getMemberPw())) {
					result ="로그인 성공";
				}else {
					result ="비밀번호 불일치";
				}
				
			}
		}		
		return result;
	}
	public String getyear(String MID) {
		return memberMapper.getyear(MID);
	}
	public List<MemberDto> addMemberUser(String SSTORECODE){
		List<MemberDto> memberDtolist = memberMapper.addMemberUser(SSTORECODE);
		
		return memberDtolist;	
	}
	
	public List<MemberDto> getMemberadmin(){
		List<MemberDto> memberDtolist = memberMapper.getMemberadmin();
		
		return memberDtolist;	
	}
	
	// 직원관리-> 직원조회-> 수정페이지 업데이트 member
	public int updateMember(MemberDto memberDto) {
		return memberMapper.updateMember(memberDto);
	}
	
	
	public MemberDto getinfoMember(String memberId) {
		return memberMapper.getinfoMember(memberId);
		
	}
	
	public List<MemberDto> getMember(String MID){
		List<MemberDto> memberDtolist = memberMapper.getMember(MID);
		
		return memberDtolist;	
	}
	
	public List<MemberDto> getMemberU(String MID){
		List<MemberDto> memberDtolist = memberMapper.getMember(MID);
		
		return memberDtolist;	
	}
	
	public int addMember(MemberDto memberDto){
		//회원가입
		return memberMapper.addMember(memberDto);
	}

}
