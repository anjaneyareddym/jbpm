package com.myspace.taskexample;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Product implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private String productId;
	private java.lang.String productName;
	private Integer productPrice;
	private java.lang.String productCategory;

	public Product() {
	}

	public java.lang.String getProductName() {
		return this.productName;
	}

	public void setProductName(java.lang.String productName) {
		this.productName = productName;
	}

	public java.lang.String getProductCategory() {
		return this.productCategory;
	}

	public void setProductCategory(java.lang.String productCategory) {
		this.productCategory = productCategory;
	}

	public java.lang.String getProductId() {
		return this.productId;
	}

	public void setProductId(java.lang.String productId) {
		this.productId = productId;
	}

	public java.lang.Integer getProductPrice() {
		return this.productPrice;
	}

	public void setProductPrice(java.lang.Integer productPrice) {
		this.productPrice = productPrice;
	}

	public Product(java.lang.String productId, java.lang.String productName,
			java.lang.Integer productPrice, java.lang.String productCategory) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
	}

}