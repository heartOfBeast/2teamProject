package com.cafe2team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe2team.dao.BoardMapper;
import com.cafe2team.domain.Notice;

@Service
public class BoardService {
	@Autowired
	private final BoardMapper boardMapper;
	
	public BoardService(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}

	public List<Notice> getNoticeList(){
		
		List<Notice> noticeList = boardMapper.getNoticeList();
		return noticeList;
	}
}
