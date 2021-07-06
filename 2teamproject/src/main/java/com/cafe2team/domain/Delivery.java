package com.cafe2team.domain;

public class Delivery {
	private String deliveryMemberId;
	private String warehouseCode;
	private String levelCode;
	private String deliveryMemberName;	
	private String deliveryMemberAddress;
	private String deliveryMemberPhone;
	private String wareAdminId;
	private String deliveryRegDate;
	private String deliveryIncentive;
	
	public String getDeliveryMemberId() {
		return deliveryMemberId;
	}
	public void setDeliveryMemberId(String deliveryMemberId) {
		this.deliveryMemberId = deliveryMemberId;
	}
	public String getWarehouseCode() {
		return warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
	public String getLevelCode() {
		return levelCode;
	}
	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}
	public String getDeliveryMemberName() {
		return deliveryMemberName;
	}
	public void setDeliveryMemberName(String deliveryMemberName) {
		this.deliveryMemberName = deliveryMemberName;
	}
	public String getDeliveryMemberAddress() {
		return deliveryMemberAddress;
	}
	public void setDeliveryMemberAddress(String deliveryMemberAddress) {
		this.deliveryMemberAddress = deliveryMemberAddress;
	}
	public String getDeliveryMemberPhone() {
		return deliveryMemberPhone;
	}
	public void setDeliveryMemberPhone(String deliveryMemberPhone) {
		this.deliveryMemberPhone = deliveryMemberPhone;
	}
	public String getWareAdminId() {
		return wareAdminId;
	}
	public void setWareAdminId(String wareAdminId) {
		this.wareAdminId = wareAdminId;
	}
	public String getDeliveryRegDate() {
		return deliveryRegDate;
	}
	public void setDeliveryRegDate(String deliveryRegDate) {
		this.deliveryRegDate = deliveryRegDate;
	}
	public String getDeliveryIncentive() {
		return deliveryIncentive;
	}
	public void setDeliveryIncentive(String deliveryIncentive) {
		this.deliveryIncentive = deliveryIncentive;
	}
	@Override
	public String toString() {
		return "Delivery [deliveryMemberId=" + deliveryMemberId + ", warehouseCode=" + warehouseCode + ", levelCode="
				+ levelCode + ", deliveryMemberName=" + deliveryMemberName + ", deliveryMemberAddress="
				+ deliveryMemberAddress + ", deliveryMemberPhone=" + deliveryMemberPhone + ", wareAdminId="
				+ wareAdminId + ", deliveryRegDate=" + deliveryRegDate + ", deliveryIncentive=" + deliveryIncentive
				+ "]";
	}
	
}
