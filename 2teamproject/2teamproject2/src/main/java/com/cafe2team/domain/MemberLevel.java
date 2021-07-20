package com.cafe2team.domain;

public class MemberLevel {
	private String levelCode;
	private String levelName;
	private String levelRegDate;
	private String levelUseState;
	private String memberId;
	
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
	public String getLevelRegDate() {
		return levelRegDate;
	}
	public void setLevelRegDate(String levelRegDate) {
		this.levelRegDate = levelRegDate;
	}
	public String getLevelUseState() {
		return levelUseState;
	}
	public void setLevelUseState(String levelUseState) {
		this.levelUseState = levelUseState;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	@Override
	public String toString() {
		return "MemberLevel [levelCode=" + levelCode + ", levelName=" + levelName + ", levelRegDate=" + levelRegDate
				+ ", levelUseState=" + levelUseState + ", memberId=" + memberId + "]";
	}
	
	
	

}
