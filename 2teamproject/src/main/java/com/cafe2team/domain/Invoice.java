package com.cafe2team.domain;

public class Invoice {
	private String inoviceCode;
	private String releaseOrderCode;
	private String driveManageCode;
	private String recipientName;
	private String recipientAddress;
	private String recipientPhone;
	private String wareAdminId;
	private String shopUserId;
	private String invoiceRegDate;
	private String invoiceUpdateDate;
	
	public String getInoviceCode() {
		return inoviceCode;
	}
	public void setInoviceCode(String inoviceCode) {
		this.inoviceCode = inoviceCode;
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
		return "Invoice [inoviceCode=" + inoviceCode + ", releaseOrderCode=" + releaseOrderCode + ", driveManageCode="
				+ driveManageCode + ", recipientName=" + recipientName + ", recipientAddress=" + recipientAddress
				+ ", recipientPhone=" + recipientPhone + ", wareAdminId=" + wareAdminId + ", shopUserId=" + shopUserId
				+ ", invoiceRegDate=" + invoiceRegDate + ", invoiceUpdateDate=" + invoiceUpdateDate + "]";
	}
	
}
