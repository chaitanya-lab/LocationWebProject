package com.paymentApp.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MenuManager {

	@Id
	private int productId;
	private String productName;
	private double productPrice;
	
	public MenuManager() {
		super();
	
	}
	public MenuManager(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "MenuManager [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

	

}
