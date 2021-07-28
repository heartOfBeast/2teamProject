package com.cafe2team.domain;

public class Notice {


		private String noticeCode;
		private String noticeSubject;
		private String noticeContent;
		private String memberid;
		private String noticeRegdate;
		private String noticeViews;
		public String getNoticeCode() {
			return noticeCode;
		}
		public void setNoticeCode(String noticeCode) {
			this.noticeCode = noticeCode;
		}
		public String getNoticeSubject() {
			return noticeSubject;
		}
		public void setNoticeSubject(String noticeSubject) {
			this.noticeSubject = noticeSubject;
		}
		public String getNoticeContent() {
			return noticeContent;
		}
		public void setNoticeContent(String noticeContent) {
			this.noticeContent = noticeContent;
		}
		public String getMemberid() {
			return memberid;
		}
		public void setMemberid(String memberid) {
			this.memberid = memberid;
		}
		public String getNoticeRegdate() {
			return noticeRegdate;
		}
		public void setNoticeRegdate(String noticeRegdate) {
			this.noticeRegdate = noticeRegdate;
		}
		public String getNoticeViews() {
			return noticeViews;
		}
		public void setNoticeViews(String noticeViews) {
			this.noticeViews = noticeViews;
		}
		@Override
		public String toString() {
			return "Notice [noticeCode=" + noticeCode + ", noticeSubject=" + noticeSubject + ", noticeContent="
					+ noticeContent + ", memberid=" + memberid + ", noticeRegdate=" + noticeRegdate + ", noticeViews="
					+ noticeViews + "]";
		}
	
		
		
	
}
