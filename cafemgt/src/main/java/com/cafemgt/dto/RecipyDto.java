package com.cafemgt.dto;

public class RecipyDto {
	private String conCode;
	private String storeInfoCode;
	private String storeInfoName;
	private String menuCode;
	private String menuName;
	private String articleCode;
	private String articleName;
	private String conVolume;
	private String conDan;
	private String conRemoveString;
	public String getConCode() {
		return conCode;
	}
	public void setConCode(String conCode) {
		this.conCode = conCode;
	}
	public String getStoreInfoCode() {
		return storeInfoCode;
	}
	public void setStoreInfoCode(String storeInfoCode) {
		this.storeInfoCode = storeInfoCode;
	}
	public String getStoreInfoName() {
		return storeInfoName;
	}
	public void setStoreInfoName(String storeInfoName) {
		this.storeInfoName = storeInfoName;
	}
	public String getMenuCode() {
		return menuCode;
	}
	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getArticleCode() {
		return articleCode;
	}
	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}
	public String getArticleName() {
		return articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}
	public String getConVolume() {
		return conVolume;
	}
	public void setConVolume(String conVolume) {
		this.conVolume = conVolume;
	}
	public String getConDan() {
		return conDan;
	}
	public void setConDan(String conDan) {
		this.conDan = conDan;
	}
	public String getConRemoveString() {
		return conRemoveString;
	}
	public void setConRemoveString(String conRemoveString) {
		this.conRemoveString = conRemoveString;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RecipyDto [conCode=");
		builder.append(conCode);
		builder.append(", storeInfoCode=");
		builder.append(storeInfoCode);
		builder.append(", storeInfoName=");
		builder.append(storeInfoName);
		builder.append(", menuCode=");
		builder.append(menuCode);
		builder.append(", menuName=");
		builder.append(menuName);
		builder.append(", articleCode=");
		builder.append(articleCode);
		builder.append(", articleName=");
		builder.append(articleName);
		builder.append(", conVolume=");
		builder.append(conVolume);
		builder.append(", conDan=");
		builder.append(conDan);
		builder.append(", conRemoveString=");
		builder.append(conRemoveString);
		builder.append("]");
		return builder.toString();
	}
	
	}
