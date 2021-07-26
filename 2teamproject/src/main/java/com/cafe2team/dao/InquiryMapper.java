package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Inquiry;

@Mapper
public interface InquiryMapper {

	
	//문의글 작성
	public int writeInquiry(Inquiry inquiry);
	//문의게시판 게시글 조회
	public Inquiry readInquiry(String boardQnaCode);
	
	//문의게시판 게시글 목록
	public List<Inquiry> getInquiryList();

	//문의게시판 조회수
	public int addViews(String boardQnaCode);
}
