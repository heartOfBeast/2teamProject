package com.cafe2team.domain;

import java.util.Arrays;

public class Request {
	
	private String requsetCode;
	private String productCode;
	private String warehouseCode;
	private int warehouseRequestAmount;
	private String shoppingUserId;
	
	private String wareHouseName;
	private String productName;
	
	private byte[] barcodeImg;
	private byte[] productFile;
	private String wareAdminId;
	private String requestRegDate;
	
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
	public String getWareHouseName() {
		return wareHouseName;
	}
	public void setWareHouseName(String wareHouseName) {
		this.wareHouseName = wareHouseName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public byte[] getBarcodeImg() {
		return barcodeImg;
	}
	public void setBarcodeImg(byte[] barcodeImg) {
		this.barcodeImg = barcodeImg;
	}
	public byte[] getProductFile() {
		return productFile;
	}
	public void setProductFile(byte[] productFile) {
		this.productFile = productFile;
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
	@Override
	public String toString() {
		return "Requset [requsetCode=" + requsetCode + ", productCode=" + productCode + ", warehouseCode="
				+ warehouseCode + ", warehouseRequestAmount=" + warehouseRequestAmount + ", shoppingUserId="
				+ shoppingUserId + ", wareHouseName=" + wareHouseName + ", productName=" + productName + ", barcodeImg="
				+ Arrays.toString(barcodeImg) + ", productFile=" + Arrays.toString(productFile) + ", wareAdminId="
				+ wareAdminId + ", requestRegDate=" + requestRegDate + "]";
	}
	
}
