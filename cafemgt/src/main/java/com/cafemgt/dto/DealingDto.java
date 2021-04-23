package com.cafemgt.dto;

public class DealingDto {
	private String dealCode;
	private String storeInfoCode;
	private String dealCate;
	private String dealVatType;
	private int dealTotal;
	private int dealSupplyValue;
	private int dealTax;
	private String 	atDebitCode;
	private String atCreditCode;
	private String dealDate;
	private String dealRegDate;
	public String getDealCode() {
		return dealCode;
	}
	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}
	public String getStoreInfoCode() {
		return storeInfoCode;
	}
	public void setStoreInfoCode(String storeInfoCode) {
		this.storeInfoCode = storeInfoCode;
	}
	public String getDealCate() {
		return dealCate;
	}
	public void setDealCate(String dealCate) {
		this.dealCate = dealCate;
	}
	public String getDealVatType() {
		return dealVatType;
	}
	public void setDealVatType(String dealVatType) {
		this.dealVatType = dealVatType;
	}
	public int getDealTotal() {
		return dealTotal;
	}
	public void setDealTotal(int dealTotal) {
		this.dealTotal = dealTotal;
	}
	public int getDealSupplyValue() {
		return dealSupplyValue;
	}
	public void setDealSupplyValue(int dealSupplyValue) {
		this.dealSupplyValue = dealSupplyValue;
	}
	public int getDealTax() {
		return dealTax;
	}
	public void setDealTax(int dealTax) {
		this.dealTax = dealTax;
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
	public String getDealDate() {
		return dealDate;
	}
	public void setDealDate(String dealDate) {
		this.dealDate = dealDate;
	}
	public String getDealRegDate() {
		return dealRegDate;
	}
	public void setDealRegDate(String dealRegDate) {
		this.dealRegDate = dealRegDate;
	}
	@Override
	public String toString() {
		return "DealingDto [dealCode=" + dealCode + ", storeInfoCode=" + storeInfoCode + ", dealCate=" + dealCate
				+ ", dealVatType=" + dealVatType + ", dealTotal=" + dealTotal + ", dealSupplyValue=" + dealSupplyValue
				+ ", dealTax=" + dealTax + ", atDebitCode=" + atDebitCode + ", atCreditCode=" + atCreditCode
				+ ", dealDate=" + dealDate + ", dealRegDate=" + dealRegDate + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((atCreditCode == null) ? 0 : atCreditCode.hashCode());
		result = prime * result + ((atDebitCode == null) ? 0 : atDebitCode.hashCode());
		result = prime * result + ((dealCate == null) ? 0 : dealCate.hashCode());
		result = prime * result + ((dealCode == null) ? 0 : dealCode.hashCode());
		result = prime * result + ((dealDate == null) ? 0 : dealDate.hashCode());
		result = prime * result + ((dealRegDate == null) ? 0 : dealRegDate.hashCode());
		result = prime * result + dealSupplyValue;
		result = prime * result + dealTax;
		result = prime * result + dealTotal;
		result = prime * result + ((dealVatType == null) ? 0 : dealVatType.hashCode());
		result = prime * result + ((storeInfoCode == null) ? 0 : storeInfoCode.hashCode());
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
		DealingDto other = (DealingDto) obj;
		if (atCreditCode == null) {
			if (other.atCreditCode != null)
				return false;
		} else if (!atCreditCode.equals(other.atCreditCode))
			return false;
		if (atDebitCode == null) {
			if (other.atDebitCode != null)
				return false;
		} else if (!atDebitCode.equals(other.atDebitCode))
			return false;
		if (dealCate == null) {
			if (other.dealCate != null)
				return false;
		} else if (!dealCate.equals(other.dealCate))
			return false;
		if (dealCode == null) {
			if (other.dealCode != null)
				return false;
		} else if (!dealCode.equals(other.dealCode))
			return false;
		if (dealDate == null) {
			if (other.dealDate != null)
				return false;
		} else if (!dealDate.equals(other.dealDate))
			return false;
		if (dealRegDate == null) {
			if (other.dealRegDate != null)
				return false;
		} else if (!dealRegDate.equals(other.dealRegDate))
			return false;
		if (dealSupplyValue != other.dealSupplyValue)
			return false;
		if (dealTax != other.dealTax)
			return false;
		if (dealTotal != other.dealTotal)
			return false;
		if (dealVatType == null) {
			if (other.dealVatType != null)
				return false;
		} else if (!dealVatType.equals(other.dealVatType))
			return false;
		if (storeInfoCode == null) {
			if (other.storeInfoCode != null)
				return false;
		} else if (!storeInfoCode.equals(other.storeInfoCode))
			return false;
		return true;
	}

}
