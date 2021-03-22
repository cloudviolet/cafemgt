package com.cafemgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafemgt.dao.MenuMapper;
import com.cafemgt.dto.MenuDto;

@Service
@Transactional
public class MenuService {

	private final MenuMapper menuMapper;
	
	public MenuService(MenuMapper menuMapper) {
		this.menuMapper= menuMapper;
	}
	
	public List<MenuDto> getMenu(String SSTORECODE) {
		
		return menuMapper.getMenu(SSTORECODE);
	}
	
	public int addMenu(MenuDto menuDto) {
		
		return menuMapper.addMenu(menuDto);
	}
}
