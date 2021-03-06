package com.cafemgt.dto;

public class StoreDto {
	
	private String storeInfoCode;
	private String memberId;
	private String storeInfoName;
	private String storeInfoLicenseNumber;
	private String storeInfoIndustryType;
	private String storeInfoZipCode;
	private String storeInfoAddr;
	private String storeInfoAddr2;
	private String storeInfoPhone;
	private String storeInfoRegDate;
	private String storeInfoDelete;
	public String getStoreInfoCode() {
		return storeInfoCode;
	}
	public void setStoreInfoCode(String storeInfoCode) {
		this.storeInfoCode = storeInfoCode;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
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
	public String getStoreInfoZipCode() {
		return storeInfoZipCode;
	}
	public void setStoreInfoZipCode(String storeInfoZipCode) {
		this.storeInfoZipCode = storeInfoZipCode;
	}
	public String getStoreInfoAddr() {
		return storeInfoAddr;
	}
	public void setStoreInfoAddr(String storeInfoAddr) {
		this.storeInfoAddr = storeInfoAddr;
	}
	public String getStoreInfoAddr2() {
		return storeInfoAddr2;
	}
	public void setStoreInfoAddr2(String storeInfoAddr2) {
		this.storeInfoAddr2 = storeInfoAddr2;
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
	public String getStoreInfoDelete() {
		return storeInfoDelete;
	}
	public void setStoreInfoDelete(String storeInfoDelete) {
		this.storeInfoDelete = storeInfoDelete;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((storeInfoAddr == null) ? 0 : storeInfoAddr.hashCode());
		result = prime * result + ((storeInfoAddr2 == null) ? 0 : storeInfoAddr2.hashCode());
		result = prime * result + ((storeInfoCode == null) ? 0 : storeInfoCode.hashCode());
		result = prime * result + ((storeInfoDelete == null) ? 0 : storeInfoDelete.hashCode());
		result = prime * result + ((storeInfoIndustryType == null) ? 0 : storeInfoIndustryType.hashCode());
		result = prime * result + ((storeInfoLicenseNumber == null) ? 0 : storeInfoLicenseNumber.hashCode());
		result = prime * result + ((storeInfoName == null) ? 0 : storeInfoName.hashCode());
		result = prime * result + ((storeInfoPhone == null) ? 0 : storeInfoPhone.hashCode());
		result = prime * result + ((storeInfoRegDate == null) ? 0 : storeInfoRegDate.hashCode());
		result = prime * result + ((storeInfoZipCode == null) ? 0 : storeInfoZipCode.hashCode());
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
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (storeInfoAddr == null) {
			if (other.storeInfoAddr != null)
				return false;
		} else if (!storeInfoAddr.equals(other.storeInfoAddr))
			return false;
		if (storeInfoAddr2 == null) {
			if (other.storeInfoAddr2 != null)
				return false;
		} else if (!storeInfoAddr2.equals(other.storeInfoAddr2))
			return false;
		if (storeInfoCode == null) {
			if (other.storeInfoCode != null)
				return false;
		} else if (!storeInfoCode.equals(other.storeInfoCode))
			return false;
		if (storeInfoDelete == null) {
			if (other.storeInfoDelete != null)
				return false;
		} else if (!storeInfoDelete.equals(other.storeInfoDelete))
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
		if (storeInfoZipCode == null) {
			if (other.storeInfoZipCode != null)
				return false;
		} else if (!storeInfoZipCode.equals(other.storeInfoZipCode))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StoreDto [storeInfoCode=");
		builder.append(storeInfoCode);
		builder.append(", memberId=");
		builder.append(memberId);
		builder.append(", storeInfoName=");
		builder.append(storeInfoName);
		builder.append(", storeInfoLicenseNumber=");
		builder.append(storeInfoLicenseNumber);
		builder.append(", storeInfoIndustryType=");
		builder.append(storeInfoIndustryType);
		builder.append(", storeInfoZipCode=");
		builder.append(storeInfoZipCode);
		builder.append(", storeInfoAddr=");
		builder.append(storeInfoAddr);
		builder.append(", storeInfoAddr2=");
		builder.append(storeInfoAddr2);
		builder.append(", storeInfoPhone=");
		builder.append(storeInfoPhone);
		builder.append(", storeInfoRegDate=");
		builder.append(storeInfoRegDate);
		builder.append(", storeInfoDelete=");
		builder.append(storeInfoDelete);
		builder.append("]");
		return builder.toString();
	}
	
}
