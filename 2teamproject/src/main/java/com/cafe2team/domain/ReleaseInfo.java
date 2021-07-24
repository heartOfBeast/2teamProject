package com.cafe2team.domain;

public class ReleaseInfo {
	private String realReleaseCode;
	private String releaseOrderCode;
	private String warehouseCode;
	private String releasesFinalSector;
	private String releaseRealDate;
	private int releaseRealAmount;
	private String wareAdminId;
	private String releaseRegDate;
	private String productCode;
	private String releaseRequestCode;
	
	private CarManagement carManagement;
	
	private Product product;
	
	private Vehicle vehicle;
	
	private Invoice invoice;
	
	private Delivery delivery;
	
	private Warehouse warehouse;
	
	private Release release;
	
	
	public Release getRelease() {
		return release;
	}
	public void setRelease(Release release) {
		this.release = release;
	}
	public Warehouse getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}
	public String getReleasesFinalSector() {
		return releasesFinalSector;
	}
	public void setReleasesFinalSector(String releasesFinalSector) {
		this.releasesFinalSector = releasesFinalSector;
	}
	public CarManagement getCarManagement() {
		return carManagement;
	}
	public void setCarManagement(CarManagement carManagement) {
		this.carManagement = carManagement;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	public Delivery getDelivery() {
		return delivery;
	}
	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}
	public String getRealReleaseCode() {
		return realReleaseCode;
	}
	public void setRealReleaseCode(String realReleaseCode) {
		this.realReleaseCode = realReleaseCode;
	}
	public String getReleaseOrderCode() {
		return releaseOrderCode;
	}
	public void setReleaseOrderCode(String releaseOrderCode) {
		this.releaseOrderCode = releaseOrderCode;
	}
	public String getWarehouseCode() {
		return warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
	public String getReleaseRealDate() {
		return releaseRealDate;
	}
	public void setReleaseRealDate(String releaseRealDate) {
		this.releaseRealDate = releaseRealDate;
	}
	public int getReleaseRealAmount() {
		return releaseRealAmount;
	}
	public void setReleaseRealAmount(int releaseRealAmount) {
		this.releaseRealAmount = releaseRealAmount;
	}
	public String getWareAdminId() {
		return wareAdminId;
	}
	public void setWareAdminId(String wareAdminId) {
		this.wareAdminId = wareAdminId;
	}
	public String getReleaseRegDate() {
		return releaseRegDate;
	}
	public void setReleaseRegDate(String releaseRegDate) {
		this.releaseRegDate = releaseRegDate;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getReleaseRequestCode() {
		return releaseRequestCode;
	}
	public void setReleaseRequestCode(String releaseRequestCode) {
		this.releaseRequestCode = releaseRequestCode;
	}
	
	@Override
	public String toString() {
		return "ReleaseInfo [realReleaseCode=" + realReleaseCode + ", releaseOrderCode=" + releaseOrderCode
				+ ", warehouseCode=" + warehouseCode + ", releasesFinalSector=" + releasesFinalSector
				+ ", releaseRealDate=" + releaseRealDate + ", releaseRealAmount=" + releaseRealAmount + ", wareAdminId="
				+ wareAdminId + ", releaseRegDate=" + releaseRegDate + ", productCode=" + productCode
				+ ", releaseRequestCode=" + releaseRequestCode + ", carManagement=" + carManagement + ", product="
				+ product + ", vehicle=" + vehicle + ", invoice=" + invoice + ", delivery=" + delivery + ", warehouse="
				+ warehouse + ", release=" + release + "]";
	}
	
}
