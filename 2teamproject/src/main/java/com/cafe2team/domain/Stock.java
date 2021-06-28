package com.cafe2team.domain;

public class Stock {
	private String productName;
	private String shoppingmallName;
	private String warehouseName;
	private String finalSector;
	private String stockUnit;
	private String recentWarehousingAmount;
	private String recentReleaseAmount;
	private String totalAmount;
	private String wareAdminId;
	private String wareAdminPhone;
	private String stockRegDate;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getShoppingmallName() {
		return shoppingmallName;
	}
	public void setShoppingmallName(String shoppingmallName) {
		this.shoppingmallName = shoppingmallName;
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
	public String getStockUnit() {
		return stockUnit;
	}
	public void setStockUnit(String stockUnit) {
		this.stockUnit = stockUnit;
	}
	public String getRecentWarehousingAmount() {
		return recentWarehousingAmount;
	}
	public void setRecentWarehousingAmount(String recentWarehousingAmount) {
		this.recentWarehousingAmount = recentWarehousingAmount;
	}
	public String getRecentReleaseAmount() {
		return recentReleaseAmount;
	}
	public void setRecentReleaseAmount(String recentReleaseAmount) {
		this.recentReleaseAmount = recentReleaseAmount;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getWareAdminId() {
		return wareAdminId;
	}
	public void setWareAdminId(String wareAdminId) {
		this.wareAdminId = wareAdminId;
	}
	public String getWareAdminPhone() {
		return wareAdminPhone;
	}
	public void setWareAdminPhone(String wareAdminPhone) {
		this.wareAdminPhone = wareAdminPhone;
	}
	public String getStockRegDate() {
		return stockRegDate;
	}
	public void setStockRegDate(String stockRegDate) {
		this.stockRegDate = stockRegDate;
	}
	@Override
	public String toString() {
		return "Stock [productName=" + productName + ", shoppingmallName=" + shoppingmallName + ", warehouseName="
				+ warehouseName + ", finalSector=" + finalSector + ", stockUnit=" + stockUnit
				+ ", recentWarehousingAmount=" + recentWarehousingAmount + ", recentReleaseAmount="
				+ recentReleaseAmount + ", totalAmount=" + totalAmount + ", wareAdminId=" + wareAdminId
				+ ", wareAdminPhone=" + wareAdminPhone + ", stockRegDate=" + stockRegDate + "]";
	}
	
}
