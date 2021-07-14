package com.cafe2team.domain;


public class Request {
	
	private String requsetCode;
	private String productCode;
	private String warehouseCode;
	private int warehouseRequestAmount;
	private String shoppingUserId;
	private String shopName;
	private String productName;
	private String barcodeImg;
	private String wareAdminId;
	private String requestRegDate;
	private String requestStatus;
	
	private Warehouse wareHouse;

	public String getRequsetCode() {
		return requsetCode;
	}

	public void setRequsetCode(String requsetCode) {
		this.requsetCode = requsetCode;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getWarehouseCode() {
		return warehouseCode;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public int getWarehouseRequestAmount() {
		return warehouseRequestAmount;
	}

	public void setWarehouseRequestAmount(int warehouseRequestAmount) {
		this.warehouseRequestAmount = warehouseRequestAmount;
	}

	public String getShoppingUserId() {
		return shoppingUserId;
	}

	public void setShoppingUserId(String shoppingUserId) {
		this.shoppingUserId = shoppingUserId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBarcodeImg() {
		return barcodeImg;
	}

	public void setBarcodeImg(String barcodeImg) {
		this.barcodeImg = barcodeImg;
	}

	public String getWareAdminId() {
		return wareAdminId;
	}

	public void setWareAdminId(String wareAdminId) {
		this.wareAdminId = wareAdminId;
	}

	public String getRequestRegDate() {
		return requestRegDate;
	}

	public void setRequestRegDate(String requestRegDate) {
		this.requestRegDate = requestRegDate;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	public Warehouse getWareHouse() {
		return wareHouse;
	}

	public void setWareHouse(Warehouse wareHouse) {
		this.wareHouse = wareHouse;
	}

	@Override
	public String toString() {
		return "Request [requsetCode=" + requsetCode + ", productCode=" + productCode + ", warehouseCode="
				+ warehouseCode + ", warehouseRequestAmount=" + warehouseRequestAmount + ", shoppingUserId="
				+ shoppingUserId + ", shopName=" + shopName + ", productName=" + productName + ", barcodeImg="
				+ barcodeImg + ", wareAdminId=" + wareAdminId + ", requestRegDate=" + requestRegDate
				+ ", requestStatus=" + requestStatus + ", wareHouse=" + wareHouse + "]";
	}
	
	
}
