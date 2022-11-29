package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeRun {
	public static void main(String[] args) {

		// lazy load
//		BeanFactory bean = new XmlBeanFactory(new ClassPathResource("emp.xml"));
//		System.out.println("Bean loaded");
//		bean.getBean("emp1");

		// eager load
		ApplicationContext context = new ClassPathXmlApplicationContext("emp.xml");
		System.out.println("Application Context loaded");
		Employee e1 = (Employee) context.getBean("emp1");
		System.out.println(e1);
	}
}
