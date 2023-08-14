package in.brytcode.jpademo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.brytcode.jpademo.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, String>{
	List<Product> findAllByCategory(String category);
}
