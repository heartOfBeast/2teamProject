package com.cafe2team.domain;

public class WareSector {
	
	private String sectorCode;
	private String sectorName;
	private String sectorAvailSpace;
	private String sectorColumnCode;
	private String sectorColumnSize;
	private String sectorColumnFinalCode;
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
	public String getSectorAvailSpace() {
		return sectorAvailSpace;
	}
	public void setSectorAvailSpace(String sectorAvailSpace) {
		this.sectorAvailSpace = sectorAvailSpace;
	}
	public String getSectorColumnCode() {
		return sectorColumnCode;
	}
	public void setSectorColumnCode(String sectorColumnCode) {
		this.sectorColumnCode = sectorColumnCode;
	}
	public String getSectorColumnSize() {
		return sectorColumnSize;
	}
	public void setSectorColumnSize(String sectorColumnSize) {
		this.sectorColumnSize = sectorColumnSize;
	}
	public String getSectorColumnFinalCode() {
		return sectorColumnFinalCode;
	}
	public void setSectorColumnFinalCode(String sectorColumnFinalCode) {
		this.sectorColumnFinalCode = sectorColumnFinalCode;
	}
	@Override
	public String toString() {
		return "WareSector [sectorCode=" + sectorCode + ", sectorName=" + sectorName + ", sectorAvailSpace="
				+ sectorAvailSpace + ", sectorColumnCode=" + sectorColumnCode + ", sectorColumnSize=" + sectorColumnSize
				+ ", sectorColumnFinalCode=" + sectorColumnFinalCode + "]";
	}
	
	
	
}
