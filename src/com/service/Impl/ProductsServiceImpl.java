package com.service.Impl;

import com.dao.ProductsDao;
import com.dao.Impl.ProductsDaoImpl;
import com.po.Products;
import com.service.ProductsService;


public class ProductsServiceImpl implements ProductsService{

	@Override
	public int add(Products p) {
		ProductsDao productsDao=new ProductsDaoImpl();
		
		return productsDao.addProducts(p);
	}

	@Override
	public Products findbyid(int id) {
		ProductsDao productsDao=new ProductsDaoImpl();
		return productsDao.findbyid(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public int updateproducts(Products p) {
		ProductsDao productsDao=new ProductsDaoImpl();
		return productsDao.updateproducts(p);
	}

	
	
	

}
