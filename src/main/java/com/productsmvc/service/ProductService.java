package com.productsmvc.service;

import java.util.List;

import com.productsmvc.model.Product;

public interface ProductService {
	
	public Product addProduct(Product product);
	   
    public Product updateProduct(Product product);
   
    public Product getProductById(Integer id);
   
    public void removeProduct(Integer id);
   
    public List<Product> listProducts();

}
