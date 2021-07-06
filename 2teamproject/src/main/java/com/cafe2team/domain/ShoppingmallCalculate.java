package com.cafe2team.domain;

public class ShoppingmallCalculate {

	private String calculateCode;
	private String contractFinalCode;
	private String shoppingmallUserId;
	private String calculateType;
	private String calculatePayment;
	private String calculateMemo;
	private String calculateDate;
	private String calculateRegDate;
	private String wareAdminId;
	
	private Contract contract;
	private Shoppingmall shoppingmall;
	private WareAdmin wareAdmin;
	public String getCalculateCode() {
		return calculateCode;
	}
	public void setCalculateCode(String calculateCode) {
		this.calculateCode = calculateCode;
	}
	public String getContractFinalCode() {
		return contractFinalCode;
	}
	public void setContractFinalCode(String contractFinalCode) {
		this.contractFinalCode = contractFinalCode;
	}
	public String getShoppingmallUserId() {
		return shoppingmallUserId;
	}
	public void setShoppingmallUserId(String shoppingmallUserId) {
		this.shoppingmallUserId = shoppingmallUserId;
	}
	public String getCalculateType() {
		return calculateType;
	}
	public void setCalculateType(String calculateType) {
		this.calculateType = calculateType;
	}
	public String getCalculatePayment() {
		return calculatePayment;
	}
	public void setCalculatePayment(String calculatePayment) {
		this.calculatePayment = calculatePayment;
	}
	public String getCalculateMemo() {
		return calculateMemo;
	}
	public void setCalculateMemo(String calculateMemo) {
		this.calculateMemo = calculateMemo;
	}
	public String getCalculateDate() {
		return calculateDate;
	}
	public void setCalculateDate(String calculateDate) {
		this.calculateDate = calculateDate;
	}
	public String getCalculateRegDate() {
		return calculateRegDate;
	}
	public void setCalculateRegDate(String calculateRegDate) {
		this.calculateRegDate = calculateRegDate;
	}
	public String getWareAdminId() {
		return wareAdminId;
	}
	public void setWareAdminId(String wareAdminId) {
		this.wareAdminId = wareAdminId;
	}
	public Contract getContract() {
		return contract;
	}
	public void setContract(Contract contract) {
		this.contract = contract;
	}
	public Shoppingmall getShoppingmall() {
		return shoppingmall;
	}
	public void setShoppingmall(Shoppingmall shoppingmall) {
		this.shoppingmall = shoppingmall;
	}
	public WareAdmin getWareAdmin() {
		return wareAdmin;
	}
	public void setWareAdmin(WareAdmin wareAdmin) {
		this.wareAdmin = wareAdmin;
	}
	@Override
	public String toString() {
		return "ShoppingmallCalculate [calculateCode=" + calculateCode + ", contractFinalCode=" + contractFinalCode
				+ ", shoppingmallUserId=" + shoppingmallUserId + ", calculateType=" + calculateType
				+ ", calculatePayment=" + calculatePayment + ", calculateMemo=" + calculateMemo + ", calculateDate="
				+ calculateDate + ", calculateRegDate=" + calculateRegDate + ", wareAdminId=" + wareAdminId
				+ ", contract=" + contract + ", shoppingmall=" + shoppingmall + ", wareAdmin=" + wareAdmin + "]";
	}
	
	
}
