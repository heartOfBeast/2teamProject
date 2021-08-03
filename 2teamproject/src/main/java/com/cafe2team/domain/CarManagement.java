package com.cafe2team.domain;

public class CarManagement {
	private String driveManageCode;
	private String releaseOrderCode;
	private String deliveryMemberId;
	private String releaseOrderCar;
	private String dispatchReason;
	private String driveUsingDate;
	private String driveRegDate;
	private String driveUpdateDate;
	private String wareAdminId;
	private String deliveryMemberName;
	private String realReleaseCode;
	
	private Release release;
	
	private Product product;
	
	private ReleaseInfo releaseInfo;
	
	
	public String getDeliveryMemberName() {
		return deliveryMemberName;
	}
	public void setDeliveryMemberName(String deliveryMemberName) {
		this.deliveryMemberName = deliveryMemberName;
	}
	public String getRealReleaseCode() {
		return realReleaseCode;
	}
	public void setRealReleaseCode(String realReleaseCode) {
		this.realReleaseCode = realReleaseCode;
	}
	public String getDriveUpdateDate() {
		return driveUpdateDate;
	}
	public void setDriveUpdateDate(String driveUpdateDate) {
		this.driveUpdateDate = driveUpdateDate;
	}
	public Release getRelease() {
		return release;
	}
	public void setRelease(Release release) {
		this.release = release;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public ReleaseInfo getReleaseInfo() {
		return releaseInfo;
	}
	public void setReleaseInfo(ReleaseInfo releaseInfo) {
		this.releaseInfo = releaseInfo;
	}
	public String getDriveManageCode() {
		return driveManageCode;
	}
	public void setDriveManageCode(String driveManageCode) {
		this.driveManageCode = driveManageCode;
	}
	public String getReleaseOrderCode() {
		return releaseOrderCode;
	}
	public void setReleaseOrderCode(String releaseOrderCode) {
		this.releaseOrderCode = releaseOrderCode;
	}
	public String getDeliveryMemberId() {
		return deliveryMemberId;
	}
	public void setDeliveryMemberId(String deliveryMemberId) {
		this.deliveryMemberId = deliveryMemberId;
	}
	public String getReleaseOrderCar() {
		return releaseOrderCar;
	}
	public void setReleaseOrderCar(String releaseOrderCar) {
		this.releaseOrderCar = releaseOrderCar;
	}
	public String getDispatchReason() {
		return dispatchReason;
	}
	public void setDispatchReason(String dispatchReason) {
		this.dispatchReason = dispatchReason;
	}
	public String getDriveUsingDate() {
		return driveUsingDate;
	}
	public void setDriveUsingDate(String driveUsingDate) {
		this.driveUsingDate = driveUsingDate;
	}
	public String getDriveRegDate() {
		return driveRegDate;
	}
	public void setDriveRegDate(String driveRegDate) {
		this.driveRegDate = driveRegDate;
	}
	public String getWareAdminId() {
		return wareAdminId;
	}
	public void setWareAdminId(String wareAdminId) {
		this.wareAdminId = wareAdminId;
	}
	
	@Override
	public String toString() {
		return "CarManagement [driveManageCode=" + driveManageCode + ", releaseOrderCode=" + releaseOrderCode
				+ ", deliveryMemberId=" + deliveryMemberId + ", releaseOrderCar=" + releaseOrderCar
				+ ", dispatchReason=" + dispatchReason + ", driveUsingDate=" + driveUsingDate + ", driveRegDate="
				+ driveRegDate + ", driveUpdateDate=" + driveUpdateDate + ", wareAdminId=" + wareAdminId
				+ ", deliveryMemberName=" + deliveryMemberName + ", realReleaseCode=" + realReleaseCode + ", release="
				+ release + ", product=" + product + ", releaseInfo=" + releaseInfo + "]";
	}
}
