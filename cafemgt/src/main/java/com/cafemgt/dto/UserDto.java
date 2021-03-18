package com.cafemgt.dto;

public class UserDto {
	
	private String userId;
	private String userPw;
	private String storeInfoCode;
	private String userName;
	private String levelCode;
	private String userJoinDate;
	private String userOutDate;
	private String userPhone;
	private int userPay;
	private int userWorkTime;
	private String userBankName;
	private String userBankAcount;
	private String userAgreement;
	private String userHealthCard;
	private String userRegDate;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getStoreInfoCode() {
		return storeInfoCode;
	}
	public void setStoreInfoCode(String storeInfoCode) {
		this.storeInfoCode = storeInfoCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLevelCode() {
		return levelCode;
	}
	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}
	public String getUserJoinDate() {
		return userJoinDate;
	}
	public void setUserJoinDate(String userJoinDate) {
		this.userJoinDate = userJoinDate;
	}
	public String getUserOutDate() {
		return userOutDate;
	}
	public void setUserOutDate(String userOutDate) {
		this.userOutDate = userOutDate;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public int getUserPay() {
		return userPay;
	}
	public void setUserPay(int userPay) {
		this.userPay = userPay;
	}
	public int getUserWorkTime() {
		return userWorkTime;
	}
	public void setUserWorkTime(int userWorkTime) {
		this.userWorkTime = userWorkTime;
	}
	public String getUserBankName() {
		return userBankName;
	}
	public void setUserBankName(String userBankName) {
		this.userBankName = userBankName;
	}
	public String getUserBankAcount() {
		return userBankAcount;
	}
	public void setUserBankAcount(String userBankAcount) {
		this.userBankAcount = userBankAcount;
	}
	public String getUserAgreement() {
		return userAgreement;
	}
	public void setUserAgreement(String userAgreement) {
		this.userAgreement = userAgreement;
	}
	public String getUserHealthCard() {
		return userHealthCard;
	}
	public void setUserHealthCard(String userHealthCard) {
		this.userHealthCard = userHealthCard;
	}
	public String getUserRegDate() {
		return userRegDate;
	}
	public void setUserRegDate(String userRegDate) {
		this.userRegDate = userRegDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserDto [userId=");
		builder.append(userId);
		builder.append(", userPw=");
		builder.append(userPw);
		builder.append(", storeInfoCode=");
		builder.append(storeInfoCode);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", levelCode=");
		builder.append(levelCode);
		builder.append(", userJoinDate=");
		builder.append(userJoinDate);
		builder.append(", userOutDate=");
		builder.append(userOutDate);
		builder.append(", userPhone=");
		builder.append(userPhone);
		builder.append(", userPay=");
		builder.append(userPay);
		builder.append(", userWorkTime=");
		builder.append(userWorkTime);
		builder.append(", userBankName=");
		builder.append(userBankName);
		builder.append(", userBankAcount=");
		builder.append(userBankAcount);
		builder.append(", userAgreement=");
		builder.append(userAgreement);
		builder.append(", userHealthCard=");
		builder.append(userHealthCard);
		builder.append(", userRegDate=");
		builder.append(userRegDate);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((levelCode == null) ? 0 : levelCode.hashCode());
		result = prime * result + ((storeInfoCode == null) ? 0 : storeInfoCode.hashCode());
		result = prime * result + ((userAgreement == null) ? 0 : userAgreement.hashCode());
		result = prime * result + ((userBankAcount == null) ? 0 : userBankAcount.hashCode());
		result = prime * result + ((userBankName == null) ? 0 : userBankName.hashCode());
		result = prime * result + ((userHealthCard == null) ? 0 : userHealthCard.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userJoinDate == null) ? 0 : userJoinDate.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userOutDate == null) ? 0 : userOutDate.hashCode());
		result = prime * result + userPay;
		result = prime * result + ((userPhone == null) ? 0 : userPhone.hashCode());
		result = prime * result + ((userPw == null) ? 0 : userPw.hashCode());
		result = prime * result + ((userRegDate == null) ? 0 : userRegDate.hashCode());
		result = prime * result + userWorkTime;
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
		UserDto other = (UserDto) obj;
		if (levelCode == null) {
			if (other.levelCode != null)
				return false;
		} else if (!levelCode.equals(other.levelCode))
			return false;
		if (storeInfoCode == null) {
			if (other.storeInfoCode != null)
				return false;
		} else if (!storeInfoCode.equals(other.storeInfoCode))
			return false;
		if (userAgreement == null) {
			if (other.userAgreement != null)
				return false;
		} else if (!userAgreement.equals(other.userAgreement))
			return false;
		if (userBankAcount == null) {
			if (other.userBankAcount != null)
				return false;
		} else if (!userBankAcount.equals(other.userBankAcount))
			return false;
		if (userBankName == null) {
			if (other.userBankName != null)
				return false;
		} else if (!userBankName.equals(other.userBankName))
			return false;
		if (userHealthCard == null) {
			if (other.userHealthCard != null)
				return false;
		} else if (!userHealthCard.equals(other.userHealthCard))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userJoinDate == null) {
			if (other.userJoinDate != null)
				return false;
		} else if (!userJoinDate.equals(other.userJoinDate))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userOutDate == null) {
			if (other.userOutDate != null)
				return false;
		} else if (!userOutDate.equals(other.userOutDate))
			return false;
		if (userPay != other.userPay)
			return false;
		if (userPhone == null) {
			if (other.userPhone != null)
				return false;
		} else if (!userPhone.equals(other.userPhone))
			return false;
		if (userPw == null) {
			if (other.userPw != null)
				return false;
		} else if (!userPw.equals(other.userPw))
			return false;
		if (userRegDate == null) {
			if (other.userRegDate != null)
				return false;
		} else if (!userRegDate.equals(other.userRegDate))
			return false;
		if (userWorkTime != other.userWorkTime)
			return false;
		return true;
	}
	
}