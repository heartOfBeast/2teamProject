package com.cafe2team.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe2team.dao.MemberMapper;
import com.cafe2team.domain.AdminApproval;
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
	public List<Member> getMemberList(Map<String, Object> memberCodeParam){
		
		log.info("=========memberList service 실행======");
		List<Member> memberList = memberMapper.getMemberList(memberCodeParam);
		
		
		return memberList;
		
	}
	
	//관리자 승인 아이디 대기 조회
	public List<AdminApproval> getApprovalList(){
		
		List<AdminApproval> AdminApprovalList = memberMapper.getApprovalList();
		
		return AdminApprovalList;
	}
	
	public AdminApproval getApprovalById(String approvalmemberId) {
		
		AdminApproval adminApproval = memberMapper.getApprovalById(approvalmemberId);
		
		return adminApproval;
		
	}
	
	public List<Member> getShoppingmallList(){
		
		
		return memberMapper.getShoppingmallList();
	}
	
	//memberId만 조회
	public Member getMemberInfoById(String memberId) {
		
		Member member = memberMapper.getMemberById(memberId);
		
		return member;
	
	}
	
	public Shoppingmall getsShopById(String shoppingmallId) {
		
		Shoppingmall shop = memberMapper.getShopById(shoppingmallId);
		
		return shop;
	}
	
	//업데이트
	public int updateMember(Member member) {
		
		int memberUpdate = memberMapper.updateMember(member);
		
		return memberUpdate;
	}
	
	public int updateShopMember(Shoppingmall shoppingmall) {
		
		return memberMapper.updateShopMember(shoppingmall);
	}
	
	//승인대기테이블에서 tbMember 으로 이동
	public int adminIntotbMember(String approvalAdminId) {
		
		return memberMapper.adminIntotbMember(approvalAdminId);
	}
	
	//승인대기테이블에서 tbWareAdmin 으로 이동
	public int adminIntotbAdminWare(String approvalAdminId) {
		
		
		return memberMapper.adminIntotbAdminWare(approvalAdminId);
	}
	
	//승인대기테이블에서 tbMeber 로 이동시 삭제처리
	public int deleteWareAdmin(String wareAdminId) {
		
			
		return memberMapper.deleteWareAdmin(wareAdminId);
	}
	
	
	public List<WareAdmin> getAdminList(){
		log.info("=========getAdminList service 실행======");
		List<WareAdmin> getAdminList = memberMapper.getAdminList();
		
		return getAdminList;
	}
	
	
	public int adminSignUp(AdminApproval adminApproval) {
		
		int result = memberMapper.adminSignUp(adminApproval);
		
		return result;
	}
	
	public int memberShopInsert(Shoppingmall shoppingMall) {
		
		int reulst = memberMapper.memberShopInsert(shoppingMall);
		
		return reulst;
	}

	public int deleteMember(String memberId) {
		
		return memberMapper.deleteMember(memberId);
		
	}
	
//	public List<Member> getMemberListDetail(String getMemberLevel){
//		
//		return memberMapper.getMemberListDetail(getMemberLevel);
//	}
	
	
	public Shoppingmall getShopAjaxId(String shopEmail) {
		
		Shoppingmall shop = memberMapper.getShopAjaxId(shopEmail);
		
		return shop;
	}
	
	public Member getAdminAjaxId(String adminEmail) {
		
		Member member =  memberMapper.getAdminAjaxId(adminEmail);
		
		return member;
	}
	
	public int shopMemberDelete(String shopMemberPassword) {
		
		return memberMapper.shopMemberDelete(shopMemberPassword);
	}
	
	public List<Member> getMemberLevelCode(){
		return memberMapper.getMemberLevelCode();
	}
	
	public int adminApprovalStatusUpdate(String approvalAdminId) {
		return memberMapper.adminApprovalStatusUpdate(approvalAdminId);
	}
	

	
}
