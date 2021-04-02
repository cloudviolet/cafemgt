package com.cafemgt.dto;

public class StockDto {
	private String stockCode;
	private String storeInfoCode;
	private String storeInfoName;
	private String articleCode;
	private ArticleDto articleDto;
	private int incoCount;	
	private int incoVolumeSubtotal;	
	private int stockIncoUnitTotal;
	private int stockMinUnit;
	private int stockConCount;
	private int stocklVolumeTotal;
	private int stockNowCount;
	private int stockNowVolume;
	private String stockRegDate;
	
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
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
	public String getArticleCode() {
		return articleCode;
	}
	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}
	public ArticleDto getArticleDto() {
		return articleDto;
	}
	public void setArticleDto(ArticleDto articleDto) {
		this.articleDto = articleDto;
	}
	public int getIncoCount() {
		return incoCount;
	}
	public void setIncoCount(int incoCount) {
		this.incoCount = incoCount;
	}
	public int getIncoVolumeSubtotal() {
		return incoVolumeSubtotal;
	}
	public void setIncoVolumeSubtotal(int incoVolumeSubtotal) {
		this.incoVolumeSubtotal = incoVolumeSubtotal;
	}
	public int getStockIncoUnitTotal() {
		return stockIncoUnitTotal;
	}
	public void setStockIncoUnitTotal(int stockIncoUnitTotal) {
		this.stockIncoUnitTotal = stockIncoUnitTotal;
	}
	public int getStockMinUnit() {
		return stockMinUnit;
	}
	public void setStockMinUnit(int stockMinUnit) {
		this.stockMinUnit = stockMinUnit;
	}
	public int getStockConCount() {
		return stockConCount;
	}
	public void setStockConCount(int stockConCount) {
		this.stockConCount = stockConCount;
	}
	public int getStocklVolumeTotal() {
		return stocklVolumeTotal;
	}
	public void setStocklVolumeTotal(int stocklVolumeTotal) {
		this.stocklVolumeTotal = stocklVolumeTotal;
	}
	public int getStockNowCount() {
		return stockNowCount;
	}
	public void setStockNowCount(int stockNowCount) {
		this.stockNowCount = stockNowCount;
	}
	public int getStockNowVolume() {
		return stockNowVolume;
	}
	public void setStockNowVolume(int stockNowVolume) {
		this.stockNowVolume = stockNowVolume;
	}
	public String getStockRegDate() {
		return stockRegDate;
	}
	public void setStockRegDate(String stockRegDate) {
		this.stockRegDate = stockRegDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StockDto [stockCode=");
		builder.append(stockCode);
		builder.append(", storeInfoCode=");
		builder.append(storeInfoCode);
		builder.append(", storeInfoName=");
		builder.append(storeInfoName);
		builder.append(", articleCode=");
		builder.append(articleCode);
		builder.append(", articleDto=");
		builder.append(articleDto);
		builder.append(", incoCount=");
		builder.append(incoCount);
		builder.append(", incoVolumeSubtotal=");
		builder.append(incoVolumeSubtotal);
		builder.append(", stockIncoUnitTotal=");
		builder.append(stockIncoUnitTotal);
		builder.append(", stockMinUnit=");
		builder.append(stockMinUnit);
		builder.append(", stockConCount=");
		builder.append(stockConCount);
		builder.append(", stocklVolumeTotal=");
		builder.append(stocklVolumeTotal);
		builder.append(", stockNowCount=");
		builder.append(stockNowCount);
		builder.append(", stockNowVolume=");
		builder.append(stockNowVolume);
		builder.append(", stockRegDate=");
		builder.append(stockRegDate);
		builder.append("]");
		return builder.toString();
	}
	
}
