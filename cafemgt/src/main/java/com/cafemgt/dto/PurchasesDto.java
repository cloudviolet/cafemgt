package com.cafemgt.dto;

public class PurchasesDto {
	private String incoCode;
	private String storeInfoCode;
	private String articleCode;
	private String articleName;
	private String custCode;
	private String custName;
	private String incoVatType;
	private String incoVatCate;
	private String incoPayType;
	private int incoTotal;
	private int incoCount;
	private int incoVolumeSubtotal;
	private int incoSupplyValue;
	private int incoTax;
	private String incoDate;
	private String incoRegDate;
	private String incoDeadline;
	private String incoDeadlineTax;
	private int incoCheck;
	private String incoDelete;
	public String getIncoCode() {
		return incoCode;
	}
	public void setIncoCode(String incoCode) {
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
	public String getArticleName() {
		return articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}
	public String getCustCode() {
		return custCode;
	}
	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getIncoVatType() {
		return incoVatType;
	}
	public void setIncoVatType(String incoVatType) {
		this.incoVatType = incoVatType;
	}
	public String getIncoVatCate() {
		return incoVatCate;
	}
	public void setIncoVatCate(String incoVatCate) {
		this.incoVatCate = incoVatCate;
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
	public String getIncoDeadline() {
		return incoDeadline;
	}
	public void setIncoDeadline(String incoDeadline) {
		this.incoDeadline = incoDeadline;
	}
	public String getIncoDeadlineTax() {
		return incoDeadlineTax;
	}
	public void setIncoDeadlineTax(String incoDeadlineTax) {
		this.incoDeadlineTax = incoDeadlineTax;
	}
	public int getIncoCheck() {
		return incoCheck;
	}
	public void setIncoCheck(int incoCheck) {
		this.incoCheck = incoCheck;
	}
	public String getIncoDelete() {
		return incoDelete;
	}
	public void setIncoDelete(String incoDelete) {
		this.incoDelete = incoDelete;
	}
	@Override
	public String toString() {
		return "PurchasesDto [incoCode=" + incoCode + ", storeInfoCode=" + storeInfoCode + ", articleCode="
				+ articleCode + ", articleName=" + articleName + ", custCode=" + custCode + ", custName=" + custName
				+ ", incoVatType=" + incoVatType + ", incoVatCate=" + incoVatCate + ", incoPayType=" + incoPayType
				+ ", incoTotal=" + incoTotal + ", incoCount=" + incoCount + ", incoVolumeSubtotal=" + incoVolumeSubtotal
				+ ", incoSupplyValue=" + incoSupplyValue + ", incoTax=" + incoTax + ", incoDate=" + incoDate
				+ ", incoRegDate=" + incoRegDate + ", incoDeadline=" + incoDeadline + ", incoDeadlineTax="
				+ incoDeadlineTax + ", incoCheck=" + incoCheck + ", incoDelete=" + incoDelete + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((articleCode == null) ? 0 : articleCode.hashCode());
		result = prime * result + ((articleName == null) ? 0 : articleName.hashCode());
		result = prime * result + ((custCode == null) ? 0 : custCode.hashCode());
		result = prime * result + ((custName == null) ? 0 : custName.hashCode());
		result = prime * result + incoCheck;
		result = prime * result + ((incoCode == null) ? 0 : incoCode.hashCode());
		result = prime * result + incoCount;
		result = prime * result + ((incoDate == null) ? 0 : incoDate.hashCode());
		result = prime * result + ((incoDeadline == null) ? 0 : incoDeadline.hashCode());
		result = prime * result + ((incoDeadlineTax == null) ? 0 : incoDeadlineTax.hashCode());
		result = prime * result + ((incoDelete == null) ? 0 : incoDelete.hashCode());
		result = prime * result + ((incoPayType == null) ? 0 : incoPayType.hashCode());
		result = prime * result + ((incoRegDate == null) ? 0 : incoRegDate.hashCode());
		result = prime * result + incoSupplyValue;
		result = prime * result + incoTax;
		result = prime * result + incoTotal;
		result = prime * result + ((incoVatCate == null) ? 0 : incoVatCate.hashCode());
		result = prime * result + ((incoVatType == null) ? 0 : incoVatType.hashCode());
		result = prime * result + incoVolumeSubtotal;
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
		PurchasesDto other = (PurchasesDto) obj;
		if (articleCode == null) {
			if (other.articleCode != null)
				return false;
		} else if (!articleCode.equals(other.articleCode))
			return false;
		if (articleName == null) {
			if (other.articleName != null)
				return false;
		} else if (!articleName.equals(other.articleName))
			return false;
		if (custCode == null) {
			if (other.custCode != null)
				return false;
		} else if (!custCode.equals(other.custCode))
			return false;
		if (custName == null) {
			if (other.custName != null)
				return false;
		} else if (!custName.equals(other.custName))
			return false;
		if (incoCheck != other.incoCheck)
			return false;
		if (incoCode == null) {
			if (other.incoCode != null)
				return false;
		} else if (!incoCode.equals(other.incoCode))
			return false;
		if (incoCount != other.incoCount)
			return false;
		if (incoDate == null) {
			if (other.incoDate != null)
				return false;
		} else if (!incoDate.equals(other.incoDate))
			return false;
		if (incoDeadline == null) {
			if (other.incoDeadline != null)
				return false;
		} else if (!incoDeadline.equals(other.incoDeadline))
			return false;
		if (incoDeadlineTax == null) {
			if (other.incoDeadlineTax != null)
				return false;
		} else if (!incoDeadlineTax.equals(other.incoDeadlineTax))
			return false;
		if (incoDelete == null) {
			if (other.incoDelete != null)
				return false;
		} else if (!incoDelete.equals(other.incoDelete))
			return false;
		if (incoPayType == null) {
			if (other.incoPayType != null)
				return false;
		} else if (!incoPayType.equals(other.incoPayType))
			return false;
		if (incoRegDate == null) {
			if (other.incoRegDate != null)
				return false;
		} else if (!incoRegDate.equals(other.incoRegDate))
			return false;
		if (incoSupplyValue != other.incoSupplyValue)
			return false;
		if (incoTax != other.incoTax)
			return false;
		if (incoTotal != other.incoTotal)
			return false;
		if (incoVatCate == null) {
			if (other.incoVatCate != null)
				return false;
		} else if (!incoVatCate.equals(other.incoVatCate))
			return false;
		if (incoVatType == null) {
			if (other.incoVatType != null)
				return false;
		} else if (!incoVatType.equals(other.incoVatType))
			return false;
		if (incoVolumeSubtotal != other.incoVolumeSubtotal)
			return false;
		if (storeInfoCode == null) {
			if (other.storeInfoCode != null)
				return false;
		} else if (!storeInfoCode.equals(other.storeInfoCode))
			return false;
		return true;
	}
	
}
