package com.cafe2team.domain;

public class Calendar {
	private String contractFinalUserName;
	private String contractFinalStart;
	private String contractFinalEnd;
	public String getContractFinalUserName() {
		return contractFinalUserName;
	}
	public void setContractFinalUserName(String contractFinalUserName) {
		this.contractFinalUserName = contractFinalUserName;
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
		return "Calendar [contractFinalUserName=" + contractFinalUserName + ", contractFinalStart=" + contractFinalStart
				+ ", contractFinalEnd=" + contractFinalEnd + "]";
	}

	
	
	
}
