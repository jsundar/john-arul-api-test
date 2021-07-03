package com.microservices.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.microservices.test.model.Product;
import com.microservices.test.model.ShoppingBasket;
import com.microservices.test.service.ShoppingCartService;
import com.microservices.test.utils.Promotions;

@SpringBootTest
class MasterCardApiTestApplicationTests {

	@InjectMocks
	private ShoppingCartService cartService;

	@Mock
	ShoppingBasket basket;

	@Test
	public void promotion1Test() {
		// Promotion 1

		ShoppingBasket basket = new ShoppingBasket();
		Product p1 = new Product();
		p1.setPrice(10.0);
		p1.setProductName("A");
		p1.setProductDescription("A de");

		Product p2 = new Product();
		p2.setPrice(10.0);
		p2.setProductName("B");
		p1.setProductDescription("AB de");

		Product p3 = new Product();
		p3.setPrice(10.0);
		p3.setProductName("A");
		p3.setProductDescription("A de");

		Product p4 = new Product();
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

		cartService.addToCartService(basket);

	}

	@Test
	public void promotion2Test() {
		// Promotion 2

		ShoppingBasket basket2 = new ShoppingBasket();
		Product pp1 = new Product();
		pp1.setPrice(10.0);
		pp1.setProductName("A");
		pp1.setProductDescription("A de");

		Product pp2 = new Product();
		pp2.setPrice(10.0);
		pp2.setProductName("B");
		pp2.setProductDescription("AB de");

		Product pp3 = new Product();
		pp3.setPrice(15.0);
		pp3.setProductName("C");
		pp3.setProductDescription("ABC de");

		Product pp4 = new Product();
		pp4.setPrice(15.0);
		pp4.setProductName("C");
		pp4.setProductDescription("ABC de");

		List<Product> productList2 = new ArrayList<>();
		productList2.add(pp3);
		productList2.add(pp2);
		productList2.add(pp3);
		productList2.add(pp4);
		basket2.setProduct(productList2);
		basket2.setPromotions(Promotions.promotion2);

		cartService.addToCartService(basket2);
	}

}
