package com.cafe2team.domain;

public class Item {

	private String itemCode;
	private String itemBigCategory;
	private String itemMiddleCategory;
	private String itemSmallCategory;
	private String itemUsingCheck;
	private String itemRegDate;
	private String itemAdminId;
	
	private WareAdmin wareAdmin;

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemBigCategory() {
		return itemBigCategory;
	}

	public void setItemBigCategory(String itemBigCategory) {
		this.itemBigCategory = itemBigCategory;
	}

	public String getItemMiddleCategory() {
		return itemMiddleCategory;
	}

	public void setItemMiddleCategory(String itemMiddleCategory) {
		this.itemMiddleCategory = itemMiddleCategory;
	}

	public String getItemSmallCategory() {
		return itemSmallCategory;
	}

	public void setItemSmallCategory(String itemSmallCategory) {
		this.itemSmallCategory = itemSmallCategory;
	}

	public String getItemUsingCheck() {
		return itemUsingCheck;
	}

	public void setItemUsingCheck(String itemUsingCheck) {
		this.itemUsingCheck = itemUsingCheck;
	}

	public String getItemRegDate() {
		return itemRegDate;
	}

	public void setItemRegDate(String itemRegDate) {
		this.itemRegDate = itemRegDate;
	}

	public String getItemAdminId() {
		return itemAdminId;
	}

	public void setItemAdminId(String itemAdminId) {
		this.itemAdminId = itemAdminId;
	}

	public WareAdmin getWareAdmin() {
		return wareAdmin;
	}

	public void setWareAdmin(WareAdmin wareAdmin) {
		this.wareAdmin = wareAdmin;
	}

	@Override
	public String toString() {
		return "Item [itemCode=" + itemCode + ", itemBigCategory=" + itemBigCategory + ", itemMiddleCategory="
				+ itemMiddleCategory + ", itemSmallCategory=" + itemSmallCategory + ", itemUsingCheck=" + itemUsingCheck
				+ ", itemRegDate=" + itemRegDate + ", itemAdminId=" + itemAdminId + ", wareAdmin=" + wareAdmin + "]";
	}
	
	
}
