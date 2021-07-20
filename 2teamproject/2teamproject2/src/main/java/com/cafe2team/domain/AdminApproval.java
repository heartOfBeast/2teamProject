package com.cafe2team.domain;

public class AdminApproval {
	
	private String adminApprovalId;
	private String adminApprovalPw;
	private String adminApprovalName;
	private String adminApprovalLevel;
	private String adminApprovalLevelName;
	private String adminApprovalAddress;
	private String adminApprovalEmail;
	private String adminApprovalPhone;
	private String adminApprovalRegDate;
	private String adminApprovalAccountState;
	private String adminApprovalIncentive;

	private MemberLevel memberLevel;

	public String getAdminApprovalId() {
		return adminApprovalId;
	}

	public void setAdminApprovalId(String adminApprovalId) {
		this.adminApprovalId = adminApprovalId;
	}

	public String getAdminApprovalPw() {
		return adminApprovalPw;
	}

	public void setAdminApprovalPw(String adminApprovalPw) {
		this.adminApprovalPw = adminApprovalPw;
	}

	public String getAdminApprovalName() {
		return adminApprovalName;
	}

	public void setAdminApprovalName(String adminApprovalName) {
		this.adminApprovalName = adminApprovalName;
	}

	public String getAdminApprovalLevel() {
		return adminApprovalLevel;
	}

	public void setAdminApprovalLevel(String adminApprovalLevel) {
		this.adminApprovalLevel = adminApprovalLevel;
	}

	public String getAdminApprovalLevelName() {
		return adminApprovalLevelName;
	}

	public void setAdminApprovalLevelName(String adminApprovalLevelName) {
		this.adminApprovalLevelName = adminApprovalLevelName;
	}

	public String getAdminApprovalAddress() {
		return adminApprovalAddress;
	}

	public void setAdminApprovalAddress(String adminApprovalAddress) {
		this.adminApprovalAddress = adminApprovalAddress;
	}

	public String getAdminApprovalEmail() {
		return adminApprovalEmail;
	}

	public void setAdminApprovalEmail(String adminApprovalEmail) {
		this.adminApprovalEmail = adminApprovalEmail;
	}

	public String getAdminApprovalPhone() {
		return adminApprovalPhone;
	}

	public void setAdminApprovalPhone(String adminApprovalPhone) {
		this.adminApprovalPhone = adminApprovalPhone;
	}

	public String getAdminApprovalRegDate() {
		return adminApprovalRegDate;
	}

	public void setAdminApprovalRegDate(String adminApprovalRegDate) {
		this.adminApprovalRegDate = adminApprovalRegDate;
	}

	public String getAdminApprovalAccountState() {
		return adminApprovalAccountState;
	}

	public void setAdminApprovalAccountState(String adminApprovalAccountState) {
		this.adminApprovalAccountState = adminApprovalAccountState;
	}

	public String getAdminApprovalIncentive() {
		return adminApprovalIncentive;
	}

	public void setAdminApprovalIncentive(String adminApprovalIncentive) {
		this.adminApprovalIncentive = adminApprovalIncentive;
	}

	public MemberLevel getMemberLevel() {
		return memberLevel;
	}

	public void setMemberLevel(MemberLevel memberLevel) {
		this.memberLevel = memberLevel;
	}

	@Override
	public String toString() {
		return "AdminApproval [adminApprovalId=" + adminApprovalId + ", adminApprovalPw=" + adminApprovalPw
				+ ", adminApprovalName=" + adminApprovalName + ", adminApprovalLevel=" + adminApprovalLevel
				+ ", adminApprovalLevelName=" + adminApprovalLevelName + ", adminApprovalAddress="
				+ adminApprovalAddress + ", adminApprovalEmail=" + adminApprovalEmail + ", adminApprovalPhone="
				+ adminApprovalPhone + ", adminApprovalRegDate=" + adminApprovalRegDate + ", adminApprovalAccountState="
				+ adminApprovalAccountState + ", adminApprovalIncentive=" + adminApprovalIncentive + ", memberLevel="
				+ memberLevel + "]";
	}


}
