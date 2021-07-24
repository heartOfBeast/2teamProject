package com.cafe2team.domain;

public class Vehicle {
	private String carCode;
	private String carKind;
	private String carStatus;
	private String carStatusDetail;
	private String carUsingYear;
	private String carNumber;
	private String carUsingStatus;
	private String wareAdminId;
	private String carRegDate;
	private String carUpdateDate;
	
	public String getCarCode() {
		return carCode;
	}
	public void setCarCode(String carCode) {
		this.carCode = carCode;
	}
	public String getCarKind() {
		return carKind;
	}
	public void setCarKind(String carKind) {
		this.carKind = carKind;
	}
	public String getCarStatus() {
		return carStatus;
	}
	public void setCarStatus(String carStatus) {
		this.carStatus = carStatus;
	}
	public String getCarStatusDetail() {
		return carStatusDetail;
	}
	public void setCarStatusDetail(String carStatusDetail) {
		this.carStatusDetail = carStatusDetail;
	}
	public String getCarUsingYear() {
		return carUsingYear;
	}
	public void setCarUsingYear(String carUsingYear) {
		this.carUsingYear = carUsingYear;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarUsingStatus() {
		return carUsingStatus;
	}
	public void setCarUsingStatus(String carUsingStatus) {
		this.carUsingStatus = carUsingStatus;
	}
	public String getWareAdminId() {
		return wareAdminId;
	}
	public void setWareAdminId(String wareAdminId) {
		this.wareAdminId = wareAdminId;
	}
	public String getCarRegDate() {
		return carRegDate;
	}
	public void setCarRegDate(String carRegDate) {
		this.carRegDate = carRegDate;
	}
	public String getCarUpdateDate() {
		return carUpdateDate;
	}
	public void setCarUpdateDate(String carUpdateDate) {
		this.carUpdateDate = carUpdateDate;
	}
	
	@Override
	public String toString() {
		return "Vehicle [carCode=" + carCode + ", carKind=" + carKind + ", carStatus=" + carStatus
				+ ", carStatusDetail=" + carStatusDetail + ", carUsingYear=" + carUsingYear + ", carNum=" + carNumber
				+ ", carUsingStatus=" + carUsingStatus + ", wareAdminId=" + wareAdminId + ", carRegDate=" + carRegDate
				+ ", carUpdateDate=" + carUpdateDate + "]";
	}
	
}
