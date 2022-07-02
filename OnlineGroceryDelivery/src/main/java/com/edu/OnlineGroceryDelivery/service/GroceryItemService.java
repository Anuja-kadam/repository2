package com.edu.OnlineGroceryDelivery.service;

import java.util.List;

import com.edu.OnlineGroceryDelivery.controller.entity.GroceryItem;

public interface GroceryItemService {

	List<GroceryItem> getGroceryItemList();

	GroceryItem saveGroceryItem(GroceryItem groceryItem);

	GroceryItem getGroceryItemById(long id);

	GroceryItem updateGroceryItem(long id, GroceryItem groceryItem);

	String deleteGroceryItem(long id);

	

}
