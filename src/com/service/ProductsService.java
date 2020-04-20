package com.service;

import com.po.Products;

public interface ProductsService {

	int add(Products p);

	Products findbyid(int id);

	int updateproducts(Products p);

}
