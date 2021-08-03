package com.cafe2team.domain;

public class Release {	
	private String releaseOrderCode;
	private String releaseCode;
	private String warehouseCode;
	private String productCode;
	private int releaseOrderQuantity;
	private String recipientName;
	private String recipientAddress;
	private String recipientPhone;
	private String shoppingmallUserId;
	private String orderRegDate;

	private Delivery delivery;

	private Shoppingmall shoppingmall;
	
	private Product product;
	
	private CarManagement carManagement;
	
	private Invoice invoice;
	
	private ReleaseInfo releaseInfo;
	
	private String warehouseName;
	
	private String releasesRequestCode;
	
	private String releasesFinalSector;
	
	
	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public String getReleaseOrderCode() {
		return releaseOrderCode;
	}

	public void setReleaseOrderCode(String releaseOrderCode) {
		this.releaseOrderCode = releaseOrderCode;
	}

	public String getReleaseCode() {
		return releaseCode;
	}

	public void setReleaseCode(String releaseCode) {
		this.releaseCode = releaseCode;
	}

	public String getWarehouseCode() {
		return warehouseCode;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public int getReleaseOrderQuantity() {
		return releaseOrderQuantity;
	}

	public void setReleaseOrderQuantity(int releaseOrderQuantity) {
		this.releaseOrderQuantity = releaseOrderQuantity;
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

	public String getShoppingmallUserId() {
		return shoppingmallUserId;
	}

	public void setShoppingmallUserId(String shoppingmallUserId) {
		this.shoppingmallUserId = shoppingmallUserId;
	}

	public String getOrderRegDate() {
		return orderRegDate;
	}

	public void setOrderRegDate(String orderRegDate) {
		this.orderRegDate = orderRegDate;
	}

	public Delivery getDelivery() {
		return delivery;
	}

	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}

	public Shoppingmall getShoppingmall() {
		return shoppingmall;
	}

	public void setShoppingmall(Shoppingmall shoppingmall) {
		this.shoppingmall = shoppingmall;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public CarManagement getCarManagement() {
		return carManagement;
	}

	public void setCarManagement(CarManagement carManagement) {
		this.carManagement = carManagement;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public ReleaseInfo getReleaseInfo() {
		return releaseInfo;
	}

	public void setReleaseInfo(ReleaseInfo releaseInfo) {
		this.releaseInfo = releaseInfo;
	}

	public String getReleasesRequestCode() {
		return releasesRequestCode;
	}

	public void setReleasesRequestCode(String releasesRequestCode) {
		this.releasesRequestCode = releasesRequestCode;
	}

	public String getReleasesFinalSector() {
		return releasesFinalSector;
	}

	public void setReleasesFinalSector(String releasesFinalSector) {
		this.releasesFinalSector = releasesFinalSector;
	}

	@Override
	public String toString() {
		return "Release [releaseOrderCode=" + releaseOrderCode + ", releaseCode=" + releaseCode + ", warehouseCode="
				+ warehouseCode + ", productCode=" + productCode + ", releaseOrderQuantity=" + releaseOrderQuantity
				+ ", recipientName=" + recipientName + ", recipientAddress=" + recipientAddress + ", recipientPhone="
				+ recipientPhone + ", shoppingmallUserId=" + shoppingmallUserId + ", orderRegDate=" + orderRegDate
				+ ", delivery=" + delivery + ", shoppingmall=" + shoppingmall + ", product=" + product
				+ ", carManagement=" + carManagement + ", invoice=" + invoice + ", releaseInfo=" + releaseInfo
				+ ", warehouseName=" + warehouseName + ", releasesRequestCode=" + releasesRequestCode
				+ ", releasesFinalSector=" + releasesFinalSector + "]";
	}

}
