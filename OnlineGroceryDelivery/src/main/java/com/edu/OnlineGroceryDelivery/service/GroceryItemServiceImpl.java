package com.edu.OnlineGroceryDelivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.edu.OnlineGroceryDelivery.controller.entity.GroceryItem;
import com.edu.OnlineGroceryDelivery.exception.ResourceNotFoundException;
import com.edu.OnlineGroceryDelivery.repository.GroceryItemRepository;

public class GroceryItemServiceImpl implements GroceryItemService{
	
	@Autowired
	GroceryItemRepository groceryItemRepository;

	@Override
	public List<GroceryItem> getGroceryItemList() {
		return groceryItemRepository.findAll();
		
	}

	@Override
	public GroceryItem saveGroceryItem(GroceryItem groceryItem) {
		return groceryItemRepository.save(groceryItem);
		
	}

	@Override
	public GroceryItem  getGroceryItemById(long id) {
		Optional <GroceryItem> groceryItem = groceryItemRepository.findById(id);
		if(groceryItem.isPresent())
		return groceryItem.get();
		else
			throw new ResourceNotFoundException("GroceryItem","id",id);
		
		
	}

	@Override
	public GroceryItem updateGroceryItem(long id, GroceryItem groceryItem) {
		GroceryItem groItem = groceryItemRepository.findById(id).orElseThrow(
				()-> new ResourceNotFoundException("GroceryItem","id",id));
		return groItem;
		
		}

	@Override
	public String deleteGroceryItem(long id) {
		GroceryItem groItem = groceryItemRepository.findById(id).orElseThrow(
				()-> new ResourceNotFoundException("GroceryItem","id",id));
		groceryItemRepository.deleteById(id);
		return "record is deleted successfully";
	}
		
	}

	
