package com.cafe2team.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Inquiry;

@Mapper
public interface InquiryMapper {

	
	//문의글 삭제
	public int deleteInquiry(String boardQnaCode);
	//문의글 수정
	public int modifyInquiry(Inquiry inquiry);
	
	//문의글 수정 위한 코드값 가져오기
	public Inquiry getBoardInfoByCode(String boardQnaCode);
	//문의글 작성
	public int writeInquiry(Inquiry inquiry);
	//문의게시판 게시글 조회
	public Inquiry readInquiry(String boardQnaCode);
	
	//문의게시판 게시글 목록
	public List<Inquiry> getInquiryList(Map<String, Object> paramMap);

	//문의게시판 조회수
	public int addViews(String boardQnaCode);
}
