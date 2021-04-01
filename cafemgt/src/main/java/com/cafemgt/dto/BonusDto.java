package com.cafemgt.dto;

public class BonusDto {
	private String ubCode;
	private String storeInfoCode;
	private String storeInfoName;
	private String memberId;
	private String memberName;
	private String ubYearMonth;
	private String ubOption;
	private int ubPay;
	private String ubEtc;
	private String ubRegDate;
	public String getUbCode() {
		return ubCode;
	}
	public void setUbCode(String ubCode) {
		this.ubCode = ubCode;
	}
	public String getStoreInfoCode() {
		return storeInfoCode;
	}
	public void setStoreInfoCode(String storeInfoCode) {
		this.storeInfoCode = storeInfoCode;
	}
	public String getStoreInfoName() {
		return storeInfoName;
	}
	public void setStoreInfoName(String storeInfoName) {
		this.storeInfoName = storeInfoName;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getUbYearMonth() {
		return ubYearMonth;
	}
	public void setUbYearMonth(String ubYearMonth) {
		this.ubYearMonth = ubYearMonth;
	}
	public String getUbOption() {
		return ubOption;
	}
	public void setUbOption(String ubOption) {
		this.ubOption = ubOption;
	}
	public int getUbPay() {
		return ubPay;
	}
	public void setUbPay(int ubPay) {
		this.ubPay = ubPay;
	}
	public String getUbEtc() {
		return ubEtc;
	}
	public void setUbEtc(String ubEtc) {
		this.ubEtc = ubEtc;
	}
	public String getUbRegDate() {
		return ubRegDate;
	}
	public void setUbRegDate(String ubRegDate) {
		this.ubRegDate = ubRegDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((memberName == null) ? 0 : memberName.hashCode());
		result = prime * result + ((storeInfoCode == null) ? 0 : storeInfoCode.hashCode());
		result = prime * result + ((storeInfoName == null) ? 0 : storeInfoName.hashCode());
		result = prime * result + ((ubCode == null) ? 0 : ubCode.hashCode());
		result = prime * result + ((ubEtc == null) ? 0 : ubEtc.hashCode());
		result = prime * result + ((ubOption == null) ? 0 : ubOption.hashCode());
		result = prime * result + ubPay;
		result = prime * result + ((ubRegDate == null) ? 0 : ubRegDate.hashCode());
		result = prime * result + ((ubYearMonth == null) ? 0 : ubYearMonth.hashCode());
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
		BonusDto other = (BonusDto) obj;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (memberName == null) {
			if (other.memberName != null)
				return false;
		} else if (!memberName.equals(other.memberName))
			return false;
		if (storeInfoCode == null) {
			if (other.storeInfoCode != null)
				return false;
		} else if (!storeInfoCode.equals(other.storeInfoCode))
			return false;
		if (storeInfoName == null) {
			if (other.storeInfoName != null)
				return false;
		} else if (!storeInfoName.equals(other.storeInfoName))
			return false;
		if (ubCode == null) {
			if (other.ubCode != null)
				return false;
		} else if (!ubCode.equals(other.ubCode))
			return false;
		if (ubEtc == null) {
			if (other.ubEtc != null)
				return false;
		} else if (!ubEtc.equals(other.ubEtc))
			return false;
		if (ubOption == null) {
			if (other.ubOption != null)
				return false;
		} else if (!ubOption.equals(other.ubOption))
			return false;
		if (ubPay != other.ubPay)
			return false;
		if (ubRegDate == null) {
			if (other.ubRegDate != null)
				return false;
		} else if (!ubRegDate.equals(other.ubRegDate))
			return false;
		if (ubYearMonth == null) {
			if (other.ubYearMonth != null)
				return false;
		} else if (!ubYearMonth.equals(other.ubYearMonth))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BonusDto [ubCode=" + ubCode + ", storeInfoCode=" + storeInfoCode + ", storeInfoName=" + storeInfoName
				+ ", memberId=" + memberId + ", memberName=" + memberName + ", ubYearMonth=" + ubYearMonth
				+ ", ubOption=" + ubOption + ", ubPay=" + ubPay + ", ubEtc=" + ubEtc + ", ubRegDate=" + ubRegDate + "]";
	}
	
	
	
}