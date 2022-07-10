package com.edu.OnlineGroceryDelivery.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.edu.OnlineGroceryDelivery.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

	List<Address> findAll();

	Address save(Address address);

	Optional<Address> findById(long id);

	void deleteById(long id);



	

	

	
	



	
	
}
