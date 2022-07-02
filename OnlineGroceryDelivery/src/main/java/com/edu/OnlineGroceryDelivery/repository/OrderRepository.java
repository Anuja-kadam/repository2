package com.edu.OnlineGroceryDelivery.repository;

import java.util.List;
import java.util.Optional;

import com.edu.OnlineGroceryDelivery.controller.entity.Order;

public interface OrderRepository {

	List<Order> findAll();

	Order save(Order order);

	Optional<Order> findById(long id);

	void deleteById(long id);

	
	

}
