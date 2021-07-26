package com.cafe2team.domain;

public class Receiving {

	private String receivingingCode;
	private String warehousingOrderCode;
	private String warehouseCode;
	private String warehousingOrderDueDate;
	private String warehousingOrderAmount;
	private String warehousingRealDate;
	private String warehousingRealAmount;
	private String shoppingmallId;
	private String warehousingRegDate;
	private String wareAdminId;
	private String productCode;
	private String stockCode;
	private String sectorColumnFinalCode;
	private String stockAmount;
	private String memberId;
	
	private WarehousingOrder warehousingOrder;
	private Warehouse warehouse;
	private Shoppingmall shoppingmall;
	private WareAdmin wareAdmin;
	private Product product;
	private Stock stock;
	private Member member;
	public String getReceivingingCode() {
		return receivingingCode;
	}
	public void setReceivingingCode(String receivingingCode) {
		this.receivingingCode = receivingingCode;
	}
	public String getWarehousingOrderCode() {
		return warehousingOrderCode;
	}
	public void setWarehousingOrderCode(String warehousingOrderCode) {
		this.warehousingOrderCode = warehousingOrderCode;
	}
	public String getWarehouseCode() {
		return warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
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
	public String getWarehousingRealDate() {
		return warehousingRealDate;
	}
	public void setWarehousingRealDate(String warehousingRealDate) {
		this.warehousingRealDate = warehousingRealDate;
	}
	public String getWarehousingRealAmount() {
		return warehousingRealAmount;
	}
	public void setWarehousingRealAmount(String warehousingRealAmount) {
		this.warehousingRealAmount = warehousingRealAmount;
	}
	public String getShoppingmallId() {
		return shoppingmallId;
	}
	public void setShoppingmallId(String shoppingmallId) {
		this.shoppingmallId = shoppingmallId;
	}
	public String getWarehousingRegDate() {
		return warehousingRegDate;
	}
	public void setWarehousingRegDate(String warehousingRegDate) {
		this.warehousingRegDate = warehousingRegDate;
	}
	public String getWareAdminId() {
		return wareAdminId;
	}
	public void setWareAdminId(String wareAdminId) {
		this.wareAdminId = wareAdminId;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getSectorColumnFinalCode() {
		return sectorColumnFinalCode;
	}
	public void setSectorColumnFinalCode(String sectorColumnFinalCode) {
		this.sectorColumnFinalCode = sectorColumnFinalCode;
	}
	public WarehousingOrder getWarehousingOrder() {
		return warehousingOrder;
	}
	public void setWarehousingOrder(WarehousingOrder warehousingOrder) {
		this.warehousingOrder = warehousingOrder;
	}
	public Warehouse getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
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
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public String getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(String stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	@Override
	public String toString() {
		return "Receiving [receivingingCode=" + receivingingCode + ", warehousingOrderCode=" + warehousingOrderCode
				+ ", warehouseCode=" + warehouseCode + ", warehousingOrderDueDate=" + warehousingOrderDueDate
				+ ", warehousingOrderAmount=" + warehousingOrderAmount + ", warehousingRealDate=" + warehousingRealDate
				+ ", warehousingRealAmount=" + warehousingRealAmount + ", shoppingmallId=" + shoppingmallId
				+ ", warehousingRegDate=" + warehousingRegDate + ", wareAdminId=" + wareAdminId + ", productCode="
				+ productCode + ", stockCode=" + stockCode + ", sectorColumnFinalCode=" + sectorColumnFinalCode
				+ ", stockAmount=" + stockAmount + ", memberId=" + memberId + ", warehousingOrder=" + warehousingOrder
				+ ", warehouse=" + warehouse + ", shoppingmall=" + shoppingmall + ", wareAdmin=" + wareAdmin
				+ ", product=" + product + ", stock=" + stock + ", member=" + member + "]";
	}
	
	

}
