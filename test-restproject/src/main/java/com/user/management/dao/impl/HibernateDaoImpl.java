package com.user.management.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.PreUpdate;

import com.user.management.dao.HibernateDao;
import com.user.management.entity.User;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class HibernateDaoImpl implements HibernateDao {

	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
	private EntityManager entityManager;

	private Session session;

	@Override
	@PreUpdate
	public void saveOrUpdate(Object transientInstance) {
		try {

			getSession().saveOrUpdate(transientInstance);
			getSession().flush();
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public Session getSession() {
		return (Session) getEntityManager().unwrap(Session.class);
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List findAll(Class entityClass) {
		try {

			return createCriteria(entityClass).list();

		} catch (RuntimeException re) {
			throw re;
		}
	}

	@Override
	public Criteria createCriteria(Class entityClass) {
		return getSession().createCriteria(entityClass);
	}

	@Override
	public boolean loginControl(String username, String pass) {

		Criteria crit = getSession().createCriteria(User.class);
			crit.add(Restrictions.eq("username", username));
			crit.add(Restrictions.eq("password", pass));
			crit.setProjection(Projections.rowCount());
				List<User> results = crit.list();
				List<?> result = crit.list();
		boolean rowCounta = false;
		if (!result.isEmpty()) {
			Long rowCount = (Long) result.get(0);
			if (rowCount >= 1) {
				rowCounta = true;
			} else {
				rowCounta = false;
			}
		}
		return rowCounta;

	}
}
