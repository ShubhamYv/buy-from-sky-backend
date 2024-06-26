package com.ecommerce.service;

import com.ecommerce.exception.ProductException;
import com.ecommerce.modal.Cart;
import com.ecommerce.modal.User;
import com.ecommerce.request.AddItemRequest;

public interface CartService {

	Cart createCart(User user);

	String addCartItem(Long userId, AddItemRequest req) throws ProductException;

	Cart findUserCart(Long userId);
}
