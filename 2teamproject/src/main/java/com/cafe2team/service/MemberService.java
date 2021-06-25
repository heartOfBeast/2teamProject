package com.cafe2team.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe2team.dao.MemberMapper;
import com.cafe2team.domain.Member;
import com.cafe2team.domain.WareAdmin;

@Service
@Transactional
public class MemberService {
	
	private static final Logger log = LoggerFactory.getLogger(MemberService.class);
	
	@Autowired
	private MemberMapper memberMapper;
	
	public MemberService(MemberMapper memberMapper){
		this.memberMapper = memberMapper;
	}

	public List<Member> getMemberList(){
		
		log.info("=========memberList service 실행======");
		List<Member> memberList = memberMapper.getMemberList();
		
		
		return memberList;
		
	}
	
	public int adminSignUp(WareAdmin wareAdmin) {
		
		int result = memberMapper.adminSignUp(wareAdmin);
		
		return result;
	}
	
	
	

	
}
