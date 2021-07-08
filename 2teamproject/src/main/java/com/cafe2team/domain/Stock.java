package com.cafe2team.domain;

public class Stock {
	private String total;
	private String bigCategory;
	private String middleCategory;
	private String smallCategory;
	private String productName;
	private String warehouseName;
	private String finalSector;
	private String spmName;
	private String wRequestAmount;
	private String wOrderAmount;
	private String wOrderDate;
	private String wRealAmount;
	private String wRealDate;
	private String productCode;
	private String receivingCode;
	
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getBigCategory() {
		return bigCategory;
	}
	public void setBigCategory(String bigCategory) {
		this.bigCategory = bigCategory;
	}
	public String getMiddleCategory() {
		return middleCategory;
	}
	public void setMiddleCategory(String middleCategory) {
		this.middleCategory = middleCategory;
	}
	public String getSmallCategory() {
		return smallCategory;
	}
	public void setSmallCategory(String smallCategory) {
		this.smallCategory = smallCategory;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getWarehouseName() {
		return warehouseName;
	}
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}
	public String getFinalSector() {
		return finalSector;
	}
	public void setFinalSector(String finalSector) {
		this.finalSector = finalSector;
	}
	public String getSpmName() {
		return spmName;
	}
	public void setSpmName(String spmName) {
		this.spmName = spmName;
	}
	public String getwRequestAmount() {
		return wRequestAmount;
	}
	public void setwRequestAmount(String wRequestAmount) {
		this.wRequestAmount = wRequestAmount;
	}
	public String getwOrderAmount() {
		return wOrderAmount;
	}
	public void setwOrderAmount(String wOrderAmount) {
		this.wOrderAmount = wOrderAmount;
	}
	public String getwOrderDate() {
		return wOrderDate;
	}
	public void setwOrderDate(String wOrderDate) {
		this.wOrderDate = wOrderDate;
	}
	public String getwRealAmount() {
		return wRealAmount;
	}
	public void setwRealAmount(String wRealAmount) {
		this.wRealAmount = wRealAmount;
	}
	public String getwRealDate() {
		return wRealDate;
	}
	public void setwRealDate(String wRealDate) {
		this.wRealDate = wRealDate;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getReceivingCode() {
		return receivingCode;
	}
	public void setReceivingCode(String receivingCode) {
		this.receivingCode = receivingCode;
	}
	@Override
	public String toString() {
		return "Stock [total=" + total + ", bigCategory=" + bigCategory + ", middleCategory=" + middleCategory
				+ ", smallCategory=" + smallCategory + ", productName=" + productName + ", warehouseName="
				+ warehouseName + ", finalSector=" + finalSector + ", spmName=" + spmName + ", wRequestAmount="
				+ wRequestAmount + ", wOrderAmount=" + wOrderAmount + ", wOrderDate=" + wOrderDate + ", wRealAmount="
				+ wRealAmount + ", wRealDate=" + wRealDate + ", productCode=" + productCode + ", receivingCode="
				+ receivingCode + "]";
	}

	
}
