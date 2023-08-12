package in.mahaan.inventory.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.mahaan.inventory.model.Product;

@Repository("classicProdRepo")
public class ProductClassicRepository implements ProductRepository{
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int saveProduct(Product product) {
		return jdbcTemplate.update("INSERT INTO Product(id,name,category,price) VALUES(?,?,?,?)", product.getId(),
				product.getName(), product.getCategory(), product.getPrice());
	}

}
