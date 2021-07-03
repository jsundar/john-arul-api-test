package com.microservices.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.test.model.ShoppingBasket;
import com.microservices.test.model.ShoppingCart;
import com.microservices.test.service.ShoppingCartService;

@RestController
@RequestMapping("/v1/api/shoppingcart")
public class ShoppingCartController {
	
	@Autowired
	private ShoppingCartService cartService;
	
	@PostMapping("/addToCart")
	public ResponseEntity<ShoppingCart> addToCart(@RequestBody ShoppingBasket basket) {
		
		return new ResponseEntity<ShoppingCart>(cartService.addToCartService(basket), HttpStatus.CREATED);
		
	}
}
