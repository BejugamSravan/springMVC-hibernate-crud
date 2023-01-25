package com.productsmvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.productsmvc.model.Product;


@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO  {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public Product getProductById(Integer id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Product product = (Product) session.get(Product.class, id);
        return product;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> listProducts() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
        List<Product> ProductList = (List<Product>) session.createQuery("from Product").list();
        return ProductList;
	}
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(product);
		  return product;
	}
	@Override
	public void removeProduct(int id) {
		// TODO Auto-generated method stub
		 Session session = sessionFactory.getCurrentSession();
		 Product product = (Product) session.get(Product.class, id);
	        if(null != product){
	            session.delete(product);
	      }
	
	}
	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.merge(product);
		 return product;
	}
	
	
	

}
