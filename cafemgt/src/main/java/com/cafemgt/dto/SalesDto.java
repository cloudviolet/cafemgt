package com.cafemgt.dto;

public class SalesDto {
	private String salesCode;
	private String storeInfoCode;
	private String menuCode;
	private String menuName;
	private int salesCount;
	private int salesTotal;
	private int salesSupplyValue;
	private int salesTax;
	private String salesVatType;
	private String salesPayType;
	private String custCode;
	private String custName;
	private String salesDate; 
	private String salesRegDate;
	private String salesDeadlineTax; 
	private String salesDealingGroupCode;
	private String salesDeadlineDailyvol;
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
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
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
	public String getSalesDeadlineTax() {
		return salesDeadlineTax;
	}
	public void setSalesDeadlineTax(String salesDeadlineTax) {
		this.salesDeadlineTax = salesDeadlineTax;
	}
	public String getSalesDealingGroupCode() {
		return salesDealingGroupCode;
	}
	public void setSalesDealingGroupCode(String salesDealingGroupCode) {
		this.salesDealingGroupCode = salesDealingGroupCode;
	}
	public String getSalesDeadlineDailyvol() {
		return salesDeadlineDailyvol;
	}
	public void setSalesDeadlineDailyvol(String salesDeadlineDailyvol) {
		this.salesDeadlineDailyvol = salesDeadlineDailyvol;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((custCode == null) ? 0 : custCode.hashCode());
		result = prime * result + ((custName == null) ? 0 : custName.hashCode());
		result = prime * result + ((menuCode == null) ? 0 : menuCode.hashCode());
		result = prime * result + ((menuName == null) ? 0 : menuName.hashCode());
		result = prime * result + ((salesCode == null) ? 0 : salesCode.hashCode());
		result = prime * result + salesCount;
		result = prime * result + ((salesDaliyvolGroupCode == null) ? 0 : salesDaliyvolGroupCode.hashCode());
		result = prime * result + ((salesDate == null) ? 0 : salesDate.hashCode());
		result = prime * result + ((salesDeadlineDailyvol == null) ? 0 : salesDeadlineDailyvol.hashCode());
		result = prime * result + ((salesDeadlineTax == null) ? 0 : salesDeadlineTax.hashCode());
		result = prime * result + ((salesDealingGroupCode == null) ? 0 : salesDealingGroupCode.hashCode());
		result = prime * result + ((salesPayType == null) ? 0 : salesPayType.hashCode());
		result = prime * result + ((salesRegDate == null) ? 0 : salesRegDate.hashCode());
		result = prime * result + salesSupplyValue;
		result = prime * result + ((salesSystemId == null) ? 0 : salesSystemId.hashCode());
		result = prime * result + ((salesSystemName == null) ? 0 : salesSystemName.hashCode());
		result = prime * result + salesTax;
		result = prime * result + salesTotal;
		result = prime * result + ((salesVatType == null) ? 0 : salesVatType.hashCode());
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
		SalesDto other = (SalesDto) obj;
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
		if (menuCode == null) {
			if (other.menuCode != null)
				return false;
		} else if (!menuCode.equals(other.menuCode))
			return false;
		if (menuName == null) {
			if (other.menuName != null)
				return false;
		} else if (!menuName.equals(other.menuName))
			return false;
		if (salesCode == null) {
			if (other.salesCode != null)
				return false;
		} else if (!salesCode.equals(other.salesCode))
			return false;
		if (salesCount != other.salesCount)
			return false;
		if (salesDaliyvolGroupCode == null) {
			if (other.salesDaliyvolGroupCode != null)
				return false;
		} else if (!salesDaliyvolGroupCode.equals(other.salesDaliyvolGroupCode))
			return false;
		if (salesDate == null) {
			if (other.salesDate != null)
				return false;
		} else if (!salesDate.equals(other.salesDate))
			return false;
		if (salesDeadlineDailyvol == null) {
			if (other.salesDeadlineDailyvol != null)
				return false;
		} else if (!salesDeadlineDailyvol.equals(other.salesDeadlineDailyvol))
			return false;
		if (salesDeadlineTax == null) {
			if (other.salesDeadlineTax != null)
				return false;
		} else if (!salesDeadlineTax.equals(other.salesDeadlineTax))
			return false;
		if (salesDealingGroupCode == null) {
			if (other.salesDealingGroupCode != null)
				return false;
		} else if (!salesDealingGroupCode.equals(other.salesDealingGroupCode))
			return false;
		if (salesPayType == null) {
			if (other.salesPayType != null)
				return false;
		} else if (!salesPayType.equals(other.salesPayType))
			return false;
		if (salesRegDate == null) {
			if (other.salesRegDate != null)
				return false;
		} else if (!salesRegDate.equals(other.salesRegDate))
			return false;
		if (salesSupplyValue != other.salesSupplyValue)
			return false;
		if (salesSystemId == null) {
			if (other.salesSystemId != null)
				return false;
		} else if (!salesSystemId.equals(other.salesSystemId))
			return false;
		if (salesSystemName == null) {
			if (other.salesSystemName != null)
				return false;
		} else if (!salesSystemName.equals(other.salesSystemName))
			return false;
		if (salesTax != other.salesTax)
			return false;
		if (salesTotal != other.salesTotal)
			return false;
		if (salesVatType == null) {
			if (other.salesVatType != null)
				return false;
		} else if (!salesVatType.equals(other.salesVatType))
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
		return "SalesDto [salesCode=" + salesCode + ", storeInfoCode=" + storeInfoCode + ", menuCode=" + menuCode
				+ ", menuName=" + menuName + ", salesCount=" + salesCount + ", salesTotal=" + salesTotal
				+ ", salesSupplyValue=" + salesSupplyValue + ", salesTax=" + salesTax + ", salesVatType=" + salesVatType
				+ ", salesPayType=" + salesPayType + ", custCode=" + custCode + ", custName=" + custName
				+ ", salesDate=" + salesDate + ", salesRegDate=" + salesRegDate + ", salesDeadlineTax="
				+ salesDeadlineTax + ", salesDealingGroupCode=" + salesDealingGroupCode + ", salesDeadlineDailyvol="
				+ salesDeadlineDailyvol + ", salesDaliyvolGroupCode=" + salesDaliyvolGroupCode + ", salesSystemId="
				+ salesSystemId + ", salesSystemName=" + salesSystemName + "]";
	}
		
}
