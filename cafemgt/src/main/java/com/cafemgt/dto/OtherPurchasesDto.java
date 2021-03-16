package com.cafemgt.dto;

public class OtherPurchasesDto {
	private String oeCode;
	private String storeInfoCode;
	private String oeStoreName;
	private String oeVatType;
	private int oeTotal;
	private int oeSupplyValue;
	private int oeTax;
	private String atDebitCode;
	private String atCreditCode;
	private String oeEtc;
	private String oedate;
	private String oeRegDate;
	
	public String getOeCode() {
		return oeCode;
	}
	public void setOeCode(String oeCode) {
		this.oeCode = oeCode;
	}
	public String getStoreInfoCode() {
		return storeInfoCode;
	}
	public void setStoreInfoCode(String storeInfoCode) {
		this.storeInfoCode = storeInfoCode;
	}
	public String getOeStoreName() {
		return oeStoreName;
	}
	public void setOeStoreName(String oeStoreName) {
		this.oeStoreName = oeStoreName;
	}
	public String getOeVatType() {
		return oeVatType;
	}
	public void setOeVatType(String oeVatType) {
		this.oeVatType = oeVatType;
	}
	public int getOeTotal() {
		return oeTotal;
	}
	public void setOeTotal(int oeTotal) {
		this.oeTotal = oeTotal;
	}
	public int getOeSupplyValue() {
		return oeSupplyValue;
	}
	public void setOeSupplyValue(int oeSupplyValue) {
		this.oeSupplyValue = oeSupplyValue;
	}
	public int getOeTax() {
		return oeTax;
	}
	public void setOeTax(int oeTax) {
		this.oeTax = oeTax;
	}
	public String getAtDebitCode() {
		return atDebitCode;
	}
	public void setAtDebitCode(String atDebitCode) {
		this.atDebitCode = atDebitCode;
	}
	public String getAtCreditCode() {
		return atCreditCode;
	}
	public void setAtCreditCode(String atCreditCode) {
		this.atCreditCode = atCreditCode;
	}
	public String getOeEtc() {
		return oeEtc;
	}
	public void setOeEtc(String oeEtc) {
		this.oeEtc = oeEtc;
	}
	public String getOedate() {
		return oedate;
	}
	public void setOedate(String oedate) {
		this.oedate = oedate;
	}
	public String getOeRegDate() {
		return oeRegDate;
	}
	public void setOeRegDate(String oeRegDate) {
		this.oeRegDate = oeRegDate;
	}
	
	@Override
	public String toString() {
		return "OtherPurchasesDto [oeCode=" + oeCode + ", storeInfoCode=" + storeInfoCode + ", oeStoreName="
				+ oeStoreName + ", oeVatType=" + oeVatType + ", oeTotal=" + oeTotal + ", oeSupplyValue=" + oeSupplyValue
				+ ", oeTax=" + oeTax + ", atDebitCode=" + atDebitCode + ", atCreditCode=" + atCreditCode + ", atEtc="
				+ oeEtc + ", oedate=" + oedate + ", oeRegDate=" + oeRegDate + "]";
	}
	
}
