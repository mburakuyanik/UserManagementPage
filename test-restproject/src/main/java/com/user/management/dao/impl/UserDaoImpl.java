package com.user.management.dao.impl;

import java.util.List;

import com.user.management.dao.UserDao;
import com.user.management.entity.User;

public class UserDaoImpl extends HibernateDaoImpl implements UserDao{

	
	
	@Override
	public void addUser(User TestA) {

		//0 pasif user olsun, 1 aktif user olsun.

		saveOrUpdate(TestA);
		
	}

	@Override
	public List findAllUsers() {
		
		return findAll(User.class);
	}

	@Override
	public boolean login(User testUserA) {
//		return loginControl(testUserA.getUsername(), testUserA.getPassword());
		return false;
		
	}

	//criteria how to select from db
}
