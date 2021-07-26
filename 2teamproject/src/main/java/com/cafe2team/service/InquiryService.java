package com.cafe2team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe2team.dao.InquiryMapper;
import com.cafe2team.domain.Inquiry;

@Service
public class InquiryService {

	@Autowired
	private InquiryMapper inquiryMapper;
	
	//게시글 조회수
	public int addHit(String boardQnaCode) {
		int result = inquiryMapper.addViews(boardQnaCode);
		return result;
	}
	
	//게시글 작성
	public int writeInquiry(Inquiry inquiry) {
		int result = inquiryMapper.writeInquiry(inquiry);
		return result;
	}
	
	//문의게시판 게시글 조회
	public Inquiry readInquiry(String boardQnaCode) {
		
		return inquiryMapper.readInquiry(boardQnaCode);
	}
	
	//문의게시판 게시글 목록
	public List<Inquiry> getInquiryList(){
		List<Inquiry> getInquiryList = inquiryMapper.getInquiryList();
		return getInquiryList;
	}
}
