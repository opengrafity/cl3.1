package in.mahaan.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import  in.mahaan.inventory.entity.Product;


@Repository
public interface ProductJpaRepository extends JpaRepository<Product, String>{
	List<Product> findAllByCategory(String category);
	
}
