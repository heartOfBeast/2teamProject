package com.cafe2team.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe2team.domain.AdminApproval;
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
	
	public Shoppingmall getShopById(String shoppingmallId);
	
	//관리자 등록
	public int adminSignUp(AdminApproval adminApproval);
	
	//미승인 관리자 조회
	public List<AdminApproval> getApprovalList();
	
	//관리자 업데이트 수정
	public int adminUpdate(WareAdmin wareAdmin);
	
	//관리자 아이디 => 멤버아이디로 복사
	public int adminIntotbMember(String approvalAdminId);
	
	public int adminIntotbAdminWare(String approvalAdminId);
	
	//어드민 아이디 삭제
	public int deleteWareAdmin(String wareAdminId);
	
	//멤버 업데이트
	public int updateMember(Member member);
	
	//거래처 등록
	public int memberShopInsert(Shoppingmall shoppingMall);
	
	//관리자 조회
	public List<WareAdmin> getAdminList();
	
	//멤버 딜리트 (미완성)
	public int deleteMember(String memberId);

	public AdminApproval getApprovalById(String approvalmemberId);
	
	public List<Member> getMemberListDetail(String getMemberLevel);
	
	//shop 아이디 찾기
	public Shoppingmall getShopAjaxId(String shopMemberEmail);
	
	//Admin 아이디 찾기
	public Member getAdminAjaxId(String adminMemberEmail);
	
	//거래처 회원탈퇴
	public int shopMemberDelete(String shopMemberPassword);
	
	
}
