package com.dao;

import com.po.Products;

public interface ProductsDao {

	int addProducts(Products p);

	Products findbyid(int id);

	int updateproducts(Products p);

}
