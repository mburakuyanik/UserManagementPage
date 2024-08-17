package com.user.management.dao;

import java.util.List;

import com.user.management.entity.User;

import org.hibernate.Criteria;

public interface HibernateDao {
	
	public void saveOrUpdate(Object transientInstance);
	public List findAll(Class entityClass);
	public Criteria createCriteria(Class entityClass);
	public boolean loginControl(String username, String pass);
}
