package com.cafemgt.dto;

public class MemberDto {
	private String memberId;
	private String memberPw;
	private String memberName;
	private String levelCode;
	private String levelName;
	private String storeInfoCode;
	private String storeInfoName;
	private String memberPhone;
	private String memberEmail;
	private String memberBirth;
	private String memberRegDate;
	private String memberOutDate;
	private String memberDelete;
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
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
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberBirth() {
		return memberBirth;
	}
	public void setMemberBirth(String memberBirth) {
		this.memberBirth = memberBirth;
	}
	public String getMemberRegDate() {
		return memberRegDate;
	}
	public void setMemberRegDate(String memberRegDate) {
		this.memberRegDate = memberRegDate;
	}
	public String getMemberOutDate() {
		return memberOutDate;
	}
	public void setMemberOutDate(String memberOutDate) {
		this.memberOutDate = memberOutDate;
	}
	public String getMemberDelete() {
		return memberDelete;
	}
	public void setMemberDelete(String memberDelete) {
		this.memberDelete = memberDelete;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((levelCode == null) ? 0 : levelCode.hashCode());
		result = prime * result + ((levelName == null) ? 0 : levelName.hashCode());
		result = prime * result + ((memberBirth == null) ? 0 : memberBirth.hashCode());
		result = prime * result + ((memberDelete == null) ? 0 : memberDelete.hashCode());
		result = prime * result + ((memberEmail == null) ? 0 : memberEmail.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((memberName == null) ? 0 : memberName.hashCode());
		result = prime * result + ((memberOutDate == null) ? 0 : memberOutDate.hashCode());
		result = prime * result + ((memberPhone == null) ? 0 : memberPhone.hashCode());
		result = prime * result + ((memberPw == null) ? 0 : memberPw.hashCode());
		result = prime * result + ((memberRegDate == null) ? 0 : memberRegDate.hashCode());
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
		MemberDto other = (MemberDto) obj;
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
		if (memberBirth == null) {
			if (other.memberBirth != null)
				return false;
		} else if (!memberBirth.equals(other.memberBirth))
			return false;
		if (memberDelete == null) {
			if (other.memberDelete != null)
				return false;
		} else if (!memberDelete.equals(other.memberDelete))
			return false;
		if (memberEmail == null) {
			if (other.memberEmail != null)
				return false;
		} else if (!memberEmail.equals(other.memberEmail))
			return false;
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
		if (memberOutDate == null) {
			if (other.memberOutDate != null)
				return false;
		} else if (!memberOutDate.equals(other.memberOutDate))
			return false;
		if (memberPhone == null) {
			if (other.memberPhone != null)
				return false;
		} else if (!memberPhone.equals(other.memberPhone))
			return false;
		if (memberPw == null) {
			if (other.memberPw != null)
				return false;
		} else if (!memberPw.equals(other.memberPw))
			return false;
		if (memberRegDate == null) {
			if (other.memberRegDate != null)
				return false;
		} else if (!memberRegDate.equals(other.memberRegDate))
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
		StringBuilder builder = new StringBuilder();
		builder.append("MemberDto [memberId=");
		builder.append(memberId);
		builder.append(", memberPw=");
		builder.append(memberPw);
		builder.append(", memberName=");
		builder.append(memberName);
		builder.append(", levelCode=");
		builder.append(levelCode);
		builder.append(", levelName=");
		builder.append(levelName);
		builder.append(", storeInfoCode=");
		builder.append(storeInfoCode);
		builder.append(", storeInfoName=");
		builder.append(storeInfoName);
		builder.append(", memberPhone=");
		builder.append(memberPhone);
		builder.append(", memberEmail=");
		builder.append(memberEmail);
		builder.append(", memberBirth=");
		builder.append(memberBirth);
		builder.append(", memberRegDate=");
		builder.append(memberRegDate);
		builder.append(", memberOutDate=");
		builder.append(memberOutDate);
		builder.append(", memberDelete=");
		builder.append(memberDelete);
		builder.append("]");
		return builder.toString();
	}
	
}
