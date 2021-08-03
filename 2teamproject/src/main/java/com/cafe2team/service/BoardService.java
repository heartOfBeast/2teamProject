package com.cafe2team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe2team.dao.BoardMapper;
import com.cafe2team.domain.Notice;
import com.cafe2team.domain.Reply;

@Service
public class BoardService {
	@Autowired
	private final BoardMapper boardMapper;
	
	public BoardService(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}

	
	//공지게시판 목록조회
	public List<Notice> getNoticeList(){
		List<Notice> noticeList = boardMapper.getNoticeList();
		return noticeList;
	}

	//공지글 수정
	public int modifyNotice(Notice notice) {
		return boardMapper.modifyNotice(notice);
	}

	//공지글 수정을 위한 정보가져오기
	public Notice getNoticeInfo(String noticeCode) {
		return boardMapper.getNoticeInfoByCode(noticeCode);
	}

	//공지글 삭제
	public int deleteNotice(String noticeCode) {
		return boardMapper.deleteNotice(noticeCode);
	}

	//공지글 조회수
	public int addHHit(String noticeCode) {
		int result = boardMapper.addView(noticeCode);
		return result;
	}

	//공지게시판 게시글 조회
	public Notice noticeRead(String noticeCode) {
		return boardMapper.noticeRead(noticeCode);
	}

	//공지게시글 작성
	public int noticeInsert(Notice notice) {
		int result = boardMapper.noticeInsert(notice);
		return result;
	}

}
