package com.edu.OnlineGroceryDelivery.Repository;



import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.edu.OnlineGroceryDelivery.entity.Order;
import com.edu.OnlineGroceryDelivery.repository.OrderRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace= Replace.NONE)
public class OrderRepositoryTest {

	@Autowired
	OrderRepository orderRepository;
	
	@Test
	public void saveOrderTest() {
		Order order= orderRepository.save(new Order(401,"C1","P1","Balaji wafers",1,120,1));
		Assertions.assertThat(order.getOrderId()).isGreaterThan(0);
	}
	
	@Test
	public void getOrderTest() {
		Order order= orderRepository.findById(402L).get();
		Assertions.assertThat(order.getOrderId()).isEqualTo(402L);
				
	}
	
	@Test
	public void getOrderListTest() {
		List<Order> order= orderRepository.findAll();
		Assertions.assertThat(order.size()).isGreaterThan(0);
	}
	
	@Test
	public void updateOrderTest() {
		Order order= orderRepository.findById(403L).get();
		order.setProductName("Pasta");
		Order updated = orderRepository.save(order);
		Assertions.assertThat(updated.getProductName()).isEqualTo("Pasta");
	}
	@Test
	public void deleteOrderTest() {
		Order order = orderRepository.findById(404L).get();
		orderRepository.delete(order);
		Order order1= null;
		
		Optional<Order> order2 = orderRepository.findById(404L);
		if(order2.isPresent()) {
			order1 = order2.get();	
		}
		Assertions.assertThat(order1).isNull();
	}
}
