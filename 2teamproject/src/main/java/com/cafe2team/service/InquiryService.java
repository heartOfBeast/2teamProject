package com.cafe2team.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe2team.dao.InquiryMapper;
import com.cafe2team.dao.ReplyMapper;
import com.cafe2team.domain.Inquiry;

@Service
public class InquiryService {

	@Autowired
	private InquiryMapper inquiryMapper;
	private ReplyMapper replyMapper;
	
	public InquiryService(InquiryMapper inquiryMapper, ReplyMapper replyMapper) {
		this.inquiryMapper = inquiryMapper;
		this.replyMapper = replyMapper;
	}
	
	//게시글 삭제
	public boolean deleteInquiry(String boardQnaCode, String boardQnaPassword) {
		//삭제여부
		boolean removeCheck = false;
		System.out.println(boardQnaCode + "<<<<<<<<<<<<<<<<boardQnaCode");
		//비밀번호 맞으면 삭제 
		
		Inquiry inquiry = inquiryMapper.getBoardInfoByCode(boardQnaCode);
		if(inquiry != null && boardQnaPassword.equals(inquiry.getBoardQnaPassword())) {
			replyMapper.deleteBoardReply(boardQnaCode);
			inquiryMapper.deleteInquiry(boardQnaCode);
			
			removeCheck = true;
		}
		return removeCheck;
	}
	
	//게시글 수정
	public int modifyInquiry(Inquiry inquiry) {
		return inquiryMapper.modifyInquiry(inquiry);
	}
	
	//수정 위한 정보 가져오기
	public Inquiry getInquiryInfo(String boardQnaCode) {
		return inquiryMapper.getBoardInfoByCode(boardQnaCode);
	}
	
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
	public List<Inquiry> getInquiryList(Map<String, Object> paramMap){
		List<Inquiry> getInquiryList = inquiryMapper.getInquiryList(paramMap);
		return getInquiryList;
	}
}
