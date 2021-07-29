package com.cafe2team.domain;

public class WarehouseFinalSector {
	private String finalSectorCode;
	private String finalSectorWareCode;
	private String finalSectorSectorCode;
	private String finalSectorMemberId;
	private String finalSectorRegDate;
	private String finalSectorRegId;
	
	
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
	public String getFinalSectorRegId() {
		return finalSectorRegId;
	}
	public void setFinalSectorRegId(String finalSectorRegId) {
		this.finalSectorRegId = finalSectorRegId;
	}
	@Override
	public String toString() {
		return "WarehouseFinalSector [finalSectorCode=" + finalSectorCode + ", finalSectorWareCode="
				+ finalSectorWareCode + ", finalSectorSectorCode=" + finalSectorSectorCode + ", finalSectorMemberId="
				+ finalSectorMemberId + ", finalSectorRegDate=" + finalSectorRegDate + ", finalSectorRegId="
				+ finalSectorRegId + "]";
	}
	

}
