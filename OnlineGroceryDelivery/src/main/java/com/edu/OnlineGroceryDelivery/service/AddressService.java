package com.edu.OnlineGroceryDelivery.service;

import java.util.List;



import com.edu.OnlineGroceryDelivery.entity.Address;

public interface AddressService{

	

	List<Address> getAddressList();

	Address saveAddress(Address address);

	Address getAddressById(long id);

	Address updateAddress(long id, Address address);

	String deleteAddress(long id);

	



	
	
	

	

	
	
	}



	
