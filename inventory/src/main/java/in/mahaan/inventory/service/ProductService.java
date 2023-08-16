package in.mahaan.inventory.service;

import java.util.List;

import in.mahaan.inventory.model.Product;

public interface ProductService {
	public boolean saveProduct(Product product);
	public List<Product> getAllProducts();
	public List<Product> getProductsByCategory(String category);
}
