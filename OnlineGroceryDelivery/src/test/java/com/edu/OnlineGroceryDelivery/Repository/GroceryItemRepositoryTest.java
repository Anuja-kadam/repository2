package com.edu.OnlineGroceryDelivery.Repository;


import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.edu.OnlineGroceryDelivery.entity.GroceryItem;
import com.edu.OnlineGroceryDelivery.repository.GroceryItemRepository;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

@DataJpaTest
@AutoConfigureTestDatabase(replace= Replace.NONE)
public class GroceryItemRepositoryTest {

	@Autowired
	GroceryItemRepository groceryItemRepository;
	
	@Test 
	public void saveGroceryItemTest() {
		GroceryItem groceryItem= groceryItemRepository.save(new GroceryItem(301L,"snaccks","Balaji wafers",120,"Excellent",1));
		Assertions.assertThat(groceryItem.getProductId()).isGreaterThan(0);
	}
	
	@Test
	public void getGroceryItemTest() {
		GroceryItem groceryItem= groceryItemRepository.findById(302L).get();
		Assertions.assertThat(groceryItem.getProductId()).isEqualTo(302L);
	}
	
	@Test
	public void getGroceryItemListTest() {
		List<GroceryItem> groceryItem= groceryItemRepository.findAll();
		Assertions.assertThat(groceryItem.size()).isGreaterThan(0);
	}
	
	@Test
	public void updateGroceryItemTest() {
		GroceryItem groceryItem= groceryItemRepository.findById(303L).get();
		groceryItem.setProductCategory("Breakfast and Tea");
		GroceryItem updated = groceryItemRepository.save(groceryItem);
		Assertions.assertThat(updated.getProductCategory()).isEqualTo("Breakfast and Tea");
	}
	
	@Test
	public void deleteGroceryIteTest() {
		GroceryItem groceryItem= groceryItemRepository.findById(304L).get();
		groceryItemRepository.delete(groceryItem);
 	GroceryItem groceryItem1= null;
		
		Optional<GroceryItem> groceryItem2= groceryItemRepository.findById(304L);
		if(groceryItem2.isPresent()) {
			groceryItem1= groceryItem2.get();
		}
		Assertions.assertThat(groceryItem1).isNull();
		}
		
	}
	