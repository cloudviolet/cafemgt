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
	private String oeDate;
	private String oeRegDate;
	private String oeDeadline;
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
	public String getOeDate() {
		return oeDate;
	}
	public void setOeDate(String oeDate) {
		this.oeDate = oeDate;
	}
	public String getOeRegDate() {
		return oeRegDate;
	}
	public void setOeRegDate(String oeRegDate) {
		this.oeRegDate = oeRegDate;
	}
	public String getOeDeadline() {
		return oeDeadline;
	}
	public void setOeDeadline(String oeDeadline) {
		this.oeDeadline = oeDeadline;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((atCreditCode == null) ? 0 : atCreditCode.hashCode());
		result = prime * result + ((atDebitCode == null) ? 0 : atDebitCode.hashCode());
		result = prime * result + ((oeCode == null) ? 0 : oeCode.hashCode());
		result = prime * result + ((oeDate == null) ? 0 : oeDate.hashCode());
		result = prime * result + ((oeDeadline == null) ? 0 : oeDeadline.hashCode());
		result = prime * result + ((oeEtc == null) ? 0 : oeEtc.hashCode());
		result = prime * result + ((oeRegDate == null) ? 0 : oeRegDate.hashCode());
		result = prime * result + ((oeStoreName == null) ? 0 : oeStoreName.hashCode());
		result = prime * result + oeSupplyValue;
		result = prime * result + oeTax;
		result = prime * result + oeTotal;
		result = prime * result + ((oeVatType == null) ? 0 : oeVatType.hashCode());
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
		OtherPurchasesDto other = (OtherPurchasesDto) obj;
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
		if (oeCode == null) {
			if (other.oeCode != null)
				return false;
		} else if (!oeCode.equals(other.oeCode))
			return false;
		if (oeDate == null) {
			if (other.oeDate != null)
				return false;
		} else if (!oeDate.equals(other.oeDate))
			return false;
		if (oeDeadline == null) {
			if (other.oeDeadline != null)
				return false;
		} else if (!oeDeadline.equals(other.oeDeadline))
			return false;
		if (oeEtc == null) {
			if (other.oeEtc != null)
				return false;
		} else if (!oeEtc.equals(other.oeEtc))
			return false;
		if (oeRegDate == null) {
			if (other.oeRegDate != null)
				return false;
		} else if (!oeRegDate.equals(other.oeRegDate))
			return false;
		if (oeStoreName == null) {
			if (other.oeStoreName != null)
				return false;
		} else if (!oeStoreName.equals(other.oeStoreName))
			return false;
		if (oeSupplyValue != other.oeSupplyValue)
			return false;
		if (oeTax != other.oeTax)
			return false;
		if (oeTotal != other.oeTotal)
			return false;
		if (oeVatType == null) {
			if (other.oeVatType != null)
				return false;
		} else if (!oeVatType.equals(other.oeVatType))
			return false;
		if (storeInfoCode == null) {
			if (other.storeInfoCode != null)
				return false;
		} else if (!storeInfoCode.equals(other.storeInfoCode))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OtherPurchasesDto [oeCode=" + oeCode + ", storeInfoCode=" + storeInfoCode + ", oeStoreName="
				+ oeStoreName + ", oeVatType=" + oeVatType + ", oeTotal=" + oeTotal + ", oeSupplyValue=" + oeSupplyValue
				+ ", oeTax=" + oeTax + ", atDebitCode=" + atDebitCode + ", atCreditCode=" + atCreditCode + ", oeEtc="
				+ oeEtc + ", oeDate=" + oeDate + ", oeRegDate=" + oeRegDate + ", oeDeadline=" + oeDeadline + "]";
	}
	
}
