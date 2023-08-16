package in.mahaan.inventory.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mahaan.inventory.model.Product;
import in.mahaan.inventory.repository.ProductJpaRepository;
@Service("prodJpaService")
public class ProductJpaService implements ProductService{
	@Autowired
	ProductJpaRepository prodRepository;
	
	@Override
	public boolean saveProduct(Product productModel) {
		String prodId = UUID.randomUUID().toString();
		productModel.setId(prodId);
		in.mahaan.inventory.entity.Product prodEntity = new in.mahaan.inventory.entity.Product();
		/*
		 * prodEntity.setId(productModel.getId());
		 * prodEntity.setName(productModel.getName());
		 * prodEntity.setCategory(productModel.getCategory());
		 * prodEntity.setPrice(productModel.getPrice());
		 */
		BeanUtils.copyProperties(productModel, prodEntity);
		prodRepository.save(prodEntity);
		return true;
	}

	@Override
	public List<Product> getAllProducts() {
		List<in.mahaan.inventory.entity.Product> prodEntities = prodRepository.findAll();
		List<Product> prodModels = new ArrayList<>();
		Product prodModel = null;
		for(in.mahaan.inventory.entity.Product prodEntity : prodEntities) {
			prodModel = new Product();
			BeanUtils.copyProperties(prodEntity, prodModel);
			prodModels.add(prodModel);
		}
		return prodModels;
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		if(category==null || category.isEmpty() || category.equalsIgnoreCase("all")) {
			return getAllProducts();
		}
		List<in.mahaan.inventory.entity.Product> prodEntities = prodRepository.findAllByCategory(category);
		List<Product> prodModels = new ArrayList<>();
		Product prodModel = null;
		for(in.mahaan.inventory.entity.Product prodEntity : prodEntities) {
			prodModel = new Product();
			BeanUtils.copyProperties(prodEntity, prodModel);
			prodModels.add(prodModel);
		}
		return prodModels;
	}

}
