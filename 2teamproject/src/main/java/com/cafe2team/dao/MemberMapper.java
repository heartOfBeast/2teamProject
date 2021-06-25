package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.Member;
import com.cafe2team.domain.WareAdmin;

@Mapper
public interface MemberMapper {
	
	//전체 회원조회
	public List<Member> getMemberList(); 
	
	//관리자 등록
	public int adminSignUp(WareAdmin wareAdmin);

}
