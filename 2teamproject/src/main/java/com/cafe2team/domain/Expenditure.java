package com.cafe2team.domain;

public class Expenditure {

	private String expenseCode;
	private String expenseInfo;
	private String expenseDate;
	private String expenseCashCard;
	private String expenseCardInfo;
	private String expenseStore;
	private String expenseCate;
	private String expensePayment;
	private String wareadminId;
	private String expensRegDate;
	public String getExpenseCode() {
		return expenseCode;
	}
	public void setExpenseCode(String expenseCode) {
		this.expenseCode = expenseCode;
	}
	public String getExpenseInfo() {
		return expenseInfo;
	}
	public void setExpenseInfo(String expenseInfo) {
		this.expenseInfo = expenseInfo;
	}
	public String getExpenseDate() {
		return expenseDate;
	}
	public void setExpenseDate(String expenseDate) {
		this.expenseDate = expenseDate;
	}
	public String getExpenseCashCard() {
		return expenseCashCard;
	}
	public void setExpenseCashCard(String expenseCashCard) {
		this.expenseCashCard = expenseCashCard;
	}
	public String getExpenseCardInfo() {
		return expenseCardInfo;
	}
	public void setExpenseCardInfo(String expenseCardInfo) {
		this.expenseCardInfo = expenseCardInfo;
	}
	public String getExpenseStore() {
		return expenseStore;
	}
	public void setExpenseStore(String expenseStore) {
		this.expenseStore = expenseStore;
	}
	public String getExpenseCate() {
		return expenseCate;
	}
	public void setExpenseCate(String expenseCate) {
		this.expenseCate = expenseCate;
	}
	public String getExpensePayment() {
		return expensePayment;
	}
	public void setExpensePayment(String expensePayment) {
		this.expensePayment = expensePayment;
	}
	public String getWareadminId() {
		return wareadminId;
	}
	public void setWareadminId(String wareadminId) {
		this.wareadminId = wareadminId;
	}
	public String getExpensRegDate() {
		return expensRegDate;
	}
	public void setExpensRegDate(String expensRegDate) {
		this.expensRegDate = expensRegDate;
	}
	
	@Override
	public String toString() {
		return "Expenditure [expenseCode=" + expenseCode + ", expenseInfo=" + expenseInfo + ", expenseDate="
				+ expenseDate + ", expenseCashCard=" + expenseCashCard + ", expenseCardInfo=" + expenseCardInfo
				+ ", expenseStore=" + expenseStore + ", expenseCate=" + expenseCate + ", expensePayment="
				+ expensePayment + ", wareadminId=" + wareadminId + ", expensRegDate=" + expensRegDate + "]";
	}
	
	
}
