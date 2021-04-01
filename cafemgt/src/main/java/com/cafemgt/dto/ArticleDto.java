package com.cafemgt.dto;

public class ArticleDto {

	private String articleCode;
	private String storeInfoCode;
	private String storeInfoName;
	private String articleName;
	private String articleTaxCate;
	private int articleBig;
	private String articleBigDan;
	private int articleMiddle;
	private String articleMiddleDan;
	private int	 articleVolume;
	private String articleDan;
	private String articleEtc;
	private String articleRegDate;
	public String getArticleCode() {
		return articleCode;
	}
	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
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
	public String getArticleName() {
		return articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}
	public String getArticleTaxCate() {
		return articleTaxCate;
	}
	public void setArticleTaxCate(String articleTaxCate) {
		this.articleTaxCate = articleTaxCate;
	}
	public int getArticleBig() {
		return articleBig;
	}
	public void setArticleBig(int articleBig) {
		this.articleBig = articleBig;
	}
	public String getArticleBigDan() {
		return articleBigDan;
	}
	public void setArticleBigDan(String articleBigDan) {
		this.articleBigDan = articleBigDan;
	}
	public int getArticleMiddle() {
		return articleMiddle;
	}
	public void setArticleMiddle(int articleMiddle) {
		this.articleMiddle = articleMiddle;
	}
	public String getArticleMiddleDan() {
		return articleMiddleDan;
	}
	public void setArticleMiddleDan(String articleMiddleDan) {
		this.articleMiddleDan = articleMiddleDan;
	}
	public int getArticleVolume() {
		return articleVolume;
	}
	public void setArticleVolume(int articleVolume) {
		this.articleVolume = articleVolume;
	}
	public String getArticleDan() {
		return articleDan;
	}
	public void setArticleDan(String articleDan) {
		this.articleDan = articleDan;
	}
	public String getArticleEtc() {
		return articleEtc;
	}
	public void setArticleEtc(String articleEtc) {
		this.articleEtc = articleEtc;
	}
	public String getArticleRegDate() {
		return articleRegDate;
	}
	public void setArticleRegDate(String articleRegDate) {
		this.articleRegDate = articleRegDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArticleDto [articleCode=");
		builder.append(articleCode);
		builder.append(", storeInfoCode=");
		builder.append(storeInfoCode);
		builder.append(", storeInfoName=");
		builder.append(storeInfoName);
		builder.append(", articleName=");
		builder.append(articleName);
		builder.append(", articleTaxCate=");
		builder.append(articleTaxCate);
		builder.append(", articleBig=");
		builder.append(articleBig);
		builder.append(", articleBigDan=");
		builder.append(articleBigDan);
		builder.append(", articleMiddle=");
		builder.append(articleMiddle);
		builder.append(", articleMiddleDan=");
		builder.append(articleMiddleDan);
		builder.append(", articleVolume=");
		builder.append(articleVolume);
		builder.append(", articleDan=");
		builder.append(articleDan);
		builder.append(", articleEtc=");
		builder.append(articleEtc);
		builder.append(", articleRegDate=");
		builder.append(articleRegDate);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
