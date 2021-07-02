package com.cafe2team.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe2team.dao.MemberMapper;
import com.cafe2team.domain.Member;
import com.cafe2team.domain.Shoppingmall;
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
	
	//멤버 조회
	public List<Member> getMemberList(){
		
		log.info("=========memberList service 실행======");
		List<Member> memberList = memberMapper.getMemberList();
		
		
		return memberList;
		
	}
	
	public List<Member> getShoppingmallList(){
		
		
		return memberMapper.getShoppingmallList();
	}
	
	//memberId만 조회
	public Member getMemberInfoById(String memberId) {
		
		Member member = memberMapper.getMemberById(memberId);
		
		return member;
	
	}
	
	public Shoppingmall getsShopById(String shId) {
		
		Shoppingmall shop = memberMapper.getShopById(shId);
		
		return shop;
	}
	
	//업데이트
	public int updateMember(Member member) {
		
		int memberUpdate = memberMapper.updateMember(member);
		
		return memberUpdate;
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
	
	public int memberShopInsert(Shoppingmall shoppingMall) {
		
		int reulst = memberMapper.memberShopInsert(shoppingMall);
		
		return reulst;
	}

	public int deleteMember(String memberId) {
		
		return memberMapper.deleteMember(memberId);
		
	}
	
	
	

	
}
