package com.cafe2team.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	public Map<String, Object> loginMember(String memberId, String memberPw){
		
		//로그인 여부
		boolean loginCheck = false;
		
		//로그인 결과 
		Map<String, Object> memberInfoMap = new HashMap<String, Object>();
		
		//로그인 처리
		Member member = memberMapper.getMemberById(memberId);
		
		if(member != null && memberPw.equals(member.getMemberPw())) {
			loginCheck = true;
			memberInfoMap.put("loginMember", member);
		}
			memberInfoMap.put("loginCheck", loginCheck);
		
			
		return memberInfoMap;
	}
	
	public List<WareAdmin> getAdminList(){
		log.info("=========getAdminList service 실행======");
		List<WareAdmin> getAdminList = memberMapper.getAdminList();
		
		return getAdminList;
	}
	
	
	public int adminSignUp(WareAdmin wareAdmin) {
		
		int result = memberMapper.adminSignUp(wareAdmin);
		
		return result;
	}
	
	public int memberShopInsert(Member member) {
		
		int reulst = memberMapper.memberShopInsert(member);
		
		return reulst;
	}
	
	
	

	
}
