package com.cafe2team.domain;



public class Product {

	private String productCode;
	private String productFreezeCoolCondition;
	private String productCategory;
	private String productAddCategory;
	private String productName;
	private String productWeight;
	private String productWeightUnit;
	private String productDateOfManufacture;
	private String productExpirationDate;
	private String shoppingmallUserId;
	private String productRegDate;
	private String productDetail;
	
	private Shoppingmall shoppingmall;
	private Item item;
	private WareSector wareSector;
	private Stock stock;
	private Warehouse warehouse;
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
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
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
	public Shoppingmall getShoppingmall() {
		return shoppingmall;
	}
	public void setShoppingmall(Shoppingmall shoppingmall) {
		this.shoppingmall = shoppingmall;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public WareSector getWareSector() {
		return wareSector;
	}
	public void setWareSector(WareSector wareSector) {
		this.wareSector = wareSector;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public Warehouse getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}
	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productFreezeCoolCondition=" + productFreezeCoolCondition
				+ ", productCategory=" + productCategory + ", productAddCategory=" + productAddCategory
				+ ", productName=" + productName + ", productWeight=" + productWeight + ", productWeightUnit="
				+ productWeightUnit + ", productDateOfManufacture=" + productDateOfManufacture
				+ ", productExpirationDate=" + productExpirationDate + ", shoppingmallUserId=" + shoppingmallUserId
				+ ", productRegDate=" + productRegDate + ", productDetail=" + productDetail + ", shoppingmall="
				+ shoppingmall + ", item=" + item + ", wareSector=" + wareSector + ", stock=" + stock + ", warehouse="
				+ warehouse + "]";
	}
	
	
	
}
