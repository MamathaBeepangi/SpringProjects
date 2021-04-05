package com.springboot.product.productAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.product.productAPI.model.Product;
import com.springboot.product.productAPI.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product)
	{
		return service.saveProduct(product);
	}

	@PostMapping("/addProductList")
	public List<Product> addallProducts(@RequestBody List<Product> products)
	{
		return service.saveproductlist(products);
	}
	
	@GetMapping("/products")
	public List<Product> getAllProducts()
	{
		return service.getAllproducts();
	}
	
	@GetMapping("/productbyid/{id}")
	public Product getproductByID(@PathVariable int id)
	{
		return service.getProductByid(id);
	}
	
	@GetMapping("/productbyname/{name}")
	public List<Product> getByname(@PathVariable String name)
	{
		return service.getByname(name);
	}	
	@PutMapping("/update")
	public Product update(@RequestBody Product product)
	{
		return service.updateProduct(product);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		return service.deleteProduct(id);
	}
}
