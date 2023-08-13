package in.mahaan.inventory.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import in.mahaan.inventory.model.Product;

@Repository("classicProdRepo")
public class ProductClassicRepository implements ProductRepository{
	@Autowired
	JdbcTemplate jdbcTemplate;
	RowMapper prodMapper =  new RowMapper<Product>() {

		@Override
		public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
			Product product = new Product();
			product.setId(rs.getString("id"));
			product.setName(rs.getString("name"));
			product.setPrice(rs.getBigDecimal("price"));
			product.setCategory(rs.getString("category"));
			return product;				
		}
		
	};
	
	
	public int saveProduct(Product product) {
		return jdbcTemplate.update("INSERT INTO Product(id,name,category,price) VALUES(?,?,?,?)", product.getId(),
				product.getName(), product.getCategory(), product.getPrice());
	}

	@Override
	public List<Product> getAllProducts() {
		String query ="SELECT * FROM Product";
		return jdbcTemplate.query(query,prodMapper);		
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		String query ="SELECT * FROM Product WHERE category = ?"; 
		return jdbcTemplate.query(query,prodMapper, category);	
	}
	
	

}
