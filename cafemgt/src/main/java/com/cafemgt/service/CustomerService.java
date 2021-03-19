package com.cafemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafemgt.dao.CustomerMapper;
import com.cafemgt.dto.CustomerDto;

@Service
public class CustomerService {
	private final CustomerMapper customerMapper;
	
	@Autowired
	public CustomerService(CustomerMapper customerMapper) {
		this.customerMapper = customerMapper;
	}
	
	public List<CustomerDto> getCustomer(String SSTORECODE){
		List<CustomerDto> customerDtoList = customerMapper.getCustomer(SSTORECODE);
		
		return customerDtoList;
	}

}
