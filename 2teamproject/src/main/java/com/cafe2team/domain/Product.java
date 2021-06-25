package com.cafe2team.domain;



public class Product {

	private String productCode;
	private String productFreezeCoolCondition;
	private String productBigCategory;
	private String productMiddleCategory;
	private String productSmallCategory;
	private String productAddCategory;
	private String productName;
	private String productWeight;
	private String productWeightUnit;
	private String productDateOfManufacture;
	private String productExpirationDate;
	private String shoppingmallUserId;
	private String productRegDate;
	private String productDetail;
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductFreezeCoolCondition() {
		return productFreezeCoolCondition;
	}
	public void setProductFreezeCoolCondition(String productFreezeCoolCondition) {
		this.productFreezeCoolCondition = productFreezeCoolCondition;
	}
	public String getProductBigCategory() {
		return productBigCategory;
	}
	public void setProductBigCategory(String productBigCategory) {
		this.productBigCategory = productBigCategory;
	}
	public String getProductMiddleCategory() {
		return productMiddleCategory;
	}
	public void setProductMiddleCategory(String productMiddleCategory) {
		this.productMiddleCategory = productMiddleCategory;
	}
	public String getProductSmallCategory() {
		return productSmallCategory;
	}
	public void setProductSmallCategory(String productSmallCategory) {
		this.productSmallCategory = productSmallCategory;
	}
	public String getProductAddCategory() {
		return productAddCategory;
	}
	public void setProductAddCategory(String productAddCategory) {
		this.productAddCategory = productAddCategory;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductWeight() {
		return productWeight;
	}
	public void setProductWeight(String productWeight) {
		this.productWeight = productWeight;
	}
	public String getProductWeightUnit() {
		return productWeightUnit;
	}
	public void setProductWeightUnit(String productWeightUnit) {
		this.productWeightUnit = productWeightUnit;
	}
	public String getProductDateOfManufacture() {
		return productDateOfManufacture;
	}
	public void setProductDateOfManufacture(String productDateOfManufacture) {
		this.productDateOfManufacture = productDateOfManufacture;
	}
	public String getProductExpirationDate() {
		return productExpirationDate;
	}
	public void setProductExpirationDate(String productExpirationDate) {
		this.productExpirationDate = productExpirationDate;
	}
	public String getShoppingmallUserId() {
		return shoppingmallUserId;
	}
	public void setShoppingmallUserId(String shoppingmallUserId) {
		this.shoppingmallUserId = shoppingmallUserId;
	}
	public String getProductRegDate() {
		return productRegDate;
	}
	public void setProductRegDate(String productRegDate) {
		this.productRegDate = productRegDate;
	}
	public String getProductDetail() {
		return productDetail;
	}
	public void setProductDetail(String productDetail) {
		this.productDetail = productDetail;
	}
	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productFreezeCoolCondition=" + productFreezeCoolCondition
				+ ", productBigCategory=" + productBigCategory + ", productMiddleCategory=" + productMiddleCategory
				+ ", productSmallCategory=" + productSmallCategory + ", productAddCategory=" + productAddCategory
				+ ", productName=" + productName + ", productWeight=" + productWeight + ", productWeightUnit="
				+ productWeightUnit + ", productDateOfManufacture=" + productDateOfManufacture
				+ ", productExpirationDate=" + productExpirationDate + ", shoppingmallUserId=" + shoppingmallUserId
				+ ", productRegDate=" + productRegDate + ", productDetail=" + productDetail + "]";
	}

}
