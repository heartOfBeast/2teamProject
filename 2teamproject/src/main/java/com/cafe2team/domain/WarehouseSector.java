package com.cafe2team.domain;

public class WarehouseSector {
	private String sectorCode;
	private String sectorName;
	private String sectorAvailble;
	private String sectorRegDate;
	private String wareAdminId;
	private String memberId;
	private String sectorUsing;
	private String sectorPCode;
	
	public String getSectorCode() {
		return sectorCode;
	}
	public void setSectorCode(String sectorCode) {
		this.sectorCode = sectorCode;
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
	public String getWareAdminId() {
		return wareAdminId;
	}
	public void setWareAdminId(String wareAdminId) {
		this.wareAdminId = wareAdminId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
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
	@Override
	public String toString() {
		return "WarehouseSector [sectorCode=" + sectorCode + ", sectorName=" + sectorName + ", sectorAvailble="
				+ sectorAvailble + ", sectorRegDate=" + sectorRegDate + ", wareAdminId=" + wareAdminId + ", memberId="
				+ memberId + ", sectorUsing=" + sectorUsing + ", sectorPCode=" + sectorPCode + "]";
	}

}
