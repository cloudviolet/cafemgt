package com.cafemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafemgt.dao.CustomerMapper;
import com.cafemgt.dto.CustomerDto;

@Service
@Transactional
public class CustomerService {
	private final CustomerMapper customerMapper;
	
	@Autowired
	public CustomerService(CustomerMapper customerMapper) {
		this.customerMapper = customerMapper;
	}
	
	//거래처 삭제
	public int deleteCustomer(String custCode) {
		return customerMapper.deleteCustomer(custCode);
	}
	//거래처 수정
	public int updateCustomer(CustomerDto customerDto) {
		return customerMapper.updateCustomer(customerDto);
	}
	
	//거래처 수정에서 정보 보기
	public CustomerDto getinfoCustomer(String custCode) {
		return customerMapper.getinfoCustomer(custCode);
		
	}
	
	//거래처 등록
	public int addCustomer(CustomerDto customerDto) {
		System.out.println("거래처 등록 서비스 확인");
		return customerMapper.addCustomer(customerDto);
	}

	//거래처 조회
	public List<CustomerDto> getCustomer(String SSTORECODE){
		List<CustomerDto> customerDtoList = customerMapper.getCustomer(SSTORECODE);
		
		return customerDtoList;
	}

}
