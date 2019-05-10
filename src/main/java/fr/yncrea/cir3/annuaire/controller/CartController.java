package fr.yncrea.cir3.annuaire.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.yncrea.cir3.annuaire.dto.CartDto;
import fr.yncrea.cir3.annuaire.dto.CartProductDto;
import fr.yncrea.cir3.annuaire.dto.SessionDto;

@RestController
@RequestMapping("/api/cart")
public class CartController {
	@Autowired
	private SessionDto session;
	
	@GetMapping("/add-product-manual")
	public CartDto addProductManual(HttpSession session, @RequestParam Long productId, @RequestParam Long quantity) {
		CartDto cart = (CartDto) session.getAttribute("cart");
		if (cart == null) {
			cart = new CartDto();
		}
		
		CartProductDto product = new CartProductDto();
		product.setProductId(productId);
		product.setQuantity(quantity);
		
		cart.getProducts().add(product);
		
		session.setAttribute("cart", cart);
		
		return cart;
	}
	
	@GetMapping("/add-product")
	public CartDto addProduct(@RequestParam Long productId, @RequestParam Long quantity) {
		CartProductDto product = new CartProductDto();
		product.setProductId(productId);
		product.setQuantity(quantity);
		session.getCart().getProducts().add(product);
		
		return session.getCart();
	}
}
