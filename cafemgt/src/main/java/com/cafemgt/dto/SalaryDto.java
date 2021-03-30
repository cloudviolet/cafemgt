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
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SalaryDto [salaryCode=");
		builder.append(salaryCode);
		builder.append(", storeInfoCode=");
		builder.append(storeInfoCode);
		builder.append(", storeInfoName=");
		builder.append(storeInfoName);
		builder.append(", memberId=");
		builder.append(memberId);
		builder.append(", memberName=");
		builder.append(memberName);
		builder.append(", salaryYearMonth=");
		builder.append(salaryYearMonth);
		builder.append(", salaryPay=");
		builder.append(salaryPay);
		builder.append(", salaryBtaxTotal=");
		builder.append(salaryBtaxTotal);
		builder.append(", salaryBntaxTotal=");
		builder.append(salaryBntaxTotal);
		builder.append(", salaryTotal=");
		builder.append(salaryTotal);
		builder.append(", salaryIncome=");
		builder.append(salaryIncome);
		builder.append(", salaryIncomeLocal=");
		builder.append(salaryIncomeLocal);
		builder.append(", salaryInsuCalc=");
		builder.append(salaryInsuCalc);
		builder.append(", salaryDeduction=");
		builder.append(salaryDeduction);
		builder.append(", salaryReceipts=");
		builder.append(salaryReceipts);
		builder.append(", salaryPayDate=");
		builder.append(salaryPayDate);
		builder.append(", salaryRegDate=");
		builder.append(salaryRegDate);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
