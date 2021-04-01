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
		//조회
		return menuMapper.getMenu(SSTORECODE);
	}
	public MenuDto getMenuByMenuCode(String menuCode) {
		//수정을 위한 한개의 메뉴정보(dto) 호출
		return menuMapper.getMenuByMenuCode(menuCode);
	}
	public int modifyMenu(MenuDto menuDto) {
		
		return menuMapper.modifyMenu(menuDto);
	}
	
	
	public int addMenu(MenuDto menuDto) {
		//등록
		return menuMapper.addMenu(menuDto);
	}
}
