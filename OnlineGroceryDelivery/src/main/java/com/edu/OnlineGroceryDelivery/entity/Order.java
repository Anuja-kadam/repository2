package com.edu.OnlineGroceryDelivery.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="orderTable")
public class Order {

	@Id
	@GeneratedValue(generator="seq4", strategy=GenerationType.AUTO)
	@SequenceGenerator(name= "seq4", initialValue=401)
	private long orderId;
	private String customerId;
	private String productId;
	private String productName;
	private long totalNoOfProduct;
	private long total;
	private long discount;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name= "custId")
	@JsonIgnoreProperties("order")
	private Customer customer;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public long getTotalNoOfProduct() {
		return totalNoOfProduct;
	}

	public void setTotalNoOfProduct(long totalNoOfProduct) {
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

	public Order(long orderId, String customerId, String productId, String productName, long totalNoOfProduct,
			long total, long discount) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.productId = productId;
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
		return "Order [orderId=" + orderId + ", customerId=" + customerId + ", productId=" + productId
				+ ", productName=" + productName + ", totalNoOfProduct=" + totalNoOfProduct + ", total=" + total
				+ ", discount=" + discount + "]";
	}
}

	
	