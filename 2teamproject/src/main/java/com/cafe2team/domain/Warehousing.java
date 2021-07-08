package com.cafe2team.domain;

public class Warehousing {
	private String warehousingOrderCode;
	private String warehousingRequestCode;
	private String productCode;
	private String productName;
	private String warehouseCode;
	private String sectorColumnFinalCode;
	private String warehousingOrderRequestAmount;
	private String shoppingmallUserId;
	private String shoppingmallName;
	private String warehousingLotNumber;
	private String warehousingBarcode;
	private String warehousingProductManufactureDate;
	private String warehousingProductExpirationDate;
	private String warehousingOrderDueDate;
	private String wareAdminId;
	
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
	public String getWarehousingOrderRequestAmount() {
		return warehousingOrderRequestAmount;
	}
	public void setWarehousingOrderRequestAmount(String warehousingOrderRequestAmount) {
		this.warehousingOrderRequestAmount = warehousingOrderRequestAmount;
	}
	public String getShoppingmallUserId() {
		return shoppingmallUserId;
	}
	public void setShoppingmallUserId(String shoppingmallUserId) {
		this.shoppingmallUserId = shoppingmallUserId;
	}
	public String getShoppingmallName() {
		return shoppingmallName;
	}
	public void setShoppingmallName(String shoppingmallName) {
		this.shoppingmallName = shoppingmallName;
	}
	public String getWarehousingLotNumber() {
		return warehousingLotNumber;
	}
	public void setWarehousingLotNumber(String warehousingLotNumber) {
		this.warehousingLotNumber = warehousingLotNumber;
	}
	public String getWarehousingBarcode() {
		return warehousingBarcode;
	}
	public void setWarehousingBarcode(String warehousingBarcode) {
		this.warehousingBarcode = warehousingBarcode;
	}
	public String getWarehousingProductManufactureDate() {
		return warehousingProductManufactureDate;
	}
	public void setWarehousingProductManufactureDate(String warehousingProductManufactureDate) {
		this.warehousingProductManufactureDate = warehousingProductManufactureDate;
	}
	public String getWarehousingProductExpirationDate() {
		return warehousingProductExpirationDate;
	}
	public void setWarehousingProductExpirationDate(String warehousingProductExpirationDate) {
		this.warehousingProductExpirationDate = warehousingProductExpirationDate;
	}
	public String getWarehousingOrderDueDate() {
		return warehousingOrderDueDate;
	}
	public void setWarehousingOrderDueDate(String warehousingOrderDueDate) {
		this.warehousingOrderDueDate = warehousingOrderDueDate;
	}
	public String getWareAdminId() {
		return wareAdminId;
	}
	public void setWareAdminId(String wareAdminId) {
		this.wareAdminId = wareAdminId;
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
		return "Warehousing [warehousingOrderCode=" + warehousingOrderCode + ", warehousingRequestCode="
				+ warehousingRequestCode + ", productCode=" + productCode + ", productName=" + productName
				+ ", warehouseCode=" + warehouseCode + ", sectorColumnFinalCode=" + sectorColumnFinalCode
				+ ", warehousingOrderRequestAmount=" + warehousingOrderRequestAmount + ", shoppingmallUserId="
				+ shoppingmallUserId + ", shoppingmallName=" + shoppingmallName + ", warehousingLotNumber="
				+ warehousingLotNumber + ", warehousingBarcode=" + warehousingBarcode
				+ ", warehousingProductManufactureDate=" + warehousingProductManufactureDate
				+ ", warehousingProductExpirationDate=" + warehousingProductExpirationDate
				+ ", warehousingOrderDueDate=" + warehousingOrderDueDate + ", wareAdminId=" + wareAdminId + ", item="
				+ item + ", product=" + product + ", shoppingmall=" + shoppingmall + ", wareAdmin=" + wareAdmin
				+ ", warehouse=" + warehouse + "]";
	}

}
