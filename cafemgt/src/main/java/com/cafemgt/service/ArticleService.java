package com.cafemgt.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafemgt.dao.ArticleMapper;
import com.cafemgt.dto.ArticleDto;

@Service
@Transactional
public class ArticleService {
	
	private final ArticleMapper articleMapper;
	
	public ArticleService(ArticleMapper articleMapper) {
		this.articleMapper= articleMapper;
	}
	
	public List<ArticleDto> getArticle(String SSTORECODE){
		List<ArticleDto> articleDto = articleMapper.getArticle(SSTORECODE);
		
		return articleDto;
	}
	public ArticleDto getArticleByArticleCode(String articleCode) {
		
		return articleMapper.getArticleByArticleCode(articleCode);
	}
	
	public int addArticle(ArticleDto articleDto) {
		
		return articleMapper.addArticle(articleDto);
	}
	
	public int modifyArticle(ArticleDto articleDto) {
		
		return articleMapper.modifyArticle(articleDto);
	}
	public List<String> getArticleByRemove() {
		return articleMapper.getArticleByRemove();
	}
	public int removeArticle(String articleCode) {
		
		return articleMapper.removeArticle(articleCode);
	}
	
}
