package com.microservices.test.model;

import java.util.List;

import com.microservices.test.utils.Promotions;

public class ShoppingBasket {
	
	private List<Product> product;
	
	private ShoppingCart shoopingCart;
	
	private Promotions promotions;

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public ShoppingCart getShoopingCart() {
		return shoopingCart;
	}

	public void setShoopingCart(ShoppingCart shoopingCart) {
		this.shoopingCart = shoopingCart;
	}

	public Promotions getPromotions() {
		return promotions;
	}

	public void setPromotions(Promotions promotions) {
		this.promotions = promotions;
	}
	
	

}
