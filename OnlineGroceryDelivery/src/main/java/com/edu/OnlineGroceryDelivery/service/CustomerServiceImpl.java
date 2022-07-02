package com.edu.OnlineGroceryDelivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.edu.OnlineGroceryDelivery.controller.entity.Customer;
import com.edu.OnlineGroceryDelivery.exception.ResourceNotFoundException;
import com.edu.OnlineGroceryDelivery.repository.CustomerRepository;


public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer saveCustomer(Customer customer) {
	  return customerRepository.save(customer);
	
	}
    @Override
	public List<Customer> getCustomerList() {
	return customerRepository.findAll();
	}
	@Override
	public Customer getCustomerById(long id) {
		Optional <Customer> customer = customerRepository.findById(id);
		if(customer.isPresent())
		return customer.get();	
	
		else 
			throw new ResourceNotFoundException("Customer","Id",id);
		}
	@Override
	public Customer updateCustomer(long id, Customer customer) {
		Customer cust = customerRepository.findById(id).orElseThrow(
				()-> new ResourceNotFoundException("Customer","id",id));
		return cust;
		
		}
	@Override
	public String deleteCustomer(long id) {
		Customer cust = customerRepository.findById(id).orElseThrow(
				()-> new ResourceNotFoundException("Customer","id",id));
		customerRepository.deleteById(id);
		return "record is deleted successfully";
	}
	
}

	
	

	
	

	


