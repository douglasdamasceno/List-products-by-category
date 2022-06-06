package com.dev.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dev.models.Product;
import com.dev.repositories.ProductRepository;

@RestController()
@RequestMapping("products")
public class ProductController {
	
	ProductRepository repository = ProductRepository.getInstance();
	
	 @GetMapping()
	    public ResponseEntity<List<Product>> findByName(@RequestParam(name= "category", required = false) String category) {
	    	return ResponseEntity.ok(repository.getByCategory(category));
	   }
}
