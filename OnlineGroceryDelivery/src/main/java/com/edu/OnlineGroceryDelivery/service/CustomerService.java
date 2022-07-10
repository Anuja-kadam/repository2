package com.edu.OnlineGroceryDelivery.service;

import java.util.List;

import com.edu.OnlineGroceryDelivery.entity.Customer;

public interface CustomerService {



	

	List<Customer> getCustomerList();



	Customer getCustomerById(long id);



	Customer updateCustomer(long id, Customer customer);



	String deleteCustomer(long id);



	Customer saveCustomer(Customer customer);





}
