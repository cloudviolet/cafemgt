package com.cafemgt.dto;

public class IncomeStatementDto {
	private String instCode;
	private String storeInfoCode;
	private String instYear;
	private String instUniqueCode;
	private int instSaleSupplyValue;
	private int instPurchaseSupplyValue;
	private int instSalesAmtTotal;
	private int instExpenses;
	private int instOp;
	private int instNoi;
	private int instNoe;
	private int instNetIncome;
	public String getInstCode() {
		return instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}
	public String getStoreInfoCode() {
		return storeInfoCode;
	}
	public void setStoreInfoCode(String storeInfoCode) {
		this.storeInfoCode = storeInfoCode;
	}
	public String getInstYear() {
		return instYear;
	}
	public void setInstYear(String instYear) {
		this.instYear = instYear;
	}
	public String getInstUniqueCode() {
		return instUniqueCode;
	}
	public void setInstUniqueCode(String instUniqueCode) {
		this.instUniqueCode = instUniqueCode;
	}
	public int getInstSaleSupplyValue() {
		return instSaleSupplyValue;
	}
	public void setInstSaleSupplyValue(int instSaleSupplyValue) {
		this.instSaleSupplyValue = instSaleSupplyValue;
	}
	public int getInstPurchaseSupplyValue() {
		return instPurchaseSupplyValue;
	}
	public void setInstPurchaseSupplyValue(int instPurchaseSupplyValue) {
		this.instPurchaseSupplyValue = instPurchaseSupplyValue;
	}
	public int getInstSalesAmtTotal() {
		return instSalesAmtTotal;
	}
	public void setInstSalesAmtTotal(int instSalesAmtTotal) {
		this.instSalesAmtTotal = instSalesAmtTotal;
	}
	public int getInstExpenses() {
		return instExpenses;
	}
	public void setInstExpenses(int instExpenses) {
		this.instExpenses = instExpenses;
	}
	public int getInstOp() {
		return instOp;
	}
	public void setInstOp(int instOp) {
		this.instOp = instOp;
	}
	public int getInstNoi() {
		return instNoi;
	}
	public void setInstNoi(int instNoi) {
		this.instNoi = instNoi;
	}
	public int getInstNoe() {
		return instNoe;
	}
	public void setInstNoe(int instNoe) {
		this.instNoe = instNoe;
	}
	public int getInstNetIncome() {
		return instNetIncome;
	}
	public void setInstNetIncome(int instNetIncome) {
		this.instNetIncome = instNetIncome;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((instCode == null) ? 0 : instCode.hashCode());
		result = prime * result + instExpenses;
		result = prime * result + instNetIncome;
		result = prime * result + instNoe;
		result = prime * result + instNoi;
		result = prime * result + instOp;
		result = prime * result + instPurchaseSupplyValue;
		result = prime * result + instSaleSupplyValue;
		result = prime * result + instSalesAmtTotal;
		result = prime * result + ((instUniqueCode == null) ? 0 : instUniqueCode.hashCode());
		result = prime * result + ((instYear == null) ? 0 : instYear.hashCode());
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
		IncomeStatementDto other = (IncomeStatementDto) obj;
		if (instCode == null) {
			if (other.instCode != null)
				return false;
		} else if (!instCode.equals(other.instCode))
			return false;
		if (instExpenses != other.instExpenses)
			return false;
		if (instNetIncome != other.instNetIncome)
			return false;
		if (instNoe != other.instNoe)
			return false;
		if (instNoi != other.instNoi)
			return false;
		if (instOp != other.instOp)
			return false;
		if (instPurchaseSupplyValue != other.instPurchaseSupplyValue)
			return false;
		if (instSaleSupplyValue != other.instSaleSupplyValue)
			return false;
		if (instSalesAmtTotal != other.instSalesAmtTotal)
			return false;
		if (instUniqueCode == null) {
			if (other.instUniqueCode != null)
				return false;
		} else if (!instUniqueCode.equals(other.instUniqueCode))
			return false;
		if (instYear == null) {
			if (other.instYear != null)
				return false;
		} else if (!instYear.equals(other.instYear))
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
		return "IncomeStatementDto [instCode=" + instCode + ", storeInfoCode=" + storeInfoCode + ", instYear="
				+ instYear + ", instUniqueCode=" + instUniqueCode + ", instSaleSupplyValue=" + instSaleSupplyValue
				+ ", instPurchaseSupplyValue=" + instPurchaseSupplyValue + ", instSalesAmtTotal=" + instSalesAmtTotal
				+ ", instExpenses=" + instExpenses + ", instOp=" + instOp + ", instNoi=" + instNoi + ", instNoe="
				+ instNoe + ", instNetIncome=" + instNetIncome + "]";
	}
}
