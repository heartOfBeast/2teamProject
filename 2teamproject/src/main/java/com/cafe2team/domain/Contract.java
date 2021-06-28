package com.cafe2team.domain;

public class Contract {
	private String contract_Code;
	private String contract_Price;
	private String contract_Start;
	private String contract_End;
	private String contract_Quantity;
	private String contract_Pay;
	private String shoppingmall_Id;
	private String contract_reg;
	private String member_Id;
	private String contract_Memo;
	private String contract_Product;
	public String getContract_Code() {
		return contract_Code;
	}
	public void setContract_Code(String contract_Code) {
		this.contract_Code = contract_Code;
	}
	public String getContract_Price() {
		return contract_Price;
	}
	public void setContract_Price(String contract_Price) {
		this.contract_Price = contract_Price;
	}
	public String getContract_Start() {
		return contract_Start;
	}
	public void setContract_Start(String contract_Start) {
		this.contract_Start = contract_Start;
	}
	public String getContract_End() {
		return contract_End;
	}
	public void setContract_End(String contract_End) {
		this.contract_End = contract_End;
	}
	public String getContract_Quantity() {
		return contract_Quantity;
	}
	public void setContract_Quantity(String contract_Quantity) {
		this.contract_Quantity = contract_Quantity;
	}
	public String getContract_Pay() {
		return contract_Pay;
	}
	public void setContract_Pay(String contract_Pay) {
		this.contract_Pay = contract_Pay;
	}
	public String getShoppingmall_Id() {
		return shoppingmall_Id;
	}
	public void setShoppingmall_Id(String shoppingmall_Id) {
		this.shoppingmall_Id = shoppingmall_Id;
	}
	public String getContract_reg() {
		return contract_reg;
	}
	public void setContract_reg(String contract_reg) {
		this.contract_reg = contract_reg;
	}
	public String getMember_Id() {
		return member_Id;
	}
	public void setMember_Id(String member_Id) {
		this.member_Id = member_Id;
	}
	public String getContract_Memo() {
		return contract_Memo;
	}
	public void setContract_Memo(String contract_Memo) {
		this.contract_Memo = contract_Memo;
	}
	public String getContract_Product() {
		return contract_Product;
	}
	public void setContract_Product(String contract_Product) {
		this.contract_Product = contract_Product;
	}
	@Override
	public String toString() {
		return "ShoppingmallContract [contract_Code=" + contract_Code + ", contract_Price=" + contract_Price
				+ ", contract_Start=" + contract_Start + ", contract_End=" + contract_End + ", contract_Quantity="
				+ contract_Quantity + ", contract_Pay=" + contract_Pay + ", shoppingmall_Id=" + shoppingmall_Id
				+ ", contract_reg=" + contract_reg + ", member_Id=" + member_Id + ", contract_Memo=" + contract_Memo
				+ ", contract_Product=" + contract_Product + "]";
	}
	
	
}
