package com.cafe2team.domain;

public class Release {	
	private String releaseOrderCode;
	private String productCode;
	private int releaseOrderQuantity;
	private String recipientName;
	private String recipientAddress;
	private String recipientPhone;
	private String shoppingmallUserId;
	private String orderRegDate;
	
	private Product product;
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getReleaseOrderCode() {
		return releaseOrderCode;
	}
	public void setReleaseOrderCode(String releaseOrderCode) {
		this.releaseOrderCode = releaseOrderCode;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public int getReleaseOrderQuantity() {
		return releaseOrderQuantity;
	}
	public void setReleaseOrderQuantity(int releaseOrderQuantity) {
		this.releaseOrderQuantity = releaseOrderQuantity;
	}
	public String getRecipientName() {
		return recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	public String getRecipientAddress() {
		return recipientAddress;
	}
	public void setRecipientAddress(String recipientAddress) {
		this.recipientAddress = recipientAddress;
	}
	public String getRecipientPhone() {
		return recipientPhone;
	}
	public void setRecipientPhone(String recipientPhone) {
		this.recipientPhone = recipientPhone;
	}
	public String getShoppingmallUserId() {
		return shoppingmallUserId;
	}
	public void setShoppingmallUserId(String shoppingmallUserId) {
		this.shoppingmallUserId = shoppingmallUserId;
	}
	public String getOrderRegDate() {
		return orderRegDate;
	}
	public void setOrderRegDate(String orderRegDate) {
		this.orderRegDate = orderRegDate;
	}
	@Override
	public String toString() {
		return "Release [releaseOrderCode=" + releaseOrderCode + ", productCode=" + productCode
				+ ", releaseOrderQuantity=" + releaseOrderQuantity + ", recipientName=" + recipientName
				+ ", recipientAddress=" + recipientAddress + ", recipientPhone=" + recipientPhone
				+ ", shoppingmallUserId=" + shoppingmallUserId + ", orderRegDate=" + orderRegDate + "]";
	}
	
		
}
