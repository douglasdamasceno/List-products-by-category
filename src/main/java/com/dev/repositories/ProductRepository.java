package com.dev.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.dev.models.Product;

public class ProductRepository {
	static ProductRepository instance;
	
	private List<Product> list;
	private ProductRepository() {
		list = new ArrayList<>();
	}
	
	public static ProductRepository getInstance() {
		if(instance==null) {
			instance = new ProductRepository();
		}
		return instance;
	}

	public List<Product> getList() {
		return list;
	}
	
	public List<Product> getByCategory(String category){
		return list.stream().filter(product -> category.equals(product.getCategory())).collect(Collectors.toList());
		
	}
}
