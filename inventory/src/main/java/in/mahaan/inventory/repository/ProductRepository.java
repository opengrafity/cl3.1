package in.mahaan.inventory.repository;

import in.mahaan.inventory.model.Product;

public interface ProductRepository {
	int saveProduct(Product product);
}
