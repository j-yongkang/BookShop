 package com.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.dao.UserDao;
import com.po.UserBean;

import utils.JDBCUitl;

public class UserDaoImpl implements UserDao {
	
	private Connection conn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;

	@Override
	public int login(UserBean user) {
		int f=0;
		try {
			conn=JDBCUitl.getConn();
			st=conn.createStatement();
			String sql="select password from tb_user where username='"+user.getUsername()+"'";
		    rs=st.executeQuery(sql);
			if(rs.next()){
				String pwd=rs.getString(1);
				if(pwd.equals(user.getPassword())){
					f=1;
				}
				else{
					f=0;
				}
			}
			else{
				f=0;
			}
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			JDBCUitl.close();
		}
		return f;
	}


	
	@Override
	public int reg(UserBean user) {
		int f=0;
		try {
			conn=JDBCUitl.getConn();
			String sql="insert into tb_user(username,password,age,sex,email) VALUES(?,?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1,user.getUsername());
			ps.setString(2,user.getPassword());
			ps.setInt(3,user.getAge());
			ps.setString(4,user.getSex());
			ps.setString(5,user.getEmail());
			f=ps.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}
	
}
