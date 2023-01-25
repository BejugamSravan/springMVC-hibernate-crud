package com.productsmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productsmvc.dao.ProductDAO;
import com.productsmvc.model.Product;



@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDAO;
	
	public void setproductDAO(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }
	
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productDAO.addProduct(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return productDAO.updateProduct(product);
		
	}
	
	@Override
	public List<Product> listProducts() {
		// TODO Auto-generated method stub
		return this.productDAO.listProducts();
	}


	@Override
	public Product getProductById(Integer id) {
		// TODO Auto-generated method stub@Override
		return productDAO.getProductById(id);
	}
	@Override
	public void removeProduct(Integer id) {
		// TODO Auto-generated method stub
		productDAO.removeProduct(id);
	}	

}
