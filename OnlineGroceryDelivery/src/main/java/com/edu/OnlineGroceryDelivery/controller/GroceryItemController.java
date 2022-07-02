package com.edu.OnlineGroceryDelivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.OnlineGroceryDelivery.controller.entity.GroceryItem;
import com.edu.OnlineGroceryDelivery.service.GroceryItemService;

@RestController
@RequestMapping("api/groceryItem")
public class GroceryItemController {
	@Autowired
	GroceryItemService groceryItemService;

	@GetMapping
	public List <GroceryItem> getGroceryItemList(){
		return groceryItemService.getGroceryItemList();
		
	}
	
     @PostMapping
      public ResponseEntity <GroceryItem> saveGroceryItem(@RequestBody GroceryItem groceryItem) {
		return new ResponseEntity<GroceryItem>(groceryItemService.saveGroceryItem(groceryItem),HttpStatus.CREATED);
    	 
     }
     @GetMapping("/{id}")
     public GroceryItem getGroceryItemById(@PathVariable("id") long id ) {
		return groceryItemService.getGroceryItemById(id);
    	 
     }
     @PutMapping("/id")
     public GroceryItem updateGroceryItem(@PathVariable("id")long id, @RequestBody GroceryItem groceryItem) {
		return groceryItemService.updateGroceryItem(id,groceryItem);
    	 
     }
     @DeleteMapping("/id")
     public ResponseEntity <String> deleteGroceryItem(@PathVariable("id") long id){
		return new ResponseEntity <String>(groceryItemService.deleteGroceryItem(id),HttpStatus.OK);
    	 
     }
     }
