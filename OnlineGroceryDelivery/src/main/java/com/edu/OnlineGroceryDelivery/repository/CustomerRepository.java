package com.edu.OnlineGroceryDelivery.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.edu.OnlineGroceryDelivery.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {


	List<Customer> findAll();

	Optional<Customer> findById(long id);

	void deleteById(long id);

}
