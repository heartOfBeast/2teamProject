package com.cafe2team.domain;

public class ReleaseInfo {
	private String releaseCode;
	private String releaseOrderCode;
	private String warehouseCode;
	private String releaseRealDate;
	private int releaseRealAmount;
	private String wareAdminId;
	private String releaseRegDate;
	private String productCode;
	private String releaseRequestCode;
	
	public String getReleaseCode() {
		return releaseCode;
	}
	public void setReleaseCode(String releaseCode) {
		this.releaseCode = releaseCode;
	}
	public String getReleaseOrderCode() {
		return releaseOrderCode;
	}
	public void setReleaseOrderCode(String releaseOrderCode) {
		this.releaseOrderCode = releaseOrderCode;
	}
	public String getWarehouseCode() {
		return warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
	public String getReleaseRealDate() {
		return releaseRealDate;
	}
	public void setReleaseRealDate(String releaseRealDate) {
		this.releaseRealDate = releaseRealDate;
	}
	public int getReleaseRealAmount() {
		return releaseRealAmount;
	}
	public void setReleaseRealAmount(int releaseRealAmount) {
		this.releaseRealAmount = releaseRealAmount;
	}
	public String getWareAdminId() {
		return wareAdminId;
	}
	public void setWareAdminId(String wareAdminId) {
		this.wareAdminId = wareAdminId;
	}
	public String getReleaseRegDate() {
		return releaseRegDate;
	}
	public void setReleaseRegDate(String releaseRegDate) {
		this.releaseRegDate = releaseRegDate;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getReleaseRequestCode() {
		return releaseRequestCode;
	}
	public void setReleaseRequestCode(String releaseRequestCode) {
		this.releaseRequestCode = releaseRequestCode;
	}
	
	@Override
	public String toString() {
		return "ReleaseInfo [releaseCode=" + releaseCode + ", releaseOrderCode=" + releaseOrderCode + ", warehouseCode="
				+ warehouseCode + ", releaseRealDate=" + releaseRealDate + ", releaseRealAmount=" + releaseRealAmount
				+ ", wareAdminId=" + wareAdminId + ", releaseRegDate=" + releaseRegDate + ", productCode=" + productCode
				+ ", releaseRequestCode=" + releaseRequestCode + "]";
	}
	
}
