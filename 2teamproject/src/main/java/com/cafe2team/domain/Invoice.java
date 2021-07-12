package com.cafe2team.domain;

public class Invoice {
	private String invoiceCode;
	private String releaseOrderCode;
	private String driveManageCode;
	private String invoiceName;
	private String invoiceAddress;
	private String invoicePhone;
	private String wareAdminId;
	private String shopUserId;
	private String invoiceRegDate;
	private String invoiceUpdateDate;
	
	public String getInvoiceCode() {
		return invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}
	public String getReleaseOrderCode() {
		return releaseOrderCode;
	}
	public void setReleaseOrderCode(String releaseOrderCode) {
		this.releaseOrderCode = releaseOrderCode;
	}
	public String getDriveManageCode() {
		return driveManageCode;
	}
	public void setDriveManageCode(String driveManageCode) {
		this.driveManageCode = driveManageCode;
	}
	public String getInvoiceName() {
		return invoiceName;
	}
	public void setInvoiceName(String invoiceName) {
		this.invoiceName = invoiceName;
	}
	public String getInvoiceAddress() {
		return invoiceAddress;
	}
	public void setInvoiceAddress(String invoiceAddress) {
		this.invoiceAddress = invoiceAddress;
	}
	public String getInvoicePhone() {
		return invoicePhone;
	}
	public void setInvoicePhone(String invoicePhone) {
		this.invoicePhone = invoicePhone;
	}
	public String getWareAdminId() {
		return wareAdminId;
	}
	public void setWareAdminId(String wareAdminId) {
		this.wareAdminId = wareAdminId;
	}
	public String getShopUserId() {
		return shopUserId;
	}
	public void setShopUserId(String shopUserId) {
		this.shopUserId = shopUserId;
	}
	public String getInvoiceRegDate() {
		return invoiceRegDate;
	}
	public void setInvoiceRegDate(String invoiceRegDate) {
		this.invoiceRegDate = invoiceRegDate;
	}
	public String getInvoiceUpdateDate() {
		return invoiceUpdateDate;
	}
	public void setInvoiceUpdateDate(String invoiceUpdateDate) {
		this.invoiceUpdateDate = invoiceUpdateDate;
	}
	
	@Override
	public String toString() {
		return "Invoice [invoiceCode=" + invoiceCode + ", releaseOrderCode=" + releaseOrderCode + ", driveManageCode="
				+ driveManageCode + ", invoiceName=" + invoiceName + ", invoiceAddress=" + invoiceAddress
				+ ", invoicePhone=" + invoicePhone + ", wareAdminId=" + wareAdminId + ", shopUserId=" + shopUserId
				+ ", invoiceRegDate=" + invoiceRegDate + ", invoiceUpdateDate=" + invoiceUpdateDate + "]";
	}
	
}
