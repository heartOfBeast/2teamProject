package com.cafe2team.domain;

public class Member {
	
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberLevelcode;
	private String memberAddress;
	private String memberEmail;
	private String memberPhone;
	private String memberRegDate;
	private String memberAccountStatus;
	private String memberIncentive;
	
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
	public String getMemberLevelcode() {
		return memberLevelcode;
	}
	public void setMemberLevelcode(String memberLevelcode) {
		this.memberLevelcode = memberLevelcode;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberRegDate() {
		return memberRegDate;
	}
	public void setMemberRegDate(String memberRegDate) {
		this.memberRegDate = memberRegDate;
	}
	public String getMemberAccountStatus() {
		return memberAccountStatus;
	}
	public void setMemberAccountStatus(String memberAccountStatus) {
		this.memberAccountStatus = memberAccountStatus;
	}
	public String getMemberIncentive() {
		return memberIncentive;
	}
	public void setMemberIncentive(String memberIncentive) {
		this.memberIncentive = memberIncentive;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPw=" + memberPw + ", memberName=" + memberName
				+ ", memberLevelcode=" + memberLevelcode + ", memberAddress=" + memberAddress + ", memberEmail="
				+ memberEmail + ", memberPhone=" + memberPhone + ", memberRegDate=" + memberRegDate
				+ ", memberAccountStatus=" + memberAccountStatus + ", memberIncentive=" + memberIncentive + "]";
	}
	
	
	

}
