package com.cafemgt.dto;

public class StoreDto {
	
	private String storeInfoCode;
	private String ownerId;
	private String storeInfoName;
	private String storeInfoLicenseNumber;
	private String storeInfoIndustryType;
	private String storeInfoAddr;
	private String storeInfoPhone;
	private String storeInfoRegDate;
	
	public String getStoreInfoCode() {
		return storeInfoCode;
	}
	public void setStoreInfoCode(String storeInfoCode) {
		this.storeInfoCode = storeInfoCode;
	}
	public String getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	public String getStoreInfoName() {
		return storeInfoName;
	}
	public void setStoreInfoName(String storeInfoName) {
		this.storeInfoName = storeInfoName;
	}
	public String getStoreInfoLicenseNumber() {
		return storeInfoLicenseNumber;
	}
	public void setStoreInfoLicenseNumber(String storeInfoLicenseNumber) {
		this.storeInfoLicenseNumber = storeInfoLicenseNumber;
	}
	public String getStoreInfoIndustryType() {
		return storeInfoIndustryType;
	}
	public void setStoreInfoIndustryType(String storeInfoIndustryType) {
		this.storeInfoIndustryType = storeInfoIndustryType;
	}
	public String getStoreInfoAddr() {
		return storeInfoAddr;
	}
	public void setStoreInfoAddr(String storeInfoAddr) {
		this.storeInfoAddr = storeInfoAddr;
	}
	public String getStoreInfoPhone() {
		return storeInfoPhone;
	}
	public void setStoreInfoPhone(String storeInfoPhone) {
		this.storeInfoPhone = storeInfoPhone;
	}
	public String getStoreInfoRegDate() {
		return storeInfoRegDate;
	}
	public void setStoreInfoRegDate(String storeInfoRegDate) {
		this.storeInfoRegDate = storeInfoRegDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StoreInfoDto [storeInfoCode=");
		builder.append(storeInfoCode);
		builder.append(", ownerId=");
		builder.append(ownerId);
		builder.append(", storeInfoName=");
		builder.append(storeInfoName);
		builder.append(", storeInfoLicenseNumber=");
		builder.append(storeInfoLicenseNumber);
		builder.append(", storeInfoIndustryType=");
		builder.append(storeInfoIndustryType);
		builder.append(", storeInfoAddr=");
		builder.append(storeInfoAddr);
		builder.append(", storeInfoPhone=");
		builder.append(storeInfoPhone);
		builder.append(", storeInfoRegDate=");
		builder.append(storeInfoRegDate);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ownerId == null) ? 0 : ownerId.hashCode());
		result = prime * result + ((storeInfoAddr == null) ? 0 : storeInfoAddr.hashCode());
		result = prime * result + ((storeInfoCode == null) ? 0 : storeInfoCode.hashCode());
		result = prime * result + ((storeInfoIndustryType == null) ? 0 : storeInfoIndustryType.hashCode());
		result = prime * result + ((storeInfoLicenseNumber == null) ? 0 : storeInfoLicenseNumber.hashCode());
		result = prime * result + ((storeInfoName == null) ? 0 : storeInfoName.hashCode());
		result = prime * result + ((storeInfoPhone == null) ? 0 : storeInfoPhone.hashCode());
		result = prime * result + ((storeInfoRegDate == null) ? 0 : storeInfoRegDate.hashCode());
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
		StoreDto other = (StoreDto) obj;
		if (ownerId == null) {
			if (other.ownerId != null)
				return false;
		} else if (!ownerId.equals(other.ownerId))
			return false;
		if (storeInfoAddr == null) {
			if (other.storeInfoAddr != null)
				return false;
		} else if (!storeInfoAddr.equals(other.storeInfoAddr))
			return false;
		if (storeInfoCode == null) {
			if (other.storeInfoCode != null)
				return false;
		} else if (!storeInfoCode.equals(other.storeInfoCode))
			return false;
		if (storeInfoIndustryType == null) {
			if (other.storeInfoIndustryType != null)
				return false;
		} else if (!storeInfoIndustryType.equals(other.storeInfoIndustryType))
			return false;
		if (storeInfoLicenseNumber == null) {
			if (other.storeInfoLicenseNumber != null)
				return false;
		} else if (!storeInfoLicenseNumber.equals(other.storeInfoLicenseNumber))
			return false;
		if (storeInfoName == null) {
			if (other.storeInfoName != null)
				return false;
		} else if (!storeInfoName.equals(other.storeInfoName))
			return false;
		if (storeInfoPhone == null) {
			if (other.storeInfoPhone != null)
				return false;
		} else if (!storeInfoPhone.equals(other.storeInfoPhone))
			return false;
		if (storeInfoRegDate == null) {
			if (other.storeInfoRegDate != null)
				return false;
		} else if (!storeInfoRegDate.equals(other.storeInfoRegDate))
			return false;
		return true;
	}

}
