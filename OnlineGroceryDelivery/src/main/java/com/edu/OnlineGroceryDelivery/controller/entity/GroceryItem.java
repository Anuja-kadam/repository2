package com.edu.OnlineGroceryDelivery.controller.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="groceryTbl")
public class GroceryItem {
	@Id
	private long productId;
	private String productCategory;
	private String productName;
	private long productPrice;
	private String qualityOfProduct;
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}
	public String getQualityOfProduct() {
		return qualityOfProduct;
	}
	public void setQualityOfProduct(String qualityOfProduct) {
		this.qualityOfProduct = qualityOfProduct;
	}
	public GroceryItem(long productId, String productCategory, String productName, long productPrice,
			String qualityOfProduct) {
		super();
		this.productId = productId;
		this.productCategory = productCategory;
		this.productName = productName;
		this.productPrice = productPrice;
		this.qualityOfProduct = qualityOfProduct;
	}
	
	public GroceryItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "GroceryItem [productId=" + productId + ", productCategory=" + productCategory + ", productName="
				+ productName + ", productPrice=" + productPrice + ", qualityOfProduct=" + qualityOfProduct + "]";
	}
	
}
	
	

