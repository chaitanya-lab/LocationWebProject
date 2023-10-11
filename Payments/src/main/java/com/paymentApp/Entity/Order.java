package com.paymentApp.Entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OrderDetails")
public class Order  {

	@Id
	private String uuid = UUID.randomUUID().toString();

	private String Instructions;
	private String OrderType;
	private int quantity;
	private String productName;
	private int prodcutId;
	private double productPrice;

	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(String uuid, String instructions, String orderType, int quantity, String productName, int prodcutId,
			double productPrice) {
		super();
		this.uuid = uuid;
		Instructions = instructions;
		OrderType = orderType;
		this.quantity = quantity;
		this.productName = productName;
		this.prodcutId = prodcutId;
		this.productPrice = productPrice;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getInstructions() {
		return Instructions;
	}

	public void setInstructions(String instructions) {
		Instructions = instructions;
	}

	public String getOrderType() {
		return OrderType;
	}

	public void setOrderType(String orderType) {
		OrderType = orderType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProdcutId() {
		return prodcutId;
	}
	public void setProdcutId(int prodcutId) {
		this.prodcutId = prodcutId;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Order [uuid=" + uuid + ", Instructions=" + Instructions + ", OrderType=" + OrderType + ", quantity="
				+ quantity + ", productName=" + productName + ", prodcutId=" + prodcutId + ", productPrice="
				+ productPrice + "]";
	}


	

}
