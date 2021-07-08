package com.cafe2team.domain;

public class CarManagement {
	private String driveManageCode;
	private String releaseOrderCode;
	private String deliveryMemberId;
	private String releaseOrderCar;
	private String dispatchReason;
	private String driveUsingDate;
	private String driveRegDate;
	private String wareAdminId;
	
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
				+ driveRegDate + ", wareAdminId=" + wareAdminId + "]";
	}
	
}
