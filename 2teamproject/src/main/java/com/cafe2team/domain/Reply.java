package com.cafe2team.domain;

public class Reply {

	private String replyCommentCode;
	private String noticeCode;
	private String boardQnaCode;
	private String onebyoneBoardCode;
	private String memberId;
	private String replyCommentContent;
	private String replyCommentRegDate;
	private String replyCommentUpdateDate;
	private String replyCommentDeleteYesno;
	private String replyOmmentSequence;
	
	private Inquiry inquiry;
	private Notice notice;
	public String getReplyCommentCode() {
		return replyCommentCode;
	}
	public void setReplyCommentCode(String replyCommentCode) {
		this.replyCommentCode = replyCommentCode;
	}
	public String getNoticeCode() {
		return noticeCode;
	}
	public void setNoticeCode(String noticeCode) {
		this.noticeCode = noticeCode;
	}
	public String getBoardQnaCode() {
		return boardQnaCode;
	}
	public void setBoardQnaCode(String boardQnaCode) {
		this.boardQnaCode = boardQnaCode;
	}
	public String getOnebyoneBoardCode() {
		return onebyoneBoardCode;
	}
	public void setOnebyoneBoardCode(String onebyoneBoardCode) {
		this.onebyoneBoardCode = onebyoneBoardCode;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getReplyCommentContent() {
		return replyCommentContent;
	}
	public void setReplyCommentContent(String replyCommentContent) {
		this.replyCommentContent = replyCommentContent;
	}
	public String getReplyCommentRegDate() {
		return replyCommentRegDate;
	}
	public void setReplyCommentRegDate(String replyCommentRegDate) {
		this.replyCommentRegDate = replyCommentRegDate;
	}
	public String getReplyCommentUpdateDate() {
		return replyCommentUpdateDate;
	}
	public void setReplyCommentUpdateDate(String replyCommentUpdateDate) {
		this.replyCommentUpdateDate = replyCommentUpdateDate;
	}
	public String getReplyCommentDeleteYesno() {
		return replyCommentDeleteYesno;
	}
	public void setReplyCommentDeleteYesno(String replyCommentDeleteYesno) {
		this.replyCommentDeleteYesno = replyCommentDeleteYesno;
	}
	public String getReplyOmmentSequence() {
		return replyOmmentSequence;
	}
	public void setReplyOmmentSequence(String replyOmmentSequence) {
		this.replyOmmentSequence = replyOmmentSequence;
	}
	public Inquiry getInquiry() {
		return inquiry;
	}
	public void setInquiry(Inquiry inquiry) {
		this.inquiry = inquiry;
	}
	public Notice getNotice() {
		return notice;
	}
	public void setNotice(Notice notice) {
		this.notice = notice;
	}
	@Override
	public String toString() {
		return "Reply [replyCommentCode=" + replyCommentCode + ", noticeCode=" + noticeCode + ", boardQnaCode="
				+ boardQnaCode + ", onebyoneBoardCode=" + onebyoneBoardCode + ", memberId=" + memberId
				+ ", replyCommentContent=" + replyCommentContent + ", replyCommentRegDate=" + replyCommentRegDate
				+ ", replyCommentUpdateDate=" + replyCommentUpdateDate + ", replyCommentDeleteYesno="
				+ replyCommentDeleteYesno + ", replyOmmentSequence=" + replyOmmentSequence + ", inquiry=" + inquiry
				+ ", notice=" + notice + "]";
	}
	
	
}
