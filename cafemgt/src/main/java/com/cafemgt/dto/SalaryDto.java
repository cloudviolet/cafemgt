package com.cafemgt.dto;

public class SalaryDto {
	private String salaryCode;
	private String storeInfoCode;
	private String storeInfoName;
	private String memberId;
	private String memberName;
	private String salaryYearMonth;
	private int salaryPay;
	private int salaryBtaxTotal;
	private int salaryBntaxTotal;
	private int salaryTotal;
	private int salaryIncome;
	private int salaryIncomeLocal;
	private int salaryInsuCalc;
	private int salaryDeduction;
	private int salaryReceipts;
	private String salaryPayDate;
	private String salaryRegDate;
	
	public String getSalaryCode() {
		return salaryCode;
	}
	public void setSalaryCode(String salaryCode) {
		this.salaryCode = salaryCode;
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
	public String getSalaryYearMonth() {
		return salaryYearMonth;
	}
	public void setSalaryYearMonth(String salaryYearMonth) {
		this.salaryYearMonth = salaryYearMonth;
	}
	public int getSalaryPay() {
		return salaryPay;
	}
	public void setSalaryPay(int salaryPay) {
		this.salaryPay = salaryPay;
	}
	public int getSalaryBtaxTotal() {
		return salaryBtaxTotal;
	}
	public void setSalaryBtaxTotal(int salaryBtaxTotal) {
		this.salaryBtaxTotal = salaryBtaxTotal;
	}
	public int getSalaryBntaxTotal() {
		return salaryBntaxTotal;
	}
	public void setSalaryBntaxTotal(int salaryBntaxTotal) {
		this.salaryBntaxTotal = salaryBntaxTotal;
	}
	public int getSalaryTotal() {
		return salaryTotal;
	}
	public void setSalaryTotal(int salaryTotal) {
		this.salaryTotal = salaryTotal;
	}
	public int getSalaryIncome() {
		return salaryIncome;
	}
	public void setSalaryIncome(int salaryIncome) {
		this.salaryIncome = salaryIncome;
	}
	public int getSalaryIncomeLocal() {
		return salaryIncomeLocal;
	}
	public void setSalaryIncomeLocal(int salaryIncomeLocal) {
		this.salaryIncomeLocal = salaryIncomeLocal;
	}
	public int getSalaryInsuCalc() {
		return salaryInsuCalc;
	}
	public void setSalaryInsuCalc(int salaryInsuCalc) {
		this.salaryInsuCalc = salaryInsuCalc;
	}
	public int getSalaryDeduction() {
		return salaryDeduction;
	}
	public void setSalaryDeduction(int salaryDeduction) {
		this.salaryDeduction = salaryDeduction;
	}
	public int getSalaryReceipts() {
		return salaryReceipts;
	}
	public void setSalaryReceipts(int salaryReceipts) {
		this.salaryReceipts = salaryReceipts;
	}
	public String getSalaryPayDate() {
		return salaryPayDate;
	}
	public void setSalaryPayDate(String salaryPayDate) {
		this.salaryPayDate = salaryPayDate;
	}
	public String getSalaryRegDate() {
		return salaryRegDate;
	}
	public void setSalaryRegDate(String salaryRegDate) {
		this.salaryRegDate = salaryRegDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((memberName == null) ? 0 : memberName.hashCode());
		result = prime * result + salaryBntaxTotal;
		result = prime * result + salaryBtaxTotal;
		result = prime * result + ((salaryCode == null) ? 0 : salaryCode.hashCode());
		result = prime * result + salaryDeduction;
		result = prime * result + salaryIncome;
		result = prime * result + salaryIncomeLocal;
		result = prime * result + salaryInsuCalc;
		result = prime * result + salaryPay;
		result = prime * result + ((salaryPayDate == null) ? 0 : salaryPayDate.hashCode());
		result = prime * result + salaryReceipts;
		result = prime * result + ((salaryRegDate == null) ? 0 : salaryRegDate.hashCode());
		result = prime * result + salaryTotal;
		result = prime * result + ((salaryYearMonth == null) ? 0 : salaryYearMonth.hashCode());
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
		SalaryDto other = (SalaryDto) obj;
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
		if (salaryBntaxTotal != other.salaryBntaxTotal)
			return false;
		if (salaryBtaxTotal != other.salaryBtaxTotal)
			return false;
		if (salaryCode == null) {
			if (other.salaryCode != null)
				return false;
		} else if (!salaryCode.equals(other.salaryCode))
			return false;
		if (salaryDeduction != other.salaryDeduction)
			return false;
		if (salaryIncome != other.salaryIncome)
			return false;
		if (salaryIncomeLocal != other.salaryIncomeLocal)
			return false;
		if (salaryInsuCalc != other.salaryInsuCalc)
			return false;
		if (salaryPay != other.salaryPay)
			return false;
		if (salaryPayDate == null) {
			if (other.salaryPayDate != null)
				return false;
		} else if (!salaryPayDate.equals(other.salaryPayDate))
			return false;
		if (salaryReceipts != other.salaryReceipts)
			return false;
		if (salaryRegDate == null) {
			if (other.salaryRegDate != null)
				return false;
		} else if (!salaryRegDate.equals(other.salaryRegDate))
			return false;
		if (salaryTotal != other.salaryTotal)
			return false;
		if (salaryYearMonth == null) {
			if (other.salaryYearMonth != null)
				return false;
		} else if (!salaryYearMonth.equals(other.salaryYearMonth))
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
		return "SalaryDto [salaryCode=" + salaryCode + ", storeInfoCode=" + storeInfoCode + ", storeInfoName="
				+ storeInfoName + ", memberId=" + memberId + ", memberName=" + memberName + ", salaryYearMonth="
				+ salaryYearMonth + ", salaryPay=" + salaryPay + ", salaryBtaxTotal=" + salaryBtaxTotal
				+ ", salaryBntaxTotal=" + salaryBntaxTotal + ", salaryTotal=" + salaryTotal + ", salaryIncome="
				+ salaryIncome + ", salaryIncomeLocal=" + salaryIncomeLocal + ", salaryInsuCalc=" + salaryInsuCalc
				+ ", salaryDeduction=" + salaryDeduction + ", salaryReceipts=" + salaryReceipts + ", salaryPayDate="
				+ salaryPayDate + ", salaryRegDate=" + salaryRegDate + "]";
	}
	
	
	
	
	
}
