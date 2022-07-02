package com.edu.OnlineGroceryDelivery.repository;

import java.util.List;
import java.util.Optional;

import com.edu.OnlineGroceryDelivery.controller.entity.Customer;

public interface CustomerRepository {

	Customer save(Object address);

	List<Customer> findAll();

	Optional<Customer> findById(long id);

	void deleteById(long id);

}
