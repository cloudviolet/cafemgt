package com.cafemgt.dto;

public class DailyVolDto {

	private String	dailyvolCode;
	private String 	storeInfoCode;
	private String 	storeInfoName;
	private String 	menuCode;
	private String 	menuName;
	private String 	conCode;
	private int		conVolume;
	private String 	conDan;
	private String 	articleCode;
	private String 	articleName;
	private int 	salesCount;
	private int 	dailyvolSubtotal;
	private String 	dailyvolDeadlineCheck;
	private String 	dailyvolRegDate;
	private String 	dailyvolEtc;
	private String 	dailyvolRelGroupCode;
	private PurchasesDto incoDto;
	
	public String getDailyvolCode() {
		return dailyvolCode;
	}
	public void setDailyvolCode(String dailyvolCode) {
		this.dailyvolCode = dailyvolCode;
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
	public String getConCode() {
		return conCode;
	}
	public void setConCode(String conCode) {
		this.conCode = conCode;
	}
	public int getConVolume() {
		return conVolume;
	}
	public void setConVolume(int conVolume) {
		this.conVolume = conVolume;
	}
	public String getConDan() {
		return conDan;
	}
	public void setConDan(String conDan) {
		this.conDan = conDan;
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
	public int getSalesCount() {
		return salesCount;
	}
	public void setSalesCount(int salesCount) {
		this.salesCount = salesCount;
	}
	public int getDailyvolSubtotal() {
		return dailyvolSubtotal;
	}
	public void setDailyvolSubtotal(int dailyvolSubtotal) {
		this.dailyvolSubtotal = dailyvolSubtotal;
	}
	public String getDailyvolDeadlineCheck() {
		return dailyvolDeadlineCheck;
	}
	public void setDailyvolDeadlineCheck(String dailyvolDeadlineCheck) {
		this.dailyvolDeadlineCheck = dailyvolDeadlineCheck;
	}
	public String getDailyvolRegDate() {
		return dailyvolRegDate;
	}
	public void setDailyvolRegDate(String dailyvolRegDate) {
		this.dailyvolRegDate = dailyvolRegDate;
	}
	public String getDailyvolEtc() {
		return dailyvolEtc;
	}
	public void setDailyvolEtc(String dailyvolEtc) {
		this.dailyvolEtc = dailyvolEtc;
	}
	public String getDailyvolRelGroupCode() {
		return dailyvolRelGroupCode;
	}
	public void setDailyvolRelGroupCode(String dailyvolRelGroupCode) {
		this.dailyvolRelGroupCode = dailyvolRelGroupCode;
	}
	public PurchasesDto getIncoDto() {
		return incoDto;
	}
	public void setIncoDto(PurchasesDto incoDto) {
		this.incoDto = incoDto;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DailyVolDto [dailyvolCode=");
		builder.append(dailyvolCode);
		builder.append(", storeInfoCode=");
		builder.append(storeInfoCode);
		builder.append(", storeInfoName=");
		builder.append(storeInfoName);
		builder.append(", menuCode=");
		builder.append(menuCode);
		builder.append(", menuName=");
		builder.append(menuName);
		builder.append(", conCode=");
		builder.append(conCode);
		builder.append(", conVolume=");
		builder.append(conVolume);
		builder.append(", conDan=");
		builder.append(conDan);
		builder.append(", articleCode=");
		builder.append(articleCode);
		builder.append(", articleName=");
		builder.append(articleName);
		builder.append(", salesCount=");
		builder.append(salesCount);
		builder.append(", dailyvolSubtotal=");
		builder.append(dailyvolSubtotal);
		builder.append(", dailyvolDeadlineCheck=");
		builder.append(dailyvolDeadlineCheck);
		builder.append(", dailyvolRegDate=");
		builder.append(dailyvolRegDate);
		builder.append(", dailyvolEtc=");
		builder.append(dailyvolEtc);
		builder.append(", dailyvolRelGroupCode=");
		builder.append(dailyvolRelGroupCode);
		builder.append(", incoDto=");
		builder.append(incoDto);
		builder.append("]");
		return builder.toString();
	}
}
