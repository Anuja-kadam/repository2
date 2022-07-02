package com.edu.OnlineGroceryDelivery.repository;

import java.util.List;
import java.util.Optional;


import com.edu.OnlineGroceryDelivery.controller.entity.Address;

public interface AddressRepository {

	List<Address> findAll();

	Address save(Address address);

	Optional<Address> findById(long id);

	void deleteById(long id);

	
	



	
	
}
