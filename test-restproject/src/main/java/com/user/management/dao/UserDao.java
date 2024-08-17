package com.user.management.dao;

import java.util.List;

import com.user.management.entity.User;

public interface UserDao {

	public void addUser(User ksmAddressTestA);
	public List findAllUsers();
	public boolean login(User testUserA);
}
