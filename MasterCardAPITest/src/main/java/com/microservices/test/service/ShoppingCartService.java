package com.microservices.test.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.microservices.test.model.Product;
import com.microservices.test.model.ShoppingBasket;
import com.microservices.test.model.ShoppingCart;
import com.microservices.test.utils.Promotions;

@Service
public class ShoppingCartService {
	
	
	public ShoppingCart addToCartService(ShoppingBasket basket) {
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.setProduct(basket.getProduct());

		Double promotionPrice = 0d;
		Double totalProdctPrice = 0d;

		if (basket.getPromotions().equals(Promotions.Promotion1)) {
			
			List<Product> products = basket.getProduct();			
			int countProductA = products.stream().filter(product -> product.getProductName().equals("A")).collect(Collectors.toList()).size();

			for (Product product : basket.getProduct()) {
				if (product.getProductName().equals("B")) {
					if (countProductA != 0) {
						promotionPrice = product.getPrice() / 2;
						countProductA--;
					}

				}
			}

		} else if (basket.getPromotions().equals(Promotions.promotion2)) {

			List<Product> products = basket.getProduct();
			Product minProductPrice = products.stream().min((o1, o2) -> o1.getPrice().compareTo(o2.getPrice())).get();
			promotionPrice = minProductPrice.getPrice();

		}
		shoppingCart.setPromotionDiscount(promotionPrice);
		shoppingCart.setTotalCartPrice(totalProdctPrice);
		shoppingCart.setTotalCartPrice(totalProdctPrice - promotionPrice);
		return shoppingCart;

	}
	
	//This Can be written in JUNIT
	public static void main(String[] args) {
		ShoppingCartService service = new ShoppingCartService();
		
		//Promotion 1
		
		ShoppingBasket basket = new ShoppingBasket();
		Product p1= new Product();
		p1.setPrice(10.0);
		p1.setProductName("A");
		p1.setProductDescription("A de");
		
		Product p2= new Product();
		p2.setPrice(10.0);
		p2.setProductName("B");
		p1.setProductDescription("AB de");
		
		Product p3= new Product();
		p3.setPrice(10.0);
		p3.setProductName("A");
		p3.setProductDescription("A de");
		
		Product p4= new Product();
		p4.setPrice(10.0);
		p4.setProductName("B");
		p4.setProductDescription("AB de");
		
		List<Product> productList = new ArrayList<>();
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		basket.setProduct(productList);
		basket.setPromotions(Promotions.Promotion1);
		
		service.addToCartService(basket);
		
		//Promotion 2
		
		ShoppingBasket basket2 = new ShoppingBasket();
		Product pp1= new Product();
		pp1.setPrice(10.0);
		pp1.setProductName("A");
		pp1.setProductDescription("A de");
		
		
		Product pp2= new Product();
		pp2.setPrice(10.0);
		pp2.setProductName("B");
		pp2.setProductDescription("AB de");
		
		Product pp3= new Product();
		pp3.setPrice(15.0);
		pp3.setProductName("C");
		pp3.setProductDescription("ABC de");
		
		Product pp4= new Product();
		pp4.setPrice(15.0);
		pp4.setProductName("C");
		pp4.setProductDescription("ABC de");
		
		List<Product> productList2 = new ArrayList<>();
		productList2.add(p3);
		productList2.add(pp2);
		productList2.add(pp3);
		productList2.add(pp4);
		basket2.setProduct(productList);
		basket2.setPromotions(Promotions.promotion2);
		
		service.addToCartService(basket2);
		
	}
}
