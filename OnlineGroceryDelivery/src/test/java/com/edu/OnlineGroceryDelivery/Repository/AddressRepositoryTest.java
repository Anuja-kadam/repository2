
package com.edu.OnlineGroceryDelivery.Repository;


import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

import com.edu.OnlineGroceryDelivery.entity.Address;
import com.edu.OnlineGroceryDelivery.repository.AddressRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class AddressRepositoryTest {
	
	@Autowired
	 private AddressRepository addressRepository;
	
	
	@Test
	public void saveAddressTest() {
		Address address=addressRepository.save(new Address(102L,"Masur","Near Bhairavnath Temple",415107L));
		Assertions.assertThat(address.getId() ).isGreaterThan(0);
	}

	@Test
	public void getAddressTest() {
		Address address= addressRepository.findById(103L).get();
		Assertions.assertThat(address.getId()).isEqualTo(103L);
	}
	
	@Test
	public void getAddressListTest() {
		
		List<Address> address= addressRepository.findAll();
		Assertions.assertThat(address.size()).isGreaterThan(0);
		
	}
	
	@Test
	public void updateAddressTest() {
		Address address = addressRepository.findById(101L).get();
		address.setCity("masur");
		Address updated = addressRepository.save(address);
		Assertions.assertThat(updated.getCity()).isEqualTo("masur");
		
	}
	@Test
	public void deleteAddressTest() {
		Address address = addressRepository.findById(104L).get();
		addressRepository.delete(address);
		Address address2= null;
		Optional <Address> address1= addressRepository.findById(104);
		if(address1.isPresent()) {
			address2=address1.get();
		}
		
		Assertions.assertThat(address2).isNull();
	
	}
	
}