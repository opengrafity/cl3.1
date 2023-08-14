package in.brytcode.jpademo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.brytcode.jpademo.entity.Product;
import in.brytcode.jpademo.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository prodRepo;
	
	public void saveProduct(Product product) {
		prodRepo.save(product);
	}
	
	public List<Product> getAllProducts(){
		return prodRepo.findAll();
	} 

	public List<Product> getAllProductsByCategory(String category){
		return prodRepo.findAllByCategory(category);
	}
}
