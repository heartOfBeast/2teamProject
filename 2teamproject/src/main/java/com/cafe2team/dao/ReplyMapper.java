package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Reply;

@Mapper
public interface ReplyMapper {

	//문의게시판 댓글 조회
	public List<Reply> readInquiryReply(String boardQnaCode);
	
	//문의게시판 댓글 작성
	public int addReply(Reply reply);

	//공지게시판 댓글 조회
	public List<Reply> readNoticeReply(String noticeCode);

	//공지게시판 댓글 작성
	public int addNoticeReply(Reply reply);
	
	//문의게시판 댓글 삭제
	public int deleteReply(String replyCommentCode);
	
	//게시물 삭제시 댓글도 삭제
	public int deleteBoardReply(String boardQnaCode);
}
