package com.cafe2team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe2team.dao.ReplyMapper;
import com.cafe2team.domain.Reply;

@Service
@Transactional
public class ReplyService {
	@Autowired
	private ReplyMapper replyMapper;
	
	//댓글목록
	public List<Reply> getInquiryReply(String boardQnaCode){
		return replyMapper.readInquiryReply(boardQnaCode);
	}
	//댓글작성
	public int addReply(Reply reply) {
		int result = replyMapper.addReply(reply);
		return result;
	}
	
	//공지 댓글조회
	public List<Reply> getNoticeReply(String noticeCode) {
		return replyMapper.readNoticeReply(noticeCode);
	}
	
	//공지 댓글작성
	public int addNoticeReply(Reply reply) {
		int result = replyMapper.addNoticeReply(reply);
		return result;
	}

}
