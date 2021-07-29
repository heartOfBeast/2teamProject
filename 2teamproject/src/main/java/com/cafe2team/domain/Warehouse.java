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
	private String warehouseLat;
	private String warehouseLon;
	
	private String sectorCode;
	private String sectorName;
	private String sectorAvailble;
	private String sectorRegDate;
	private String wareSectorAdminId;
	private String sectorUsing;
	private String sectorPCode;
	
	private String finalSectorCode;
	private String finalSectorWareCode;
	private String finalSectorSectorCode;
	private String finalSectorMemberId;
	private String finalSectorRegDate;
	private String finalSectorRegId;
	
	
	public String getSectorCode() {
		return sectorCode;
	}
	public void setSectorCode(String sectorCode) {
		this.sectorCode = sectorCode;
	}
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
	public String getSectorName() {
		return sectorName;
	}
	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}
	public String getSectorAvailble() {
		return sectorAvailble;
	}
	public void setSectorAvailble(String sectorAvailble) {
		this.sectorAvailble = sectorAvailble;
	}
	public String getSectorRegDate() {
		return sectorRegDate;
	}
	public void setSectorRegDate(String sectorRegDate) {
		this.sectorRegDate = sectorRegDate;
	}
	public String getWareSectorAdminId() {
		return wareSectorAdminId;
	}
	public void setWareSectorAdminId(String wareSectorAdminId) {
		this.wareSectorAdminId = wareSectorAdminId;
	}
	public String getSectorUsing() {
		return sectorUsing;
	}
	public void setSectorUsing(String sectorUsing) {
		this.sectorUsing = sectorUsing;
	}
	public String getSectorPCode() {
		return sectorPCode;
	}
	public void setSectorPCode(String sectorPCode) {
		this.sectorPCode = sectorPCode;
	}

	public String getWarehouseLat() {
		return warehouseLat;
	}
	public void setWarehouseLat(String warehouseLat) {
		this.warehouseLat = warehouseLat;
	}
	public String getWarehouseLon() {
		return warehouseLon;
	}
	public void setWarehouseLon(String warehouseLon) {
		this.warehouseLon = warehouseLon;
	}
	public String getFinalSectorRegId() {
		return finalSectorRegId;
	}
	public void setFinalSectorRegId(String finalSectorRegId) {
		this.finalSectorRegId = finalSectorRegId;
	}
	public String getFinalSectorCode() {
		return finalSectorCode;
	}
	public void setFinalSectorCode(String finalSectorCode) {
		this.finalSectorCode = finalSectorCode;
	}
	public String getFinalSectorWareCode() {
		return finalSectorWareCode;
	}
	public void setFinalSectorWareCode(String finalSectorWareCode) {
		this.finalSectorWareCode = finalSectorWareCode;
	}
	public String getFinalSectorSectorCode() {
		return finalSectorSectorCode;
	}
	public void setFinalSectorSectorCode(String finalSectorSectorCode) {
		this.finalSectorSectorCode = finalSectorSectorCode;
	}
	public String getFinalSectorMemberId() {
		return finalSectorMemberId;
	}
	public void setFinalSectorMemberId(String finalSectorMemberId) {
		this.finalSectorMemberId = finalSectorMemberId;
	}
	public String getFinalSectorRegDate() {
		return finalSectorRegDate;
	}
	public void setFinalSectorRegDate(String finalSectorRegDate) {
		this.finalSectorRegDate = finalSectorRegDate;
	}
	@Override
	public String toString() {
		return "Warehouse [warehouseCode=" + warehouseCode + ", warehouseName=" + warehouseName + ", warehouseAddr="
				+ warehouseAddr + ", warehouseCate=" + warehouseCate + ", warehouseArea=" + warehouseArea
				+ ", warehousePhone=" + warehousePhone + ", warehouseRegNumber=" + warehouseRegNumber
				+ ", warehouseDetail=" + warehouseDetail + ", warehouseRegDate=" + warehouseRegDate + ", wareAdminId="
				+ wareAdminId + ", warehouseLat=" + warehouseLat + ", warehouseLon=" + warehouseLon + ", sectorCode="
				+ sectorCode + ", sectorName=" + sectorName + ", sectorAvailble=" + sectorAvailble + ", sectorRegDate="
				+ sectorRegDate + ", wareSectorAdminId=" + wareSectorAdminId + ", sectorUsing=" + sectorUsing
				+ ", sectorPCode=" + sectorPCode + ", finalSectorCode=" + finalSectorCode + ", finalSectorWareCode="
				+ finalSectorWareCode + ", finalSectorSectorCode=" + finalSectorSectorCode + ", finalSectorMemberId="
				+ finalSectorMemberId + ", finalSectorRegDate=" + finalSectorRegDate + ", finalSectorRegId="
				+ finalSectorRegId + "]";
	}


}
