package in.brytcode.jpademo;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.brytcode.jpademo.entity.Product;
import in.brytcode.jpademo.service.ProductService;

@SpringBootApplication
public class JpademoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(JpademoApplication.class, args);
		ProductService prodService = applicationContext.getBean(ProductService.class);
		
		Product prod = new Product();
		prod.setId(UUID.randomUUID().toString());
		prod.setName("aeo freshner");
		prod.setCategory("grocery");
		prod.setPrice(BigDecimal.valueOf(250));
		
		prodService.saveProduct(prod);
		
		System.out.println(prodService.getAllProducts());
		
		System.out.println(prodService.getAllProductsByCategory("stationary"));
	}

}
