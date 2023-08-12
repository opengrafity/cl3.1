package in.mahaan.inventory.repository;

import org.springframework.beans.factory.annotation.Autowired;
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

}
