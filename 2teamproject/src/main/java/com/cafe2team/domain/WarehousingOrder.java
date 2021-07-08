package com.cafe2team.domain;

public class WarehousingOrder {
	private String warehousingOrderCode;
	private String warehousingRequestCode;
	private String productCode;
	private String productName;
	private String warehouseCode;
	private String sectorColumnFinalCode;
	private String shoppingmallUserId;
	private String warehousingBarcode;
	private String warehousingOrderDueDate;
	private String warehousingOrderAmount;
	private String wareAdminId;
	private String warehousingOrderStatus;
	
	
	private Item item;
	private Product product;
	private Shoppingmall shoppingmall;
	private WareAdmin wareAdmin;
	private Warehouse	warehouse;
	public String getWarehousingOrderCode() {
		return warehousingOrderCode;
	}
	public void setWarehousingOrderCode(String warehousingOrderCode) {
		this.warehousingOrderCode = warehousingOrderCode;
	}
	public String getWarehousingRequestCode() {
		return warehousingRequestCode;
	}
	public void setWarehousingRequestCode(String warehousingRequestCode) {
		this.warehousingRequestCode = warehousingRequestCode;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getWarehouseCode() {
		return warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
	public String getSectorColumnFinalCode() {
		return sectorColumnFinalCode;
	}
	public void setSectorColumnFinalCode(String sectorColumnFinalCode) {
		this.sectorColumnFinalCode = sectorColumnFinalCode;
	}
	public String getShoppingmallUserId() {
		return shoppingmallUserId;
	}
	public void setShoppingmallUserId(String shoppingmallUserId) {
		this.shoppingmallUserId = shoppingmallUserId;
	}
	public String getWarehousingBarcode() {
		return warehousingBarcode;
	}
	public void setWarehousingBarcode(String warehousingBarcode) {
		this.warehousingBarcode = warehousingBarcode;
	}
	public String getWarehousingOrderDueDate() {
		return warehousingOrderDueDate;
	}
	public void setWarehousingOrderDueDate(String warehousingOrderDueDate) {
		this.warehousingOrderDueDate = warehousingOrderDueDate;
	}
	public String getWarehousingOrderAmount() {
		return warehousingOrderAmount;
	}
	public void setWarehousingOrderAmount(String warehousingOrderAmount) {
		this.warehousingOrderAmount = warehousingOrderAmount;
	}
	public String getWareAdminId() {
		return wareAdminId;
	}
	public void setWareAdminId(String wareAdminId) {
		this.wareAdminId = wareAdminId;
	}
	public String getWarehousingOrderStatus() {
		return warehousingOrderStatus;
	}
	public void setWarehousingOrderStatus(String warehousingOrderStatus) {
		this.warehousingOrderStatus = warehousingOrderStatus;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Shoppingmall getShoppingmall() {
		return shoppingmall;
	}
	public void setShoppingmall(Shoppingmall shoppingmall) {
		this.shoppingmall = shoppingmall;
	}
	public WareAdmin getWareAdmin() {
		return wareAdmin;
	}
	public void setWareAdmin(WareAdmin wareAdmin) {
		this.wareAdmin = wareAdmin;
	}
	public Warehouse getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}
	@Override
	public String toString() {
		return "WarehousingOrder [warehousingOrderCode=" + warehousingOrderCode + ", warehousingRequestCode="
				+ warehousingRequestCode + ", productCode=" + productCode + ", productName=" + productName
				+ ", warehouseCode=" + warehouseCode + ", sectorColumnFinalCode=" + sectorColumnFinalCode
				+ ", shoppingmallUserId=" + shoppingmallUserId + ", warehousingBarcode=" + warehousingBarcode
				+ ", warehousingOrderDueDate=" + warehousingOrderDueDate + ", warehousingOrderAmount="
				+ warehousingOrderAmount + ", wareAdminId=" + wareAdminId + ", warehousingOrderStatus="
				+ warehousingOrderStatus + ", item=" + item + ", product=" + product + ", shoppingmall=" + shoppingmall
				+ ", wareAdmin=" + wareAdmin + ", warehouse=" + warehouse + "]";
	}

}
