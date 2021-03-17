package com.cafemgt.dto;

public class OwnerDto {
	private String ownerId;
	private String ownerPw;
	private String ownerName;
	private String levelCode;
	private String ownerPhone;
	private String ownerEmail;
	private String ownerBirth;
	private String ownerRegDate;
	public String getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	public String getOwnerPw() {
		return ownerPw;
	}
	public void setOwnerPw(String ownerPw) {
		this.ownerPw = ownerPw;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getLevelCode() {
		return levelCode;
	}
	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}
	public String getOwnerPhone() {
		return ownerPhone;
	}
	public void setOwnerPhone(String ownerPhone) {
		this.ownerPhone = ownerPhone;
	}
	public String getOwnerEmail() {
		return ownerEmail;
	}
	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}
	public String getOwnerBirth() {
		return ownerBirth;
	}
	public void setOwnerBirth(String ownerBirth) {
		this.ownerBirth = ownerBirth;
	}
	public String getOwnerRegDate() {
		return ownerRegDate;
	}
	public void setOwnerRegDate(String ownerRegDate) {
		this.ownerRegDate = ownerRegDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OwnerDto [ownerId=");
		builder.append(ownerId);
		builder.append(", ownerPw=");
		builder.append(ownerPw);
		builder.append(", ownerName=");
		builder.append(ownerName);
		builder.append(", levelCode=");
		builder.append(levelCode);
		builder.append(", ownerPhone=");
		builder.append(ownerPhone);
		builder.append(", ownerEmail=");
		builder.append(ownerEmail);
		builder.append(", ownerBirth=");
		builder.append(ownerBirth);
		builder.append(", ownerRegDate=");
		builder.append(ownerRegDate);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((levelCode == null) ? 0 : levelCode.hashCode());
		result = prime * result + ((ownerBirth == null) ? 0 : ownerBirth.hashCode());
		result = prime * result + ((ownerEmail == null) ? 0 : ownerEmail.hashCode());
		result = prime * result + ((ownerId == null) ? 0 : ownerId.hashCode());
		result = prime * result + ((ownerName == null) ? 0 : ownerName.hashCode());
		result = prime * result + ((ownerPhone == null) ? 0 : ownerPhone.hashCode());
		result = prime * result + ((ownerPw == null) ? 0 : ownerPw.hashCode());
		result = prime * result + ((ownerRegDate == null) ? 0 : ownerRegDate.hashCode());
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
		OwnerDto other = (OwnerDto) obj;
		if (levelCode == null) {
			if (other.levelCode != null)
				return false;
		} else if (!levelCode.equals(other.levelCode))
			return false;
		if (ownerBirth == null) {
			if (other.ownerBirth != null)
				return false;
		} else if (!ownerBirth.equals(other.ownerBirth))
			return false;
		if (ownerEmail == null) {
			if (other.ownerEmail != null)
				return false;
		} else if (!ownerEmail.equals(other.ownerEmail))
			return false;
		if (ownerId == null) {
			if (other.ownerId != null)
				return false;
		} else if (!ownerId.equals(other.ownerId))
			return false;
		if (ownerName == null) {
			if (other.ownerName != null)
				return false;
		} else if (!ownerName.equals(other.ownerName))
			return false;
		if (ownerPhone == null) {
			if (other.ownerPhone != null)
				return false;
		} else if (!ownerPhone.equals(other.ownerPhone))
			return false;
		if (ownerPw == null) {
			if (other.ownerPw != null)
				return false;
		} else if (!ownerPw.equals(other.ownerPw))
			return false;
		if (ownerRegDate == null) {
			if (other.ownerRegDate != null)
				return false;
		} else if (!ownerRegDate.equals(other.ownerRegDate))
			return false;
		return true;
	}

}
