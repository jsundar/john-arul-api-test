package com.microservices.test.model;

import java.util.List;

public class ShoppingCart {

	
	private List<Product> product;
	
	private Double totalProductPrice;
	private Double promotionDiscount;
	private Double totalCartPrice;
	
	
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public Double getTotalProductPrice() {
		return totalProductPrice;
	}
	public void setTotalProductPrice(Double totalProductPrice) {
		this.totalProductPrice = totalProductPrice;
	}
	public Double getPromotionDiscount() {
		return promotionDiscount;
	}
	public void setPromotionDiscount(Double promotionDiscount) {
		this.promotionDiscount = promotionDiscount;
	}
	public Double getTotalCartPrice() {
		return totalCartPrice;
	}
	public void setTotalCartPrice(Double totalCartPrice) {
		this.totalCartPrice = totalCartPrice;
	}
	
}
