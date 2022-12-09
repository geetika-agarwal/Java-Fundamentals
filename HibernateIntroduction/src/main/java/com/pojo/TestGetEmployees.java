package com.pojo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestGetEmployees {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		List result = session.createQuery("from Employee").list();
		for (Employee emp : (List<Employee>) result) {
			System.out.println("Employee (" + emp.getId() + ") : " + emp.getFirstName() + " " + emp.getLastName());

		}

		transaction.commit();
		session.close();
		factory.close();
	}
}
