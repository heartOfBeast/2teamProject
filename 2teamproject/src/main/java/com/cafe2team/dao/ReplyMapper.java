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
}
