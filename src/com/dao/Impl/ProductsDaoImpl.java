package com.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.dao.ProductsDao;
import com.po.Products;

import utils.JDBCUitl;

public class ProductsDaoImpl implements ProductsDao {
private Connection conn=null;
private Statement st=null;
private PreparedStatement ps=null;
private ResultSet rs=null;
@Override
public int addProducts(Products p) {
	int f=0;
	try {
		conn=JDBCUitl.getConn();
		String sql="insert into products(name,price,category,pnum,imgurl,description) VALUES(?,?,?,?,?,?)";
		ps=conn.prepareStatement(sql);
		ps.setString(1, p.getName());
		ps.setDouble(2,p.getPrice());
		ps.setString(3,p.getCategory());
		ps.setInt(4, p.getPnum());
		ps.setString(5,p.getImgurl());
		ps.setString(6, p.getDescription());
		f=ps.executeUpdate();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}//创建了一个Connection对象
	JDBCUitl.release(ps, conn);
	return f;
}
@Override
public Products findbyid(int id) {
	Products p=new Products();
	try {
		conn=JDBCUitl.getConn();
		String sql="select * from products where id=?";
		ps=conn.prepareStatement(sql);
		ps.setInt(1,id);
		rs=ps.executeQuery();
		
		if(rs.next())
		{
			p.setId(rs.getInt(1));
			p.setName(rs.getString(2));
			p.setPrice(rs.getDouble(3));
			p.setCategory(rs.getString(4));
			p.setPnum(rs.getInt(5));
			p.setImgurl(rs.getString(6));
			p.setDescription(rs.getString(7));
		}
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return p;
}
@Override
public int updateproducts(Products p) {
	int f=0;
	try {
		conn=JDBCUitl.getConn();
		String sql = "update products set name=?,price=?,category=?,pnum=?,imgurl=?,description=? where id=?";
		ps=conn.prepareStatement(sql);
		ps.setString(1, p.getName());
		ps.setDouble(2,p.getPrice());
		ps.setString(3,p.getCategory());
		ps.setInt(4, p.getPnum());
		ps.setString(5,p.getImgurl());
		ps.setString(6, p.getDescription());
		ps.setInt(7, p.getId());
		f=ps.executeUpdate();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	JDBCUitl.release(ps, conn);
	return f;
}

}
