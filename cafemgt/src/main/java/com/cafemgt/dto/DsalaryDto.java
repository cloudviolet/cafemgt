package com.cafemgt.dto;

public class DsalaryDto {
	private String sdCode;
	private String storeInfoCode;
	private String storeInfoName;
	private String memberId;
	private String memberName;
	private String sdYearMonth;
	private String sdWorktime;
	private int sdPay;
	private int sdIncome;
	private int sdIncomeLocal;
	private int sdDeduction;
	private int sdReceipts;
	private String sdPayDate;
	private String sdRegDate;
	
	public String getSdCode() {
		return sdCode;
	}
	public void setSdCode(String sdCode) {
		this.sdCode = sdCode;
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
	public String getSdYearMonth() {
		return sdYearMonth;
	}
	public void setSdYearMonth(String sdYearMonth) {
		this.sdYearMonth = sdYearMonth;
	}
	public String getSdWorktime() {
		return sdWorktime;
	}
	public void setSdWorktime(String sdWorktime) {
		this.sdWorktime = sdWorktime;
	}
	public int getSdPay() {
		return sdPay;
	}
	public void setSdPay(int sdPay) {
		this.sdPay = sdPay;
	}
	public int getSdIncome() {
		return sdIncome;
	}
	public void setSdIncome(int sdIncome) {
		this.sdIncome = sdIncome;
	}
	public int getSdIncomeLocal() {
		return sdIncomeLocal;
	}
	public void setSdIncomeLocal(int sdIncomeLocal) {
		this.sdIncomeLocal = sdIncomeLocal;
	}
	public int getSdDeduction() {
		return sdDeduction;
	}
	public void setSdDeduction(int sdDeduction) {
		this.sdDeduction = sdDeduction;
	}
	public int getSdReceipts() {
		return sdReceipts;
	}
	public void setSdReceipts(int sdReceipts) {
		this.sdReceipts = sdReceipts;
	}
	public String getSdPayDate() {
		return sdPayDate;
	}
	public void setSdPayDate(String sdPayDate) {
		this.sdPayDate = sdPayDate;
	}
	public String getSdRegDate() {
		return sdRegDate;
	}
	public void setSdRegDate(String sdRegDate) {
		this.sdRegDate = sdRegDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((memberName == null) ? 0 : memberName.hashCode());
		result = prime * result + ((sdCode == null) ? 0 : sdCode.hashCode());
		result = prime * result + sdDeduction;
		result = prime * result + sdIncome;
		result = prime * result + sdIncomeLocal;
		result = prime * result + sdPay;
		result = prime * result + ((sdPayDate == null) ? 0 : sdPayDate.hashCode());
		result = prime * result + sdReceipts;
		result = prime * result + ((sdRegDate == null) ? 0 : sdRegDate.hashCode());
		result = prime * result + ((sdWorktime == null) ? 0 : sdWorktime.hashCode());
		result = prime * result + ((sdYearMonth == null) ? 0 : sdYearMonth.hashCode());
		result = prime * result + ((storeInfoCode == null) ? 0 : storeInfoCode.hashCode());
		result = prime * result + ((storeInfoName == null) ? 0 : storeInfoName.hashCode());
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
		DsalaryDto other = (DsalaryDto) obj;
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
		if (sdCode == null) {
			if (other.sdCode != null)
				return false;
		} else if (!sdCode.equals(other.sdCode))
			return false;
		if (sdDeduction != other.sdDeduction)
			return false;
		if (sdIncome != other.sdIncome)
			return false;
		if (sdIncomeLocal != other.sdIncomeLocal)
			return false;
		if (sdPay != other.sdPay)
			return false;
		if (sdPayDate == null) {
			if (other.sdPayDate != null)
				return false;
		} else if (!sdPayDate.equals(other.sdPayDate))
			return false;
		if (sdReceipts != other.sdReceipts)
			return false;
		if (sdRegDate == null) {
			if (other.sdRegDate != null)
				return false;
		} else if (!sdRegDate.equals(other.sdRegDate))
			return false;
		if (sdWorktime == null) {
			if (other.sdWorktime != null)
				return false;
		} else if (!sdWorktime.equals(other.sdWorktime))
			return false;
		if (sdYearMonth == null) {
			if (other.sdYearMonth != null)
				return false;
		} else if (!sdYearMonth.equals(other.sdYearMonth))
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
		return true;
	}
	
	@Override
	public String toString() {
		return "DsalaryDto [sdCode=" + sdCode + ", storeInfoCode=" + storeInfoCode + ", storeInfoName=" + storeInfoName
				+ ", memberId=" + memberId + ", memberName=" + memberName + ", sdYearMonth=" + sdYearMonth
				+ ", sdWorktime=" + sdWorktime + ", sdPay=" + sdPay + ", sdIncome=" + sdIncome + ", sdIncomeLocal="
				+ sdIncomeLocal + ", sdDeduction=" + sdDeduction + ", sdReceipts=" + sdReceipts + ", sdPayDate="
				+ sdPayDate + ", sdRegDate=" + sdRegDate + "]";
	}
	
	
	
	

}
