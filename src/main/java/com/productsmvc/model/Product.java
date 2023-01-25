package com.productsmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "Product_Id")
	private Integer Product_Id;
	
	@Column(name = "Product_Name")
	private String Product_Name;
	
	@Column(name = "Product_Type")
	private String Product_Type;
	
	@Column(name = "Product_key")
	private String Product_Key;

	@Column(name = "Product_Status")
	private String Product_Status;
	
	@Column(name = "Date_Modified")
	private String Date_Modified;
	
	@Column(name = "Date_Created")
	private String Date_Created;

	public Integer getProduct_Id() {
		return Product_Id;
	}

	public void setProduct_Id(Integer product_Id) {
		Product_Id = product_Id;
	}

	public String getProduct_Name() {
		return Product_Name;
	}

	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}

	public String getProduct_Type() {
		return Product_Type;
	}

	public void setProduct_Type(String product_Type) {
		Product_Type = product_Type;
	}

	public String getProduct_Key() {
		return Product_Key;
	}

	public void setProduct_Key(String product_Key) {
		Product_Key = product_Key;
	}

	public String getProduct_Status() {
		return Product_Status;
	}

	public void setProduct_Status(String product_Status) {
		Product_Status = product_Status;
	}

	public String getDate_Modified() {
		return Date_Modified;
	}

	public void setDate_Modified(String date_Modified) {
		Date_Modified = date_Modified;
	}

	public String getDate_Created() {
		return Date_Created;
	}

	public void setDate_Created(String date_Created) {
		Date_Created = date_Created;
	}

}
