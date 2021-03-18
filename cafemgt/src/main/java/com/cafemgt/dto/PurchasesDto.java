package com.cafemgt.dto;

public class PurchasesDto {
	private String incoCode;
	private String storeInfoCode;
	private String articleCode ;
	private String custCode;
	private String incoVatType;
	private String incoPayType;
	private int incoTotal;
	private int incoCount;
	private int incoVolumeSubtotal;
	private int incoSupplyValue;
	private int incoTax;
	private String incoDealingGroupCode;
	private String incoStockGroupCode;
	private String incoDate;
	private String incoRegDate;
	private String incoCheck;
	private String incoSystemId;
	private String incoSystemName;
	private int detailvolCheck;
	
	public String getInco_code() {
		return incoCode;
	}
	public void setInco_code(String incoCode) {
		this.incoCode = incoCode;
	}
	public String getStoreInfoCode() {
		return storeInfoCode;
	}
	public void setStoreInfoCode(String storeInfoCode) {
		this.storeInfoCode = storeInfoCode;
	}
	public String getArticleCode() {
		return articleCode;
	}
	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}
	public String getCustCode() {
		return custCode;
	}
	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}
	public String getIncoVatType() {
		return incoVatType;
	}
	public void setIncoVatType(String incoVatType) {
		this.incoVatType = incoVatType;
	}
	public String getIncoPayType() {
		return incoPayType;
	}
	public void setIncoPayType(String incoPayType) {
		this.incoPayType = incoPayType;
	}
	public int getIncoTotal() {
		return incoTotal;
	}
	public void setIncoTotal(int incoTotal) {
		this.incoTotal = incoTotal;
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
	public int getIncoSupplyValue() {
		return incoSupplyValue;
	}
	public void setIncoSupplyValue(int incoSupplyValue) {
		this.incoSupplyValue = incoSupplyValue;
	}
	public int getIncoTax() {
		return incoTax;
	}
	public void setIncoTax(int incoTax) {
		this.incoTax = incoTax;
	}
	public String getIncoDealingGroupCode() {
		return incoDealingGroupCode;
	}
	public void setIncoDealingGroupCode(String incoDealingGroupCode) {
		this.incoDealingGroupCode = incoDealingGroupCode;
	}
	public String getIncoStockGroupCode() {
		return incoStockGroupCode;
	}
	public void setIncoStockGroupCode(String incoStockGroupCode) {
		this.incoStockGroupCode = incoStockGroupCode;
	}
	public String getIncoDate() {
		return incoDate;
	}
	public void setIncoDate(String incoDate) {
		this.incoDate = incoDate;
	}
	public String getIncoRegDate() {
		return incoRegDate;
	}
	public void setIncoRegDate(String incoRegDate) {
		this.incoRegDate = incoRegDate;
	}
	public String getIncoCheck() {
		return incoCheck;
	}
	public void setIncoCheck(String incoCheck) {
		this.incoCheck = incoCheck;
	}
	public String getIncoSystemId() {
		return incoSystemId;
	}
	public void setIncoSystemId(String incoSystemId) {
		this.incoSystemId = incoSystemId;
	}
	public String getIncoSystemName() {
		return incoSystemName;
	}
	public void setIncoSystemName(String incoSystemName) {
		this.incoSystemName = incoSystemName;
	}
	public int getDetailvolCheck() {
		return detailvolCheck;
	}
	public void setDetailvolCheck(int detailvolCheck) {
		this.detailvolCheck = detailvolCheck;
	}
	
	@Override
	public String toString() {
		return "PurchasesDto [incoCode=" + incoCode + ", storeInfoCode=" + storeInfoCode + ", articleCode="
				+ articleCode + ", custCode=" + custCode + ", incoVatType=" + incoVatType + ", incoPayType="
				+ incoPayType + ", incoTotal=" + incoTotal + ", incoCount=" + incoCount + ", incoVolumeSubtotal="
				+ incoVolumeSubtotal + ", incoSupplyValue=" + incoSupplyValue + ", incoTax=" + incoTax
				+ ", incoDealingGroupCode=" + incoDealingGroupCode + ", incoStockGroupCode=" + incoStockGroupCode
				+ ", incoDate=" + incoDate + ", incoRegDate=" + incoRegDate + ", incoCheck=" + incoCheck
				+ ", incoSystemId=" + incoSystemId + ", incoSystemName=" + incoSystemName + ", detailvolCheck="
				+ detailvolCheck + "]";
	}
}
