package in.mahaan.inventory.repository;

import java.util.List;

import in.mahaan.inventory.model.Product;

public interface ProductRepository {
	int saveProduct(Product product);
	List<Product> getAllProducts();
	List<Product> getProductsByCategory(String category);
}
