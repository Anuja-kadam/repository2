package com.edu.OnlineGroceryDelivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.edu.OnlineGroceryDelivery.controller.entity.Order;
import com.edu.OnlineGroceryDelivery.exception.ResourceNotFoundException;
import com.edu.OnlineGroceryDelivery.repository.OrderRepository;

public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderRepository orderRepository;

	@Override
	public List<Order> getOrderList() {
		return orderRepository.findAll();
		
	}

	@Override
	public Order saveOrder(Order order) {
		return  orderRepository.save(order);
		
	}

	@Override
	public Order getOrderById(long id) {
		Optional<Order> order = orderRepository.findById(id);
		if(order.isPresent())
		return order.get();
		else
			throw new ResourceNotFoundException("Order","id",id);
	}

	@Override
	public Order updateOrder(long id, Order order) {
		Order ord = orderRepository.findById(id).orElseThrow(
				()-> new ResourceNotFoundException("Order","id",id));
		return ord;
				
	}

	@Override
	public String deleteOrder(long id) {
		Order ord = orderRepository.findById(id).orElseThrow(
				()-> new ResourceNotFoundException("Order","id",id));
		orderRepository.deleteById(id);
		return "record is deleted successfully";
		
	}

	
}
	


