package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Notice;

@Mapper
public interface BoardMapper {

	//공지게시판 목록조회
	public List<Notice> getNoticeList();

	//공지글 수정
	public int modifyNotice(Notice notice);

	//공지글 수정 위한 코드값 가져오기
	public Notice getNoticeInfoByCode(String noticeCode);

	//공지글 삭제
	public int deleteNotice(String noticeCode);

	//공지글 조회수 
	public int addView(String noticeCode);

	//공지게시판 게시글 조회
	public Notice noticeRead(String noticeCode);

	//공지게시글 작성
	public int noticeInsert(Notice notice);

	
}
