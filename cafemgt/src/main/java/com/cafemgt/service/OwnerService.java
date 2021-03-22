package com.cafemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafemgt.dao.OwnerMapper;
import com.cafemgt.dto.OwnerDto;

@Service
@Transactional
public class OwnerService {
	
	private final OwnerMapper ownerMapper;
	
	@Autowired
	public OwnerService(OwnerMapper ownerMapper) {
		this.ownerMapper = ownerMapper;
	}
	
	public String login(String ownerId, String ownerPw) {
		String result = "로그인 성공 실패";
		if(ownerId != null && !"".equals(ownerId) &&
		   ownerPw != null && !"".equals(ownerPw)) {			
			OwnerDto ownerDto = ownerMapper.getinfoOwner(ownerId);
			if(ownerId.equals(ownerDto.getOwnerId())) {
				if(ownerPw.equals(ownerDto.getOwnerPw())) {
					result ="로그인 성공";
				}else {
					result ="비밀번호 불일치";
				}
				
			}
		}		
		return result;
	}
	
	public List<OwnerDto> getOwneradmin(){
		List<OwnerDto> ownerDtolist = ownerMapper.getOwneradmin();
		
		return ownerDtolist;	
	}
	
	public OwnerDto getinfoOwner(String ownerId) {
		return ownerMapper.getinfoOwner(ownerId);
		
	}
	
	public List<OwnerDto> getOwner(String ownerId){
		List<OwnerDto> ownerDtolist = ownerMapper.getOwner(ownerId);
		
		return ownerDtolist;	
	}

}
