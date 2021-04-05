package com.springboot.product.productAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.product.productAPI.model.Product;
import com.springboot.product.productAPI.repository.ProductRepo;

@Service
public class ProductService 
{
	@Autowired
	private ProductRepo repo;
	
	public Product saveProduct(Product product)
	{
		return repo.save(product);
	}
	
	public List<Product> saveproductlist(List<Product> products)
	{
		return repo.saveAll(products);
	}
	public Product getProductByid(int id)
	{
		return repo.findById(id).orElseThrow();
	}
	
	public List<Product> getAllproducts()
	{
		return repo.findAll();

	}
	public List<Product> getByname(String name)
	{
		return repo.findByName(name);
	}
	
	public String deleteProduct(int id)
	{
		repo.deleteById(id);
		return "Product removed successfully";
	}
	public Product updateProduct(Product product)
	{
		Product existingProduct=repo.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setPrice(product.getPrice());
		return repo.save(existingProduct);
	}
}
