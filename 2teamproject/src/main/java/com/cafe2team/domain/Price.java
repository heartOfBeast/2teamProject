package com.cafe2team.domain;

public class Price {
	private String price_Code;
	private String wareHouse_Type;
	private String contract_Type;
	private String price_Weight;
	private String price_Number;
	private String price_Zone;
	private String price_Day;
	private String price_Price;
	private String unit_Id;
	private String unit_reg_date;
	private String unit_price_update;
	
	public String getPrice_Code() {
		return price_Code;
	}
	public void setPrice_Code(String price_Code) {
		this.price_Code = price_Code;
	}
	public String getWareHouse_Type() {
		return wareHouse_Type;
	}
	public void setWareHouse_Type(String wareHouse_Type) {
		this.wareHouse_Type = wareHouse_Type;
	}
	public String getContract_Type() {
		return contract_Type;
	}
	public void setContract_Type(String contract_Type) {
		this.contract_Type = contract_Type;
	}
	public String getPrice_Weight() {
		return price_Weight;
	}
	public void setPrice_Weight(String price_Weight) {
		this.price_Weight = price_Weight;
	}
	public String getPrice_Number() {
		return price_Number;
	}
	public void setPrice_Number(String price_Number) {
		this.price_Number = price_Number;
	}
	public String getPrice_Zone() {
		return price_Zone;
	}
	public void setPrice_Zone(String price_Zone) {
		this.price_Zone = price_Zone;
	}
	public String getPrice_Day() {
		return price_Day;
	}
	public void setPrice_Day(String price_Day) {
		this.price_Day = price_Day;
	}
	public String getPrice_Price() {
		return price_Price;
	}
	public void setPrice_Price(String price_Price) {
		this.price_Price = price_Price;
	}
	public String getUnit_Id() {
		return unit_Id;
	}
	public void setUnit_Id(String unit_Id) {
		this.unit_Id = unit_Id;
	}
	public String getUnit_reg_date() {
		return unit_reg_date;
	}
	public void setUnit_reg_date(String unit_reg_date) {
		this.unit_reg_date = unit_reg_date;
	}
	public String getUnit_price_update() {
		return unit_price_update;
	}
	public void setUnit_price_update(String unit_price_update) {
		this.unit_price_update = unit_price_update;
	}
	
	@Override
	public String toString() {
		return "Price [price_Code=" + price_Code + ", wareHouse_Type=" + wareHouse_Type + ", contract_Type="
				+ contract_Type + ", price_Weight=" + price_Weight + ", price_Number=" + price_Number + ", price_Zone="
				+ price_Zone + ", price_Day=" + price_Day + ", price_Price=" + price_Price + ", unit_Id=" + unit_Id
				+ ", unit_reg_date=" + unit_reg_date + ", unit_price_update=" + unit_price_update + "]";
	}
	
	
}
