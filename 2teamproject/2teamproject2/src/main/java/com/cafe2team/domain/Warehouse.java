package com.cafe2team.domain;

public class Warehouse {
	private String warehouseCode;
	private String warehouseName;
	private String warehouseAddr;
	private String warehouseCate;
	private String warehouseArea;
	private String warehousePhone;
	private String warehouseRegNumber;
	private String warehouseDetail;
	private String warehouseRegDate;
	private String wareAdminId;
	
	public String getWarehouseCode() {
		return warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
	public String getWarehouseName() {
		return warehouseName;
	}
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}
	public String getWarehouseAddr() {
		return warehouseAddr;
	}
	public void setWarehouseAddr(String warehouseAddr) {
		this.warehouseAddr = warehouseAddr;
	}
	public String getWarehouseCate() {
		return warehouseCate;
	}
	public void setWarehouseCate(String warehouseCate) {
		this.warehouseCate = warehouseCate;
	}
	public String getWarehouseArea() {
		return warehouseArea;
	}
	public void setWarehouseArea(String warehouseArea) {
		this.warehouseArea = warehouseArea;
	}
	public String getWarehousePhone() {
		return warehousePhone;
	}
	public void setWarehousePhone(String warehousePhone) {
		this.warehousePhone = warehousePhone;
	}
	public String getWarehouseRegNumber() {
		return warehouseRegNumber;
	}
	public void setWarehouseRegNumber(String warehouseRegNumber) {
		this.warehouseRegNumber = warehouseRegNumber;
	}
	public String getWarehouseDetail() {
		return warehouseDetail;
	}
	public void setWarehouseDetail(String warehouseDetail) {
		this.warehouseDetail = warehouseDetail;
	}
	public String getWarehouseRegDate() {
		return warehouseRegDate;
	}
	public void setWarehouseRegDate(String warehouseRegDate) {
		this.warehouseRegDate = warehouseRegDate;
	}
	public String getWareAdminId() {
		return wareAdminId;
	}
	public void setWareAdminId(String wareAdminId) {
		this.wareAdminId = wareAdminId;
	}
	@Override
	public String toString() {
		return "Warehouse [warehouseCode=" + warehouseCode + ", warehouseName=" + warehouseName + ", warehouseAddr="
				+ warehouseAddr + ", warehouseCate=" + warehouseCate + ", warehouseArea=" + warehouseArea
				+ ", warehousePhone=" + warehousePhone + ", warehouseRegNumber=" + warehouseRegNumber
				+ ", warehouseDetail=" + warehouseDetail + ", warehouseRegDate=" + warehouseRegDate + ", wareAdminId="
				+ wareAdminId + "]";
	}
	

}
