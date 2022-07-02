package com.edu.OnlineGroceryDelivery.controller.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="orderTable")
public class Order {

	@Id
	private long customerId;
	private long productId;
	private long orderId;
	private String productName;
	private String totalNoOfProduct;
	private long total;
	private long discount;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name= "custId")
	@JsonIgnoreProperties("customer")
	private Order order;//104
	
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getTotalNoOfProduct() {
		return totalNoOfProduct;
	}
	public void setTotalNoOfProduct(String totalNoOfProduct) {
		this.totalNoOfProduct = totalNoOfProduct;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public long getDiscount() {
		return discount;
	}
	public void setDiscount(long discount) {
		this.discount = discount;
	}
	public Order(long customerId, long productId, long orderId, String productName, String totalNoOfProduct, long total,
			long discount) {
		super();
		this.customerId = customerId;
		this.productId = productId;
		this.orderId = orderId;
		this.productName = productName;
		this.totalNoOfProduct = totalNoOfProduct;
		this.total = total;
		this.discount = discount;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Order [customerId=" + customerId + ", productId=" + productId + ", orderId=" + orderId
				+ ", productName=" + productName + ", totalNoOfProduct=" + totalNoOfProduct + ", total=" + total
				+ ", discount=" + discount + "]";
	}
	
	
	
}
