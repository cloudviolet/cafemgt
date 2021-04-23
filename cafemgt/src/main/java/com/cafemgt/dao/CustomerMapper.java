package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.CustomerDto;

@Mapper
public interface CustomerMapper {
	
	//거래처 삭제
	public int deleteCustomer(String custCode);
	//거래처 수정
	public int updateCustomer(CustomerDto customerDto);
	//거래처 수정화면
	public CustomerDto getinfoCustomer(String custCode);
	//거래처 등록
	public int addCustomer(CustomerDto customerDto);
	//거래처 조회
	public List<CustomerDto> getCustomer(String SSTORECODE);

}
