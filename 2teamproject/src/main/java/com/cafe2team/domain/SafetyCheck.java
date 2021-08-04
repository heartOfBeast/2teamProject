package com.cafe2team.domain;

public class SafetyCheck {
	private String facilityCode;
	private String warehouseCode;
	private String facilityFiresafety;
	private String facilityLogistics;
	private String facilityMainEquipemnt;
	private String wareAdminId;
	private String facilityRegDate;
	private String facilityUpdateDate;
	private String facilityCheck;
	private String followUpAction;
	
	private Warehouse warehouse;

	
	

	public String getFollowUpAction() {
		return followUpAction;
	}

	public void setFollowUpAction(String followUpAction) {
		this.followUpAction = followUpAction;
	}

	public String getFacilityCode() {
		return facilityCode;
	}

	public void setFacilityCode(String facilityCode) {
		this.facilityCode = facilityCode;
	}

	public String getWarehouseCode() {
		return warehouseCode;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public String getFacilityFiresafety() {
		return facilityFiresafety;
	}

	public void setFacilityFiresafety(String facilityFiresafety) {
		this.facilityFiresafety = facilityFiresafety;
	}

	public String getFacilityLogistics() {
		return facilityLogistics;
	}

	public void setFacilityLogistics(String facilityLogistics) {
		this.facilityLogistics = facilityLogistics;
	}

	public String getFacilityMainEquipemnt() {
		return facilityMainEquipemnt;
	}

	public void setFacilityMainEquipemnt(String facilityMainEquipemnt) {
		this.facilityMainEquipemnt = facilityMainEquipemnt;
	}

	public String getWareAdminId() {
		return wareAdminId;
	}

	public void setWareAdminId(String wareAdminId) {
		this.wareAdminId = wareAdminId;
	}

	public String getFacilityRegDate() {
		return facilityRegDate;
	}

	public void setFacilityRegDate(String facilityRegDate) {
		this.facilityRegDate = facilityRegDate;
	}

	public String getFacilityUpdateDate() {
		return facilityUpdateDate;
	}

	public void setFacilityUpdateDate(String facilityUpdateDate) {
		this.facilityUpdateDate = facilityUpdateDate;
	}

	public String getFacilityCheck() {
		return facilityCheck;
	}

	public void setFacilityCheck(String facilityCheck) {
		this.facilityCheck = facilityCheck;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	@Override
	public String toString() {
		return "SafetyCheck [facilityCode=" + facilityCode + ", warehouseCode=" + warehouseCode
				+ ", facilityFiresafety=" + facilityFiresafety + ", facilityLogistics=" + facilityLogistics
				+ ", facilityMainEquipemnt=" + facilityMainEquipemnt + ", wareAdminId=" + wareAdminId
				+ ", facilityRegDate=" + facilityRegDate + ", facilityUpdateDate=" + facilityUpdateDate
				+ ", facilityCheck=" + facilityCheck + ", followUpAction=" + followUpAction + ", warehouse=" + warehouse
				+ "]";
	}
}
