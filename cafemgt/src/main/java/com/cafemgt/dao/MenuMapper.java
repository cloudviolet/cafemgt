package com.cafemgt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafemgt.dto.MenuDto;

@Mapper
public interface MenuMapper {
	public List<MenuDto> getMenu(String SSTORECODE);
	
	public MenuDto getMenuByMenuCode(String menuCode);
	
	public int modifyMenu(MenuDto menuDto);

	public int addMenu(MenuDto menuDto);
	
	public int removeMenu(String menuCode);
}
