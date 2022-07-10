package com.edu.OnlineGroceryDelivery.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.edu.OnlineGroceryDelivery.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	List<Order> findAll();

	Order save(Order order);

	Optional<Order> findById(long id);

	void deleteById(long id);

	
	

}
