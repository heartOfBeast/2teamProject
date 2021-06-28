package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Member;
import com.cafe2team.domain.WareAdmin;

@Mapper
public interface MemberMapper {
	
	//전체 회원조회
	public List<Member> getMemberList(); 
	
	//로그인
	public Member getMemberById(String memberId);
	
	//관리자 등록
	public int adminSignUp(WareAdmin wareAdmin);
	
	//거래처 등록
	public int memberShopInsert(Member member);
	
	//관리자 조회
	public List<WareAdmin> getAdminList();

}
