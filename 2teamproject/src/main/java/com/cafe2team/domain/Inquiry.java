package com.cafe2team.domain;

public class Inquiry {

	private String boardQnaCode;
	private String boardQnaSubject;
	private String boardQnaContent;
	private String boardQnaWriter;
	private String boardNonmemberPhone;
	private String boardNonmemberEmail;
	private String boardQnaViews;
	private String boardCheckPassword;
	private String boardQnaPassword;
	private String boardQnaTemp;
	private String boardQnaRegDate;
	public String getBoardQnaCode() {
		return boardQnaCode;
	}
	public void setBoardQnaCode(String boardQnaCode) {
		this.boardQnaCode = boardQnaCode;
	}
	public String getBoardQnaSubject() {
		return boardQnaSubject;
	}
	public void setBoardQnaSubject(String boardQnaSubject) {
		this.boardQnaSubject = boardQnaSubject;
	}
	public String getBoardQnaContent() {
		return boardQnaContent;
	}
	public void setBoardQnaContent(String boardQnaContent) {
		this.boardQnaContent = boardQnaContent;
	}
	public String getBoardQnaWriter() {
		return boardQnaWriter;
	}
	public void setBoardQnaWriter(String boardQnaWriter) {
		this.boardQnaWriter = boardQnaWriter;
	}
	public String getBoardNonmemberPhone() {
		return boardNonmemberPhone;
	}
	public void setBoardNonmemberPhone(String boardNonmemberPhone) {
		this.boardNonmemberPhone = boardNonmemberPhone;
	}
	public String getBoardNonmemberEmail() {
		return boardNonmemberEmail;
	}
	public void setBoardNonmemberEmail(String boardNonmemberEmail) {
		this.boardNonmemberEmail = boardNonmemberEmail;
	}
	public String getBoardQnaViews() {
		return boardQnaViews;
	}
	public void setBoardQnaViews(String boardQnaViews) {
		this.boardQnaViews = boardQnaViews;
	}
	public String getBoardCheckPassword() {
		return boardCheckPassword;
	}
	public void setBoardCheckPassword(String boardCheckPassword) {
		this.boardCheckPassword = boardCheckPassword;
	}
	public String getBoardQnaPassword() {
		return boardQnaPassword;
	}
	public void setBoardQnaPassword(String boardQnaPassword) {
		this.boardQnaPassword = boardQnaPassword;
	}
	public String getBoardQnaTemp() {
		return boardQnaTemp;
	}
	public void setBoardQnaTemp(String boardQnaTemp) {
		this.boardQnaTemp = boardQnaTemp;
	}
	public String getBoardQnaRegDate() {
		return boardQnaRegDate;
	}
	public void setBoardQnaRegDate(String boardQnaRegDate) {
		this.boardQnaRegDate = boardQnaRegDate;
	}
	@Override
	public String toString() {
		return "Inquiry [boardQnaCode=" + boardQnaCode + ", boardQnaSubject=" + boardQnaSubject + ", boardQnaContent="
				+ boardQnaContent + ", boardQnaWriter=" + boardQnaWriter + ", boardNonmemberPhone="
				+ boardNonmemberPhone + ", boardNonmemberEmail=" + boardNonmemberEmail + ", boardQnaViews="
				+ boardQnaViews + ", boardCheckPassword=" + boardCheckPassword + ", boardQnaPassword="
				+ boardQnaPassword + ", boardQnaTemp=" + boardQnaTemp + ", boardQnaRegDate=" + boardQnaRegDate + "]";
	}

	
	
}
