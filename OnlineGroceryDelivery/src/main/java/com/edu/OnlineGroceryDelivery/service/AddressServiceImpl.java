package com.edu.OnlineGroceryDelivery.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.edu.OnlineGroceryDelivery.controller.entity.Address;
import com.edu.OnlineGroceryDelivery.exception.ResourceNotFoundException;
import com.edu.OnlineGroceryDelivery.repository.AddressRepository;

public  class AddressServiceImpl implements AddressService{
	
	@Autowired 
    AddressRepository addressRepository; 

	@Override
	public List<Address> getAddressList() {
		return addressRepository.findAll();
		
	}

	@Override
	public Address saveAddress(Address address) {
		return addressRepository.save(address);
		
	}

	@Override
	public Address getAddressById(long id) {
		Optional <Address> address = addressRepository.findById(id);
		if(address.isPresent())
		return address.get();
		else
			throw new ResourceNotFoundException("Customer","Id",id);
		
	}

	@Override
	public Address updateAddress(long id, Address address) {
		Address add= addressRepository.findById(id).orElseThrow(
				()-> new ResourceNotFoundException("Address","id",id));
		return add;
	}

	@Override
	public String deleteAddress(long id) {
		Address add= addressRepository.findById(id).orElseThrow(
				()-> new ResourceNotFoundException("address","id",id));
		addressRepository.deleteById(id);
		return "record is deleted successfully";
		

	
	}	}

	
		
	
		
	
				
		
				

	

	
	