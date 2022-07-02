package com.edu.OnlineGroceryDelivery.service;

import java.util.List;

import com.edu.OnlineGroceryDelivery.controller.entity.Order;

public interface OrderService {

	List<Order> getOrderList();

	Order saveOrder(Order order);

	Order getOrderById(long id);

	Order updateOrder(long id, Order order);

	String deleteOrder(long id);

	
	}


