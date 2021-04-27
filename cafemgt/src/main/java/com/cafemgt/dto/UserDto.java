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
	private String userAgreementSave;
	private String userHealthCard;
	private String userHealthCardSave;
	private String userEtc;
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
	public String getUserAgreementSave() {
		return userAgreementSave;
	}
	public void setUserAgreementSave(String userAgreementSave) {
		this.userAgreementSave = userAgreementSave;
	}
	public String getUserHealthCard() {
		return userHealthCard;
	}
	public void setUserHealthCard(String userHealthCard) {
		this.userHealthCard = userHealthCard;
	}
	public String getUserHealthCardSave() {
		return userHealthCardSave;
	}
	public void setUserHealthCardSave(String userHealthCardSave) {
		this.userHealthCardSave = userHealthCardSave;
	}
	public String getUserEtc() {
		return userEtc;
	}
	public void setUserEtc(String userEtc) {
		this.userEtc = userEtc;
	}
	public MemberDto getMemberDto() {
		return memberDto;
	}
	public void setMemberDto(MemberDto memberDto) {
		this.memberDto = memberDto;
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
		builder.append(", userAgreementSave=");
		builder.append(userAgreementSave);
		builder.append(", userHealthCard=");
		builder.append(userHealthCard);
		builder.append(", userHealthCardSave=");
		builder.append(userHealthCardSave);
		builder.append(", userEtc=");
		builder.append(userEtc);
		builder.append(", memberDto=");
		builder.append(memberDto);
		builder.append("]");
		return builder.toString();
	}

	
}