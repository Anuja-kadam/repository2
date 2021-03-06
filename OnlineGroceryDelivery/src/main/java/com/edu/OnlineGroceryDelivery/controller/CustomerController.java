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

import com.edu.OnlineGroceryDelivery.entity.Customer;
import com.edu.OnlineGroceryDelivery.service.CustomerService;

@RestController
@RequestMapping("api/customer")


public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@GetMapping
	public List<Customer> getCustomerList(){
	return customerService.getCustomerList();
}
	@PostMapping
	public ResponseEntity<Customer> SaveCustomer(@RequestBody Customer customer){
		return new ResponseEntity<Customer>(customerService.saveCustomer(customer),HttpStatus.CREATED); 
	}
	
	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable("id")long id) {
		return customerService.getCustomerById(id);
	}
	
	@PutMapping("/id")
	public Customer updateCustomer(@PathVariable("id") long id, @RequestBody Customer customer) {
    return customerService.updateCustomer(id,customer);
}

    @DeleteMapping("/id")
    public ResponseEntity<String> deleteCustomer(@PathVariable("id") long id){
		return new ResponseEntity<String>(customerService.deleteCustomer(id),HttpStatus.OK);
    	
    }
}