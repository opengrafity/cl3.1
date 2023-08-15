package com.brytcode.rawjpa.repository;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;

import com.brytcode.rawjpa.entity.Product;

@Repository
public class ProductRepository {
	@Autowired
	private LocalContainerEntityManagerFactoryBean emfBean;	
	public int saveProduct(Product prod) {
		EntityManager em = emfBean.getObject().createEntityManager();
		EntityTransaction et = em.getTransaction();
		try{
			et.begin();
			em.persist(prod);	
			et.commit();
			return 1;
		}catch(Exception ex ) {
			ex.printStackTrace();
			return 0;
		}
	}
	
	public Product getProduct(String uuid) {
		EntityManager em = emfBean.getObject().createEntityManager();
		EntityTransaction et = em.getTransaction();
		try{			
			et.begin();
			Product prod = em.find(Product.class,uuid);	
			et.commit();
			return prod;
		}catch(Exception ex ) {
			throw ex;			
		}
	}
	
	public Product updateProductPrice(String uuid,BigDecimal newPrice) {
		EntityManager em = emfBean.getObject().createEntityManager();
		EntityTransaction et = em.getTransaction();
		try{			
			et.begin();
			Product prod = em.find(Product.class,uuid);
			em.detach(prod);
			prod.setPrice(newPrice);			
			et.commit();
			return prod;
		}catch(Exception ex ) {
			throw ex;			
		}
	}
	
}
