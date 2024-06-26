package com.ecommerce.service;

import java.util.List;

import com.ecommerce.exception.OrderException;
import com.ecommerce.modal.Address;
import com.ecommerce.modal.Order;
import com.ecommerce.modal.User;

public interface OrderService {

	Order createOrder(User user, Address shippingAdress);

	Order findOrderById(Long orderId) throws OrderException;

	List<Order> usersOrderHistory(Long userId);

	Order placedOrder(Long orderId) throws OrderException;

	Order confirmedOrder(Long orderId) throws OrderException;

	Order shippedOrder(Long orderId) throws OrderException;

	Order deliveredOrder(Long orderId) throws OrderException;

	Order cancledOrder(Long orderId) throws OrderException;

	List<Order> getAllOrders();

	void deleteOrder(Long orderId) throws OrderException;
}
