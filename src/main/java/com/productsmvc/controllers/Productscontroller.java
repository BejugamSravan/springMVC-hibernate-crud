package com.productsmvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.productsmvc.model.Product;
import com.productsmvc.service.ProductService;

@RestController
public class Productscontroller {
	
	@Autowired
	ProductService productService;
	
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	
	/**
	  * This method is used to list products.
	  * @return List of products
	  */
	
	@RequestMapping(value = "/product1", method = RequestMethod.GET)
	public String listproduct1()
	{

		return "testpassed";
		  
	}
	
	
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public ResponseEntity<List<Product>> listproduct(Model model)
	{
		
		List<Product> product =  productService.listProducts();
		  if(product!=null){
		   return new ResponseEntity<List<Product>>(product,HttpStatus.OK); 
		  }
		  return new ResponseEntity<List<Product>>(HttpStatus.NOT_FOUND);
		  
	}
	
	/**
	  * This method is used to get the product based on the product id
	  * @param Id
	  * @return product details
	  */
	 @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
	 public ResponseEntity<Product> getProduct(@PathVariable("id")Integer id){
		 Product product =  productService.getProductById(id);
	  if(product!=null){
	   return new ResponseEntity<Product>(product,HttpStatus.OK);
	  }
	  return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
	 }
	
	/**
	  * This method is used to add a product.
	  * @param product object
	  * @return product
	  */

	@ResponseBody
	@RequestMapping(value = "/product/add", method=RequestMethod.POST)
	public ResponseEntity<Product> addProduct(@RequestBody Product product)
	{
		  product =  productService.addProduct(product);
		  return new ResponseEntity<Product>(product,HttpStatus.CREATED);
			
	}
	
	 /**
	  * This method is used to update product
	  * @param product id 
	  * @param product object
	  * @return product
	  */
	 @RequestMapping(value = "/product/{Id}", method = RequestMethod.PUT)
	 public ResponseEntity<Product> updateEmployee(@PathVariable("Id")Integer id,@RequestBody Product product){
	  product.setProduct_Id(id);
	  Product updatedProduct =  productService.updateProduct(product);
	  return new ResponseEntity<Product>(updatedProduct,HttpStatus.OK);
	 }
	
	
	
	 /**
	  * This method is used to delete product
	  * @param product id
	  * @return
	  */
	 @RequestMapping(value = "/product/{Id}", method = RequestMethod.DELETE)
	 public ResponseEntity<Void> deleteEmployees(@PathVariable("Id")Integer id){
	  Product product = productService.getProductById(id);
	  if(product!=null){
	   productService.removeProduct(id);
	   return new ResponseEntity<Void>(HttpStatus.OK);
	  }
	  return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);  
	  
	 }

}
