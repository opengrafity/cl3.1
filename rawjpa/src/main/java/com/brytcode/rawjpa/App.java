package com.brytcode.rawjpa;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.brytcode.rawjpa.entity.Product;
import com.brytcode.rawjpa.repository.ProductRepository;


@ComponentScan(basePackages = "com.brytcode.rawjpa")
public class App {
	public static void main(String[] args) {
		ApplicationContext applicationConfig = new AnnotationConfigApplicationContext(App.class);
		
		Product prod = new Product();
		prod.setId(UUID.randomUUID().toString());
		prod.setName("mic");
		prod.setCategory("electonics");
		prod.setPrice(BigDecimal.valueOf(6500));
		
		ProductRepository prodRepo =  applicationConfig.getBean(ProductRepository.class);
		//prodRepo.saveProduct(prod);
		
		prod = prodRepo.getProduct("d174457e-c8ef-4adf-8605-d7c7df4f64e2");
		
		System.out.println(prod);
		
		prodRepo.updateProductPrice("d174457e-c8ef-4adf-8605-d7c7df4f64e2", BigDecimal.valueOf(150));
		
		prod = prodRepo.getProduct("d174457e-c8ef-4adf-8605-d7c7df4f64e2");
		
		System.out.println(prod);
	}
}
