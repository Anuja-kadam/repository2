package com.edu.OnlineGroceryDelivery.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name ="groceryTbl")
public class GroceryItem {
	
	@Id
	@GeneratedValue(generator="seq3", strategy=GenerationType.AUTO)
	@SequenceGenerator(name= "seq3", initialValue=301)
	private long productId;
	private String productCategory;
	private String productName;
	private long productPrice;
	private String qualityOfProduct;
	private long totalNoOfProduct;
	
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
	public long getTotalNoOfProduct() {
		return totalNoOfProduct;
	}
	public void setTotalNoOfProduct(long totalNoOfProduct) {
		this.totalNoOfProduct = totalNoOfProduct;
	}
	public GroceryItem(long productId, String productCategory, String productName, long productPrice,
			String qualityOfProduct, long totalNoOfProduct) {
		super();
		this.productId = productId;
		this.productCategory = productCategory;
		this.productName = productName;
		this.productPrice = productPrice;
		this.qualityOfProduct = qualityOfProduct;
		this.totalNoOfProduct = totalNoOfProduct;
	}
	public GroceryItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "GroceryItem [productId=" + productId + ", productCategory=" + productCategory + ", productName="
				+ productName + ", productPrice=" + productPrice + ", qualityOfProduct=" + qualityOfProduct
				+ ", totalNoOfProduct=" + totalNoOfProduct + "]";
	}
}
	
	
