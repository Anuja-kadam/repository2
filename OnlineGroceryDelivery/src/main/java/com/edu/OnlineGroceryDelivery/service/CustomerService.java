package com.edu.OnlineGroceryDelivery.service;

import java.util.List;

import com.edu.OnlineGroceryDelivery.controller.entity.Customer;

public interface CustomerService {

	Customer saveCustomer(Customer customer);

	

	List<Customer> getCustomerList();



	Customer getCustomerById(long id);



	Customer updateCustomer(long id, Customer customer);



	String deleteCustomer(long id);

}
