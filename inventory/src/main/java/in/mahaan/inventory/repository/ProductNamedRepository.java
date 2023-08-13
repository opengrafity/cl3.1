package in.mahaan.inventory.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import in.mahaan.inventory.model.Product;
@Repository("namedProdRepo")
public class ProductNamedRepository implements ProductRepository{
	@Autowired
	private NamedParameterJdbcTemplate  jdbcTemplate;
	public int saveProduct(Product product) {		
		String prod_insert = "INSERT INTO Product(id,name,category,price) VALUES(:id,:name,:category,:price)";
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(product);	
		return jdbcTemplate.update(prod_insert,params);
	}
	@Override
	public List<Product> getAllProducts() {
		String query ="SELECT * FROM Product";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<Product>(Product.class));		
	}
	
	@Override
	public List<Product> getProductsByCategory(String category) {
		String query ="SELECT * FROM Product WHERE category=:category";
		Map<String, Object> keys = new HashMap<>();
		keys.put("category", category);
		
		return jdbcTemplate.query(query, keys, new BeanPropertyRowMapper<Product>(Product.class));
	}


}
