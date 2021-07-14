package com.cafe2team.domain;

public class Stock {
	private String pCondition;
	private String bCate;
	private String mCate;
	private String sCate;
	private String productName;
	private String spmName;
	private String warehouseName;
	private String finalSector;
	private int stockAmount;
	private int wOrderAmount;
	private String wOrderDate;
	private int wRealAmount;
	private String wRealDate;
	private int rOrderAmount;
	private int rRealAmount;
	private String rRealDate;
	
	public String getpCondition() {
		return pCondition;
	}
	public void setpCondition(String pCondition) {
		this.pCondition = pCondition;
	}
	public String getbCate() {
		return bCate;
	}
	public void setbCate(String bCate) {
		this.bCate = bCate;
	}
	public String getmCate() {
		return mCate;
	}
	public void setmCate(String mCate) {
		this.mCate = mCate;
	}
	public String getsCate() {
		return sCate;
	}
	public void setsCate(String sCate) {
		this.sCate = sCate;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSpmName() {
		return spmName;
	}
	public void setSpmName(String spmName) {
		this.spmName = spmName;
	}
	public String getWarehouseName() {
		return warehouseName;
	}
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}
	public String getFinalSector() {
		return finalSector;
	}
	public void setFinalSector(String finalSector) {
		this.finalSector = finalSector;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public int getwOrderAmount() {
		return wOrderAmount;
	}
	public void setwOrderAmount(int wOrderAmount) {
		this.wOrderAmount = wOrderAmount;
	}
	public String getwOrderDate() {
		return wOrderDate;
	}
	public void setwOrderDate(String wOrderDate) {
		this.wOrderDate = wOrderDate;
	}
	public int getwRealAmount() {
		return wRealAmount;
	}
	public void setwRealAmount(int wRealAmount) {
		this.wRealAmount = wRealAmount;
	}
	public String getwRealDate() {
		return wRealDate;
	}
	public void setwRealDate(String wRealDate) {
		this.wRealDate = wRealDate;
	}
	public int getrOrderAmount() {
		return rOrderAmount;
	}
	public void setrOrderAmount(int rOrderAmount) {
		this.rOrderAmount = rOrderAmount;
	}
	public int getrRealAmount() {
		return rRealAmount;
	}
	public void setrRealAmount(int rRealAmount) {
		this.rRealAmount = rRealAmount;
	}
	public String getrRealDate() {
		return rRealDate;
	}
	public void setrRealDate(String rRealDate) {
		this.rRealDate = rRealDate;
	}
	@Override
	public String toString() {
		return "Stock [pCondition=" + pCondition + ", bCate=" + bCate + ", mCate=" + mCate + ", sCate=" + sCate
				+ ", productName=" + productName + ", spmName=" + spmName + ", warehouseName=" + warehouseName
				+ ", finalSector=" + finalSector + ", stockAmount=" + stockAmount + ", wOrderAmount=" + wOrderAmount
				+ ", wOrderDate=" + wOrderDate + ", wRealAmount=" + wRealAmount + ", wRealDate=" + wRealDate
				+ ", rOrderAmount=" + rOrderAmount + ", rRealAmount=" + rRealAmount + ", rRealDate=" + rRealDate + "]";
	}

	
	
}
