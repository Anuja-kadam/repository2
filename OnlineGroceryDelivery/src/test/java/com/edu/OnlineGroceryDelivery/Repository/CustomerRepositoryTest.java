



package com.edu.OnlineGroceryDelivery.Repository;

import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

import com.edu.OnlineGroceryDelivery.entity.Customer;
import com.edu.OnlineGroceryDelivery.repository.CustomerRepository;



@DataJpaTest
@AutoConfigureTestDatabase(replace= Replace.NONE)
public class CustomerRepositoryTest {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Test
	public void saveCustomerTest() {
		Customer customer= customerRepository.save(new Customer(201L,"Anuja","Kadam","anuja8642@gmail.com",7875120657L));
		Assertions.assertThat(customer.getId() ).isGreaterThan(0);
		
	}
	
	@Test
	public void getCustomerTest() {
		Customer customer= customerRepository.findById(202L).get();
		Assertions.assertThat(customer.getId()).isEqualTo(202L);
	}
	
	@Test
	public void getCustomerListTest() {
		List<Customer> customer= customerRepository.findAll();
		Assertions.assertThat(customer.size()).isGreaterThan(0);
	}
	
	@Test
	public void updateCustomerTest(){
		Customer customer = customerRepository.findById(202).get();
		customer.setEmail("anuja8642@gmail.com");
		Customer updated = customerRepository.save(customer);
		Assertions.assertThat(updated.getEmail()).isEqualTo("anuja8642@gmail.com");
		
	}
	
	@Test
	public void deleteCustomerTest() {
		Customer customer= customerRepository.findById(201L).get();
		customerRepository.delete(customer);
		Customer customer2= null;
		Optional <Customer> customer1= customerRepository.findById(201L);
		if(customer1.isPresent()) {
			customer2=customer1.get();
		}
		
		Assertions.assertThat(customer2).isNull();
		
		
	}
}
