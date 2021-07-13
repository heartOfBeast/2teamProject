package com.cafe2team.domain;

public class Calendar {
	private String contractFinalUserName;
	private String contractFinalPriceName;
	private String contractFinalStart;
	private String contractFinalEnd;

	public String getContractFinalUserName() {
		return contractFinalUserName;
	}
	public void setContractFinalUserName(String contractFinalUserName) {
		this.contractFinalUserName = contractFinalUserName;
	}
	public String getContractFinalPriceName() {
		return contractFinalPriceName;
	}
	public void setContractFinalPriceName(String contractFinalPriceName) {
		this.contractFinalPriceName = contractFinalPriceName;
	}
	public String getContractFinalStart() {
		return contractFinalStart;
	}
	public void setContractFinalStart(String contractFinalStart) {
		this.contractFinalStart = contractFinalStart;
	}
	public String getContractFinalEnd() {
		return contractFinalEnd;
	}
	public void setContractFinalEnd(String contractFinalEnd) {
		this.contractFinalEnd = contractFinalEnd;
	}

	@Override
	public String toString() {
		return "Calendar [contractFinalUserName=" + contractFinalUserName + ", contractFinalPriceName="
				+ contractFinalPriceName + ", contractFinalStart=" + contractFinalStart + ", contractFinalEnd="
				+ contractFinalEnd + "]";
	}
	
	
}
