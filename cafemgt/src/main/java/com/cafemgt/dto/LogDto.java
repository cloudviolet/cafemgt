package com.cafemgt.dto;

public class LogDto {
	private String loginCode;
	private String loginId;
	private String loginAct;
	private String loginRegDate;
	public String getLoginCode() {
		return loginCode;
	}
	public void setLoginCode(String loginCode) {
		this.loginCode = loginCode;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginAct() {
		return loginAct;
	}
	public void setLoginAct(String loginAct) {
		this.loginAct = loginAct;
	}
	public String getLoginRegDate() {
		return loginRegDate;
	}
	public void setLoginRegDate(String loginRegDate) {
		this.loginRegDate = loginRegDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((loginAct == null) ? 0 : loginAct.hashCode());
		result = prime * result + ((loginCode == null) ? 0 : loginCode.hashCode());
		result = prime * result + ((loginId == null) ? 0 : loginId.hashCode());
		result = prime * result + ((loginRegDate == null) ? 0 : loginRegDate.hashCode());
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
		LogDto other = (LogDto) obj;
		if (loginAct == null) {
			if (other.loginAct != null)
				return false;
		} else if (!loginAct.equals(other.loginAct))
			return false;
		if (loginCode == null) {
			if (other.loginCode != null)
				return false;
		} else if (!loginCode.equals(other.loginCode))
			return false;
		if (loginId == null) {
			if (other.loginId != null)
				return false;
		} else if (!loginId.equals(other.loginId))
			return false;
		if (loginRegDate == null) {
			if (other.loginRegDate != null)
				return false;
		} else if (!loginRegDate.equals(other.loginRegDate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LoginDto [loginCode=");
		builder.append(loginCode);
		builder.append(", loginId=");
		builder.append(loginId);
		builder.append(", loginAct=");
		builder.append(loginAct);
		builder.append(", loginRegDate=");
		builder.append(loginRegDate);
		builder.append("]");
		return builder.toString();
	}
	
}
