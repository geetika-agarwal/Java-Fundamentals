package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired(required = true)
	private SessionFactory sessionFactory;

	// @private HibernateTransactionManager transaction;
	public void save() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		// Transaction tx=session.beginTransaction();
		User u1 = new User(101, "Geetika", "Agarwal", "geetika@gmail.com");
		session.save(u1);
		// tx.commit();
		// session.close();

	}

}