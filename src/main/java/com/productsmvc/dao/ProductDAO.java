package com.productsmvc.dao;

import java.util.List;

import com.productsmvc.model.Product;


public interface ProductDAO {
	
	public Product addProduct(Product product);
	   
    public Product updateProduct(Product product);
   
    public Product getProductById(Integer id);
   
    public void removeProduct(int id);
   
    public List<Product> listProducts();

}
