package com.dev;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dev.models.Product;
import com.dev.repositories.ProductRepository;

@SpringBootApplication
public class OsfTrainingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OsfTrainingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ProductRepository repository = ProductRepository.getInstance();
		for (int i=0;i<5;i++) {
			
			repository.getList().add(new Product(i, "TV", "home appliances", "1000"));
			repository.getList().add(new Product(i+5, "cell", "technology", "1500"));
			repository.getList().add(new Product(i+5, "apple", "food", "1"));
		}
		
		for (Product product : repository.getList()) {
			System.out.println(product.toString());
		}
	}

}
