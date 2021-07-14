package com.cafe2team.domain;

public class StockCheck {
	private String seccheckCode;
	private String warehouseCode;
	private String memberid;
	private String seccheckError;
	private String seccheckAmount;
	private String checkUnit;
	private String checkDetail;
	private String checkDate;
	private String checkRegdate;

	private Product product;
	private Stock stock;
	private WareSector wareSector;
	
	public String getSeccheckCode() {
		return seccheckCode;
	}
	public void setSeccheckCode(String seccheckCode) {
		this.seccheckCode = seccheckCode;
	}
	public String getWarehouseCode() {
		return warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	public String getSeccheckError() {
		return seccheckError;
	}
	public void setSeccheckError(String seccheckError) {
		this.seccheckError = seccheckError;
	}
	public String getSeccheckAmount() {
		return seccheckAmount;
	}
	public void setSeccheckAmount(String seccheckAmount) {
		this.seccheckAmount = seccheckAmount;
	}
	public String getCheckUnit() {
		return checkUnit;
	}
	public void setCheckUnit(String checkUnit) {
		this.checkUnit = checkUnit;
	}
	public String getCheckDetail() {
		return checkDetail;
	}
	public void setCheckDetail(String checkDetail) {
		this.checkDetail = checkDetail;
	}
	public String getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(String checkDate) {
		this.checkDate = checkDate;
	}
	public String getCheckRegdate() {
		return checkRegdate;
	}
	public void setCheckRegdate(String checkRegdate) {
		this.checkRegdate = checkRegdate;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public WareSector getWareSector() {
		return wareSector;
	}
	public void setWareSector(WareSector wareSector) {
		this.wareSector = wareSector;
	}
	@Override
	public String toString() {
		return "StockCheck [seccheckCode=" + seccheckCode + ", warehouseCode=" + warehouseCode + ", memberid="
				+ memberid + ", seccheckError=" + seccheckError + ", seccheckAmount=" + seccheckAmount + ", checkUnit="
				+ checkUnit + ", checkDetail=" + checkDetail + ", checkDate=" + checkDate + ", checkRegdate="
				+ checkRegdate + ", product=" + product + ", stock=" + stock + ", wareSector=" + wareSector + "]";
	}
	
	
	

	
	
	
	
	
	
}
