package in.mahaan.inventory.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.mahaan.inventory.model.Product;
import in.mahaan.inventory.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	@Qualifier("namedProdRepo")
	private ProductRepository prodRepository;
	public boolean saveProduct(Product product) {
		String prodId = UUID.randomUUID().toString();
		product.setId(prodId);
		int rowsUpdated = prodRepository.saveProduct(product);
		return rowsUpdated > 0?true:false;		
	}  
	
	public List<Product> getAllProducts(){
		return prodRepository.getAllProducts();
	}
	
	public List<Product> getProductsByCategory(String category){
		if(category==null || category.isEmpty() || category.equalsIgnoreCase("all")) {
			return prodRepository.getAllProducts();
		}
		return prodRepository.getProductsByCategory(category);
	}
	
	
}
