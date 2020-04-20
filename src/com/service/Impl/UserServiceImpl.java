package com.service.Impl;

import com.dao.UserDao;
import com.dao.Impl.UserDaoImpl;
import com.po.UserBean;
import com.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public int login(UserBean user) {
		UserDao userDao = new UserDaoImpl();
		int b = userDao.login(user);
		return b;
	}
	
	@Override
	public int reg(UserBean user) {
		UserDao userDao = new UserDaoImpl();
		int b = userDao.reg(user);
		return b;
	}
	

}
