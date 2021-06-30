package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Member;
import com.cafe2team.domain.Shoppingmall;
import com.cafe2team.domain.WareAdmin;

@Mapper
public interface MemberMapper {
	
	//회원조회
	public List<Member> getMemberList(); 
	
	//거래처만 조회
	public List<Member> getShoppingmallList();
	
	//로그인, id 만 조회
	public Member getMemberById(String memberId);
	
	//관리자 등록
	public int adminSignUp(WareAdmin wareAdmin);
	
	//멤버 업데이트
	public int updateMember(Member member);
	
	//거래처 등록
	public int memberShopInsert(Shoppingmall shoppingMall);
	
	//관리자 조회
	public List<WareAdmin> getAdminList();
	
	//멤버 딜리트 (미완성)
	public int deleteMember(String memberId);
	
	
	
	
}
