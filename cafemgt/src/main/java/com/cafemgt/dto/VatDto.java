package com.cafemgt.dto;

public class VatDto {
	private String vatCode;
	private String storeInfoCode;
	private String vatDate;
	private String vatUnique;
	private int vatSaleSupplyValue;
	private int vatSalesTax;
	private int vatPurchaseSupplyValue;
	private int vatPurchaseTax;
	private int vatIntendedTax;
	private int vatDeemedInputTax;
	private int vatCardTax;
	private int vatAdditionalTax;
	private int vatPaymentTax;
	public String getVatCode() {
		return vatCode;
	}
	public void setVatCode(String vatCode) {
		this.vatCode = vatCode;
	}
	public String getStoreInfoCode() {
		return storeInfoCode;
	}
	public void setStoreInfoCode(String storeInfoCode) {
		this.storeInfoCode = storeInfoCode;
	}
	public String getVatDate() {
		return vatDate;
	}
	public void setVatDate(String vatDate) {
		this.vatDate = vatDate;
	}
	public String getVatUnique() {
		return vatUnique;
	}
	public void setVatUnique(String vatUnique) {
		this.vatUnique = vatUnique;
	}
	public int getVatSaleSupplyValue() {
		return vatSaleSupplyValue;
	}
	public void setVatSaleSupplyValue(int vatSaleSupplyValue) {
		this.vatSaleSupplyValue = vatSaleSupplyValue;
	}
	public int getVatSalesTax() {
		return vatSalesTax;
	}
	public void setVatSalesTax(int vatSalesTax) {
		this.vatSalesTax = vatSalesTax;
	}
	public int getVatPurchaseSupplyValue() {
		return vatPurchaseSupplyValue;
	}
	public void setVatPurchaseSupplyValue(int vatPurchaseSupplyValue) {
		this.vatPurchaseSupplyValue = vatPurchaseSupplyValue;
	}
	public int getVatPurchaseTax() {
		return vatPurchaseTax;
	}
	public void setVatPurchaseTax(int vatPurchaseTax) {
		this.vatPurchaseTax = vatPurchaseTax;
	}
	public int getVatIntendedTax() {
		return vatIntendedTax;
	}
	public void setVatIntendedTax(int vatIntendedTax) {
		this.vatIntendedTax = vatIntendedTax;
	}
	public int getVatDeemedInputTax() {
		return vatDeemedInputTax;
	}
	public void setVatDeemedInputTax(int vatDeemedInputTax) {
		this.vatDeemedInputTax = vatDeemedInputTax;
	}
	public int getVatCardTax() {
		return vatCardTax;
	}
	public void setVatCardTax(int vatCardTax) {
		this.vatCardTax = vatCardTax;
	}
	public int getVatAdditionalTax() {
		return vatAdditionalTax;
	}
	public void setVatAdditionalTax(int vatAdditionalTax) {
		this.vatAdditionalTax = vatAdditionalTax;
	}
	public int getVatPaymentTax() {
		return vatPaymentTax;
	}
	public void setVatPaymentTax(int vatPaymentTax) {
		this.vatPaymentTax = vatPaymentTax;
	}
	@Override
	public String toString() {
		return "VatDto [vatCode=" + vatCode + ", storeInfoCode=" + storeInfoCode + ", vatDate=" + vatDate
				+ ", vatUnique=" + vatUnique + ", vatSaleSupplyValue=" + vatSaleSupplyValue + ", vatSalesTax="
				+ vatSalesTax + ", vatPurchaseSupplyValue=" + vatPurchaseSupplyValue + ", vatPurchaseTax="
				+ vatPurchaseTax + ", vatIntendedTax=" + vatIntendedTax + ", vatDeemedInputTax=" + vatDeemedInputTax
				+ ", vatCardTax=" + vatCardTax + ", vatAdditionalTax=" + vatAdditionalTax + ", vatPaymentTax="
				+ vatPaymentTax + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((storeInfoCode == null) ? 0 : storeInfoCode.hashCode());
		result = prime * result + vatAdditionalTax;
		result = prime * result + vatCardTax;
		result = prime * result + ((vatCode == null) ? 0 : vatCode.hashCode());
		result = prime * result + ((vatDate == null) ? 0 : vatDate.hashCode());
		result = prime * result + vatDeemedInputTax;
		result = prime * result + vatIntendedTax;
		result = prime * result + vatPaymentTax;
		result = prime * result + vatPurchaseSupplyValue;
		result = prime * result + vatPurchaseTax;
		result = prime * result + vatSaleSupplyValue;
		result = prime * result + vatSalesTax;
		result = prime * result + ((vatUnique == null) ? 0 : vatUnique.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VatDto other = (VatDto) obj;
		if (storeInfoCode == null) {
			if (other.storeInfoCode != null)
				return false;
		} else if (!storeInfoCode.equals(other.storeInfoCode))
			return false;
		if (vatAdditionalTax != other.vatAdditionalTax)
			return false;
		if (vatCardTax != other.vatCardTax)
			return false;
		if (vatCode == null) {
			if (other.vatCode != null)
				return false;
		} else if (!vatCode.equals(other.vatCode))
			return false;
		if (vatDate == null) {
			if (other.vatDate != null)
				return false;
		} else if (!vatDate.equals(other.vatDate))
			return false;
		if (vatDeemedInputTax != other.vatDeemedInputTax)
			return false;
		if (vatIntendedTax != other.vatIntendedTax)
			return false;
		if (vatPaymentTax != other.vatPaymentTax)
			return false;
		if (vatPurchaseSupplyValue != other.vatPurchaseSupplyValue)
			return false;
		if (vatPurchaseTax != other.vatPurchaseTax)
			return false;
		if (vatSaleSupplyValue != other.vatSaleSupplyValue)
			return false;
		if (vatSalesTax != other.vatSalesTax)
			return false;
		if (vatUnique == null) {
			if (other.vatUnique != null)
				return false;
		} else if (!vatUnique.equals(other.vatUnique))
			return false;
		return true;
	}
	
}
