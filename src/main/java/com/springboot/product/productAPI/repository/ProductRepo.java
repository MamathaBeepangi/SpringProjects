package com.springboot.product.productAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.product.productAPI.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer> {

	List<Product> findByName(String name);
}
