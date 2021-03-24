package com.cafemgt.dto;

public class UserDto {
	private String memberId;
	private String storeInfoCode;
	private String storeInfoName;
	private String levelCode;
	private String levelName;	
	private String userJoinDate;
	private String userOutDate;
	private int userPay;
	private int userWorkTime;
	private String userBankName;
	private String userBankAcount;
	private String userAgreement;
	private String userHealthCard;
	private MemberDto memberDto;
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
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
	public String getLevelCode() {
		return levelCode;
	}
	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}
	public String getLevelName() {
		return levelName;
	}
	public void setLevelName(String levelName) {
		this.levelName = levelName;
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
	public MemberDto getMemberDto() {
		return memberDto;
	}
	public void setMemberDto(MemberDto memberDto) {
		this.memberDto = memberDto;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((levelCode == null) ? 0 : levelCode.hashCode());
		result = prime * result + ((levelName == null) ? 0 : levelName.hashCode());
		result = prime * result + ((memberDto == null) ? 0 : memberDto.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((storeInfoCode == null) ? 0 : storeInfoCode.hashCode());
		result = prime * result + ((storeInfoName == null) ? 0 : storeInfoName.hashCode());
		result = prime * result + ((userAgreement == null) ? 0 : userAgreement.hashCode());
		result = prime * result + ((userBankAcount == null) ? 0 : userBankAcount.hashCode());
		result = prime * result + ((userBankName == null) ? 0 : userBankName.hashCode());
		result = prime * result + ((userHealthCard == null) ? 0 : userHealthCard.hashCode());
		result = prime * result + ((userJoinDate == null) ? 0 : userJoinDate.hashCode());
		result = prime * result + ((userOutDate == null) ? 0 : userOutDate.hashCode());
		result = prime * result + userPay;
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
		if (levelName == null) {
			if (other.levelName != null)
				return false;
		} else if (!levelName.equals(other.levelName))
			return false;
		if (memberDto == null) {
			if (other.memberDto != null)
				return false;
		} else if (!memberDto.equals(other.memberDto))
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
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
		if (userJoinDate == null) {
			if (other.userJoinDate != null)
				return false;
		} else if (!userJoinDate.equals(other.userJoinDate))
			return false;
		if (userOutDate == null) {
			if (other.userOutDate != null)
				return false;
		} else if (!userOutDate.equals(other.userOutDate))
			return false;
		if (userPay != other.userPay)
			return false;
		if (userWorkTime != other.userWorkTime)
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserDto [memberId=");
		builder.append(memberId);
		builder.append(", storeInfoCode=");
		builder.append(storeInfoCode);
		builder.append(", storeInfoName=");
		builder.append(storeInfoName);
		builder.append(", levelCode=");
		builder.append(levelCode);
		builder.append(", levelName=");
		builder.append(levelName);
		builder.append(", userJoinDate=");
		builder.append(userJoinDate);
		builder.append(", userOutDate=");
		builder.append(userOutDate);
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
		builder.append(", memberDto=");
		builder.append(memberDto);
		builder.append("]");
		return builder.toString();
	}
	
}