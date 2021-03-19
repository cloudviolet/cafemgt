package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.CustomerDto;

@Mapper
public interface CustomerMapper {
	
	public List<CustomerDto> getCustomer(String SSTORECODE);

}
