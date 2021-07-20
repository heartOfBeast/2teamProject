package com.cafe2team.domain;

public class Price {
	private String priceCode;
	private String priceName;
	private String wareHouseType;
	private String contractType;
	private String priceWeight;
	private String priceNumber;
	private String priceZone;
	private String priceDay;
	private String pricePrice;
	private String unitPriceId;
	private String unitPriceRegDate;
	private String unitPriceUpdate;
	
	public String getPriceCode() {
		return priceCode;
	}
	public void setPriceCode(String priceCode) {
		this.priceCode = priceCode;
	}
	public String getPriceName() {
		return priceName;
	}
	public void setPriceName(String priceName) {
		this.priceName = priceName;
	}
	public String getWareHouseType() {
		return wareHouseType;
	}
	public void setWareHouseType(String wareHouseType) {
		this.wareHouseType = wareHouseType;
	}
	public String getContractType() {
		return contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
	public String getPriceWeight() {
		return priceWeight;
	}
	public void setPriceWeight(String priceWeight) {
		this.priceWeight = priceWeight;
	}
	public String getPriceNumber() {
		return priceNumber;
	}
	public void setPriceNumber(String priceNumber) {
		this.priceNumber = priceNumber;
	}
	public String getPriceZone() {
		return priceZone;
	}
	public void setPriceZone(String priceZone) {
		this.priceZone = priceZone;
	}
	public String getPriceDay() {
		return priceDay;
	}
	public void setPriceDay(String priceDay) {
		this.priceDay = priceDay;
	}
	public String getPricePrice() {
		return pricePrice;
	}
	public void setPricePrice(String pricePrice) {
		this.pricePrice = pricePrice;
	}
	public String getUnitPriceId() {
		return unitPriceId;
	}
	public void setUnitPriceId(String unitPriceId) {
		this.unitPriceId = unitPriceId;
	}
	public String getUnitPriceRegDate() {
		return unitPriceRegDate;
	}
	public void setUnitPriceRegDate(String unitPriceRegDate) {
		this.unitPriceRegDate = unitPriceRegDate;
	}
	public String getUnitPriceUpdate() {
		return unitPriceUpdate;
	}
	public void setUnitPriceUpdate(String unitPriceUpdate) {
		this.unitPriceUpdate = unitPriceUpdate;
	}
	@Override
	public String toString() {
		return "Price [priceCode=" + priceCode + ", priceName=" + priceName + ", wareHouseType=" + wareHouseType
				+ ", contractType=" + contractType + ", priceWeight=" + priceWeight + ", priceNumber=" + priceNumber
				+ ", priceZone=" + priceZone + ", priceDay=" + priceDay + ", pricePrice=" + pricePrice
				+ ", unitPriceId=" + unitPriceId + ", unitPriceRegDate=" + unitPriceRegDate + ", unitPriceUpdate="
				+ unitPriceUpdate + "]";
	}
	
	
	
	
}
