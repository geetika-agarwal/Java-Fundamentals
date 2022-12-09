package com.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestAddEmployee {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee e1 = new Employee(2, "Geetika", "Agarwal", 2000);
		session.save(e1);
		System.out.println("Employee saved in database");
		transaction.commit();
		session.close();
		factory.close();
	}
}
