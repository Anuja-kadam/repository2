package com.edu.OnlineGroceryDelivery.repository;

import java.util.List;
import java.util.Optional;

import com.edu.OnlineGroceryDelivery.controller.entity.GroceryItem;

public interface GroceryItemRepository {

	List<GroceryItem> findAll();

	GroceryItem save(GroceryItem groceryItem);

	Optional<GroceryItem> findById(long id);

	void deleteById(long id);

}
