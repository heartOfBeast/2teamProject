package com.cafe2team.domain;

public class Release {	
	private String releaseOrderCode;
	private String releaseCode;
	private String warehouseCode;
	private String productCode;
	private int releaseOrderQuantity;
	private String recipientName;
	private String recipientAddress;
	private String recipientPhone;
	private String shoppingmallUserId;
	private String orderRegDate;
	
	private Product product;
	
	private CarManagement carManagement;

	public String getReleaseOrderCode() {
		return releaseOrderCode;
	}

	public void setReleaseOrderCode(String releaseOrderCode) {
		this.releaseOrderCode = releaseOrderCode;
	}

	public String getReleaseCode() {
		return releaseCode;
	}

	public void setReleaseCode(String releaseCode) {
		this.releaseCode = releaseCode;
	}

	public String getWarehouseCode() {
		return warehouseCode;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public CarManagement getCarManagement() {
		return carManagement;
	}

	public void setCarManagement(CarManagement carManagement) {
		this.carManagement = carManagement;
	}

	@Override
	public String toString() {
		return "Release [releaseOrderCode=" + releaseOrderCode + ", releaseCode=" + releaseCode + ", warehouseCode="
				+ warehouseCode + ", productCode=" + productCode + ", releaseOrderQuantity=" + releaseOrderQuantity
				+ ", recipientName=" + recipientName + ", recipientAddress=" + recipientAddress + ", recipientPhone="
				+ recipientPhone + ", shoppingmallUserId=" + shoppingmallUserId + ", orderRegDate=" + orderRegDate
				+ ", product=" + product + ", carManagement=" + carManagement + "]";
	}
	
}
