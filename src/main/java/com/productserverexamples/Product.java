package com.productserverexamples;

public class Product {
	private int pId;
	private String pName;
	private int pPrice;
	private String pCategory;
	public Product(int pId, String pName, int pPrice, String pCategory) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pCategory = pCategory;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	public String getpCategory() {
		return pCategory;
	}
	public void setpCategory(String pCategory) {
		this.pCategory = pCategory;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + ", pCategory=" + pCategory + "]";
	}
}

