package com.cafemgt.service;

import java.util.List;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
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
	
	public  List<MemberDto> getStoreChoice(String MID){
		return memberMapper.getStoreChoice(MID);
	}
	
	public String login(String memberId, String memberPw) {
		StandardPBEStringEncryptor stringPBEConfig = new StandardPBEStringEncryptor();
		stringPBEConfig.setPassword("cafemgt");		   //대칭키 (암호화 키) 설정
		stringPBEConfig.setAlgorithm("PBEWithMD5AndDES");  //사용할 암호화  알고리즘
		
		String result = "로그인 성공 실패";
		if(memberId != null && !"".equals(memberId) &&
		   memberPw != null && !"".equals(memberPw)) {			
			MemberDto memberDto = memberMapper.getinfoMember(memberId);
			String decryptMemberPw = (stringPBEConfig.decrypt(memberDto.getMemberPw()));
			System.out.println(decryptMemberPw);
			if(memberId.equals(memberDto.getMemberId())) {
				if(memberPw.equals(decryptMemberPw)) {
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
	
	public int addUserjoin(MemberDto memberDto){
		
		return memberMapper.addUserjoin(memberDto);	
	}
	//관리자회원조회
	public List<MemberDto> getMemberadmin(){
		List<MemberDto> memberDtolist = memberMapper.getMemberadmin();
		
		return memberDtolist;	
	}
	//관리자탈퇴회원조회
	public List<MemberDto> getoutmemberadmin(){
		List<MemberDto> memberDtolist = memberMapper.getoutmemberadmin();
		
		return memberDtolist;	
	}
	
	// 마이페이지-> -> 수정페이지 업데이트 member
	public int updateMemberMy(MemberDto memberDto) {
		return memberMapper.updateMemberMy(memberDto);
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
