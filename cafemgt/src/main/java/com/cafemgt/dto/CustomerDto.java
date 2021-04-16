package com.cafemgt.dto;

public class CustomerDto {
	private String custCode;
	private String storeInfoCode;
	private String custNumber;
	private String custName;
	private String custBusinessType;
	private String custOwnerName;
	private String custPhone;
	private String custEtc;
	private String custRegDate;
	private String custDelete;
	public String getCustCode() {
		return custCode;
	}
	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}
	public String getStoreInfoCode() {
		return storeInfoCode;
	}
	public void setStoreInfoCode(String storeInfoCode) {
		this.storeInfoCode = storeInfoCode;
	}
	public String getCustNumber() {
		return custNumber;
	}
	public void setCustNumber(String custNumber) {
		this.custNumber = custNumber;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustBusinessType() {
		return custBusinessType;
	}
	public void setCustBusinessType(String custBusinessType) {
		this.custBusinessType = custBusinessType;
	}
	public String getCustOwnerName() {
		return custOwnerName;
	}
	public void setCustOwnerName(String custOwnerName) {
		this.custOwnerName = custOwnerName;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	public String getCustEtc() {
		return custEtc;
	}
	public void setCustEtc(String custEtc) {
		this.custEtc = custEtc;
	}
	public String getCustRegDate() {
		return custRegDate;
	}
	public void setCustRegDate(String custRegDate) {
		this.custRegDate = custRegDate;
	}
	public String getCustDelete() {
		return custDelete;
	}
	public void setCustDelete(String custDelete) {
		this.custDelete = custDelete;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((custBusinessType == null) ? 0 : custBusinessType.hashCode());
		result = prime * result + ((custCode == null) ? 0 : custCode.hashCode());
		result = prime * result + ((custDelete == null) ? 0 : custDelete.hashCode());
		result = prime * result + ((custEtc == null) ? 0 : custEtc.hashCode());
		result = prime * result + ((custName == null) ? 0 : custName.hashCode());
		result = prime * result + ((custNumber == null) ? 0 : custNumber.hashCode());
		result = prime * result + ((custOwnerName == null) ? 0 : custOwnerName.hashCode());
		result = prime * result + ((custPhone == null) ? 0 : custPhone.hashCode());
		result = prime * result + ((custRegDate == null) ? 0 : custRegDate.hashCode());
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
		CustomerDto other = (CustomerDto) obj;
		if (custBusinessType == null) {
			if (other.custBusinessType != null)
				return false;
		} else if (!custBusinessType.equals(other.custBusinessType))
			return false;
		if (custCode == null) {
			if (other.custCode != null)
				return false;
		} else if (!custCode.equals(other.custCode))
			return false;
		if (custDelete == null) {
			if (other.custDelete != null)
				return false;
		} else if (!custDelete.equals(other.custDelete))
			return false;
		if (custEtc == null) {
			if (other.custEtc != null)
				return false;
		} else if (!custEtc.equals(other.custEtc))
			return false;
		if (custName == null) {
			if (other.custName != null)
				return false;
		} else if (!custName.equals(other.custName))
			return false;
		if (custNumber == null) {
			if (other.custNumber != null)
				return false;
		} else if (!custNumber.equals(other.custNumber))
			return false;
		if (custOwnerName == null) {
			if (other.custOwnerName != null)
				return false;
		} else if (!custOwnerName.equals(other.custOwnerName))
			return false;
		if (custPhone == null) {
			if (other.custPhone != null)
				return false;
		} else if (!custPhone.equals(other.custPhone))
			return false;
		if (custRegDate == null) {
			if (other.custRegDate != null)
				return false;
		} else if (!custRegDate.equals(other.custRegDate))
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
		StringBuilder builder = new StringBuilder();
		builder.append("CustomerDto [custCode=");
		builder.append(custCode);
		builder.append(", storeInfoCode=");
		builder.append(storeInfoCode);
		builder.append(", custNumber=");
		builder.append(custNumber);
		builder.append(", custName=");
		builder.append(custName);
		builder.append(", custBusinessType=");
		builder.append(custBusinessType);
		builder.append(", custOwnerName=");
		builder.append(custOwnerName);
		builder.append(", custPhone=");
		builder.append(custPhone);
		builder.append(", custEtc=");
		builder.append(custEtc);
		builder.append(", custRegDate=");
		builder.append(custRegDate);
		builder.append(", custDelete=");
		builder.append(custDelete);
		builder.append("]");
		return builder.toString();
	}
	

}
