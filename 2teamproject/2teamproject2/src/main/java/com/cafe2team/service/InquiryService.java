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
