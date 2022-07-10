package com.edu.OnlineGroceryDelivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.OnlineGroceryDelivery.entity.Order;
import com.edu.OnlineGroceryDelivery.service.OrderService;

@RestController
@RequestMapping("api/order")
public class OrderContoller {
	
	@Autowired
	OrderService orderService;
	
	@GetMapping 
	public List<Order> getOrderList(){
		return orderService.getOrderList();
		}
	@PostMapping
	public ResponseEntity<Order> saveOrder(@RequestBody Order order){
		return new ResponseEntity<Order>(orderService.saveOrder(order),HttpStatus.CREATED);
		
	}
	@GetMapping("/{id}")
	public Order getOrderById(@PathVariable("id")long id) {
		return orderService.getOrderById(id);
		
	}
	@PutMapping("id")
	public Order updateOrder(@PathVariable("id")long id, @RequestBody Order order) {
		return orderService.updateOrder(id,order);
		
	}
	@DeleteMapping("/id")
	public ResponseEntity<String> deleteOrder(@PathVariable("id")long id){
		return new ResponseEntity<String>(orderService.deleteOrder(id),HttpStatus.OK);
		
	}
}