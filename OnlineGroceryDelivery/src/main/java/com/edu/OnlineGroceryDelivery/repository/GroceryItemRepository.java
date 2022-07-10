package com.edu.OnlineGroceryDelivery.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.edu.OnlineGroceryDelivery.entity.GroceryItem;

public interface GroceryItemRepository extends JpaRepository<GroceryItem, Long>{

	List<GroceryItem> findAll();

	GroceryItem save(GroceryItem groceryItem);

	Optional<GroceryItem> findById(long id);

	void deleteById(long id);

}
