package com.cafemgt.dto;

public class SalesDto {
	private String salesCode;
	private String storeInfoCode;
	private String menuCode;
	private int salesCount;
	private int salesTotal;
	private int salesSupplyValue;
	private int salesTax;
	private String salesVatType;
	private String salesPayType;
	private String CustCode;
	private String salesDate; 
	private String salesRegDate;
	private String salesDeadline; 
	private String salesDealingGroupCode;
	private String salesDeadlineCheck;
	private String salesDaliyvolGroupCode;
	private String salesSystemId;
	private String salesSystemName;
	
	public String getSalesCode() {
		return salesCode;
	}
	public void setSalesCode(String salesCode) {
		this.salesCode = salesCode;
	}
	public String getStoreInfoCode() {
		return storeInfoCode;
	}
	public void setStoreInfoCode(String storeInfoCode) {
		this.storeInfoCode = storeInfoCode;
	}
	public String getMenuCode() {
		return menuCode;
	}
	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}
	public int getSalesCount() {
		return salesCount;
	}
	public void setSalesCount(int salesCount) {
		this.salesCount = salesCount;
	}
	public int getSalesTotal() {
		return salesTotal;
	}
	public void setSalesTotal(int salesTotal) {
		this.salesTotal = salesTotal;
	}
	public int getSalesSupplyValue() {
		return salesSupplyValue;
	}
	public void setSalesSupplyValue(int salesSupplyValue) {
		this.salesSupplyValue = salesSupplyValue;
	}
	public int getSalesTax() {
		return salesTax;
	}
	public void setSalesTax(int salesTax) {
		this.salesTax = salesTax;
	}
	public String getSalesVatType() {
		return salesVatType;
	}
	public void setSalesVatType(String salesVatType) {
		this.salesVatType = salesVatType;
	}
	public String getSalesPayType() {
		return salesPayType;
	}
	public void setSalesPayType(String salesPayType) {
		this.salesPayType = salesPayType;
	}
	public String getCustCode() {
		return CustCode;
	}
	public void setCustCode(String custCode) {
		CustCode = custCode;
	}
	public String getSalesDate() {
		return salesDate;
	}
	public void setSalesDate(String salesDate) {
		this.salesDate = salesDate;
	}
	public String getSalesRegDate() {
		return salesRegDate;
	}
	public void setSalesRegDate(String salesRegDate) {
		this.salesRegDate = salesRegDate;
	}
	public String getSalesDeadline() {
		return salesDeadline;
	}
	public void setSalesDeadline(String salesDeadline) {
		this.salesDeadline = salesDeadline;
	}
	public String getSalesDealingGroupCode() {
		return salesDealingGroupCode;
	}
	public void setSalesDealingGroupCode(String salesDealingGroupCode) {
		this.salesDealingGroupCode = salesDealingGroupCode;
	}
	public String getSalesDeadlineCheck() {
		return salesDeadlineCheck;
	}
	public void setSalesDeadlineCheck(String salesDeadlineCheck) {
		this.salesDeadlineCheck = salesDeadlineCheck;
	}
	public String getSalesDaliyvolGroupCode() {
		return salesDaliyvolGroupCode;
	}
	public void setSalesDaliyvolGroupCode(String salesDaliyvolGroupCode) {
		this.salesDaliyvolGroupCode = salesDaliyvolGroupCode;
	}
	public String getSalesSystemId() {
		return salesSystemId;
	}
	public void setSalesSystemId(String salesSystemId) {
		this.salesSystemId = salesSystemId;
	}
	public String getSalesSystemName() {
		return salesSystemName;
	}
	public void setSalesSystemName(String salesSystemName) {
		this.salesSystemName = salesSystemName;
	}
	
	@Override
	public String toString() {
		return "SalesDto [salesCode=" + salesCode + ", storeInfoCode=" + storeInfoCode + ", menuCode=" + menuCode
				+ ", salesCount=" + salesCount + ", salesTotal=" + salesTotal + ", salesSupplyValue=" + salesSupplyValue
				+ ", salesTax=" + salesTax + ", salesVatType=" + salesVatType + ", salesPayType=" + salesPayType
				+ ", CustCode=" + CustCode + ", salesDate=" + salesDate + ", salesRegDate=" + salesRegDate
				+ ", salesDeadline=" + salesDeadline + ", salesDealingGroupCode=" + salesDealingGroupCode
				+ ", salesDeadlineCheck=" + salesDeadlineCheck + ", salesDaliyvolGroupCode=" + salesDaliyvolGroupCode
				+ ", salesSystemId=" + salesSystemId + ", salesSystemName=" + salesSystemName + "]";
	}
}
